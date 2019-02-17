/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainUI;

import java.awt.Image;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author htvph
 */
public class mainUI extends javax.swing.JFrame {

    /**
     * Creates new form mainUI
     */
    public mainUI() throws IOException {
        initComponents();
        
        // set up form's icon image
        Image i = ImageIO.read(getClass().getResource("/mainUI/targetlogo.png"));
        setIconImage(i);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelSubtitle = new javax.swing.JLabel();
        labelTitle = new javax.swing.JLabel();
        labelLogo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        labelLoginTitle = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        labelLoginTitle1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TargetGrade");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 51, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelSubtitle.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        labelSubtitle.setForeground(new java.awt.Color(255, 255, 255));
        labelSubtitle.setText("Aim for your best self. Take control of your grades.");
        jPanel1.add(labelSubtitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        labelTitle.setFont(new java.awt.Font("Open Sans Semibold", 1, 48)); // NOI18N
        labelTitle.setForeground(new java.awt.Color(255, 255, 255));
        labelTitle.setText("TargetGrade");
        jPanel1.add(labelTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

        labelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainUI/target.png"))); // NOI18N
        jPanel1.add(labelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 440));

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelLoginTitle.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        labelLoginTitle.setForeground(new java.awt.Color(255, 255, 255));
        labelLoginTitle.setText("Register");
        jPanel2.add(labelLoginTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));

        jTextField1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 65, 120, 30));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Username");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, 20));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 105, -1, 20));

        labelLoginTitle1.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        labelLoginTitle1.setForeground(new java.awt.Color(255, 255, 255));
        labelLoginTitle1.setText("Login");
        jPanel2.add(labelLoginTitle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 20, -1, -1));

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Log In");
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 140, -1, -1));

        jPasswordField1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jPasswordField1.setEchoChar('\u2022');
        jPanel2.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 120, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, 220, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(mainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new mainUI().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(mainUI.class.getName()).log(Level.SEVERE, null, ex);
                }            
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel labelLoginTitle;
    private javax.swing.JLabel labelLoginTitle1;
    private javax.swing.JLabel labelLogo;
    private javax.swing.JLabel labelSubtitle;
    private javax.swing.JLabel labelTitle;
    // End of variables declaration//GEN-END:variables
}
