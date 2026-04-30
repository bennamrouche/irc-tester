package alphaben.irc;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class GlobalConfig 
{
    public static String  SERVER_DISCONNECTED      =    "Server Disconnected"; 
    public static String  ERR_SEND_TO_SERVER       =    "Error : while Send To Server "; 
    public static String  ERR_RECEIVE_FROM         =   "Error: while Receive From Server "; 
    public static String  ERR_CON_SERVER           =   "Error : failed connecting to server";
    public static String  EMPTY_FIELDS             =   "Empty Address or Port or PassWord ...!";
    public static String  CLIENT_NEGATIVE_ERROR    =   "Client count must be strictly positive ";
    public static String  BAD_PORT_CLIENT_COUNT    =   "Bad Port or Client Count ";
    public static String  CONNECT_FAIL             =   "Fail to Connect the server ";
    
    // ExecutorService for managing client threads
    private static final ExecutorService clientExecutor = Executors.newCachedThreadPool();
    private static ExecutorService monitorExecutor      = Executors.newSingleThreadExecutor();
    
    public static int      port            =         8080;
    public static String   HOST            =        "localhost";
    public static String   SERVER_PASS     =        "root" ;
    public static int      command         =        0;
    
    public static final int   START_COMMAND        =  1;
    public static final int   STOP_COMMAND         =  2;
    public static final int   SEND_TO_ALL_COMMAND  =  3;
    
    private static long      download            =  0;
    private static long      upload              =  0;
    
    // Buffer size for NIO operations
    public static final int BUFFER_SIZE = 8192;
    
    public static String getDownloadSize() {
        return ByteFormater.formatBytes(download);
    }
    
    public static String getUploadSize() {
        return ByteFormater.formatBytes(upload);
    }
    
    public static void reset() {
        download = 0;
        upload = 0;
    }
    
    public static void send(SocketChannel channel, byte[] data) throws IOException {
        ByteBuffer buffer = ByteBuffer.wrap(data);
        while (buffer.hasRemaining()) {
            channel.write(buffer);
        }
        
        upload += data.length;
    }
    
    public static void send(SocketChannel channel, String data) throws IOException {

        send(channel, data.getBytes());
        data = data.substring(0, data.length() - 2);
        System.out.printf("row sended [[ %s ]]%n", data);
    }
    
    public static byte[] receive(SocketChannel channel, int size) throws IOException {
        ByteBuffer buffer = ByteBuffer.allocate(size);
        int bytesRead = channel.read(buffer);
        
        if (bytesRead <= 0) {
            return new byte[0];
        }
        
        download += bytesRead;
        byte[] result = new byte[bytesRead];
        System.arraycopy(buffer.array(), 0, result, 0, bytesRead);
        return result;
    }
    
    public static byte[] receiveAvailable(SocketChannel channel) throws IOException {
        ByteBuffer buffer = ByteBuffer.allocate(BUFFER_SIZE);
        int bytesRead = channel.read(buffer);
        
        if (bytesRead <= 0) {
            return new byte[0];
        }
        
        download += bytesRead;
        byte[] result = new byte[bytesRead];
        System.arraycopy(buffer.array(), 0, result, 0, bytesRead);
        return result;
    }
    
    public static ExecutorService getClientExecutor() {
        return clientExecutor;
    }
    
    public static ExecutorService getMonitorExecutor() {
        return monitorExecutor;
    }
    
    public static void shutdownExecutors() {
        clientExecutor.shutdown();
        monitorExecutor.shutdown();
        try {
            if (!clientExecutor.awaitTermination(5, TimeUnit.SECONDS)) {
                clientExecutor.shutdownNow();
            }
            if (!monitorExecutor.awaitTermination(5, TimeUnit.SECONDS)) {
                monitorExecutor.shutdownNow();
            }
        } catch (InterruptedException e) {
            clientExecutor.shutdownNow();
            monitorExecutor.shutdownNow();
            Thread.currentThread().interrupt();
        }
    }
    
    /**
     * Tests if a server is reachable at the given address and port.
     *
     * @param address The server hostname or IP.
     * @param port    The server port.
     * @param timeout Timeout in milliseconds.
     * @return true if reachable, false otherwise.
     */
    public static boolean isServerReachable(String address, int port, int timeout) {
        try (SocketChannel channel = SocketChannel.open()) {
            channel.configureBlocking(true);
            channel.socket().connect(new InetSocketAddress(address, port), timeout);
            return true;
        } catch (IOException e) {
            return false;
        }
    }
    
    public static String[] names = {
        "James", "Mary", "Robert", "Patricia", "John", "Jennifer", "Michael", "Linda", "David", "Elizabeth",
        "William", "Barbara", "Richard", "Susan", "Joseph", "Jessica", "Thomas", "Sarah", "Christopher", "Karen",
        "Charles", "Lisa", "Daniel", "Nancy", "Matthew", "Betty", "Anthony", "Sandra", "Mark", "Margaret",
        "Donald", "Ashley", "Steven", "Kimberly", "Andrew", "Emily", "Paul", "Donna", "Joshua", "Michelle",
        "Kenneth", "Carol", "Kevin", "Amanda", "Brian", "Melissa", "George", "Deborah", "Timothy", "Stephanie",
        "Ronald", "Dorothy", "Jason", "Rebecca", "Edward", "Sharon", "Jeffrey", "Laura", "Ryan", "Cynthia",
        "Jacob", "Amy", "Gary", "Kathleen", "Nicholas", "Angela", "Eric", "Shirley", "Jonathan", "Brenda",
        "Stephen", "Emma", "Larry", "Anna", "Justin", "Pamela", "Scott", "Nicole", "Brandon", "Samantha",
        "Benjamin", "Katherine", "Samuel", "Christine", "Gregory", "Helen", "Alexander", "Debra", "Patrick",
        "Rachel", "Frank", "Carolyn", "Raymond", "Janet", "Jack", "Maria", "Dennis", "Catherine", "Jerry",
        "Heather", "Tyler", "Diane", "Aaron", "Olivia", "Jose", "Julie", "Adam", "Joyce", "Nathan", "Victoria",
        "Henry", "Ruth", "Zachary", "Virginia", "Douglas", "Lauren", "Peter", "Kelly", "Kyle", "Christina",
        "Noah", "Joan", "Ethan", "Evelyn", "Jeremy", "Judith", "Walter", "Andrea", "Christian", "Hannah",
        "Keith", "Megan", "Roger", "Cheryl", "Terry", "Jacqueline", "Austin", "Martha", "Sean", "Madison",
        "Gerald", "Teresa", "Carl", "Gloria", "Harold", "Sara", "Dylan", "Janice", "Arthur", "Ann",
        "Lawrence", "Kathryn", "Jordan", "Abigail", "Jesse", "Sophia", "Bryan", "Frances", "Billy", "Jean",
        "Bruce", "Alice", "Gabriel", "Judy", "Joe", "Isabella", "Logan", "Julia", "Alan", "Grace", "Juan",
        "Amber", "Albert", "Denise", "Willie", "Danielle", "Elijah", "Marilyn", "Wayne", "Beverly", "Randy",
        "Charlotte", "Vincent", "Natalie", "Mason", "Theresa", "Roy", "Diana", "Ralph", "Brittany", "Bobby",
        "Doris", "Kayla", "Russell", "Alexis", "Bradley", "Philip", "Lori", "Eugene", "Marie"
    };
}