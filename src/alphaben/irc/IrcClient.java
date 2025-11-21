package alphaben.irc;

import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.concurrent.TimeUnit;

public class IrcClient 
{
    static final int STATUS_ERROR           = -1;
    static final int STATUS_CONNECTED       = 0;
    static final int STATUS_DISCONNECTED    = 1;
 
    int         status = -1;
    Socket      sock = null;
    String      data = "";
    String      name = "";
    
    
    
 void doAuthentaction()
    {
        try {
         
                 
            String pass = String.format("PASS %s\r\n", GlobalConfig.SERVER_PASS);
            String nick = String.format("NICK %s\r\n", name);
            String user = String.format("USER %s 0 * %srm\r\n", name, name);
            String join = "JOIN #room\r\n";
            String strAuth = "authentication : \n%s%s%s%s\n".formatted(pass , nick ,  user , join );
            insertData(strAuth);
            
            sendWithDelay(pass);
            sendWithDelay(nick);
            sendWithDelay(user);
            sendWithDelay(join);
           
     
            
        } catch (Exception ex) {
            Logger.getLogger(IrcClient.class.getName()).log(Level.SEVERE,  ex.getMessage());
        }
    
    
    }
 
// /**
//  * 
//  * @see this is a Constructor  
//  */
 
 
 /**
  * @see send the message into server and sleep a 2 
  * @param message  
  */
 
 private void sendWithDelay(String message) throws IOException, InterruptedException{
             byte[] payload   = message.getBytes();
             GlobalConfig.send(this.sock,payload);
            TimeUnit.MILLISECONDS.sleep(2);
           
 }
 
public IrcClient(String ServerAddress ,int port,String name)
{
    try
        {
            
           this.name = name ;
           sock = new Socket(ServerAddress, port);  
           doAuthentaction();
           status = STATUS_CONNECTED;
 
        }catch(Exception ex)
        {
            sock = new Socket();
            data += GlobalConfig.ERR_CON_SERVER;
            status = STATUS_ERROR;
        }
}

public void Disconnected()
{
    try
    {
        if(status == STATUS_DISCONNECTED)
            return;
        sock.close();
        data += "\n----- Disconnected ------";
        
        status = STATUS_DISCONNECTED;
    }
    catch(Exception ex)
    {
         System.out.println( ex.getMessage());
    }
   
}


public void SendToServer(String bytes)
{
    if (status != 0)
        return;     
    try{
            if (!sock.isConnected())
            {
                status = STATUS_DISCONNECTED;
                insertData(GlobalConfig.SERVER_DISCONNECTED);
            }
            
            sock.getOutputStream().write(bytes.getBytes());
            sock.getOutputStream().flush();
             insertData("Client > " + bytes);
            Thread.sleep(1);
  
    }
    catch(Exception ex)
    {
       
          status = STATUS_ERROR;
           insertData(GlobalConfig.SERVER_DISCONNECTED);
    } 
}

public String  ReicveFromServer()
{
    try {
        
        if(status != STATUS_CONNECTED)
                return null;
        
        int  bufferSize =  sock.getInputStream().available();
        
        if(bufferSize <= 0) return null; 
     
         byte buff[] = GlobalConfig.recieve(sock, bufferSize);
         String result = new String(buff);
         
         insertData("Server #>  %s".formatted(result));
         return result;
         
        } catch (Exception ex) {
            Logger.getLogger(IrcClient.class.getName()).log(Level.SEVERE, null, ex);
            return "Error";
        }
              
}

public String getData(){return data;}

public void insertData(String text)
{
        data += "\n" + text;
}

public String getClientName(){return name;}


public  String getStatusText()
{
    
    switch (status) {
        case -1 : return            "Error";
        case STATUS_CONNECTED       : return "Connected";
        case STATUS_DISCONNECTED    :   return "Disconnected";    
 }
    return "Undfined";
}
}
