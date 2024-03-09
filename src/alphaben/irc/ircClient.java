package alphaben.irc;

import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ircClient 
{
    static final int STATUS_ERROR = -1;
    static final int STATUS_CONNECTED  = 0;
    static final int STATUS_DISCONNECTED  = 1;
 
    int status = -1;
    Socket  sock = null;
    String  data = "";
    String   name = "";
    
    
    
 void StartAuthentaction()
    {
        try {
         
                   String pass =  "PASS " + GlobalConfig.SERVER_PASS  +"\r\n";
                   String nick =   "NICK " + name + "\r\n";
                   String user =    "USER " + name  + " 0 * " + name + "rm \r\n";
                   String join =    "JOIN #room\r\n";
                  insertData("authentication : \n " + pass + nick + user + join + "\n");
            
            sock.getOutputStream().write(pass.getBytes());
            sock.getOutputStream().flush();
            Thread.sleep(2);
           sock.getOutputStream().write(nick.getBytes());
           sock.getOutputStream().flush();
           
              Thread.sleep(2);
            sock.getOutputStream().write(user.getBytes());
            sock.getOutputStream().flush();
              
            Thread.sleep(2);

            sock.getOutputStream().write(join.getBytes());
            sock.getOutputStream().flush();
            
            
        } catch (Exception ex) {
            Logger.getLogger(ircClient.class.getName()).log(Level.SEVERE,  ex.getMessage());
        }
    
    
    }
 
// /**
//  * 
//  * @see this is a Constructor  
//  */
public ircClient(String ServerAddress ,int port,String name)
{
    try
        {
            
             this.name = name ;
            sock = new Socket(ServerAddress, port);  
           StartAuthentaction();
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
             Thread.sleep(30);
  
    }
    catch(Exception ex)
    {
       
          status = STATUS_ERROR;
           insertData(GlobalConfig.SERVER_DISCONNECTED);
    } 
}

public void ReicveFromServer()
{
    try {
        
        if(status != STATUS_CONNECTED)
                return;
      if(sock.getInputStream().available() > 0)
         {
                byte buff[] = new byte[sock.getInputStream().available()];
            
               int nb =  sock.getInputStream().read(buff);
                if (nb != 0)
                        insertData("Server #>  " + new String(buff));
            
                
          }

            
        } catch (Exception ex) {
            Logger.getLogger(ircClient.class.getName()).log(Level.SEVERE, null, ex);
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
        case -1 : return "Error";
        case  STATUS_CONNECTED : return "Connected";
        case STATUS_DISCONNECTED : return "Disconnected";    
 }
    return "Undfined";
}
}
