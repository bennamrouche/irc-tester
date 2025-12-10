
package alphaben.irc;

import java.awt.Color;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.SwingWorker;

public class ClientManger extends javax.swing.JFrame {
  
    private IrcClient               client;
    private static              ClientManger instance = null;
    
 public ClientManger() 
 {
        this.client = null;
        initComponents();
        this.getContentPane().setBackground(Color.black);
        progressBar.setVisible(false);
      
 }

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
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        progressBar = new javax.swing.JProgressBar();
        jScrollPane2 = new javax.swing.JScrollPane();
        lblMessage = new javax.swing.JTextPane();
        jLabel2 = new javax.swing.JLabel();
        btnSend = new javax.swing.JButton();
        btnSendAll = new javax.swing.JButton();
        btnDisconnected = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        txtClientData.setBackground(new java.awt.Color(45, 49, 66));
        txtClientData.setColumns(20);
        txtClientData.setForeground(new java.awt.Color(255, 255, 255));
        txtClientData.setRows(5);
        jScrollPane1.setViewportView(txtClientData);

        commanmPanel.setBackground(new java.awt.Color(79, 93, 117));
        commanmPanel.setMaximumSize(new java.awt.Dimension(100, 20));
        commanmPanel.setLayout(new javax.swing.BoxLayout(commanmPanel, javax.swing.BoxLayout.LINE_AXIS));

        lblName.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        lblName.setForeground(new java.awt.Color(255, 217, 61));
        lblName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblName.setText("alphaben");
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
        lblStatus.setForeground(new java.awt.Color(78, 205, 196));
        lblStatus.setText("Connected");
        lblStatus.setMaximumSize(new java.awt.Dimension(69, 28));
        lblStatus.setMinimumSize(new java.awt.Dimension(69, 28));
        lblStatus.setPreferredSize(new java.awt.Dimension(69, 28));
        commanmPanel.add(lblStatus);

        jSeparator6.setBackground(new Color(0,0,0,0)
        );
        jSeparator6.setForeground(new Color(0,0,0,0));
        jSeparator6.setMaximumSize(new java.awt.Dimension(20, 10));
        jSeparator6.setMinimumSize(new java.awt.Dimension(20, 10));
        jSeparator6.setPreferredSize(new java.awt.Dimension(20, 10));
        commanmPanel.add(jSeparator6);

        jSeparator5.setBackground(new Color(0,0,0,0)
        );
        jSeparator5.setForeground(new Color(0,0,0,0));
        jSeparator5.setMaximumSize(new java.awt.Dimension(20, 10));
        jSeparator5.setMinimumSize(new java.awt.Dimension(20, 10));
        jSeparator5.setPreferredSize(new java.awt.Dimension(20, 10));
        commanmPanel.add(jSeparator5);

        jSeparator10.setBackground(new Color(0,0,0,0)
        );
        jSeparator10.setForeground(new Color(0,0,0,0));
        jSeparator10.setMaximumSize(new java.awt.Dimension(20, 10));
        jSeparator10.setMinimumSize(new java.awt.Dimension(20, 10));
        jSeparator10.setPreferredSize(new java.awt.Dimension(20, 10));
        commanmPanel.add(jSeparator10);

        jSeparator11.setBackground(new Color(0,0,0,0)
        );
        jSeparator11.setForeground(new Color(0,0,0,0));
        jSeparator11.setMaximumSize(new java.awt.Dimension(20, 10));
        jSeparator11.setMinimumSize(new java.awt.Dimension(20, 10));
        jSeparator11.setPreferredSize(new java.awt.Dimension(20, 10));
        commanmPanel.add(jSeparator11);

        progressBar.setValue(50);
        commanmPanel.add(progressBar);

        lblMessage.setBackground(new java.awt.Color(0, 0, 0));
        lblMessage.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jScrollPane2.setViewportView(lblMessage);

        btnSend.setBackground(new java.awt.Color(78, 205, 196));
        btnSend.setFont(new java.awt.Font("Cantarell", 1, 14)); // NOI18N
        btnSend.setText("Send");
        btnSend.setMaximumSize(new java.awt.Dimension(72, 28));
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });

        btnSendAll.setBackground(new java.awt.Color(78, 205, 196));
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

        btnDisconnected.setBackground(new java.awt.Color(78, 205, 196));
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(commanmPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 706, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSendAll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSend, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDisconnected, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(commanmPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(3, 3, 3)
                        .addComponent(jScrollPane2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 131, Short.MAX_VALUE)
                        .addComponent(btnSend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSendAll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDisconnected, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed

       new SwingWorker<Void, Void>() {
        @Override
        protected Void doInBackground() {
  
       List<String> nonEmptyLines = lblMessage.getText().lines().filter(s -> !s.isBlank()).collect(Collectors.toList());
       if(nonEmptyLines.isEmpty()) return null;
       progressBar.setValue(0);
       progressBar.setVisible(true);
       progressBar.setMaximum(nonEmptyLines.size());
       progressBar.setStringPainted(true);
       setEnable(false);
       for(String message : nonEmptyLines)
       {
            client.sendToServer("%s\r\n".formatted(message));
     
           progressBar.setValue(progressBar.getValue() + 1);
       }
        update();
        progressBar.setVisible(true); 
        
       return null;
        }

        @Override
        protected void done()
        {
           
             setEnable(true);
            btnSendAll.setText("all Send this");
            progressBar.setVisible(false);
         
        }
    }.execute();
          

    }//GEN-LAST:event_btnSendActionPerformed

    private void btnDisconnectedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisconnectedActionPerformed
            client.disconnect();
            update();
    }//GEN-LAST:event_btnDisconnectedActionPerformed

    private void btnSendAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendAllActionPerformed

       new SwingWorker<Void, Void>() {
        @Override
        protected Void doInBackground() {
        List<String> nonEmptyLines = lblMessage.getText().lines().filter(s -> !s.isBlank()).collect(Collectors.toList());
       
        if(nonEmptyLines.isEmpty()) return null;
       progressBar.setValue(0);
       progressBar.setVisible(true);
       progressBar.setMaximum(nonEmptyLines.size() * ClientPanel.clinets.size());  
       progressBar.setStringPainted(true);
       setEnable(false);
       btnSendAll.setText("Wait ..."); //all Send this
       for(ClientPanel clt : ClientPanel.clinets)
       {
         for(String message : nonEmptyLines)
        {
            clt.client.sendToServer("%s\r\n".formatted(message));
            progressBar.setValue(progressBar.getValue() + 1);
        }
       } 
        
       return null;
        }

        @Override
        protected void done()
        {
             btnSendAll.setEnabled(true);
             setEnable(true);
             lblMessage.setText("");
            btnSendAll.setText("all Send this");
            progressBar.setVisible(false);
         
        }
    }.execute();

    
    }//GEN-LAST:event_btnSendAllActionPerformed

    private void setEnable(boolean ststus){
    
        btnDisconnected.setEnabled(ststus);
        btnSend.setEnabled(ststus);
        btnSendAll.setEnabled(ststus);
    }
    
public void  setViewCliet(IrcClient client)
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
    
    Color color =  client.status == 0 ? Color.green : Color.red;
   
     lblStatus.setForeground(color);
    boolean enable = client.status == IrcClient.STATUS_CONNECTED;
    
    setEnable(enable);
   
    lblStatus.setText(client.getStatusText());
    lblName.setText(client.getClientName());  
    txtClientData.setText(client.getData());
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDisconnected;
    private javax.swing.JButton btnSend;
    private javax.swing.JButton btnSendAll;
    private javax.swing.JPanel commanmPanel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTextPane lblMessage;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JProgressBar progressBar;
    private javax.swing.JTextArea txtClientData;
    // End of variables declaration//GEN-END:variables
}
