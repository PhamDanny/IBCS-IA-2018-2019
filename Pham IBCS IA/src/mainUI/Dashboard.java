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
    static int dashboardState = 0;
    public Dashboard(User user) throws IOException {
        initComponents();
        
        // set up form's icon image
        Image i = ImageIO.read(getClass().getResource("/mainUI/targetlogo.png"));
        setIconImage(i);
        
        // puts form in center of screen
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        
        // sets greeting message
        labelWelcome.setText("Welcome, " + user.getFirstName() + ".");
        
        // set dashboard state to 1
        // dashboardState keeps track of what screen the dashboard is on
        // 1 = home
        // 2 = grades
        // 3 = calendar
        // 4 = settings
        dashboardState = 1;
        updateDashButtons();
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
        panelHomeButton = new javax.swing.JPanel();
        homeButton = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        labelHomeIcon = new javax.swing.JLabel();
        panelGradesButton = new javax.swing.JPanel();
        gradesButton = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        labelGradesIcon = new javax.swing.JLabel();
        panelCalendarButton = new javax.swing.JPanel();
        calendarButton = new javax.swing.JPanel();
        labelCalendarIcon = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        panelSettingsButton = new javax.swing.JPanel();
        settingsButton = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        labelSettingsIcon = new javax.swing.JLabel();
        panelCalendar = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        panelHome = new javax.swing.JPanel();
        labelWelcome = new javax.swing.JLabel();
        panelGrades = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        panelSettings = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(new java.awt.Color(0, 0, 0));
        setMinimumSize(new java.awt.Dimension(700, 440));
        setUndecorated(true);
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

        panelHomeButton.setBackground(new java.awt.Color(0, 0, 51));
        panelHomeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelHomeButtonMouseEntered(evt);
            }
        });
        panelHomeButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        homeButton.setOpaque(false);
        homeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                homeButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                homeButtonMouseExited(evt);
            }
        });
        homeButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panelHomeButton.add(homeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 110));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("HOME");
        panelHomeButton.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 110, -1));

        labelHomeIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainUI/Dashboard Icons/home.png"))); // NOI18N
        panelHomeButton.add(labelHomeIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 5, -1, -1));

        getContentPane().add(panelHomeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 110));

        panelGradesButton.setBackground(new java.awt.Color(0, 0, 51));
        panelGradesButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        gradesButton.setOpaque(false);
        gradesButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gradesButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                gradesButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                gradesButtonMouseExited(evt);
            }
        });
        gradesButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panelGradesButton.add(gradesButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 110));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("GRADES");
        panelGradesButton.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 110, -1));

        labelGradesIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainUI/Dashboard Icons/pencil.png"))); // NOI18N
        panelGradesButton.add(labelGradesIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        getContentPane().add(panelGradesButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 110, 110));

        panelCalendarButton.setBackground(new java.awt.Color(0, 0, 51));
        panelCalendarButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        calendarButton.setOpaque(false);
        calendarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                calendarButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                calendarButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                calendarButtonMouseExited(evt);
            }
        });
        calendarButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panelCalendarButton.add(calendarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 110));

        labelCalendarIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainUI/Dashboard Icons/calendar.png"))); // NOI18N
        panelCalendarButton.add(labelCalendarIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 7, -1, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("TO-DO");
        panelCalendarButton.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 110, -1));

        getContentPane().add(panelCalendarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 110, 110));

        panelSettingsButton.setBackground(new java.awt.Color(0, 0, 51));
        panelSettingsButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        settingsButton.setOpaque(false);
        settingsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                settingsButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                settingsButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                settingsButtonMouseExited(evt);
            }
        });
        settingsButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panelSettingsButton.add(settingsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 110));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("SETTINGS");
        panelSettingsButton.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 110, -1));

        labelSettingsIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainUI/Dashboard Icons/settings.png"))); // NOI18N
        panelSettingsButton.add(labelSettingsIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 7, -1, -1));

        getContentPane().add(panelSettingsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 110, 110));

        panelCalendar.setBackground(new java.awt.Color(0, 153, 153));
        panelCalendar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("To-Do List");
        panelCalendar.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, -1));

        getContentPane().add(panelCalendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 440));

        panelHome.setBackground(new java.awt.Color(0, 153, 153));
        panelHome.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelWelcome.setFont(new java.awt.Font("Century Gothic", 0, 30)); // NOI18N
        labelWelcome.setForeground(new java.awt.Color(255, 255, 255));
        labelWelcome.setText("Welcome, name.");
        panelHome.add(labelWelcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, -1));

        getContentPane().add(panelHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 440));

        panelGrades.setBackground(new java.awt.Color(0, 153, 153));
        panelGrades.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setText("grades");
        panelGrades.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, -1, -1));

        getContentPane().add(panelGrades, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 440));

        panelSettings.setBackground(new java.awt.Color(0, 153, 153));
        panelSettings.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setText("Settings");
        panelSettings.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, -1, -1));

        getContentPane().add(panelSettings, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updateDashButtons() {
        if(dashboardState == 1) {
            panelHomeButton.setBackground(new java.awt.Color(0,0,100));
            panelGradesButton.setBackground(new java.awt.Color(0,0,51));
            panelCalendarButton.setBackground(new java.awt.Color(0,0,51));
            panelSettingsButton.setBackground(new java.awt.Color(0,0,51));
            
            panelHome.setVisible(true);
            panelGrades.setVisible(false);
            panelCalendar.setVisible(false);
            panelSettings.setVisible(false);
        }
        else if(dashboardState == 2) {
            panelGradesButton.setBackground(new java.awt.Color(0,0,100));
            panelHomeButton.setBackground(new java.awt.Color(0,0,51));
            panelCalendarButton.setBackground(new java.awt.Color(0,0,51));
            panelSettingsButton.setBackground(new java.awt.Color(0,0,51));
            
            panelHome.setVisible(false);
            panelGrades.setVisible(true);
            panelCalendar.setVisible(false);
            panelSettings.setVisible(false);
        }
        else if(dashboardState == 3) {
            panelCalendarButton.setBackground(new java.awt.Color(0,0,100));
            panelHomeButton.setBackground(new java.awt.Color(0,0,51));
            panelGradesButton.setBackground(new java.awt.Color(0,0,51));
            panelSettingsButton.setBackground(new java.awt.Color(0,0,51));
            
            panelHome.setVisible(false);
            panelGrades.setVisible(false);
            panelCalendar.setVisible(true);
            panelSettings.setVisible(false);
        }
        else if (dashboardState == 4) {
            panelSettingsButton.setBackground(new java.awt.Color(0,0,100));
            panelHomeButton.setBackground(new java.awt.Color(0,0,51));
            panelGradesButton.setBackground(new java.awt.Color(0,0,51));
            panelCalendarButton.setBackground(new java.awt.Color(0,0,51));
            
            panelHome.setVisible(false);
            panelGrades.setVisible(false);
            panelCalendar.setVisible(false);
            panelSettings.setVisible(true);
        }
    }
    private void panelHomeButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelHomeButtonMouseEntered
        
    }//GEN-LAST:event_panelHomeButtonMouseEntered

    private void homeButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeButtonMouseEntered
        // when hovered over home panel change color
        panelHomeButton.setBackground(new java.awt.Color(0,0,150));
    }//GEN-LAST:event_homeButtonMouseEntered

    private void homeButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeButtonMouseExited
        // change back
        panelHomeButton.setBackground(new java.awt.Color(0,0,51));
        updateDashButtons();
    }//GEN-LAST:event_homeButtonMouseExited

    private void gradesButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gradesButtonMouseEntered
        // when hovered over grade panel change color
        panelGradesButton.setBackground(new java.awt.Color(0,0,150));
    }//GEN-LAST:event_gradesButtonMouseEntered

    private void gradesButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gradesButtonMouseExited
        // change back
        panelGradesButton.setBackground(new java.awt.Color(0,0,51));
        updateDashButtons();
    }//GEN-LAST:event_gradesButtonMouseExited

    private void calendarButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calendarButtonMouseEntered
        // when hovered over calendar panel change color
        panelCalendarButton.setBackground(new java.awt.Color(0,0,150));
    }//GEN-LAST:event_calendarButtonMouseEntered

    private void calendarButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calendarButtonMouseExited
        // change back
        panelCalendarButton.setBackground(new java.awt.Color(0,0,51));
        updateDashButtons();
    }//GEN-LAST:event_calendarButtonMouseExited

    private void labelExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelExitMouseClicked
        // closes dashboard form when exit is clicked
        this.dispose();
        try {
            // returns to login
            new mainUI().setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        panelSettingsButton.setBackground(new java.awt.Color(0,0,150));
    }//GEN-LAST:event_settingsButtonMouseEntered

    private void settingsButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsButtonMouseExited
        // change back
        panelSettingsButton.setBackground(new java.awt.Color(0,0,51));
        updateDashButtons();
    }//GEN-LAST:event_settingsButtonMouseExited

    private void gradesButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gradesButtonMouseClicked
        // grades tab selected
        dashboardState = 2;
        updateDashButtons();
    }//GEN-LAST:event_gradesButtonMouseClicked

    private void calendarButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calendarButtonMouseClicked
        // calendar tab selected
        dashboardState = 3;
        updateDashButtons();
    }//GEN-LAST:event_calendarButtonMouseClicked

    private void homeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeButtonMouseClicked
        // home button clicked
        dashboardState = 1;
        updateDashButtons();
    }//GEN-LAST:event_homeButtonMouseClicked

    private void settingsButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsButtonMouseClicked
        // settings button clicked
        dashboardState = 4;
        updateDashButtons();
    }//GEN-LAST:event_settingsButtonMouseClicked

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
                    new Dashboard(new User("", "", "", "", 0)).setVisible(true);
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel labelCalendarIcon;
    private javax.swing.JLabel labelExit;
    private javax.swing.JLabel labelGradesIcon;
    private javax.swing.JLabel labelHomeIcon;
    private javax.swing.JLabel labelSettingsIcon;
    private javax.swing.JLabel labelWelcome;
    private javax.swing.JPanel panelCalendar;
    private javax.swing.JPanel panelCalendarButton;
    private javax.swing.JPanel panelExit;
    private javax.swing.JPanel panelGrades;
    private javax.swing.JPanel panelGradesButton;
    private javax.swing.JPanel panelHome;
    private javax.swing.JPanel panelHomeButton;
    private javax.swing.JPanel panelSettings;
    private javax.swing.JPanel panelSettingsButton;
    private javax.swing.JPanel settingsButton;
    // End of variables declaration//GEN-END:variables
}
