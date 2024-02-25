package alphaben.irc;





import java.awt.Color;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ClientPanel extends javax.swing.JPanel {

    ircClient client = null;
    public static ArrayList<ClientPanel> clinets = new ArrayList<>();
     
public ClientPanel()
{
        initComponents();
}
  
  public ClientPanel(ircClient client) 
  {
     initComponents();
     
        this.client = client; 
        clinets.add(this);
        updateView();
       
//        this.setSize(100, 70);
//        this.setPreferredSize(this.getSize());
//        this.setMinimumSize(this.getSize());
//        this.setMaximumSize(this.getSize());
  }


  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblClientName = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(57, 62, 70));
        setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 153)));

        lblClientName.setBackground(new java.awt.Color(255, 255, 255));
        lblClientName.setFont(new java.awt.Font("Cantarell", 1, 24)); // NOI18N
        lblClientName.setForeground(new java.awt.Color(255, 255, 255));
        lblClientName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblClientName.setText("Mehdi");

        lblStatus.setFont(new java.awt.Font("Cantarell", 1, 12)); // NOI18N
        lblStatus.setForeground(new java.awt.Color(51, 255, 0));
        lblStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStatus.setText("Connected");

        jButton1.setBackground(new java.awt.Color(255, 211, 105));
        jButton1.setFont(new java.awt.Font("Lato Semibold", 1, 15)); // NOI18N
        jButton1.setForeground(new java.awt.Color(3, 0, 28));
        jButton1.setText("view");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblClientName, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(lblStatus, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(lblClientName, javax.swing.GroupLayout.PREFERRED_SIZE, 27, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ClientManger.getInctance().setVisible(true);
        ClientManger.getInctance().SetViewCliet(client);
    }//GEN-LAST:event_jButton1ActionPerformed

    
  public void updateView()
 {        
        if (client.status == 0)
             lblStatus.setForeground(Color.green);
        else 
             lblStatus.setForeground(Color.red);
        
    try {
      
        client.ReicveFromServer();
        lblStatus.setText(client.getStatusText());
        
        } catch (Exception ex) 
        {
           client.status = ircClient.STATUS_ERROR;
           client.insertData("Erorr#> " + GlobalConfig.ERR_REICEVE_FROM);
            Logger.getLogger(ClientPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        lblClientName.setText(client.getClientName());
                
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lblClientName;
    private javax.swing.JLabel lblStatus;
    // End of variables declaration//GEN-END:variables
}
