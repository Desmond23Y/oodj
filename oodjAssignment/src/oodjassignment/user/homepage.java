/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package oodjassignment.user;

import java.io.BufferedReader;
import java.io.FileReader;
import oodjassignment.Loginpage;


public class homepage extends javax.swing.JFrame {

    /**
     * Creates new form homepage
     */
public homepage() {
    initComponents();
    updateWelcome();
}

    private void updateWelcome() {
        String userName = readUserInfo(); // Now a single String, not an array
        if (userName != null) {
            welcome.setText("Welcome " + userName);
        } else {
            welcome.setText("Welcome back!");
        }
    }

    private String readUserInfo() {
        String filePath = "src/oodjassignment/database/cookie.txt";
        String userName = null;
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line = br.readLine(); // Read the single line from the file
            if (line != null) {
                String[] parts = line.split(","); // Split the line by commas
                if (parts.length >= 2) {
                    userName = parts[1]; // Extract User Name (second element)
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return userName;
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        welcome = new javax.swing.JLabel();
        profile = new javax.swing.JButton();
        hall_info = new javax.swing.JButton();
        booking_details = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        feedback = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        welcome.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        welcome.setForeground(new java.awt.Color(255, 255, 255));
        welcome.setText("Welcome");
        getContentPane().add(welcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 490, 70));

        profile.setBackground(new java.awt.Color(0, 137, 248));
        profile.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        profile.setForeground(new java.awt.Color(255, 255, 255));
        profile.setText("Profile");
        profile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profileActionPerformed(evt);
            }
        });
        getContentPane().add(profile, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, 180, 40));

        hall_info.setBackground(new java.awt.Color(0, 137, 248));
        hall_info.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        hall_info.setForeground(new java.awt.Color(255, 255, 255));
        hall_info.setText("Hall Infomation");
        hall_info.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hall_infoActionPerformed(evt);
            }
        });
        getContentPane().add(hall_info, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, 180, 40));

        booking_details.setBackground(new java.awt.Color(0, 137, 248));
        booking_details.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        booking_details.setForeground(new java.awt.Color(255, 255, 255));
        booking_details.setText("Booking Details");
        booking_details.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                booking_detailsActionPerformed(evt);
            }
        });
        getContentPane().add(booking_details, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 370, 180, 40));

        logout.setBackground(new java.awt.Color(0, 137, 248));
        logout.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        logout.setForeground(new java.awt.Color(255, 255, 255));
        logout.setText("Logout");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        getContentPane().add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 540, 180, 40));

        feedback.setBackground(new java.awt.Color(0, 137, 248));
        feedback.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        feedback.setForeground(new java.awt.Color(255, 255, 255));
        feedback.setText("Feedback");
        feedback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                feedbackActionPerformed(evt);
            }
        });
        getContentPane().add(feedback, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 460, 180, 40));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oodjassignment/picture/blue.jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 810));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void profileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileActionPerformed
       new
       profile().setVisible(true);
       dispose();
    }//GEN-LAST:event_profileActionPerformed

    private void hall_infoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hall_infoActionPerformed
       new
       hall().setVisible(true);
       dispose();
    }//GEN-LAST:event_hall_infoActionPerformed

    private void booking_detailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_booking_detailsActionPerformed
       new
       bookingdetails().setVisible(true);
       dispose();
    }//GEN-LAST:event_booking_detailsActionPerformed

    private void feedbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_feedbackActionPerformed
       new
       feedback().setVisible(true);
       dispose();
    }//GEN-LAST:event_feedbackActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
       new
       Loginpage().setVisible(true);
       dispose();
    }//GEN-LAST:event_logoutActionPerformed

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
            java.util.logging.Logger.getLogger(homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            new homepage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton booking_details;
    private javax.swing.JButton feedback;
    private javax.swing.JButton hall_info;
    private javax.swing.JButton logout;
    private javax.swing.JButton profile;
    private javax.swing.JLabel welcome;
    // End of variables declaration//GEN-END:variables
}
