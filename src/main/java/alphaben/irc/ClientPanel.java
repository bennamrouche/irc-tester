package alphaben.irc;

import java.awt.Color;
import java.util.ArrayList;

public class ClientPanel extends javax.swing.JPanel {

    IrcClient client = null;
    public static ArrayList<ClientPanel> clinets = new ArrayList<>();
     
public ClientPanel()
{
        initComponents();
}
  
  public ClientPanel(IrcClient client) 
  {
        initComponents();
        this.client = client; 
        clinets.add(this);
        this.updateView();
     
  }


  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblClientName = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lblLastMessage = new javax.swing.JLabel();

        setBackground(new java.awt.Color(57, 62, 70));
        setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 153)));
        setForeground(new java.awt.Color(255, 140, 66));

        lblClientName.setBackground(new java.awt.Color(255, 255, 255));
        lblClientName.setFont(new java.awt.Font("Cantarell", 1, 24)); // NOI18N
        lblClientName.setForeground(new java.awt.Color(255, 255, 255));
        lblClientName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblClientName.setText("Mehdi");

        lblStatus.setFont(new java.awt.Font("Cantarell", 1, 12)); // NOI18N
        lblStatus.setForeground(new java.awt.Color(51, 255, 0));
        lblStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStatus.setText("Connected");

        jButton1.setBackground(new java.awt.Color(78, 205, 196));
        jButton1.setFont(new java.awt.Font("Lato Semibold", 1, 15)); // NOI18N
        jButton1.setForeground(new java.awt.Color(3, 0, 28));
        jButton1.setText("view");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lblLastMessage.setForeground(new java.awt.Color(255, 140, 66));
        lblLastMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLastMessage.setText("-- -- -- --");
        lblLastMessage.setMaximumSize(new java.awt.Dimension(400, 22));
        lblLastMessage.setMinimumSize(new java.awt.Dimension(400, 22));
        lblLastMessage.setPreferredSize(new java.awt.Dimension(400, 22));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblClientName, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(lblLastMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(lblStatus, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(lblClientName, javax.swing.GroupLayout.PREFERRED_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(lblLastMessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ClientManger.getInctance().setVisible(true);
        ClientManger.getInctance().setViewCliet(client);
    }//GEN-LAST:event_jButton1ActionPerformed

    
    public static String getLastLine(String text) {
        if (text == null || text.isEmpty()) return "";
        String[] lines = text.split("\\R"); 
        String lastLine = lines[lines.length - 1];
        return lastLine.length() > 30 ? lastLine.substring(lastLine.length()- 30, lastLine.length()- 1)  : lastLine;
    }
    
  public void updateView()
 {        
        if (client.status == 0)
             lblStatus.setForeground(Color.green);
        else 
             lblStatus.setForeground(Color.red);
        
    try {
      
        String newMesssage = client.receiveFromServer();        
        if(newMesssage != null) {
            this.lblLastMessage.setText(getLastLine(newMesssage));
        }
        
        lblStatus.setText(client.getStatusText());
        
        } catch (Exception ex) 
        {
           client.status = IrcClient.STATUS_ERROR;
           client.insertData("Erorr#> " + GlobalConfig.ERR_REICEVE_FROM);
                System.err.println(ex.getMessage());
        }
        lblClientName.setText(client.getClientName());
                
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lblClientName;
    private javax.swing.JLabel lblLastMessage;
    private javax.swing.JLabel lblStatus;
    // End of variables declaration//GEN-END:variables
}
