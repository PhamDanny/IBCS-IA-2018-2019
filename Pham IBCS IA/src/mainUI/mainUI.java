/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainUI;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author Danny Pham
 * mainUI is the login screen
 */
public class mainUI extends javax.swing.JFrame {

    

    /**
     * Creates new form mainUI
     */
    // sets up username/password strings
    
    String username, password;
    static User[] savedUsers = new User[100];
    static int users = 0;

    // main constructor
    public mainUI() throws IOException {
        initComponents();
        
        // load users from file
        loadUsers();
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

        jPanel1 = new javax.swing.JPanel();
        labelSubtitle = new javax.swing.JLabel();
        labelTitle = new javax.swing.JLabel();
        labelLogo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        panelExit = new javax.swing.JPanel();
        labelExit = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        textFieldUserName = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        panelSignIn = new javax.swing.JPanel();
        labelSignIn = new javax.swing.JLabel();
        panelNewProfile = new javax.swing.JPanel();
        labelNewProfile = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TargetGrade");
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelSubtitle.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        labelSubtitle.setForeground(new java.awt.Color(255, 255, 255));
        labelSubtitle.setText("Aim for your best self.");
        jPanel1.add(labelSubtitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 160, -1, -1));

        labelTitle.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        labelTitle.setForeground(new java.awt.Color(255, 255, 255));
        labelTitle.setText("TargetGrade");
        jPanel1.add(labelTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        labelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainUI/target.png"))); // NOI18N
        jPanel1.add(labelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 300));

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelExit.setBackground(new java.awt.Color(0, 153, 153));
        panelExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelExitMouseExited(evt);
            }
        });
        panelExit.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelExit.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        labelExit.setForeground(new java.awt.Color(0, 0, 51));
        labelExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelExit.setText("X");
        labelExit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        labelExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelExitMouseExited(evt);
            }
        });
        panelExit.add(labelExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        jPanel2.add(panelExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 40, 40));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("PASSWORD");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, 20));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 220, 10));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 220, 10));

        textFieldUserName.setBackground(new java.awt.Color(0, 153, 153));
        textFieldUserName.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        textFieldUserName.setForeground(new java.awt.Color(255, 255, 255));
        textFieldUserName.setBorder(null);
        textFieldUserName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textFieldUserNameMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                textFieldUserNameMouseExited(evt);
            }
        });
        textFieldUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldUserNameActionPerformed(evt);
            }
        });
        jPanel2.add(textFieldUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 220, -1));

        passwordField.setBackground(new java.awt.Color(0, 153, 153));
        passwordField.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        passwordField.setForeground(new java.awt.Color(255, 255, 255));
        passwordField.setBorder(null);
        passwordField.setEchoChar('\u2022');
        jPanel2.add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 220, -1));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("USERNAME");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, 20));

        panelSignIn.setBackground(new java.awt.Color(0, 0, 51));
        panelSignIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelSignInMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelSignInMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelSignInMouseExited(evt);
            }
        });
        panelSignIn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelSignIn.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        labelSignIn.setForeground(new java.awt.Color(255, 255, 255));
        labelSignIn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelSignIn.setText("Sign In");
        labelSignIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelSignInMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelSignInMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelSignInMouseExited(evt);
            }
        });
        panelSignIn.add(labelSignIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 30));

        jPanel2.add(panelSignIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 100, 30));

        panelNewProfile.setBackground(new java.awt.Color(0, 0, 51));
        panelNewProfile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelNewProfileMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelNewProfileMouseExited(evt);
            }
        });
        panelNewProfile.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelNewProfile.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        labelNewProfile.setForeground(new java.awt.Color(255, 255, 255));
        labelNewProfile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelNewProfile.setText("New Profile");
        labelNewProfile.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        labelNewProfile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelNewProfileMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelNewProfileMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelNewProfileMouseExited(evt);
            }
        });
        panelNewProfile.add(labelNewProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 30));

        jPanel2.add(panelNewProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 100, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 260, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldUserNameActionPerformed

    private void textFieldUserNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textFieldUserNameMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldUserNameMouseClicked

    private void textFieldUserNameMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textFieldUserNameMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldUserNameMouseExited

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1MouseDragged

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseDragged

    private void panelSignInMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelSignInMouseEntered
        // changes color of sign in button when hovered
        //panelSignIn.setBackground(new java.awt.Color(0, 0, 120));
    }//GEN-LAST:event_panelSignInMouseEntered

    private void panelSignInMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelSignInMouseExited
        // changes color back when mouse stops hovering
        //panelSignIn.setBackground(new java.awt.Color(0, 0, 51));
    }//GEN-LAST:event_panelSignInMouseExited

    private void panelNewProfileMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelNewProfileMouseEntered
        
    }//GEN-LAST:event_panelNewProfileMouseEntered

    private void panelNewProfileMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelNewProfileMouseExited
        
    }//GEN-LAST:event_panelNewProfileMouseExited

    private void panelExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelExitMouseEntered
        
    }//GEN-LAST:event_panelExitMouseEntered

    private void labelExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelExitMouseExited
        // changes color back to default when area is not hovered
        labelExit.setForeground(new java.awt.Color(0,0,51));
    }//GEN-LAST:event_labelExitMouseExited

    private void panelExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelExitMouseClicked
        // closes login form when exit is clicked
        // this one is based on the panel which is larger and more forgiving to click
        this.dispose();
    }//GEN-LAST:event_panelExitMouseClicked

    private void labelExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelExitMouseClicked
        // closes login form when exit is clicked
        this.dispose();
    }//GEN-LAST:event_labelExitMouseClicked

    private void labelExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelExitMouseEntered
        // change exit button to white when hovered
        labelExit.setForeground(new java.awt.Color(0,0,0));
    }//GEN-LAST:event_labelExitMouseEntered

    private void panelExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelExitMouseExited
        
    }//GEN-LAST:event_panelExitMouseExited
    
    static void saveUsers() {        
        try {
            PrintWriter writer = new PrintWriter(new File("users.txt"));
            writer.println(users);
            for(int i = 0; i <= users; i++) {
                writer.println(savedUsers[i].getUsername() + "," + savedUsers[i].getPassword() + "," + savedUsers[i].getFirstName() + "," + savedUsers[i].getLastName() + "," + savedUsers[i].getGradeLevel() + "," + savedUsers[i].getHiddenID());
                
            }
        }
        catch(IOException e) {
            
        }
        
    }
    private void loadUsers() {
        // TO DO: method extracts users from text file and converts them into user objects       
        
    }
    // USER SIGNS IN HERE
    private void panelSignInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelSignInMouseClicked
        try {
            // user signs in
            username = textFieldUserName.getText();
            password = String.valueOf(passwordField.getPassword());
            
            // TODO
            // validation goes here
            // fetching account from list of files goes here
            new Dashboard(new User(username, password, "Danny", "Pham", 11, 0)).setVisible(true); // just a placeholder for now, later paremeter will have user fetched from list from textfile
        } catch (IOException ex) {
            Logger.getLogger(mainUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setVisible(false);
    }//GEN-LAST:event_panelSignInMouseClicked
    // USER ALSO SIGNS IN HERE
    private void labelSignInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelSignInMouseClicked
        try {
            // user signs in
            username = textFieldUserName.getText();
            password = String.valueOf(passwordField.getPassword());
            
            
            // TODO
            // validation goes here
            // fetching account from list of files goes here
            new Dashboard(new User(username, password, "Danny", "Pham", 11, 0)).setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(mainUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setVisible(false);
    }//GEN-LAST:event_labelSignInMouseClicked

    private void labelSignInMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelSignInMouseEntered
        // changes color of sign in button when hovered
        panelSignIn.setBackground(new java.awt.Color(0, 0, 120));
    }//GEN-LAST:event_labelSignInMouseEntered

    private void labelSignInMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelSignInMouseExited
        // changes color back when mouse stops hovering
        panelSignIn.setBackground(new java.awt.Color(0, 0, 51));
    }//GEN-LAST:event_labelSignInMouseExited

    private void labelNewProfileMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelNewProfileMouseEntered
        // changes color of new profile button when hovered
        panelNewProfile.setBackground(new java.awt.Color(0, 0, 120));
    }//GEN-LAST:event_labelNewProfileMouseEntered

    private void labelNewProfileMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelNewProfileMouseExited
        // changes color back when mouse stops hovering
        panelNewProfile.setBackground(new java.awt.Color(0, 0, 51));
    }//GEN-LAST:event_labelNewProfileMouseExited
// USER SIGNS UP HERE
    private void labelNewProfileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelNewProfileMouseClicked
        try {
            new SignUp(textFieldUserName.getText(), String.valueOf(passwordField.getPassword())).setVisible(true);
            this.setVisible(false);
            
        } catch (IOException ex) {
            Logger.getLogger(mainUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_labelNewProfileMouseClicked

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel labelExit;
    private javax.swing.JLabel labelLogo;
    private javax.swing.JLabel labelNewProfile;
    private javax.swing.JLabel labelSignIn;
    private javax.swing.JLabel labelSubtitle;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JPanel panelExit;
    private javax.swing.JPanel panelNewProfile;
    private javax.swing.JPanel panelSignIn;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField textFieldUserName;
    // End of variables declaration//GEN-END:variables


}
