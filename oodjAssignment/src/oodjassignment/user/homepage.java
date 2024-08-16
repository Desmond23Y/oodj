/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package oodjassignment.user;

/**
 *
 * @author User
 */
public class homepage extends javax.swing.JFrame {

    /**
     * Creates new form homepage
     */
    public homepage() {
        initComponents();
    }
    
    void username(String user){
        title.setText(user);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JLabel();
        profile = new javax.swing.JButton();
        hall_info = new javax.swing.JButton();
        booking_details = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        feedback = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setText("Welcome");
        getContentPane().add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 230, 30));

        profile.setBackground(new java.awt.Color(0, 137, 248));
        profile.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        profile.setForeground(new java.awt.Color(255, 255, 255));
        profile.setText("Profile");
        getContentPane().add(profile, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 180, 40));

        hall_info.setBackground(new java.awt.Color(0, 137, 248));
        hall_info.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        hall_info.setForeground(new java.awt.Color(255, 255, 255));
        hall_info.setText("Hall Infomation");
        getContentPane().add(hall_info, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, 180, 40));

        booking_details.setBackground(new java.awt.Color(0, 137, 248));
        booking_details.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        booking_details.setForeground(new java.awt.Color(255, 255, 255));
        booking_details.setText("Booking Details");
        getContentPane().add(booking_details, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 340, 180, 40));

        logout.setBackground(new java.awt.Color(0, 137, 248));
        logout.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        logout.setForeground(new java.awt.Color(255, 255, 255));
        logout.setText("Logout");
        getContentPane().add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 480, 180, 40));

        feedback.setBackground(new java.awt.Color(0, 137, 248));
        feedback.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        feedback.setForeground(new java.awt.Color(255, 255, 255));
        feedback.setText("Feedback");
        getContentPane().add(feedback, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 410, 180, 40));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oodjassignment/picture/blue.jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
