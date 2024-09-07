/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package oodjassignment;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import oodjassignment.admin.AdministratorHomepage;
import oodjassignment.scheduler.schedulerhomepage;
import oodjassignment.manager.managerHomepage;
import oodjassignment.user.homepage;

/**
 *
 * @author Acer
 */
public class Loginpage extends javax.swing.JFrame {

    public Loginpage() {
        initComponents();
        createanaccount.setText("<html><u>Create An Account</u></html>");
        forgotpassowrd.setText("<html><u>Forgot Password?</u></html>");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        username = new javax.swing.JTextField();
        login = new javax.swing.JButton();
        showpassword = new javax.swing.JCheckBox();
        password = new javax.swing.JPasswordField();
        logintype = new javax.swing.JComboBox<>();
        Welcome = new javax.swing.JLabel();
        picture = new javax.swing.JLabel();
        forgotpassowrd = new javax.swing.JLabel();
        createanaccount = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 600));
        setPreferredSize(new java.awt.Dimension(1000, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        username.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        username.setForeground(new java.awt.Color(204, 204, 204));
        username.setText("Enter Your UserID Here");
        username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                usernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                usernameFocusLost(evt);
            }
        });
        username.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usernameMouseClicked(evt);
            }
        });
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        getContentPane().add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 330, 378, 30));

        login.setBackground(new java.awt.Color(0, 137, 248));
        login.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        login.setForeground(new java.awt.Color(255, 255, 255));
        login.setText("LOGIN");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        getContentPane().add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 470, 380, 30));

        showpassword.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        showpassword.setForeground(new java.awt.Color(255, 255, 255));
        showpassword.setText("Show Password");
        showpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showpasswordActionPerformed(evt);
            }
        });
        getContentPane().add(showpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 420, -1, -1));

        password.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        password.setForeground(new java.awt.Color(204, 204, 204));
        password.setText("Please Enter Password Here");
        password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordFocusLost(evt);
            }
        });
        password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passwordMouseClicked(evt);
            }
        });
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 380, 378, 30));

        logintype.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        logintype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADMINISTRATOR", "CUSTOMER", "SCHEDULER", "MANAGER" }));
        getContentPane().add(logintype, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, -1, -1));

        Welcome.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        Welcome.setForeground(new java.awt.Color(255, 255, 255));
        Welcome.setText("WELCOME TO THE HALL SYMPHONY INC.");
        getContentPane().add(Welcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, -1, -1));

        picture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oodjassignment/picture/hall.png"))); // NOI18N
        getContentPane().add(picture, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, -1, -1));

        forgotpassowrd.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        forgotpassowrd.setForeground(new java.awt.Color(204, 204, 204));
        forgotpassowrd.setText("Forgot Password?");
        forgotpassowrd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                forgotpassowrdMouseClicked(evt);
            }
        });
        getContentPane().add(forgotpassowrd, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 510, -1, -1));

        createanaccount.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        createanaccount.setForeground(new java.awt.Color(204, 204, 204));
        createanaccount.setText("Create an account");
        createanaccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createanaccountMouseClicked(evt);
            }
        });
        getContentPane().add(createanaccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 510, -1, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oodjassignment/picture/blue.jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameFocusGained
        // TODO add your handling code here:
        if (username.getText().equals("Please Enter Username Here")) {
            username.setText("");
            username.setForeground(newColor(0, 118, 221));
        }
    }//GEN-LAST:event_usernameFocusGained

    private void usernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameFocusLost
        // TODO add your handling code here:
        if (username.getText().equals("")) {
            username.setText("Please Enter Username Here");
            username.setForeground(newColor(0, 118, 221));

        }
    }//GEN-LAST:event_usernameFocusLost

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        String userType = (String) logintype.getSelectedItem();
        String usernameText = username.getText();  // Assuming this is the ID input
        String passwordText = password.getText();

        String fileName = "";
        switch (userType) {
            case "ADMINISTRATOR" ->
                fileName = "src/oodjassignment/database/Administrator.txt";
            case "CUSTOMER" ->
                fileName = "src/oodjassignment/database/User.txt";
            case "SCHEDULER" ->
                fileName = "src/oodjassignment/database/Scheduler.txt";
            case "MANAGER" ->
                fileName = "src/oodjassignment/database/Manager.txt";
            default -> {
                JOptionPane.showMessageDialog(this, "Please select a valid user type!");
                return;
            }
        }

        authenticateUser(fileName, usernameText, passwordText, userType);
    }

    private void authenticateUser(String filename, String id, String password, String userType) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");  // Assuming comma-separated values

                // Ensure the line has the expected number of parts (ID, Name, Phone, Email, Password)
                if (parts.length >= 5 && parts[1].equals(id) && parts[4].equals(password)) {
                    // Store full user details along with the role in the cookie
                    String userDetailsWithRole = String.join(",", parts) + "," + userType;
                    cookie(userDetailsWithRole);

                    // Handle successful login based on the role
                    switch (userType) {
                        case "ADMINISTRATOR" -> {
                            JOptionPane.showMessageDialog(this, "Admin logged in successfully!");
                            setVisible(false);
                            new AdministratorHomepage().setVisible(true);
                        }
                        case "CUSTOMER" -> {
                            JOptionPane.showMessageDialog(this, "Customer logged in successfully!");
                            setVisible(false);
                            homepage myHomepage = new homepage(ID);
                            myHomepage.setVisible(true);
                        }
                        case "SCHEDULER" -> {
                            JOptionPane.showMessageDialog(this, "Welcome scheduler!");
                            setVisible(false);
                            new schedulerhomepage().setVisible(true);
                        }
                        case "MANAGER" -> {
                            JOptionPane.showMessageDialog(this, "Manager logged in successfully!");
                            setVisible(false);
                            new managerHomepage().setVisible(true);
                        }
                    }
                    return;
                }
            }
            // If no matching credentials are found, show an error message
            JOptionPane.showMessageDialog(this, "Incorrect ID or Password.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error reading file. Please try again later.");
        }
    }//GEN-LAST:event_loginActionPerformed

private void cookie(String userDetailsWithRole) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("src/oodjassignment/database/cookie.txt"))) {
            writer.write(userDetailsWithRole);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error saving login details.");
        }
    }


    private void showpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showpasswordActionPerformed
        // TODO add your handling code here:
        if (showpassword.isSelected()) {
            password.setEchoChar((char) 0);
        } else {
            password.setEchoChar('*');
        }
    }//GEN-LAST:event_showpasswordActionPerformed

    private void passwordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFocusGained
        // TODO add your handling code here:
        if (password.getText().equals("Please Enter Password Here")) {
            password.setText("");
            password.setForeground(newColor(0, 118, 221));
        }
    }//GEN-LAST:event_passwordFocusGained

    private void passwordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFocusLost
        // TODO add your handling code here:
        if (password.getText().equals("")) {
            password.setText("Please Enter Password Here");
            password.setForeground(newColor(0, 118, 221));

        }
    }//GEN-LAST:event_passwordFocusLost

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void forgotpassowrdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgotpassowrdMouseClicked
        new AdministratorHomepage().setVisible(true);
        dispose();
    }//GEN-LAST:event_forgotpassowrdMouseClicked

    private void createanaccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createanaccountMouseClicked
        new Registerpage().setVisible(true);
        dispose();
    }//GEN-LAST:event_createanaccountMouseClicked

    private void usernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usernameMouseClicked
        username.setText("");
    }//GEN-LAST:event_usernameMouseClicked

    private void passwordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordMouseClicked
        password.setText("");
    }//GEN-LAST:event_passwordMouseClicked

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
            java.util.logging.Logger.getLogger(Loginpage.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);

} catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Loginpage.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);

} catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Loginpage.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);

} catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Loginpage.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Loginpage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Welcome;
    private javax.swing.JLabel background;
    private javax.swing.JLabel createanaccount;
    private javax.swing.JLabel forgotpassowrd;
    private javax.swing.JButton login;
    private javax.swing.JComboBox<String> logintype;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel picture;
    private javax.swing.JCheckBox showpassword;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables

    private Color newColor(int i, int i0, int i1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
