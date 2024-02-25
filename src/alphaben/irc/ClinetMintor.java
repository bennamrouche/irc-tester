
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
//                  if()
                  
                 ClientManger.getInctance().updateData();
             }catch(Exception ex)
             {
             }
           
        
        }  
    }
         
}
