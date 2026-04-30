package alphaben.irc;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ClientMonitor implements Runnable {
    
    private static ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();
    private static boolean running = false;
    
    public static void start() {
        if (!running) {
            running = true;
            scheduler.scheduleAtFixedRate(new ClientMonitor(), 0, 45, TimeUnit.MILLISECONDS);
        }
    }
    
    public static void stop() {
        running = false;
        scheduler.shutdown();
    }
    
    @Override
    public void run() {
        try {
            // Update all client panels
            ClientPanel.clinets.forEach(ClientPanel::updateView);
            
            // Update client manager data
            ClientManger.getInctance().updateData();
            
            // Run frame commands
            Frame.instance.runCommand();
            
        } catch (Exception ex) {
            System.err.printf("Error:[%s] %s%n", ex.getClass().getName(), ex.getMessage());
        }
    }
}