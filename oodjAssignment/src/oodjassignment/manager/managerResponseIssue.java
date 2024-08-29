/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package oodjassignment.manager;

/**
 *
 * @author enyis
 */
public class managerResponseIssue extends javax.swing.JFrame {

    /**
     * Creates new form managerResponseIssue
     */
    public managerResponseIssue() {
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

        lbl_title = new javax.swing.JLabel();
        lbl_enterCaseID = new javax.swing.JLabel();
        txt_caseID = new javax.swing.JTextField();
        lbl_or = new javax.swing.JLabel();
        lbl_selectCaseID = new javax.swing.JLabel();
        spn_selectCaseID = new javax.swing.JSpinner();
        btn_send = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_title.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        lbl_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_title.setText("View Customer Issue");
        getContentPane().add(lbl_title, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, -1, -1));

        lbl_enterCaseID.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        lbl_enterCaseID.setText("Enter the Case ID:");
        getContentPane().add(lbl_enterCaseID, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, -1, -1));

        txt_caseID.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        getContentPane().add(txt_caseID, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 150, -1));

        lbl_or.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        lbl_or.setText("OR");
        getContentPane().add(lbl_or, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, -1, -1));

        lbl_selectCaseID.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        lbl_selectCaseID.setText("Select the Case ID:");
        getContentPane().add(lbl_selectCaseID, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, -1, -1));

        spn_selectCaseID.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        getContentPane().add(spn_selectCaseID, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 110, 160, -1));

        btn_send.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        btn_send.setText("Send");
        btn_send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sendActionPerformed(evt);
            }
        });
        getContentPane().add(btn_send, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 430, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel1.setText("Message:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, -1, -1));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 560, 170));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_sendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sendActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_sendActionPerformed

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
            java.util.logging.Logger.getLogger(managerResponseIssue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(managerResponseIssue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(managerResponseIssue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(managerResponseIssue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new managerResponseIssue().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_send;
    private javax.swing.JButton btn_view;
    private javax.swing.JButton btn_view1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lbl_enterCaseID;
    private javax.swing.JLabel lbl_or;
    private javax.swing.JLabel lbl_selectCaseID;
    private javax.swing.JLabel lbl_title;
    private javax.swing.JSpinner spn_selectCaseID;
    private javax.swing.JTextField txt_caseID;
    // End of variables declaration//GEN-END:variables
}
