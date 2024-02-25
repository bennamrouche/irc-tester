
package alphaben.irc;

import java.awt.Color;


public class ClientManger extends javax.swing.JFrame {
  
    private ircClient client;
    private static  ClientManger instance = null;
    
 public ClientManger() 
 {
        this.client = null;
        initComponents();
        this.getContentPane().setBackground(Color.black);
      
 }
 /*
JOIN #
PRIVMSG #
PART #
QUIT
*/
 public static ClientManger getInctance()
 {
     if (instance == null)
     {
         instance = new ClientManger();
         instance.setDefaultCloseOperation(Frame.HIDE_ON_CLOSE);
     }
     return instance;
 }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtClientData = new javax.swing.JTextArea();
        commanmPanel = new javax.swing.JPanel();
        lblName = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        lblStatus = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        lblStatus1 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        btnJoin = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        btnPrivmsg = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        btnPart = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JSeparator();
        btnQuit = new javax.swing.JButton();
        SendPanel = new javax.swing.JPanel();
        lblMessage = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        btnSend = new javax.swing.JButton();
        jSeparator9 = new javax.swing.JSeparator();
        btnSendAll = new javax.swing.JButton();
        jSeparator8 = new javax.swing.JSeparator();
        btnDisconnected = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        txtClientData.setEditable(false);
        txtClientData.setBackground(new java.awt.Color(0, 0, 0));
        txtClientData.setColumns(20);
        txtClientData.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        txtClientData.setForeground(new java.awt.Color(255, 255, 255));
        txtClientData.setRows(5);
        jScrollPane1.setViewportView(txtClientData);

        commanmPanel.setBackground(new java.awt.Color(0, 0, 0));
        commanmPanel.setMaximumSize(new java.awt.Dimension(100, 20));
        commanmPanel.setLayout(new javax.swing.BoxLayout(commanmPanel, javax.swing.BoxLayout.LINE_AXIS));

        lblName.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        lblName.setForeground(new java.awt.Color(255, 211, 105));
        lblName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblName.setText("Mord Razi");
        commanmPanel.add(lblName);

        jSeparator2.setBackground(new Color(0,0,0,0)
        );
        jSeparator2.setForeground(new Color(0,0,0,0));
        jSeparator2.setMaximumSize(new java.awt.Dimension(20, 10));
        jSeparator2.setMinimumSize(new java.awt.Dimension(20, 10));
        jSeparator2.setPreferredSize(new java.awt.Dimension(20, 10));
        commanmPanel.add(jSeparator2);

        lblStatus.setBackground(new java.awt.Color(204, 255, 102));
        lblStatus.setFont(new java.awt.Font("Cantarell", 1, 14)); // NOI18N
        lblStatus.setForeground(new java.awt.Color(51, 255, 0));
        lblStatus.setText("Connected");
        lblStatus.setMaximumSize(new java.awt.Dimension(69, 28));
        lblStatus.setMinimumSize(new java.awt.Dimension(69, 28));
        lblStatus.setPreferredSize(new java.awt.Dimension(69, 28));
        commanmPanel.add(lblStatus);

        jSeparator4.setBackground(new Color(0,0,0,0)
        );
        jSeparator4.setForeground(new Color(0,0,0,0));
        jSeparator4.setMaximumSize(new java.awt.Dimension(20, 10));
        jSeparator4.setMinimumSize(new java.awt.Dimension(20, 10));
        jSeparator4.setPreferredSize(new java.awt.Dimension(20, 10));
        commanmPanel.add(jSeparator4);

        lblStatus1.setBackground(new java.awt.Color(204, 255, 102));
        lblStatus1.setFont(new java.awt.Font("Cantarell", 1, 14)); // NOI18N
        lblStatus1.setForeground(new java.awt.Color(255, 211, 105));
        lblStatus1.setText("Commands : ");
        lblStatus1.setMaximumSize(new java.awt.Dimension(83, 28));
        lblStatus1.setMinimumSize(new java.awt.Dimension(83, 28));
        commanmPanel.add(lblStatus1);

        jSeparator6.setBackground(new Color(0,0,0,0)
        );
        jSeparator6.setForeground(new Color(0,0,0,0));
        jSeparator6.setMaximumSize(new java.awt.Dimension(20, 10));
        jSeparator6.setMinimumSize(new java.awt.Dimension(20, 10));
        jSeparator6.setPreferredSize(new java.awt.Dimension(20, 10));
        commanmPanel.add(jSeparator6);

        btnJoin.setBackground(new java.awt.Color(255, 211, 105));
        btnJoin.setFont(new java.awt.Font("Cantarell", 1, 12)); // NOI18N
        btnJoin.setText("JOIN");
        btnJoin.setMaximumSize(new java.awt.Dimension(72, 28));
        btnJoin.setMinimumSize(new java.awt.Dimension(72, 28));
        btnJoin.setPreferredSize(new java.awt.Dimension(7, 28));
        btnJoin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJoinActionPerformed(evt);
            }
        });
        commanmPanel.add(btnJoin);

        jSeparator1.setBackground(new Color(0,0,0,0)
        );
        jSeparator1.setForeground(new Color(0,0,0,0));
        jSeparator1.setMaximumSize(new java.awt.Dimension(20, 10));
        jSeparator1.setMinimumSize(new java.awt.Dimension(20, 10));
        jSeparator1.setPreferredSize(new java.awt.Dimension(20, 10));
        commanmPanel.add(jSeparator1);

        btnPrivmsg.setBackground(new java.awt.Color(255, 211, 105));
        btnPrivmsg.setFont(new java.awt.Font("Cantarell", 1, 12)); // NOI18N
        btnPrivmsg.setText("PRIVMSG");
        btnPrivmsg.setMaximumSize(new java.awt.Dimension(90, 28));
        btnPrivmsg.setMinimumSize(new java.awt.Dimension(90, 28));
        btnPrivmsg.setPreferredSize(new java.awt.Dimension(90, 28));
        btnPrivmsg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrivmsgActionPerformed(evt);
            }
        });
        commanmPanel.add(btnPrivmsg);

        jSeparator3.setBackground(new Color(0,0,0,0)
        );
        jSeparator3.setForeground(new Color(0,0,0,0));
        jSeparator3.setMaximumSize(new java.awt.Dimension(20, 10));
        jSeparator3.setMinimumSize(new java.awt.Dimension(20, 10));
        jSeparator3.setPreferredSize(new java.awt.Dimension(20, 10));
        commanmPanel.add(jSeparator3);

        btnPart.setBackground(new java.awt.Color(255, 211, 105));
        btnPart.setFont(new java.awt.Font("Cantarell", 1, 12)); // NOI18N
        btnPart.setText("PART");
        btnPart.setMaximumSize(new java.awt.Dimension(72, 28));
        btnPart.setMinimumSize(new java.awt.Dimension(72, 28));
        btnPart.setPreferredSize(new java.awt.Dimension(72, 28));
        btnPart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPartActionPerformed(evt);
            }
        });
        commanmPanel.add(btnPart);

        jSeparator5.setBackground(new Color(0,0,0,0)
        );
        jSeparator5.setForeground(new Color(0,0,0,0));
        jSeparator5.setMaximumSize(new java.awt.Dimension(20, 10));
        jSeparator5.setMinimumSize(new java.awt.Dimension(20, 10));
        jSeparator5.setPreferredSize(new java.awt.Dimension(20, 10));
        commanmPanel.add(jSeparator5);

        btnQuit.setBackground(new java.awt.Color(255, 211, 105));
        btnQuit.setFont(new java.awt.Font("Cantarell", 1, 12)); // NOI18N
        btnQuit.setText("QUIT");
        btnQuit.setMaximumSize(new java.awt.Dimension(72, 28));
        btnQuit.setMinimumSize(new java.awt.Dimension(72, 28));
        btnQuit.setPreferredSize(new java.awt.Dimension(72, 28));
        btnQuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitActionPerformed(evt);
            }
        });
        commanmPanel.add(btnQuit);

        SendPanel.setBackground(new java.awt.Color(0, 0, 0));
        SendPanel.setLayout(new javax.swing.BoxLayout(SendPanel, javax.swing.BoxLayout.LINE_AXIS));

        lblMessage.setBackground(new java.awt.Color(57, 62, 70));
        lblMessage.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        lblMessage.setForeground(new java.awt.Color(255, 211, 105));
        lblMessage.setMaximumSize(new java.awt.Dimension(300, 28));
        lblMessage.setMinimumSize(new java.awt.Dimension(200, 28));
        lblMessage.setPreferredSize(new java.awt.Dimension(200, 28));
        lblMessage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblMessageActionPerformed(evt);
            }
        });
        SendPanel.add(lblMessage);

        jSeparator7.setBackground(new Color(0,0,0,0)
        );
        jSeparator7.setForeground(new Color(0,0,0,0));
        jSeparator7.setMaximumSize(new java.awt.Dimension(33, 32767));
        jSeparator7.setMinimumSize(new java.awt.Dimension(30, 10));
        jSeparator7.setPreferredSize(new java.awt.Dimension(30, 10));
        SendPanel.add(jSeparator7);

        btnSend.setBackground(new java.awt.Color(255, 211, 105));
        btnSend.setFont(new java.awt.Font("Cantarell", 1, 14)); // NOI18N
        btnSend.setText("Send ");
        btnSend.setMaximumSize(new java.awt.Dimension(72, 28));
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });
        SendPanel.add(btnSend);

        jSeparator9.setBackground(new Color(0,0,0,0)
        );
        jSeparator9.setForeground(new Color(0,0,0,0));
        jSeparator9.setMaximumSize(new java.awt.Dimension(33, 32767));
        jSeparator9.setMinimumSize(new java.awt.Dimension(30, 10));
        jSeparator9.setPreferredSize(new java.awt.Dimension(10, 10));
        SendPanel.add(jSeparator9);

        btnSendAll.setBackground(new java.awt.Color(255, 211, 105));
        btnSendAll.setFont(new java.awt.Font("Cantarell", 1, 14)); // NOI18N
        btnSendAll.setText("all Send this");
        btnSendAll.setMaximumSize(new java.awt.Dimension(120, 28));
        btnSendAll.setMinimumSize(new java.awt.Dimension(120, 28));
        btnSendAll.setPreferredSize(new java.awt.Dimension(120, 28));
        btnSendAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendAllActionPerformed(evt);
            }
        });
        SendPanel.add(btnSendAll);

        jSeparator8.setBackground(new Color(0,0,0,0)
        );
        jSeparator8.setForeground(new Color(0,0,0,0));
        jSeparator8.setMaximumSize(new java.awt.Dimension(40, 10));
        jSeparator8.setMinimumSize(new java.awt.Dimension(40, 10));
        jSeparator8.setPreferredSize(new java.awt.Dimension(40, 10));
        SendPanel.add(jSeparator8);

        btnDisconnected.setBackground(new java.awt.Color(255, 211, 105));
        btnDisconnected.setFont(new java.awt.Font("Cantarell", 1, 14)); // NOI18N
        btnDisconnected.setForeground(new java.awt.Color(51, 0, 0));
        btnDisconnected.setText("Disconnected");
        btnDisconnected.setMaximumSize(new java.awt.Dimension(120, 28));
        btnDisconnected.setMinimumSize(new java.awt.Dimension(120, 28));
        btnDisconnected.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisconnectedActionPerformed(evt);
            }
        });
        SendPanel.add(btnDisconnected);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(commanmPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SendPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(commanmPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(SendPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
       client.SendToServer(lblMessage.getText() + "\n");
        update();
    }//GEN-LAST:event_btnSendActionPerformed

    private void btnDisconnectedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisconnectedActionPerformed
            client.Disconnected();
            update();
    }//GEN-LAST:event_btnDisconnectedActionPerformed

    private void btnSendAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendAllActionPerformed
   
        String msg = lblMessage.getText();
     btnSendAll.setEnabled(false);
      btnSendAll.setText("Wait ..."); //all Send this
       if(msg.length() == 0)
           return ;
       for(ClientPanel clt : ClientPanel.clinets)
       {
            clt.client.SendToServer(msg);
          
       }
       
     btnSendAll.setEnabled(true);
     btnSendAll.setText("all Send this");
    }//GEN-LAST:event_btnSendAllActionPerformed

    private void lblMessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblMessageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblMessageActionPerformed

    private void btnJoinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJoinActionPerformed
       lblMessage.setText("JOIN # ");
    }//GEN-LAST:event_btnJoinActionPerformed

    private void btnPrivmsgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrivmsgActionPerformed
       lblMessage.setText("PRIVMSG ");
    }//GEN-LAST:event_btnPrivmsgActionPerformed

    private void btnPartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPartActionPerformed
            lblMessage.setText("PART # ");
    }//GEN-LAST:event_btnPartActionPerformed

    private void btnQuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitActionPerformed
         lblMessage.setText("QUIT ");
    }//GEN-LAST:event_btnQuitActionPerformed

    
    
public void  SetViewCliet(ircClient client)
{
       this.client = client;
       update();
}



public void updateData()
{
     if (client == null)
         return;
     txtClientData.setText(client.getData());
}


public void update()
{
     if (client == null)
         return;
     
     lblMessage.setText("");
     txtClientData.setText("");
     
    if (client.status == 0)
             lblStatus.setForeground(Color.green);
    else 
             lblStatus.setForeground(Color.red);
    boolean enable = client.status == ircClient.STATUS_CONNECTED;
    
    btnDisconnected.setEnabled(enable);
    btnSend.setEnabled(enable);
    btnSendAll.setEnabled(enable);
    
    btnPrivmsg.setEnabled(enable);
    btnPart.setEnabled(enable);
    btnQuit.setEnabled(enable);
    btnJoin.setEnabled(enable);
             
     lblStatus.setText(client.getStatusText());
     lblName.setText(client.getClientName());  
     txtClientData.setText(client.getData());
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel SendPanel;
    private javax.swing.JButton btnDisconnected;
    private javax.swing.JButton btnJoin;
    private javax.swing.JButton btnPart;
    private javax.swing.JButton btnPrivmsg;
    private javax.swing.JButton btnQuit;
    private javax.swing.JButton btnSend;
    private javax.swing.JButton btnSendAll;
    private javax.swing.JPanel commanmPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField lblMessage;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblStatus1;
    private javax.swing.JTextArea txtClientData;
    // End of variables declaration//GEN-END:variables
}
