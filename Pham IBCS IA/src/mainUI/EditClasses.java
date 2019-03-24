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
public class EditClasses extends javax.swing.JFrame {

    /**
     * Creates new form EditClasses
     */
    public EditClasses() throws IOException {
        initComponents();
        
        // set up form's icon image
        Image i = ImageIO.read(getClass().getResource("/mainUI/targetlogo.png"));
        setIconImage(i);
        
        // puts form in center of screen
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        // hide all textfields/seperators
        textFieldClass1.setVisible(false);
        textFieldClass2.setVisible(false);
        textFieldClass3.setVisible(false);
        textFieldClass4.setVisible(false);
        textFieldClass5.setVisible(false);
        textFieldClass6.setVisible(false);
        textFieldClass7.setVisible(false);
        textFieldClass8.setVisible(false);
        seperator1.setVisible(false);
        seperator2.setVisible(false);
        seperator3.setVisible(false);
        seperator4.setVisible(false);
        seperator5.setVisible(false);
        seperator6.setVisible(false);
        seperator7.setVisible(false);
        seperator8.setVisible(false);
        
        // show the current class names in text fields
        if(Dashboard.currentUser.classes.size() == 1) {
            textFieldClass1.setVisible(true);
            seperator1.setVisible(true);
            textFieldClass1.setText(Dashboard.currentUser.classes.get(0).getClassName());
        }
        else if(Dashboard.currentUser.classes.size() == 2) {
            textFieldClass1.setVisible(true);
            seperator1.setVisible(true);
            textFieldClass1.setText(Dashboard.currentUser.classes.get(0).getClassName());
            
            textFieldClass2.setVisible(true);
            seperator2.setVisible(true);           
            textFieldClass2.setText(Dashboard.currentUser.classes.get(1).getClassName());                    
        }
        else if(Dashboard.currentUser.classes.size() == 3) {
            textFieldClass1.setVisible(true);
            seperator1.setVisible(true);
            textFieldClass1.setText(Dashboard.currentUser.classes.get(0).getClassName());
            
            textFieldClass2.setVisible(true);
            seperator2.setVisible(true);           
            textFieldClass2.setText(Dashboard.currentUser.classes.get(1).getClassName());
            
            textFieldClass3.setVisible(true);
            seperator3.setVisible(true);           
            textFieldClass3.setText(Dashboard.currentUser.classes.get(2).getClassName());
        }
        else if(Dashboard.currentUser.classes.size() == 4) {
            textFieldClass1.setVisible(true);
            seperator1.setVisible(true);
            textFieldClass1.setText(Dashboard.currentUser.classes.get(0).getClassName());
            
            textFieldClass2.setVisible(true);
            seperator2.setVisible(true);           
            textFieldClass2.setText(Dashboard.currentUser.classes.get(1).getClassName());
            
            textFieldClass3.setVisible(true);
            seperator3.setVisible(true);           
            textFieldClass3.setText(Dashboard.currentUser.classes.get(2).getClassName());
            
            textFieldClass4.setVisible(true);
            seperator4.setVisible(true);           
            textFieldClass4.setText(Dashboard.currentUser.classes.get(3).getClassName());
        }
        else if(Dashboard.currentUser.classes.size() == 5) {
            textFieldClass1.setVisible(true);
            seperator1.setVisible(true);
            textFieldClass1.setText(Dashboard.currentUser.classes.get(0).getClassName());
            
            textFieldClass2.setVisible(true);
            seperator2.setVisible(true);           
            textFieldClass2.setText(Dashboard.currentUser.classes.get(1).getClassName());
            
            textFieldClass3.setVisible(true);
            seperator3.setVisible(true);           
            textFieldClass3.setText(Dashboard.currentUser.classes.get(2).getClassName());
            
            textFieldClass4.setVisible(true);
            seperator4.setVisible(true);           
            textFieldClass4.setText(Dashboard.currentUser.classes.get(3).getClassName());
            
            textFieldClass5.setVisible(true);
            seperator5.setVisible(true);           
            textFieldClass5.setText(Dashboard.currentUser.classes.get(4).getClassName());
        }
        else if(Dashboard.currentUser.classes.size() == 6) {
            textFieldClass1.setVisible(true);
            seperator1.setVisible(true);
            textFieldClass1.setText(Dashboard.currentUser.classes.get(0).getClassName());
            
            textFieldClass2.setVisible(true);
            seperator2.setVisible(true);           
            textFieldClass2.setText(Dashboard.currentUser.classes.get(1).getClassName());
            
            textFieldClass3.setVisible(true);
            seperator3.setVisible(true);           
            textFieldClass3.setText(Dashboard.currentUser.classes.get(2).getClassName());
            
            textFieldClass4.setVisible(true);
            seperator4.setVisible(true);           
            textFieldClass4.setText(Dashboard.currentUser.classes.get(3).getClassName());
            
            textFieldClass5.setVisible(true);
            seperator5.setVisible(true);           
            textFieldClass5.setText(Dashboard.currentUser.classes.get(4).getClassName());
            
            textFieldClass6.setVisible(true);
            seperator6.setVisible(true);           
            textFieldClass6.setText(Dashboard.currentUser.classes.get(5).getClassName());
        }
        else if(Dashboard.currentUser.classes.size() == 7) {
            textFieldClass1.setVisible(true);
            seperator1.setVisible(true);
            textFieldClass1.setText(Dashboard.currentUser.classes.get(0).getClassName());
            
            textFieldClass2.setVisible(true);
            seperator2.setVisible(true);           
            textFieldClass2.setText(Dashboard.currentUser.classes.get(1).getClassName());
            
            textFieldClass3.setVisible(true);
            seperator3.setVisible(true);           
            textFieldClass3.setText(Dashboard.currentUser.classes.get(2).getClassName());
            
            textFieldClass4.setVisible(true);
            seperator4.setVisible(true);           
            textFieldClass4.setText(Dashboard.currentUser.classes.get(3).getClassName());
            
            textFieldClass5.setVisible(true);
            seperator5.setVisible(true);           
            textFieldClass5.setText(Dashboard.currentUser.classes.get(4).getClassName());
            
            textFieldClass6.setVisible(true);
            seperator6.setVisible(true);           
            textFieldClass6.setText(Dashboard.currentUser.classes.get(5).getClassName());
            
            textFieldClass7.setVisible(true);
            seperator7.setVisible(true);           
            textFieldClass7.setText(Dashboard.currentUser.classes.get(6).getClassName());
        }
        else if(Dashboard.currentUser.classes.size() == 8) {
            textFieldClass1.setVisible(true);
            seperator1.setVisible(true);
            textFieldClass1.setText(Dashboard.currentUser.classes.get(0).getClassName());
            
            textFieldClass2.setVisible(true);
            seperator2.setVisible(true);           
            textFieldClass2.setText(Dashboard.currentUser.classes.get(1).getClassName());
            
            textFieldClass3.setVisible(true);
            seperator3.setVisible(true);           
            textFieldClass3.setText(Dashboard.currentUser.classes.get(2).getClassName());
            
            textFieldClass4.setVisible(true);
            seperator4.setVisible(true);           
            textFieldClass4.setText(Dashboard.currentUser.classes.get(3).getClassName());
            
            textFieldClass5.setVisible(true);
            seperator5.setVisible(true);           
            textFieldClass5.setText(Dashboard.currentUser.classes.get(4).getClassName());
            
            textFieldClass6.setVisible(true);
            seperator6.setVisible(true);           
            textFieldClass6.setText(Dashboard.currentUser.classes.get(5).getClassName());
            
            textFieldClass7.setVisible(true);
            seperator7.setVisible(true);           
            textFieldClass7.setText(Dashboard.currentUser.classes.get(6).getClassName());
            
            textFieldClass8.setVisible(true);
            seperator8.setVisible(true);           
            textFieldClass8.setText(Dashboard.currentUser.classes.get(7).getClassName());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelEdit = new javax.swing.JPanel();
        panelSave = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        buttonSave = new javax.swing.JPanel();
        panelExit = new javax.swing.JPanel();
        buttonExit = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        textFieldClass8 = new javax.swing.JTextField();
        seperator8 = new javax.swing.JSeparator();
        textFieldClass1 = new javax.swing.JTextField();
        seperator1 = new javax.swing.JSeparator();
        textFieldClass2 = new javax.swing.JTextField();
        seperator2 = new javax.swing.JSeparator();
        textFieldClass3 = new javax.swing.JTextField();
        seperator3 = new javax.swing.JSeparator();
        textFieldClass4 = new javax.swing.JTextField();
        seperator4 = new javax.swing.JSeparator();
        textFieldClass5 = new javax.swing.JTextField();
        seperator5 = new javax.swing.JSeparator();
        textFieldClass6 = new javax.swing.JTextField();
        seperator6 = new javax.swing.JSeparator();
        textFieldClass7 = new javax.swing.JTextField();
        seperator7 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelEdit.setBackground(new java.awt.Color(0, 153, 153));
        panelEdit.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelSave.setBackground(new java.awt.Color(0, 0, 51));
        panelSave.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Save & Exit");
        panelSave.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 140, -1));

        buttonSave.setOpaque(false);
        buttonSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonSaveMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonSaveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonSaveMouseExited(evt);
            }
        });

        javax.swing.GroupLayout buttonSaveLayout = new javax.swing.GroupLayout(buttonSave);
        buttonSave.setLayout(buttonSaveLayout);
        buttonSaveLayout.setHorizontalGroup(
            buttonSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );
        buttonSaveLayout.setVerticalGroup(
            buttonSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        panelSave.add(buttonSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 40));

        panelEdit.add(panelSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, 140, 40));

        panelExit.setBackground(new java.awt.Color(0, 0, 51));
        panelExit.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonExit.setOpaque(false);
        buttonExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonExitMouseExited(evt);
            }
        });

        javax.swing.GroupLayout buttonExitLayout = new javax.swing.GroupLayout(buttonExit);
        buttonExit.setLayout(buttonExitLayout);
        buttonExitLayout.setHorizontalGroup(
            buttonExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );
        buttonExitLayout.setVerticalGroup(
            buttonExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        panelExit.add(buttonExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 40));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Exit without saving");
        panelExit.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 140, -1));

        panelEdit.add(panelExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, -1, 40));

        textFieldClass8.setBackground(new java.awt.Color(0, 153, 153));
        textFieldClass8.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        textFieldClass8.setForeground(new java.awt.Color(255, 255, 255));
        textFieldClass8.setBorder(null);
        panelEdit.add(textFieldClass8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 140, -1));
        panelEdit.add(seperator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 140, 5));

        textFieldClass1.setBackground(new java.awt.Color(0, 153, 153));
        textFieldClass1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        textFieldClass1.setForeground(new java.awt.Color(255, 255, 255));
        textFieldClass1.setBorder(null);
        panelEdit.add(textFieldClass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 140, -1));
        panelEdit.add(seperator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 140, 5));

        textFieldClass2.setBackground(new java.awt.Color(0, 153, 153));
        textFieldClass2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        textFieldClass2.setForeground(new java.awt.Color(255, 255, 255));
        textFieldClass2.setBorder(null);
        panelEdit.add(textFieldClass2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 140, -1));
        panelEdit.add(seperator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 140, 5));

        textFieldClass3.setBackground(new java.awt.Color(0, 153, 153));
        textFieldClass3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        textFieldClass3.setForeground(new java.awt.Color(255, 255, 255));
        textFieldClass3.setBorder(null);
        panelEdit.add(textFieldClass3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 140, -1));
        panelEdit.add(seperator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 140, 5));

        textFieldClass4.setBackground(new java.awt.Color(0, 153, 153));
        textFieldClass4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        textFieldClass4.setForeground(new java.awt.Color(255, 255, 255));
        textFieldClass4.setBorder(null);
        panelEdit.add(textFieldClass4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 140, -1));
        panelEdit.add(seperator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 140, 5));

        textFieldClass5.setBackground(new java.awt.Color(0, 153, 153));
        textFieldClass5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        textFieldClass5.setForeground(new java.awt.Color(255, 255, 255));
        textFieldClass5.setBorder(null);
        panelEdit.add(textFieldClass5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 140, -1));
        panelEdit.add(seperator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 140, 5));

        textFieldClass6.setBackground(new java.awt.Color(0, 153, 153));
        textFieldClass6.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        textFieldClass6.setForeground(new java.awt.Color(255, 255, 255));
        textFieldClass6.setBorder(null);
        panelEdit.add(textFieldClass6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 140, -1));
        panelEdit.add(seperator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 140, 5));

        textFieldClass7.setBackground(new java.awt.Color(0, 153, 153));
        textFieldClass7.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        textFieldClass7.setForeground(new java.awt.Color(255, 255, 255));
        textFieldClass7.setBorder(null);
        panelEdit.add(textFieldClass7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, 140, -1));
        panelEdit.add(seperator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, 140, 5));

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Edit class names below. You can also delete any unneccesary classes.");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 510, 30));

        panelEdit.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 50));

        getContentPane().add(panelEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonExitMouseEntered
        panelExit.setBackground(new java.awt.Color(0, 0, 150));
    }//GEN-LAST:event_buttonExitMouseEntered

    private void buttonExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonExitMouseExited
        panelExit.setBackground(new java.awt.Color(0, 0, 51));
    }//GEN-LAST:event_buttonExitMouseExited

    private void buttonSaveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonSaveMouseEntered
        panelSave.setBackground(new java.awt.Color(0, 0, 150));
    }//GEN-LAST:event_buttonSaveMouseEntered

    private void buttonSaveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonSaveMouseExited
        panelSave.setBackground(new java.awt.Color(0, 0, 51));
    }//GEN-LAST:event_buttonSaveMouseExited

    private void buttonSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonSaveMouseClicked
        // save users changes
        if(Dashboard.currentUser.classes.isEmpty()) {
            this.dispose();
        }
        else if(Dashboard.currentUser.classes.size() == 1) {
            Dashboard.currentUser.classes.get(0).setClassName(textFieldClass1.getText());
        }
        else if(Dashboard.currentUser.classes.size() == 2) {
            Dashboard.currentUser.classes.get(0).setClassName(textFieldClass1.getText());
            Dashboard.currentUser.classes.get(1).setClassName(textFieldClass2.getText());
        }
        else if(Dashboard.currentUser.classes.size() == 3) {
            Dashboard.currentUser.classes.get(0).setClassName(textFieldClass1.getText());
            Dashboard.currentUser.classes.get(1).setClassName(textFieldClass2.getText());
            Dashboard.currentUser.classes.get(2).setClassName(textFieldClass3.getText());
        }
        else if(Dashboard.currentUser.classes.size() == 4) {
            Dashboard.currentUser.classes.get(0).setClassName(textFieldClass1.getText());
            Dashboard.currentUser.classes.get(1).setClassName(textFieldClass2.getText());
            Dashboard.currentUser.classes.get(2).setClassName(textFieldClass3.getText());
            Dashboard.currentUser.classes.get(3).setClassName(textFieldClass3.getText());
        }
        else if(Dashboard.currentUser.classes.size() == 5) {
            Dashboard.currentUser.classes.get(0).setClassName(textFieldClass1.getText());
            Dashboard.currentUser.classes.get(1).setClassName(textFieldClass2.getText());
            Dashboard.currentUser.classes.get(2).setClassName(textFieldClass3.getText());
            Dashboard.currentUser.classes.get(3).setClassName(textFieldClass3.getText());
            Dashboard.currentUser.classes.get(4).setClassName(textFieldClass3.getText());
        }
        else if(Dashboard.currentUser.classes.size() == 6) {
            Dashboard.currentUser.classes.get(0).setClassName(textFieldClass1.getText());
            Dashboard.currentUser.classes.get(1).setClassName(textFieldClass2.getText());
            Dashboard.currentUser.classes.get(2).setClassName(textFieldClass3.getText());
            Dashboard.currentUser.classes.get(3).setClassName(textFieldClass3.getText());
            Dashboard.currentUser.classes.get(4).setClassName(textFieldClass3.getText());
            Dashboard.currentUser.classes.get(5).setClassName(textFieldClass3.getText());
        }
        else if(Dashboard.currentUser.classes.size() == 7) {
            Dashboard.currentUser.classes.get(0).setClassName(textFieldClass1.getText());
            Dashboard.currentUser.classes.get(1).setClassName(textFieldClass2.getText());
            Dashboard.currentUser.classes.get(2).setClassName(textFieldClass3.getText());
            Dashboard.currentUser.classes.get(3).setClassName(textFieldClass3.getText());
            Dashboard.currentUser.classes.get(4).setClassName(textFieldClass3.getText());
            Dashboard.currentUser.classes.get(5).setClassName(textFieldClass3.getText());
            Dashboard.currentUser.classes.get(6).setClassName(textFieldClass3.getText());
        }
        else if(Dashboard.currentUser.classes.size() == 7) {
            Dashboard.currentUser.classes.get(0).setClassName(textFieldClass1.getText());
            Dashboard.currentUser.classes.get(1).setClassName(textFieldClass2.getText());
            Dashboard.currentUser.classes.get(2).setClassName(textFieldClass3.getText());
            Dashboard.currentUser.classes.get(3).setClassName(textFieldClass3.getText());
            Dashboard.currentUser.classes.get(4).setClassName(textFieldClass3.getText());
            Dashboard.currentUser.classes.get(5).setClassName(textFieldClass3.getText());
            Dashboard.currentUser.classes.get(6).setClassName(textFieldClass3.getText());
            Dashboard.currentUser.classes.get(7).setClassName(textFieldClass3.getText());
        }
        
        // save the changes
        mainUI.saveUsers();
        
        // update dashboard to reflect changes
        DashboardManager.updateDashboards();
        this.dispose();
    }//GEN-LAST:event_buttonSaveMouseClicked

    private void buttonExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonExitMouseClicked
        // close without saving
        this.dispose();
    }//GEN-LAST:event_buttonExitMouseClicked

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
            java.util.logging.Logger.getLogger(EditClasses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditClasses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditClasses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditClasses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new EditClasses().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(EditClasses.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel buttonExit;
    private javax.swing.JPanel buttonSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panelEdit;
    private javax.swing.JPanel panelExit;
    private javax.swing.JPanel panelSave;
    private javax.swing.JSeparator seperator1;
    private javax.swing.JSeparator seperator2;
    private javax.swing.JSeparator seperator3;
    private javax.swing.JSeparator seperator4;
    private javax.swing.JSeparator seperator5;
    private javax.swing.JSeparator seperator6;
    private javax.swing.JSeparator seperator7;
    private javax.swing.JSeparator seperator8;
    private javax.swing.JTextField textFieldClass1;
    private javax.swing.JTextField textFieldClass2;
    private javax.swing.JTextField textFieldClass3;
    private javax.swing.JTextField textFieldClass4;
    private javax.swing.JTextField textFieldClass5;
    private javax.swing.JTextField textFieldClass6;
    private javax.swing.JTextField textFieldClass7;
    private javax.swing.JTextField textFieldClass8;
    // End of variables declaration//GEN-END:variables
}
