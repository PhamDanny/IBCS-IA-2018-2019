/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainUI;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author htvph
 */
public class NewClass extends javax.swing.JFrame {

    /**
     * Creates new form NewClass
     */
    public NewClass() throws IOException {
        initComponents();
        
        // set up form's icon image
        Image i = ImageIO.read(getClass().getResource("/mainUI/targetlogo.png"));
        setIconImage(i);
        
        // puts form in center of screen
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        textFieldClassName = new javax.swing.JTextField();
        panelSubmit = new javax.swing.JPanel();
        buttonSubmit = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        textFieldTeacherName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        comboBoxGoal = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Please fill out class information below.");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 30));

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 220, 10));

        textFieldClassName.setBackground(new java.awt.Color(0, 153, 153));
        textFieldClassName.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        textFieldClassName.setForeground(new java.awt.Color(255, 255, 255));
        textFieldClassName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textFieldClassName.setBorder(null);
        jPanel1.add(textFieldClassName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 220, -1));

        panelSubmit.setBackground(new java.awt.Color(0, 0, 51));
        panelSubmit.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonSubmit.setOpaque(false);
        buttonSubmit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonSubmitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonSubmitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonSubmitMouseExited(evt);
            }
        });

        javax.swing.GroupLayout buttonSubmitLayout = new javax.swing.GroupLayout(buttonSubmit);
        buttonSubmit.setLayout(buttonSubmitLayout);
        buttonSubmitLayout.setHorizontalGroup(
            buttonSubmitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        buttonSubmitLayout.setVerticalGroup(
            buttonSubmitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        panelSubmit.add(buttonSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 30));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Submit");
        panelSubmit.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 5, 100, -1));

        jPanel1.add(panelSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 100, 30));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Class Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 5, 220, -1));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 220, 10));

        textFieldTeacherName.setBackground(new java.awt.Color(0, 153, 153));
        textFieldTeacherName.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        textFieldTeacherName.setForeground(new java.awt.Color(255, 255, 255));
        textFieldTeacherName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textFieldTeacherName.setBorder(null);
        jPanel1.add(textFieldTeacherName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 220, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Goal");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 50, -1));

        comboBoxGoal.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "F" }));
        jPanel1.add(comboBoxGoal, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, -1, -1));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Teacher Name");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 220, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 240, 220));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonSubmitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonSubmitMouseClicked
        double goal = 1;
        if(comboBoxGoal.getSelectedItem() == "A") {
            goal = .925;
        }
        else if(comboBoxGoal.getSelectedItem() == "A-") {
            goal = .895;
        }
        else if(comboBoxGoal.getSelectedItem() == "B+") {
            goal = .865;
        }
        else if(comboBoxGoal.getSelectedItem() == "B") {
            goal = .825;
        }
        else if(comboBoxGoal.getSelectedItem() == "B-") {
            goal = .795;
        }
        else if(comboBoxGoal.getSelectedItem() == "C+") {
            goal = .765;
        }
        else if(comboBoxGoal.getSelectedItem() == "C") {
            goal = .725;
        }
        else if(comboBoxGoal.getSelectedItem() == "C-") {
            goal = .695;
        }
        else if(comboBoxGoal.getSelectedItem() == "D+") {
            goal = .665;
        }
        else if(comboBoxGoal.getSelectedItem() == "D") {
            goal = .595;
        }
        else if(comboBoxGoal.getSelectedItem() == "F") {
            goal = 0;
        }
        Dashboard.currentUser.classes.add(new Class(textFieldClassName.getText(), textFieldTeacherName.getText(), goal));
        DashboardManager.updateDashboards();
        mainUI.saveUsers();
        this.dispose();
    }//GEN-LAST:event_buttonSubmitMouseClicked

    private void buttonSubmitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonSubmitMouseEntered
        panelSubmit.setBackground(new java.awt.Color(0, 0, 150));
    }//GEN-LAST:event_buttonSubmitMouseEntered

    private void buttonSubmitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonSubmitMouseExited
        panelSubmit.setBackground(new java.awt.Color(0, 0, 51));
    }//GEN-LAST:event_buttonSubmitMouseExited

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
            java.util.logging.Logger.getLogger(NewClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new NewClass().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(NewClass.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel buttonSubmit;
    private javax.swing.JComboBox comboBoxGoal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPanel panelSubmit;
    private javax.swing.JTextField textFieldClassName;
    private javax.swing.JTextField textFieldTeacherName;
    // End of variables declaration//GEN-END:variables
}
