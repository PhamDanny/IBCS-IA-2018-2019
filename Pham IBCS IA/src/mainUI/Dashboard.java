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
public class Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    public Dashboard(String username) throws IOException {
        initComponents();
        
        // set up form's icon image
        Image i = ImageIO.read(getClass().getResource("/mainUI/targetlogo.png"));
        setIconImage(i);
        
        // puts form in center of screen
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        
        // sets greeting message
        labelWelcome.setText("Welcome back, " + username + ".");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelExit = new javax.swing.JPanel();
        labelExit = new javax.swing.JLabel();
        panelHome = new javax.swing.JPanel();
        homeButton = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        labelHomeIcon = new javax.swing.JLabel();
        panelGrades = new javax.swing.JPanel();
        gradesButton = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        labelGradesIcon = new javax.swing.JLabel();
        panelCalendar = new javax.swing.JPanel();
        calendarButton = new javax.swing.JPanel();
        labelCalendarIcon = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        panelSettings = new javax.swing.JPanel();
        settingsButton = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        labelSettingsIcon = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        labelWelcome = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(new java.awt.Color(0, 0, 0));
        setMinimumSize(new java.awt.Dimension(700, 440));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(700, 440));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        getContentPane().add(panelExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 0, 40, 40));

        panelHome.setBackground(new java.awt.Color(0, 0, 51));
        panelHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelHomeMouseEntered(evt);
            }
        });
        panelHome.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        homeButton.setOpaque(false);
        homeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                homeButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                homeButtonMouseExited(evt);
            }
        });
        homeButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panelHome.add(homeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 110));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("HOME");
        panelHome.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 110, -1));

        labelHomeIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainUI/Dashboard Icons/home.png"))); // NOI18N
        panelHome.add(labelHomeIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 5, -1, -1));

        getContentPane().add(panelHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 110));

        panelGrades.setBackground(new java.awt.Color(0, 0, 51));
        panelGrades.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        gradesButton.setOpaque(false);
        gradesButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                gradesButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                gradesButtonMouseExited(evt);
            }
        });
        gradesButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panelGrades.add(gradesButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 110));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("GRADES");
        panelGrades.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 110, -1));

        labelGradesIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainUI/Dashboard Icons/pencil.png"))); // NOI18N
        panelGrades.add(labelGradesIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        getContentPane().add(panelGrades, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 110, 110));

        panelCalendar.setBackground(new java.awt.Color(0, 0, 51));
        panelCalendar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        calendarButton.setOpaque(false);
        calendarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                calendarButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                calendarButtonMouseExited(evt);
            }
        });
        calendarButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panelCalendar.add(calendarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 110));

        labelCalendarIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainUI/Dashboard Icons/calendar.png"))); // NOI18N
        panelCalendar.add(labelCalendarIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 7, -1, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CALENDAR");
        panelCalendar.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 110, -1));

        getContentPane().add(panelCalendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 110, 110));

        panelSettings.setBackground(new java.awt.Color(0, 0, 51));
        panelSettings.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        settingsButton.setOpaque(false);
        settingsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                settingsButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                settingsButtonMouseExited(evt);
            }
        });
        settingsButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panelSettings.add(settingsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 110));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("SETTINGS");
        panelSettings.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 110, -1));

        labelSettingsIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainUI/Dashboard Icons/settings.png"))); // NOI18N
        panelSettings.add(labelSettingsIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 7, -1, -1));

        getContentPane().add(panelSettings, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 110, 110));

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelWelcome.setFont(new java.awt.Font("Century Gothic", 0, 30)); // NOI18N
        labelWelcome.setForeground(new java.awt.Color(255, 255, 255));
        labelWelcome.setText("Welcome back, username.");
        jPanel2.add(labelWelcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 3, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void panelHomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelHomeMouseEntered
        
    }//GEN-LAST:event_panelHomeMouseEntered

    private void homeButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeButtonMouseEntered
        // when hovered over home panel change color
        panelHome.setBackground(new java.awt.Color(0,0,100));
    }//GEN-LAST:event_homeButtonMouseEntered

    private void homeButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeButtonMouseExited
        // change back
        panelHome.setBackground(new java.awt.Color(0,0,51));
    }//GEN-LAST:event_homeButtonMouseExited

    private void gradesButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gradesButtonMouseEntered
        // when hovered over grade panel change color
        panelGrades.setBackground(new java.awt.Color(0,0,100));
    }//GEN-LAST:event_gradesButtonMouseEntered

    private void gradesButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gradesButtonMouseExited
        // change back
        panelGrades.setBackground(new java.awt.Color(0,0,51));
    }//GEN-LAST:event_gradesButtonMouseExited

    private void calendarButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calendarButtonMouseEntered
        // when hovered over calendar panel change color
        panelCalendar.setBackground(new java.awt.Color(0,0,100));
    }//GEN-LAST:event_calendarButtonMouseEntered

    private void calendarButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calendarButtonMouseExited
        // change back
        panelCalendar.setBackground(new java.awt.Color(0,0,51));
    }//GEN-LAST:event_calendarButtonMouseExited

    private void labelExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelExitMouseClicked
        // closes login form when exit is clicked
        this.dispose();
    }//GEN-LAST:event_labelExitMouseClicked

    private void labelExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelExitMouseEntered
        // change exit button to white when hovered
        labelExit.setForeground(new java.awt.Color(0,0,0));
    }//GEN-LAST:event_labelExitMouseEntered

    private void labelExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelExitMouseExited
        // changes color back to default when area is not hovered
        labelExit.setForeground(new java.awt.Color(0,0,51));
    }//GEN-LAST:event_labelExitMouseExited

    private void panelExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelExitMouseClicked
        // closes login form when exit is clicked
        // this one is based on the panel which is larger and more forgiving to click
        this.dispose();
    }//GEN-LAST:event_panelExitMouseClicked

    private void panelExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelExitMouseEntered
        // change exit button to white when hovered
        labelExit.setForeground(new java.awt.Color(0,0,0));
    }//GEN-LAST:event_panelExitMouseEntered

    private void panelExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelExitMouseExited
        // changes color back to default when area is not hovered
        labelExit.setForeground(new java.awt.Color(0,0,51));
    }//GEN-LAST:event_panelExitMouseExited

    private void settingsButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsButtonMouseEntered
        // when hovered over calendar panel change color
        panelSettings.setBackground(new java.awt.Color(0,0,100));
    }//GEN-LAST:event_settingsButtonMouseEntered

    private void settingsButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsButtonMouseExited
        // change back
        panelSettings.setBackground(new java.awt.Color(0,0,51));
    }//GEN-LAST:event_settingsButtonMouseExited

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Dashboard("").setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel calendarButton;
    private javax.swing.JPanel gradesButton;
    private javax.swing.JPanel homeButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelCalendarIcon;
    private javax.swing.JLabel labelExit;
    private javax.swing.JLabel labelGradesIcon;
    private javax.swing.JLabel labelHomeIcon;
    private javax.swing.JLabel labelSettingsIcon;
    private javax.swing.JLabel labelWelcome;
    private javax.swing.JPanel panelCalendar;
    private javax.swing.JPanel panelExit;
    private javax.swing.JPanel panelGrades;
    private javax.swing.JPanel panelHome;
    private javax.swing.JPanel panelSettings;
    private javax.swing.JPanel settingsButton;
    // End of variables declaration//GEN-END:variables
}
