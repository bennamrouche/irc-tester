
package alphaben.irc;

public class ClinetMintor implements Runnable
{
    @Override
    public void run()
{
         while(true)
         {
             try
             {
                  Thread.sleep(500);
            for(ClientPanel clt : ClientPanel.clinets)
            {
                    clt.updateView();
            }                 
                ClientManger.getInctance().updateData();
//                 if (GlobalConfig.command  2)
                     Frame.instance.runCommand();
             }catch(Exception ex)
             {
             }
           
        
        }  
    }
         
}
