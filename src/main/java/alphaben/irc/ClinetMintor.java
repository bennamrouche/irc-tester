
package alphaben.irc;

import java.util.concurrent.TimeUnit;

public class ClinetMintor implements Runnable
{
    @Override
    public void run()
{
         while(true)
         {
             try
             {
                 
            TimeUnit.MILLISECONDS.sleep(45);   
            
            ClientPanel.clinets.forEach(ClientPanel::updateView);
            
            ClientManger.getInctance().updateData();
            
            Frame.instance.runCommand();
               
             }catch(Exception ex)
             {

                 System.err.printf("Error:[%s] %s",ex.getClass().getName(),ex.getMessage());
             }
           
        
        }  
    }
         
}
