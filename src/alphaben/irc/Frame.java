
package alphaben.irc;

import java.awt.Color;
import javax.swing.BoxLayout;
import javax.swing.JOptionPane;

public class Frame extends javax.swing.JFrame { 
    boolean isRunning = false;
   static  Frame instance  = null;
    
    public Frame() 
    {
        initComponents();
        
        getContentPane().setBackground(new Color(0x03001C));
    }

    public static Frame Instance()
    {
        if (instance == null){
                
            instance = new Frame();
            instance.setTitle("[+] IrcMultiClient #  Alphaben [+]");
        }
                
        return instance; 
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ScrollPane = new javax.swing.JScrollPane();
        clinetContainer = new javax.swing.JPanel();
        lblNoClient = new javax.swing.JLabel();
        Menu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        txtPort = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        btnStart = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ScrollPane.setAutoscrolls(true);

        clinetContainer.setBackground(new java.awt.Color(57, 62, 70));
        clinetContainer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        clinetContainer.setLayout(null);

        lblNoClient.setFont(new java.awt.Font("Cantarell Extra Bold", 1, 24)); // NOI18N
        lblNoClient.setForeground(new java.awt.Color(255, 211, 105));
        lblNoClient.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNoClient.setText("No Client");
        clinetContainer.add(lblNoClient);
        lblNoClient.setBounds(2, 1, 730, 440);

        ScrollPane.setViewportView(clinetContainer);

        Menu.setBackground(new java.awt.Color(3, 0, 28));
        Menu.setLayout(new javax.swing.BoxLayout(Menu, javax.swing.BoxLayout.LINE_AXIS));

        jLabel1.setFont(new java.awt.Font("Cantarell", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 211, 105));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("IP");
        jLabel1.setMaximumSize(new java.awt.Dimension(30, 28));
        jLabel1.setMinimumSize(new java.awt.Dimension(30, 28));
        jLabel1.setPreferredSize(new java.awt.Dimension(30, 28));
        Menu.add(jLabel1);

        txtAddress.setBackground(new java.awt.Color(57, 62, 70));
        txtAddress.setFont(new java.awt.Font("Cantarell", 1, 14)); // NOI18N
        txtAddress.setForeground(new java.awt.Color(255, 211, 105));
        txtAddress.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAddress.setText("127.0.0.1");
        txtAddress.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 211, 105), 2, true));
        txtAddress.setMaximumSize(new java.awt.Dimension(100, 28));
        txtAddress.setMinimumSize(new java.awt.Dimension(100, 28));
        txtAddress.setPreferredSize(new java.awt.Dimension(100, 28));
        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });
        Menu.add(txtAddress);

        jSeparator2.setMaximumSize(new java.awt.Dimension(50, 0));
        jSeparator2.setMinimumSize(new java.awt.Dimension(50, 0));
        jSeparator2.setPreferredSize(new java.awt.Dimension(50, 0));
        Menu.add(jSeparator2);

        jLabel2.setBackground(new java.awt.Color(255, 211, 105));
        jLabel2.setFont(new java.awt.Font("Cantarell", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 211, 105));
        jLabel2.setText("PORT");
        Menu.add(jLabel2);

        jSeparator3.setMaximumSize(new java.awt.Dimension(10, 10));
        jSeparator3.setMinimumSize(new java.awt.Dimension(10, 10));
        jSeparator3.setPreferredSize(new java.awt.Dimension(10, 10));
        Menu.add(jSeparator3);

        txtPort.setBackground(new java.awt.Color(57, 62, 70));
        txtPort.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 211, 105), 2, true));
        txtPort.setForeground(new java.awt.Color(255, 211, 105));
        txtPort.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txtPort.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPort.setText("8080");
        txtPort.setFont(new java.awt.Font("Cantarell", 1, 14)); // NOI18N
        txtPort.setMaximumSize(new java.awt.Dimension(60, 28));
        txtPort.setMinimumSize(new java.awt.Dimension(60, 28));
        Menu.add(txtPort);

        jLabel4.setFont(new java.awt.Font("Cantarell", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 211, 105));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Password");
        jLabel4.setMaximumSize(new java.awt.Dimension(120, 28));
        jLabel4.setMinimumSize(new java.awt.Dimension(120, 28));
        jLabel4.setPreferredSize(new java.awt.Dimension(120, 28));
        Menu.add(jLabel4);

        txtPassword.setBackground(new java.awt.Color(57, 62, 70));
        txtPassword.setFont(new java.awt.Font("Cantarell", 1, 14)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(255, 211, 105));
        txtPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPassword.setText("root");
        txtPassword.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 211, 105), 2, true));
        txtPassword.setMaximumSize(new java.awt.Dimension(100, 28));
        txtPassword.setMinimumSize(new java.awt.Dimension(100, 28));
        txtPassword.setPreferredSize(new java.awt.Dimension(100, 28));
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        Menu.add(txtPassword);

        jSeparator1.setMaximumSize(new java.awt.Dimension(150, 0));
        jSeparator1.setMinimumSize(new java.awt.Dimension(150, 0));
        jSeparator1.setPreferredSize(new java.awt.Dimension(150, 0));
        Menu.add(jSeparator1);

        btnStart.setBackground(new java.awt.Color(255, 211, 105));
        btnStart.setFont(new java.awt.Font("Cantarell", 1, 14)); // NOI18N
        btnStart.setText("Start");
        btnStart.setMaximumSize(new java.awt.Dimension(72, 28));
        btnStart.setMinimumSize(new java.awt.Dimension(72, 28));
        btnStart.setPreferredSize(new java.awt.Dimension(72, 28));
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });
        Menu.add(btnStart);

        jLabel3.setFont(new java.awt.Font("Cantarell", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("<html> Enter <b> IP </b> ,  <b> Password</b> and  <b> Port </b>  to Connect , IrcMultiClient Connect you to <b>200 </b> client automaticly  <br>              and each one of them is joined to a channel  \"room\"  </html> ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Menu, javax.swing.GroupLayout.DEFAULT_SIZE, 749, Short.MAX_VALUE)
                        .addComponent(ScrollPane)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(ScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
     
    }//GEN-LAST:event_txtAddressActionPerformed

    
    
    
   public void runCommand()
   {
        if  (GlobalConfig.command == GlobalConfig.Start)
        {  
            
           btnStart.setText("Stop");
           String StringAddress = txtAddress.getText();
           String  StringPort = txtPort.getText();
           String  StringPassword = txtPassword.getText();
            int port;
        if(StringAddress.length() == 0 || StringPort.length() == 0 || StringPassword.length() == 0)
        {
                JOptionPane.showMessageDialog(null, GlobalConfig.EMPTY_FIELDS);
                btnStart.setEnabled(true);
                  return;
        }
        
        port = Integer.parseInt(StringPort);
        GlobalConfig.SERVER_PASS = StringPassword;
        clinetContainer.removeAll();
        clinetContainer.setLayout(new BoxLayout(clinetContainer, BoxLayout.Y_AXIS));

        for(int i = 0; i<  200; i++)
        {
            this.clinetContainer.add(new ClientPanel(new ircClient(StringAddress,port, GlobalConfig.names[i])));
             this.validate();
        }
        GlobalConfig.command = 0;
     }// end if check is runnig 
        else if (GlobalConfig.command == GlobalConfig.Stop)
        {   
            for (ClientPanel pn : ClientPanel.clinets)
            {
                try {
                       clinetContainer.remove(pn);
                       pn.client.sock.close();
                } catch (Exception ex) { }
                
                 clinetContainer.validate();
            }
             ClientPanel.clinets.clear();           
             btnStart.setText("Start");
             clinetContainer.add(lblNoClient);
               GlobalConfig.command = 0;
        }
        else
            return;
        
           isRunning = !isRunning;
          
          btnStart.setEnabled(true);
   
   }
    
    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
           btnStart.setEnabled(false);
           if (isRunning)
                    GlobalConfig.command = GlobalConfig.Stop;
           else 
                  GlobalConfig.command = GlobalConfig.Start;
        
    }//GEN-LAST:event_btnStartActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
      
    }//GEN-LAST:event_txtPasswordActionPerformed

   
    public static void main(String args[]) {
       System.err.close();
//        System.exit(0);
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
             Frame fr=         Frame.Instance();
            fr.setVisible(true);
            fr.setLocationRelativeTo(null);
              GlobalConfig.Mintor.start();
                
            }
        });
        
   
      
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Menu;
    private javax.swing.JScrollPane ScrollPane;
    private javax.swing.JButton btnStart;
    private javax.swing.JPanel clinetContainer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblNoClient;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JFormattedTextField txtPort;
    // End of variables declaration//GEN-END:variables
}
