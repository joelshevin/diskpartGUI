    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diskpart;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.System.exit;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author Joel
 */
public class MainDrive0Newpartition extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public MainDrive0Newpartition() throws IOException {
        
    
        initComponents();
        setIcon();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jProgressBar2 = new javax.swing.JProgressBar();
        jLabel9 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        jProgressBar3 = new javax.swing.JProgressBar();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jProgressBar4 = new javax.swing.JProgressBar();
        jLabel21 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jProgressBar5 = new javax.swing.JProgressBar();
        jLabel24 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jProgressBar6 = new javax.swing.JProgressBar();
        jLabel22 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Diskpart");
        setBackground(new java.awt.Color(204, 204, 204));
        setForeground(new java.awt.Color(0, 102, 102));
        setIconImages(null);
        setLocation(new java.awt.Point(380, 90));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 51, 102));
        jPanel3.setForeground(new java.awt.Color(0, 153, 255));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-Exit-26.png"))); // NOI18N
        jLabel4.setToolTipText("Quit Diskpart");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-Help-25.png"))); // NOI18N
        jLabel5.setToolTipText("Help");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-Console-26.png"))); // NOI18N
        jLabel6.setToolTipText("Run Advanced task");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-Home-26.png"))); // NOI18N
        jLabel7.setToolTipText("Home");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(123, 123, 123))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 290, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(29, 29, 29))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 530));

        jPanel1.setBackground(new java.awt.Color(218, 218, 218));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N
        jLabel1.setText("Status: Online");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(110, 280, 110, 20);

        jProgressBar1.setBackground(new java.awt.Color(153, 153, 153));
        jProgressBar1.setForeground(new java.awt.Color(204, 51, 0));
        jProgressBar1.setValue(75);
        jProgressBar1.setBorderPainted(false);
        jProgressBar1.setString("75 GB free of 250 GB");
        jProgressBar1.setStringPainted(true);
        jPanel1.add(jProgressBar1);
        jProgressBar1.setBounds(110, 260, 330, 17);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 15)); // NOI18N
        jLabel3.setText("Drive 1");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 210, 51, 20);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(20, 410, 750, 10);

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 15)); // NOI18N
        jLabel8.setText("Drive 0");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(10, 10, 53, 20);

        jProgressBar2.setBackground(new java.awt.Color(153, 153, 153));
        jProgressBar2.setForeground(new java.awt.Color(0, 102, 204));
        jProgressBar2.setValue(25);
        jProgressBar2.setBorderPainted(false);
        jProgressBar2.setString("750 GB free of 1 TB");
        jProgressBar2.setStringPainted(true);
        jPanel1.add(jProgressBar2);
        jProgressBar2.setBounds(500, 70, 200, 17);

        jLabel9.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N
        jLabel9.setText("Status: Online");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(110, 70, 110, 20);
        jPanel1.add(jSeparator2);
        jSeparator2.setBounds(20, 200, 750, 2);

        jLabel15.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jLabel15.setText("Partitions");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(500, 240, 100, 30);

        jProgressBar3.setBackground(new java.awt.Color(153, 153, 153));
        jProgressBar3.setForeground(new java.awt.Color(0, 102, 204));
        jProgressBar3.setValue(25);
        jProgressBar3.setBorderPainted(false);
        jProgressBar3.setString("750 GB free of 1 TB");
        jProgressBar3.setStringPainted(true);
        jPanel1.add(jProgressBar3);
        jProgressBar3.setBounds(110, 50, 330, 17);

        jLabel17.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        jLabel17.setText("C:");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(500, 50, 20, 20);

        jLabel18.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        jLabel18.setText("File system: NTFS");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(500, 90, 170, 20);

        jLabel16.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jLabel16.setText("Partitions");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(500, 20, 100, 30);

        jLabel20.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        jLabel20.setText("E:");
        jPanel1.add(jLabel20);
        jLabel20.setBounds(500, 270, 20, 20);

        jProgressBar4.setBackground(new java.awt.Color(153, 153, 153));
        jProgressBar4.setForeground(new java.awt.Color(0, 102, 204));
        jProgressBar4.setValue(50);
        jProgressBar4.setBorderPainted(false);
        jProgressBar4.setRequestFocusEnabled(false);
        jProgressBar4.setString("50 GB free of 100 GB");
        jProgressBar4.setStringPainted(true);
        jPanel1.add(jProgressBar4);
        jProgressBar4.setBounds(500, 290, 200, 17);

        jLabel21.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jLabel21.setText("File system: NTFS");
        jPanel1.add(jLabel21);
        jLabel21.setBounds(500, 310, 170, 20);

        jLabel23.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        jLabel23.setText("F:");
        jPanel1.add(jLabel23);
        jLabel23.setBounds(500, 340, 20, 20);

        jProgressBar5.setBackground(new java.awt.Color(153, 153, 153));
        jProgressBar5.setForeground(new java.awt.Color(204, 51, 0));
        jProgressBar5.setValue(75);
        jProgressBar5.setBorderPainted(false);
        jProgressBar5.setRequestFocusEnabled(false);
        jProgressBar5.setString("25 GB free of 100 GB");
        jProgressBar5.setStringPainted(true);
        jPanel1.add(jProgressBar5);
        jProgressBar5.setBounds(500, 360, 200, 17);

        jLabel24.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jLabel24.setText("File system: NTFS");
        jPanel1.add(jLabel24);
        jLabel24.setBounds(500, 380, 170, 20);

        jButton8.setBackground(new java.awt.Color(0, 102, 204));
        jButton8.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("Manage Disk");
        jButton8.setToolTipText("");
        jButton8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButton8.setBorderPainted(false);
        jButton8.setFocusPainted(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8);
        jButton8.setBounds(20, 110, 130, 30);

        jButton10.setBackground(new java.awt.Color(0, 102, 204));
        jButton10.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setText("Manage Disk");
        jButton10.setToolTipText("");
        jButton10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButton10.setBorderPainted(false);
        jButton10.setFocusable(false);
        jButton10.setRequestFocusEnabled(false);
        jButton10.setRolloverEnabled(false);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton10);
        jButton10.setBounds(20, 370, 130, 30);

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rsz_dplogo.png"))); // NOI18N
        jPanel1.add(jLabel14);
        jLabel14.setBounds(610, 480, 152, 40);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-HDD-50 (1).png"))); // NOI18N
        jPanel1.add(jLabel11);
        jLabel11.setBounds(40, 40, 90, 60);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-HDD-50 (1).png"))); // NOI18N
        jPanel1.add(jLabel12);
        jLabel12.setBounds(40, 250, 90, 60);

        jLabel19.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        jLabel19.setText("D:");
        jPanel1.add(jLabel19);
        jLabel19.setBounds(500, 120, 20, 20);

        jProgressBar6.setBackground(new java.awt.Color(153, 153, 153));
        jProgressBar6.setForeground(new java.awt.Color(0, 102, 204));
        jProgressBar6.setBorderPainted(false);
        jProgressBar6.setString("250 GB free of 250 GB");
        jProgressBar6.setStringPainted(true);
        jPanel1.add(jProgressBar6);
        jProgressBar6.setBounds(500, 140, 200, 17);

        jLabel22.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        jLabel22.setText("File system: NTFS");
        jPanel1.add(jLabel22);
        jLabel22.setBounds(500, 160, 170, 20);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 780, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        try {
            drive0Newpartition drive0 = new drive0Newpartition();
            this.dispose();
            drive0.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(MainDrive0Newpartition.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        exit(0);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        try {
            Desktop.getDesktop().browse(new URL("https://technet.microsoft.com/en-us/library/cc766465(v=ws.10).aspx").toURI());
        } catch (Exception e) {}
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        try {
            Runtime rt = Runtime.getRuntime();
            Process pr = rt.exec("cmd /c diskpart");

            //Process pr = rt.exec("C:\\Windows\\System32\\cmd.exe");

            BufferedReader input = new BufferedReader(new InputStreamReader(pr.getInputStream()));

            String line=null;

            while((line=input.readLine()) != null) {
                System.out.println(line);
            }

            int exitVal = pr.waitFor();
            System.out.println("Exited with error code "+exitVal);

        } catch(Exception e) {
            System.out.println(e.toString());
            e.printStackTrace();
        }
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
      
    }//GEN-LAST:event_jLabel7MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainDrive0Newpartition.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainDrive0Newpartition.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainDrive0Newpartition.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainDrive0Newpartition.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                sleepThread();
                 
                try {
                    new MainDrive0Newpartition().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(MainDrive0Newpartition.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        
        
       
    }
    
     private static void sleepThread() {
        try
            {
                Thread.sleep(3000);
                //Thread.sleep(1);
            }
            catch (InterruptedException ex)
            {
                // Do something, if there is a exception
                System.out.println(ex.toString());
            } 
    }
     
     private void setIcon() throws IOException {
       Image i = ImageIO.read(getClass().getResource("/DPLogo.png"));
                 setIconImage(i); 
               
    }
     
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JProgressBar jProgressBar2;
    private javax.swing.JProgressBar jProgressBar3;
    private javax.swing.JProgressBar jProgressBar4;
    private javax.swing.JProgressBar jProgressBar5;
    private javax.swing.JProgressBar jProgressBar6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables

    
}
