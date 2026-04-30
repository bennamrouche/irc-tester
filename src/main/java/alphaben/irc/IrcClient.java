package alphaben.irc;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class IrcClient 
{
    static final int STATUS_ERROR           = -1;
    static final int STATUS_CONNECTED       = 0;
    static final int STATUS_DISCONNECTED    = 1;
    
    private int         status = -1;
    private SocketChannel channel = null;
    private final StringBuilder data = new StringBuilder();
    private final String name;
    private Future<?> receiveTask;
    
    public IrcClient(String serverAddress, int port, String name) {
        this.name = name;
        
        try {
            // Create and configure channel
            channel = SocketChannel.open();
            channel.configureBlocking(false); // Non-blocking mode
           boolean isConnected  =  channel.connect(new InetSocketAddress(serverAddress, port));
            
            if (!isConnected) {

                while (!channel.finishConnect()) {}
         }
    
            status = STATUS_CONNECTED;
            doAuthentication();
            startReceiveLoop();
            
        } catch (Exception ex) {
            data.append(GlobalConfig.ERR_CON_SERVER);
            status = STATUS_ERROR;
            Logger.getLogger(IrcClient.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
        }
    }
    
    private void startReceiveLoop() {
        receiveTask = GlobalConfig.getClientExecutor().submit(() -> {
            while (status == STATUS_CONNECTED && channel != null && channel.isOpen()) {
                try {
                    String received = receiveFromServer();
                    if (received != null && !received.isEmpty()) {
                        // Data is already inserted in receiveFromServer
                    }
                    TimeUnit.MILLISECONDS.sleep(10); // Small delay to prevent CPU spinning
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    break;
                } catch (Exception e) {
                    if (status == STATUS_CONNECTED) {
                        insertData("Error receiving: " + e.getMessage());
                    }
                    break;
                }
            }
            return null;
        });
    }
    
    void doAuthentication() {
        try {
            String pass = String.format("PASS %s\r\n", GlobalConfig.SERVER_PASS);
            String nick = String.format("NICK %s\r\n", name);
            String user = String.format("USER %s 0 * %s\r\n", name, name);
            String join = "JOIN #room\r\n";
            
            String strAuth = "authentication : \n%s%s%s%s".formatted(pass, nick, user, join);
            
            StringBuilder stringBuffer = new StringBuilder();
            
            stringBuffer.append(pass);
            stringBuffer.append(nick);
            stringBuffer.append(user);
            stringBuffer.append(join);
           
            insertData(strAuth);
            
             sendWithDelay(stringBuffer.toString());
            

        } catch (Exception ex) {
            Logger.getLogger(IrcClient.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
            status = STATUS_ERROR;
        }
    }
    
    private void sendWithDelay(String message) throws IOException, InterruptedException {
        if (channel != null && channel.isOpen()) {
            GlobalConfig.send(channel, message);
            TimeUnit.MILLISECONDS.sleep(2);
        }
    }
    
    public void disconnect() {
        try {
            if (status == STATUS_DISCONNECTED) {
                return;
            }
            
            if (receiveTask != null && !receiveTask.isDone()) {
                receiveTask.cancel(true);
            }
            
            if (channel != null && channel.isOpen()) {
                channel.close();
            }
            
            data.append("\n----- Disconnected ------");
            status = STATUS_DISCONNECTED;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public void sendToServer(String bytes) {
        if (status != STATUS_CONNECTED) {
            return;
        }
        
        try {
            if (channel == null || !channel.isOpen()) {
                status = STATUS_DISCONNECTED;
                insertData(GlobalConfig.SERVER_DISCONNECTED);
                return;
            }
            
            GlobalConfig.send(channel, bytes);
            insertData("Client > " + bytes);
            
        } catch (Exception ex) {
            status = STATUS_ERROR;
            insertData(GlobalConfig.SERVER_DISCONNECTED);
            Logger.getLogger(IrcClient.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
        }
    }
    
    public String receiveFromServer() {
        try {
            if (status != STATUS_CONNECTED || channel == null || !channel.isOpen()) {
                return null;
            }
            
            byte[] buff = GlobalConfig.receiveAvailable(channel);
            if (buff == null || buff.length == 0) {
                return null;
            }
            
            String result = new String(buff);
            insertData("Server #> %s".formatted(result));
            return result;
            
        } catch (IOException ex) {
            if (status == STATUS_CONNECTED) {
                Logger.getLogger(IrcClient.class.getName()).log(Level.SEVERE, null, ex);
            }
            return null;
        }
    }
    
    public String getData() {
        return data.toString();
    }
    
    public void insertData(String text) {
        synchronized (data) {
            data.append("\n").append(text);
        }
    }
    
    public String getClientName() {
        return name;
    }
    
    public int getStatus() {
        if(!isConnected()) return   STATUS_DISCONNECTED; 
        return status;
    }
    
    public void setStatus(int status) {
        
        this.status = status;
    }
    
    public boolean isConnected() {
      
        return status == STATUS_CONNECTED ||  channel != null || channel.isOpen();
    }
    
    public String getStatusText() {
        switch (status) {
            case -1 -> {
                return "Error";
            }
            case STATUS_CONNECTED -> {
                return "Connected";
            }
            case STATUS_DISCONNECTED -> {
                return "Disconnected";
            }
        }
        return "Undefined";
    }
}