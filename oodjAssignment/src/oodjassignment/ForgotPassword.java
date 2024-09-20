/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package oodjassignment;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author user
 */
public class ForgotPassword extends javax.swing.JFrame {

    /**
     * Creates new form ForgotPassword
     */
    public ForgotPassword() {
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

        jPanel1 = new javax.swing.JPanel();
        tfUserid = new javax.swing.JTextField();
        tfPassword = new javax.swing.JPasswordField();
        tfEmail = new javax.swing.JTextField();
        btResetPassword = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        BACKGROUND = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 137, 248));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tfUserid.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        tfUserid.setForeground(new java.awt.Color(0, 0, 0));
        tfUserid.setText("ENTER USER ID HERE");
        tfUserid.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfUseridFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfUseridFocusLost(evt);
            }
        });
        tfUserid.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfUseridMouseClicked(evt);
            }
        });
        tfUserid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfUseridActionPerformed(evt);
            }
        });

        tfPassword.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        tfPassword.setForeground(new java.awt.Color(0, 0, 0));
        tfPassword.setText("000000000000000000000000");
        tfPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfPasswordFocusLost(evt);
            }
        });
        tfPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfPasswordMouseClicked(evt);
            }
        });

        tfEmail.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        tfEmail.setForeground(new java.awt.Color(0, 0, 0));
        tfEmail.setText("ENTER EMAIL HERE");
        tfEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfEmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfEmailFocusLost(evt);
            }
        });
        tfEmail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfEmailMouseClicked(evt);
            }
        });
        tfEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfEmailActionPerformed(evt);
            }
        });

        btResetPassword.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        btResetPassword.setText("RESET PASSWORD");
        btResetPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btResetPasswordActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ENTER NEW PASSWORD:");

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ENTER USER DETAILS:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfPassword)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(tfEmail)
                    .addComponent(tfUserid, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
                    .addComponent(btResetPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfUserid, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btResetPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("FORGOT PASSWORD");

        BACKGROUND.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oodjassignment/picture/blue.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(247, 247, 247)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(263, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(BACKGROUND, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(jLabel3)
                .addGap(86, 86, 86)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(148, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(BACKGROUND, javax.swing.GroupLayout.PREFERRED_SIZE, 806, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfUseridFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfUseridFocusGained

    }//GEN-LAST:event_tfUseridFocusGained

    private void tfUseridFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfUseridFocusLost

    }//GEN-LAST:event_tfUseridFocusLost

    private void tfUseridMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfUseridMouseClicked
        tfUserid.setText("");
    }//GEN-LAST:event_tfUseridMouseClicked

    private void tfUseridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfUseridActionPerformed

    }//GEN-LAST:event_tfUseridActionPerformed

    private void tfPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfPasswordFocusGained

    }//GEN-LAST:event_tfPasswordFocusGained

    private void tfPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfPasswordFocusLost

    }//GEN-LAST:event_tfPasswordFocusLost

    private void tfPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfPasswordMouseClicked
        tfPassword.setText("");
    }//GEN-LAST:event_tfPasswordMouseClicked

    private void tfEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfEmailFocusGained

    }//GEN-LAST:event_tfEmailFocusGained

    private void tfEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfEmailFocusLost

    }//GEN-LAST:event_tfEmailFocusLost

    private void tfEmailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfEmailMouseClicked
        tfEmail.setText("");
    }//GEN-LAST:event_tfEmailMouseClicked

    private void tfEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfEmailActionPerformed

    private void btResetPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btResetPasswordActionPerformed
        // Get user input from the text fields
        String userId = tfUserid.getText();
        String email = tfEmail.getText();
        String newPassword = String.valueOf(tfPassword.getPassword());
        
        if (userId.isEmpty() || email.isEmpty() || newPassword.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Please fill in all fields.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if (!DataValidation.isValidUserId(userId)) {
            javax.swing.JOptionPane.showMessageDialog(this, "Invalid User ID. It must be 1 letter followed by 4 digits.", "Validation Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!DataValidation.isValidEmail(email)) {
            javax.swing.JOptionPane.showMessageDialog(this, "Invalid Email. Please enter a valid email address.", "Validation Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!DataValidation.isValidPassword(newPassword)) {
            javax.swing.JOptionPane.showMessageDialog(this, "Invalid Password. Password must contain at least 1 uppercase letter, 1 digit, 1 symbol, and be at least 8 characters long.", "Validation Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }

        String[] filePaths = {"src/oodjassignment/database/User.txt",
            "src/oodjassignment/database/Scheduler.txt",
            "src/oodjassignment/database/Administrator.txt",
            "src/oodjassignment/database/Manager.txt"};

        String matchedLine = null;
        String matchedFile = null;

        // Check all files for matching UserID and Email
        for (String filePath : filePaths) {
            matchedLine = checkFileForMatch(filePath, userId, email);
            if (matchedLine != null) {
                matchedFile = filePath;
                break;
            }
        }

        if (matchedLine != null) {
            updatePasswordInFile(matchedFile, matchedLine, newPassword);
            javax.swing.JOptionPane.showMessageDialog(this, "Password reset successfully!", "Success", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            Loginpage Loginpage = new Loginpage();
            Loginpage.setVisible(true);
            this.dispose();
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Entered Wrong Credientials.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }

// Method to check file for matching UserID and Email
    private String checkFileForMatch(String filePath, String userId, String email) {
        boolean isUserFile = filePath.contains("User.txt");

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");

                int expectedLength = isUserFile ? 6 : 5;  // User.txt has 6 columns, others have 5

                if (parts.length == expectedLength) {
                    if (parts[0].equals(userId) && parts[3].equals(email)) {
                        return line;
                    }
                } else {
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;  // No match found
    }

    private void updatePasswordInFile(String filePath, String oldLine, String newPassword) {
        File file = new File(filePath);
        File tempFile = new File("temp.txt");

        try (BufferedReader reader = new BufferedReader(new FileReader(file)); BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {

            String line;
            while ((line = reader.readLine()) != null) {
                if (line.equals(oldLine)) {
                    // Split the line to update password
                    String[] parts = line.split(",");
                    parts[4] = newPassword; // Update password (5th field)
                    line = String.join(",", parts); // Rebuild the line
                }
                writer.write(line + System.lineSeparator());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (file.delete()) {
            tempFile.renameTo(file);
        }
    }//GEN-LAST:event_btResetPasswordActionPerformed

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
            java.util.logging.Logger.getLogger(ForgotPassword.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ForgotPassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BACKGROUND;
    private javax.swing.JButton btResetPassword;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JPasswordField tfPassword;
    private javax.swing.JTextField tfUserid;
    // End of variables declaration//GEN-END:variables
}
