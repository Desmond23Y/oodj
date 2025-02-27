/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package oodjassignment.user;

import javax.swing.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class profile extends javax.swing.JFrame {
    private UserProfile userProfile;

    public profile() {
        initComponents();
        userProfile = UserProfile.autofillUserData();
        if (userProfile != null) {
            populateFields();
        }
    }
    
    private void populateFields() {
        id_field.setText(userProfile.getId());
        username_field.setText(userProfile.getUsername());
        phone_field.setText(userProfile.getPhone());
        email_field.setText(userProfile.getEmail());
        password_field.setText(userProfile.getPassword());
        acc_status.setText(userProfile.getAccountStatus());
        
        id_field.setEditable(false);
        acc_status.setEditable(false);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        phone_field = new javax.swing.JTextField();
        acc_status = new javax.swing.JTextField();
        update_button = new javax.swing.JButton();
        logout_button = new javax.swing.JButton();
        showpassword = new javax.swing.JCheckBox();
        id_field = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        username_field = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        password_field = new javax.swing.JPasswordField();
        email_field = new javax.swing.JTextField();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("Account Settings");
        getContentPane().add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 60, 330, 50));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Username:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Phone number:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Email:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 400, 110, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Password:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 480, 110, 30));
        getContentPane().add(phone_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 320, 200, 30));
        getContentPane().add(acc_status, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 550, 200, 30));

        update_button.setBackground(new java.awt.Color(0, 137, 248));
        update_button.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        update_button.setForeground(new java.awt.Color(255, 255, 255));
        update_button.setText("Update");
        update_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(update_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 650, -1, -1));

        logout_button.setBackground(new java.awt.Color(0, 137, 248));
        logout_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oodjassignment/picture/logout.png"))); // NOI18N
        logout_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(logout_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 10, 60, 40));

        showpassword.setBackground(new java.awt.Color(0, 137, 248));
        showpassword.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        showpassword.setForeground(new java.awt.Color(255, 255, 255));
        showpassword.setText("Show password");
        showpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showpasswordActionPerformed(evt);
            }
        });
        getContentPane().add(showpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 470, -1, 30));
        getContentPane().add(id_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 160, 200, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ID:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 170, -1, -1));
        getContentPane().add(username_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 240, 200, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Account Status:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 550, -1, -1));

        password_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                password_fieldActionPerformed(evt);
            }
        });
        getContentPane().add(password_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 470, 200, 30));
        getContentPane().add(email_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 390, 200, 30));

        background.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        background.setForeground(new java.awt.Color(255, 255, 255));
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oodjassignment/picture/blue.jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logout_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout_buttonActionPerformed
    new 
    homepage().setVisible(true);
    dispose();
    }//GEN-LAST:event_logout_buttonActionPerformed

    private void showpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showpasswordActionPerformed
          if(showpassword.isSelected())
        {
            password_field.setEchoChar((char)0);
        }
        else
        {
            password_field.setEchoChar('*');
        }   
    }//GEN-LAST:event_showpasswordActionPerformed

    
    private void update_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_buttonActionPerformed
        userProfile = new UserProfile(id_field.getText(), username_field.getText(),
                            phone_field.getText(), email_field.getText(),
                new String(password_field.getPassword()), "ACTIVE");
        userProfile.updateUserProfile();
        new
        homepage().setVisible(true);
        dispose();
    }//GEN-LAST:event_update_buttonActionPerformed

    private void password_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_password_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_password_fieldActionPerformed

    
    public static void main(String args[]) {
            java.awt.EventQueue.invokeLater(() -> {
            new profile().setVisible(true);  // Open the JFrame
        });
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new profile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField acc_status;
    private javax.swing.JLabel background;
    private javax.swing.JTextField email_field;
    private javax.swing.JTextField id_field;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton logout_button;
    private javax.swing.JPasswordField password_field;
    private javax.swing.JTextField phone_field;
    private javax.swing.JCheckBox showpassword;
    private javax.swing.JLabel title;
    private javax.swing.JButton update_button;
    private javax.swing.JTextField username_field;
    // End of variables declaration//GEN-END:variables
}
