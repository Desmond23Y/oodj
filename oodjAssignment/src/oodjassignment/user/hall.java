/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package oodjassignment.user;

/**
 *
 * @author User
 */
public class hall extends javax.swing.JFrame {

    /**
     * Creates new form hall
     */
    public hall() {
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

        hall = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        selection_field = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        select_button = new javax.swing.JButton();
        logout_button = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        hall.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        hall.setForeground(new java.awt.Color(255, 255, 255));
        hall.setText("Hall information");
        getContentPane().add(hall, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 330, 70));

        jTable1.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, 700, 520));

        selection_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selection_fieldActionPerformed(evt);
            }
        });
        getContentPane().add(selection_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 140, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Hall ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, -1));

        select_button.setBackground(new java.awt.Color(0, 137, 248));
        select_button.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        select_button.setForeground(new java.awt.Color(255, 255, 255));
        select_button.setText("Select");
        getContentPane().add(select_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 80, 30));

        logout_button.setBackground(new java.awt.Color(0, 137, 248));
        logout_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oodjassignment/picture/logout.png"))); // NOI18N
        logout_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(logout_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 10, 60, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oodjassignment/picture/blue.jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void selection_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selection_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selection_fieldActionPerformed

    private void logout_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout_buttonActionPerformed
     new 
     homepage().setVisible(true);
     dispose();
    }//GEN-LAST:event_logout_buttonActionPerformed

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
            java.util.logging.Logger.getLogger(hall.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(hall.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(hall.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(hall.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new hall().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JLabel hall;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton logout_button;
    private javax.swing.JButton select_button;
    private javax.swing.JTextField selection_field;
    // End of variables declaration//GEN-END:variables
}
