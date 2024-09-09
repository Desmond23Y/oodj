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


    public profile() {
        initComponents();
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
        email_field = new javax.swing.JTextField();
        update_button = new javax.swing.JButton();
        logout_button = new javax.swing.JButton();
        password_field = new javax.swing.JPasswordField();
        showpassword = new javax.swing.JCheckBox();
        id_field = new javax.swing.JTextField();
        search_button = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        username_field = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("Account Settings");
        getContentPane().add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, 330, 50));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Username");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Phone number");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Email");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 390, 110, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Password");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 470, 100, 30));
        getContentPane().add(phone_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 310, 200, 30));
        getContentPane().add(email_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 390, 200, 30));

        update_button.setBackground(new java.awt.Color(0, 137, 248));
        update_button.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        update_button.setForeground(new java.awt.Color(255, 255, 255));
        update_button.setText("Update");
        update_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(update_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 610, -1, -1));

        logout_button.setBackground(new java.awt.Color(0, 137, 248));
        logout_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oodjassignment/picture/logout.png"))); // NOI18N
        logout_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(logout_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 10, 60, 40));

        password_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                password_fieldActionPerformed(evt);
            }
        });
        getContentPane().add(password_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 470, 200, 30));

        showpassword.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        showpassword.setForeground(new java.awt.Color(255, 255, 255));
        showpassword.setText("Show password");
        showpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showpasswordActionPerformed(evt);
            }
        });
        getContentPane().add(showpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 470, -1, 30));
        getContentPane().add(id_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 170, 200, 30));

        search_button.setBackground(new java.awt.Color(0, 137, 248));
        search_button.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        search_button.setForeground(new java.awt.Color(255, 255, 255));
        search_button.setText("Search");
        search_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(search_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 240, 100, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ID");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, -1, -1));
        getContentPane().add(username_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 240, 200, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 51, 51));
        jLabel6.setText("Account blocked!!");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 540, 230, 30));

        background.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        background.setForeground(new java.awt.Color(255, 255, 255));
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oodjassignment/picture/blue.jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 800));

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

    private void password_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_password_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_password_fieldActionPerformed

    
    private void update_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_buttonActionPerformed
    String filePath = "src/oodjassignment/database/User.txt";
    File inputFile = new File(filePath);

    try (
        BufferedReader reader = new BufferedReader(new FileReader(inputFile))
    ) {
        StringBuilder fileContent = new StringBuilder();
        String currentLine;
        boolean isUpdated = false;

        // Read the file content and update if necessary
        while ((currentLine = reader.readLine()) != null) {
            String[] details = currentLine.split(",");

            if (details[0].equals(id_field.getText())) { // Compare with locked ID field
                // Ensure all required fields are filled before updating
                if (!username_field.getText().isEmpty() 
                    && !phone_field.getText().isEmpty() 
                    && !email_field.getText().isEmpty() 
                    && !password_field.getText().isEmpty()) {

                    // Create the updated record
                    String updatedRecord = details[0] + "," + username_field.getText() + "," +
                                           phone_field.getText() + "," + email_field.getText() + "," +
                                           password_field.getText();

                    // Append the updated record to the file content
                    fileContent.append(updatedRecord).append(System.lineSeparator());
                    isUpdated = true;
                } else {
                    JOptionPane.showMessageDialog(this, "Please fill in all fields.");
                    return;
                }
            } else {
                // Append the existing record to the file content
                fileContent.append(currentLine).append(System.lineSeparator());
            }
        }

        // If update was successful, write the new content back to the file
        if (isUpdated) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(inputFile))) {
                writer.write(fileContent.toString());
            }
            JOptionPane.showMessageDialog(this, "Update Successfully!!");
            setVisible(false);
            new profile().setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "User ID not found.");
        }

    } catch (IOException ex) {
        JOptionPane.showMessageDialog(this, "Something went wrong: " + ex.getMessage());
        ex.printStackTrace();
    }
    }//GEN-LAST:event_update_buttonActionPerformed

    
    private void search_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_buttonActionPerformed
        String searchTerm = username_field.getText();
    if (searchTerm.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Please enter your username");
        return;
    }

    try (BufferedReader reader = new BufferedReader(new FileReader("src/oodjassignment/database/User.txt"))) {
        String line;
        boolean userFound = false;

        while ((line = reader.readLine()) != null) {
            String[] userData = line.split(",");
            if (userData.length == 6 && (userData[1].equals(searchTerm))) {
                // User found, load the data into text fields
                id_field.setText(userData[0]);
                id_field.setEditable(false);  // Lock the User ID field
                username_field.setText(userData[1]);
                phone_field.setText(userData[2]);
                email_field.setText(userData[3]);
                password_field.setText(userData[4]);
                userFound = true;
                break;
            }
        }

        if (!userFound) {
            JOptionPane.showMessageDialog(null, "User not found.");
        }

    } catch (IOException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error loading user data.");
    }
    }//GEN-LAST:event_search_buttonActionPerformed

    



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
            java.util.logging.Logger.getLogger(profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new profile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JButton search_button;
    private javax.swing.JCheckBox showpassword;
    private javax.swing.JLabel title;
    private javax.swing.JButton update_button;
    private javax.swing.JTextField username_field;
    // End of variables declaration//GEN-END:variables
}
