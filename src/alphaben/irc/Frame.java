
package alphaben.irc;

import java.awt.Color;
import javax.swing.BoxLayout;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class Frame extends javax.swing.JFrame { 
    boolean isRunning = false;
    static  Frame instance  = null;
   
    
    public Frame() 
    {
        initComponents();
        
        getContentPane().setBackground(new Color(0x03001C));
        Timer timer = new Timer(16, (ae) -> {
             lblDownload.setText("Download: %s".formatted(GlobalConfig.getDownloadSize()));
            lblUpload.setText("Upload: %s".formatted(GlobalConfig.getUploadSize()));
        }); // 60 FPS
        timer.start();
    }

    public static Frame Instance()
    {
        if (instance == null){
                
            instance = new Frame();
            instance.setTitle("IrcMultiClient v2 by  Alphaben");
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
        jLabel6 = new javax.swing.JLabel();
        txtClientCount = new javax.swing.JFormattedTextField();
        jSeparator1 = new javax.swing.JSeparator();
        btnStart = new javax.swing.JButton();
        lblUpload = new javax.swing.JLabel();
        lblDownload = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ScrollPane.setAutoscrolls(true);

        clinetContainer.setBackground(new java.awt.Color(57, 62, 70));
        clinetContainer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        clinetContainer.setLayout(null);

        lblNoClient.setFont(new java.awt.Font("Cantarell Extra Bold", 1, 24)); // NOI18N
        lblNoClient.setForeground(new java.awt.Color(78, 205, 196));
        lblNoClient.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNoClient.setText("No Client");
        clinetContainer.add(lblNoClient);
        lblNoClient.setBounds(2, 1, 730, 410);

        ScrollPane.setViewportView(clinetContainer);

        Menu.setBackground(new java.awt.Color(3, 0, 28));
        Menu.setLayout(new javax.swing.BoxLayout(Menu, javax.swing.BoxLayout.LINE_AXIS));

        jLabel1.setFont(new java.awt.Font("Cantarell", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 140, 66));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ip");
        jLabel1.setMaximumSize(new java.awt.Dimension(30, 28));
        jLabel1.setMinimumSize(new java.awt.Dimension(30, 28));
        jLabel1.setPreferredSize(new java.awt.Dimension(30, 28));
        Menu.add(jLabel1);

        txtAddress.setBackground(new java.awt.Color(57, 62, 70));
        txtAddress.setFont(new java.awt.Font("Cantarell", 1, 14)); // NOI18N
        txtAddress.setForeground(new java.awt.Color(78, 205, 196));
        txtAddress.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAddress.setText("127.0.0.1");
        txtAddress.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(78, 205, 196), 2, true));
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
        jLabel2.setForeground(new java.awt.Color(255, 140, 66));
        jLabel2.setText("Port");
        Menu.add(jLabel2);

        jSeparator3.setMaximumSize(new java.awt.Dimension(10, 10));
        jSeparator3.setMinimumSize(new java.awt.Dimension(10, 10));
        jSeparator3.setPreferredSize(new java.awt.Dimension(10, 10));
        Menu.add(jSeparator3);

        txtPort.setBackground(new java.awt.Color(57, 62, 70));
        txtPort.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(78, 205, 196), 2, true));
        txtPort.setForeground(new java.awt.Color(78, 205, 196));
        txtPort.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txtPort.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPort.setText("8080");
        txtPort.setFont(new java.awt.Font("Cantarell", 1, 14)); // NOI18N
        txtPort.setMaximumSize(new java.awt.Dimension(60, 28));
        txtPort.setMinimumSize(new java.awt.Dimension(60, 28));
        Menu.add(txtPort);

        jLabel4.setFont(new java.awt.Font("Cantarell", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 140, 66));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Password");
        jLabel4.setMaximumSize(new java.awt.Dimension(120, 28));
        jLabel4.setMinimumSize(new java.awt.Dimension(120, 28));
        jLabel4.setPreferredSize(new java.awt.Dimension(120, 28));
        Menu.add(jLabel4);

        txtPassword.setBackground(new java.awt.Color(57, 62, 70));
        txtPassword.setFont(new java.awt.Font("Cantarell", 1, 14)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(78, 205, 196));
        txtPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPassword.setText("root");
        txtPassword.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(78, 205, 196), 2, true));
        txtPassword.setMaximumSize(new java.awt.Dimension(100, 28));
        txtPassword.setMinimumSize(new java.awt.Dimension(100, 28));
        txtPassword.setPreferredSize(new java.awt.Dimension(100, 28));
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        Menu.add(txtPassword);

        jLabel6.setFont(new java.awt.Font("Cantarell", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 140, 66));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("clients");
        jLabel6.setMaximumSize(new java.awt.Dimension(120, 28));
        jLabel6.setMinimumSize(new java.awt.Dimension(120, 28));
        jLabel6.setPreferredSize(new java.awt.Dimension(120, 28));
        Menu.add(jLabel6);

        txtClientCount.setBackground(new java.awt.Color(57, 62, 70));
        txtClientCount.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(78, 205, 196), 2, true));
        txtClientCount.setForeground(new java.awt.Color(78, 205, 196));
        txtClientCount.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txtClientCount.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtClientCount.setText("200");
        txtClientCount.setFont(new java.awt.Font("Cantarell", 1, 14)); // NOI18N
        txtClientCount.setMaximumSize(new java.awt.Dimension(60, 28));
        txtClientCount.setMinimumSize(new java.awt.Dimension(60, 28));
        Menu.add(txtClientCount);

        jSeparator1.setMaximumSize(new java.awt.Dimension(150, 0));
        jSeparator1.setMinimumSize(new java.awt.Dimension(150, 0));
        jSeparator1.setPreferredSize(new java.awt.Dimension(150, 0));
        Menu.add(jSeparator1);

        btnStart.setBackground(new java.awt.Color(78, 205, 196));
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

        lblUpload.setBackground(new java.awt.Color(255, 51, 102));
        lblUpload.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        lblUpload.setForeground(new java.awt.Color(255, 51, 102));
        lblUpload.setText("Upload : 45.5Gb  ");

        lblDownload.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        lblDownload.setForeground(new java.awt.Color(153, 255, 153));
        lblDownload.setText("Dowlonad  : 45.5Gb  ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Menu, javax.swing.GroupLayout.DEFAULT_SIZE, 904, Short.MAX_VALUE)
                            .addComponent(ScrollPane)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(lblDownload, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblUpload, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(ScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDownload)
                    .addComponent(lblUpload, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
     
    }//GEN-LAST:event_txtAddressActionPerformed

    
    private  void validationError(String s){
    
                JOptionPane.showMessageDialog(null, s);
               btnStart.setText("Start");
              btnStart.setEnabled(true);
                GlobalConfig.command = 0;
    }
    
   public void runCommand()
   {
       
       
       
        
        if  (GlobalConfig.command == GlobalConfig.Start)
        {  
            
           btnStart.setText("Stop");
           
           String   StringAddress     = txtAddress.getText();
           String   StringPort       = txtPort.getText();
           String   StringPassword   = txtPassword.getText();
           int port         = 0;
           int clientCount  = 0;
        if(StringAddress.trim().isEmpty() || StringPort.trim().isEmpty()  || StringPassword.trim().isEmpty())
        {
  
              validationError(GlobalConfig.EMPTY_FIELDS);
        
                  return;
        }
        try{
            
              port = Integer.parseInt(StringPort);
             clientCount =Integer.parseInt(txtClientCount.getText());
        }catch(NumberFormatException ex){
              validationError(GlobalConfig.BAD_PORT_CLIENT_COUNT);
          
              return;
        }
   
        
        if (clientCount <= 0){
             validationError(GlobalConfig.CLIENT_NEGATIVE_ERROR);
              return;
        }
            
        if (port <= 0){
           
             validationError(GlobalConfig.BAD_PORT_CLIENT_COUNT);
              return;
        }
        GlobalConfig.SERVER_PASS = StringPassword;
        clinetContainer.removeAll();
        clinetContainer.setLayout(new BoxLayout(clinetContainer, BoxLayout.Y_AXIS));

        for(int i = 0; i<  clientCount; i++)
        {
            String name;
              if(i < GlobalConfig.names.length){
                name =  GlobalConfig.names[i];
              } else {
                   name =  GlobalConfig.names[i % 200] + (char)((int)'a' + (i % 25));
              }
                    
            this.clinetContainer.add(new ClientPanel(new IrcClient(StringAddress,port, name)));
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
                } catch (Exception ex) {
                
                }    
         
            }
            
            ClientManger.getInctance().setVisible(false);
            GlobalConfig.reset();
            clinetContainer.validate();
            ClientPanel.clinets.clear();           
             btnStart.setText("Start");
             clinetContainer.add(lblNoClient);
               GlobalConfig.command = 0;
        }
        else
            return;
        
           isRunning = !isRunning;

          btnStart.setEnabled(true);
           
        GlobalConfig.command = 0;
   
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
 
        System.err.close(); // this for avoid unkow graphic exception 
       
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
                System.err.println("run");
                
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblDownload;
    private javax.swing.JLabel lblNoClient;
    private javax.swing.JLabel lblUpload;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JFormattedTextField txtClientCount;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JFormattedTextField txtPort;
    // End of variables declaration//GEN-END:variables
}
