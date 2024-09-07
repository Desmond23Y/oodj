/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package oodjassignment.user;

public class profile extends javax.swing.JFrame {

    /**
     * Creates new form profile
     */
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
        username_field = new javax.swing.JTextField();
        update_button = new javax.swing.JButton();
        logout_button = new javax.swing.JButton();
        password_field = new javax.swing.JPasswordField();
        showpassword = new javax.swing.JCheckBox();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("Account Settings");
        getContentPane().add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 330, 50));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Username");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Phone number");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Email");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 110, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Password");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 410, 100, 30));
        getContentPane().add(phone_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, 200, 30));
        getContentPane().add(email_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 340, 200, 30));
        getContentPane().add(username_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, 200, 30));

        update_button.setBackground(new java.awt.Color(0, 137, 248));
        update_button.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        update_button.setForeground(new java.awt.Color(255, 255, 255));
        update_button.setText("Update");
        update_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(update_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 490, -1, -1));

        logout_button.setBackground(new java.awt.Color(0, 137, 248));
        logout_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oodjassignment/picture/logout.png"))); // NOI18N
        logout_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(logout_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 10, 60, 40));

        password_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                password_fieldActionPerformed(evt);
            }
        });
        getContentPane().add(password_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 410, 200, 30));

        showpassword.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        showpassword.setForeground(new java.awt.Color(255, 255, 255));
        showpassword.setText("Show password");
        showpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showpasswordActionPerformed(evt);
            }
        });
        getContentPane().add(showpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 410, -1, 30));

        background.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        background.setForeground(new java.awt.Color(255, 255, 255));
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oodjassignment/picture/blue.jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logout_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout_buttonActionPerformed
    homepage myHomepage = new homepage(0);
    myHomepage.setVisible(true);
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
             
    }//GEN-LAST:event_update_buttonActionPerformed

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton logout_button;
    private javax.swing.JPasswordField password_field;
    private javax.swing.JTextField phone_field;
    private javax.swing.JCheckBox showpassword;
    private javax.swing.JLabel title;
    private javax.swing.JButton update_button;
    private javax.swing.JTextField username_field;
    // End of variables declaration//GEN-END:variables
}
