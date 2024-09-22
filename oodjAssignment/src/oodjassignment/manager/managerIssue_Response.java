/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package oodjassignment.manager;

/**
 *
 * @author enyis
 */
public class managerIssue_Response extends javax.swing.JFrame {

    /**
     * Creates new form managerResponseIssue
     */
    public managerIssue_Response() {
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

        btn_back = new javax.swing.JButton();
        lbl_title = new javax.swing.JLabel();
        pnl_ID = new javax.swing.JPanel();
        lbl_enterCaseID = new javax.swing.JLabel();
        txt_caseID = new javax.swing.JTextField();
        lbl_space = new javax.swing.JLabel();
        btn_view = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txt_newMessage = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        lbl_background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1200, 800));
        setPreferredSize(new java.awt.Dimension(1200, 800));
        setSize(new java.awt.Dimension(1200, 800));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_back.setFont(new java.awt.Font("Segoe UI Black", 0, 16)); // NOI18N
        btn_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oodjassignment/picture/logout.png"))); // NOI18N
        btn_back.setText("BACK");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });
        getContentPane().add(btn_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        lbl_title.setFont(new java.awt.Font("Segoe UI Black", 0, 48)); // NOI18N
        lbl_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_title.setText("Response to Customer Issue");
        getContentPane().add(lbl_title, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 40, -1, -1));

        pnl_ID.setBackground(new java.awt.Color(255, 255, 255));
        pnl_ID.setMinimumSize(new java.awt.Dimension(900, 45));
        pnl_ID.setPreferredSize(new java.awt.Dimension(900, 45));

        lbl_enterCaseID.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        lbl_enterCaseID.setText("CASE ID");
        pnl_ID.add(lbl_enterCaseID);

        txt_caseID.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        txt_caseID.setMinimumSize(new java.awt.Dimension(100, 29));
        txt_caseID.setPreferredSize(new java.awt.Dimension(100, 29));
        pnl_ID.add(txt_caseID);

        lbl_space.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        lbl_space.setText("                                                                                           ");
        pnl_ID.add(lbl_space);

        btn_view.setFont(new java.awt.Font("Segoe UI Black", 0, 20)); // NOI18N
        btn_view.setText("VIEW");
        btn_view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_viewActionPerformed(evt);
            }
        });
        pnl_ID.add(btn_view);

        getContentPane().add(pnl_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 900, -1));

        btn_update.setFont(new java.awt.Font("Segoe UI Black", 0, 16)); // NOI18N
        btn_update.setText("UPDATE");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });
        getContentPane().add(btn_update, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 590, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 20)); // NOI18N
        jLabel1.setText("NEW MESSAGE");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 500, -1, -1));
        getContentPane().add(txt_newMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 530, 540, 90));

        jScrollPane1.setPreferredSize(new java.awt.Dimension(900, 402));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Case ID", "Date", "Hall Type", "Hall Number", "Customer ID", "Description", "Case Status", "Assigned Staff"
            }
        ));
        jTable1.setMinimumSize(new java.awt.Dimension(900, 80));
        jTable1.setPreferredSize(new java.awt.Dimension(900, 80));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, -1, 230));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 20)); // NOI18N
        jLabel2.setText("HISTORY");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, -1, -1));

        lbl_background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oodjassignment/picture/blue.jpg"))); // NOI18N
        lbl_background.setText("jLabel4");
        lbl_background.setMinimumSize(new java.awt.Dimension(1200, 800));
        lbl_background.setPreferredSize(new java.awt.Dimension(1200, 800));
        getContentPane().add(lbl_background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        managerHomepage managerHomepage = new managerHomepage();
        managerHomepage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_backActionPerformed

    private void btn_viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_viewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_viewActionPerformed

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
            java.util.logging.Logger.getLogger(managerIssue_Response.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(managerIssue_Response.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(managerIssue_Response.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(managerIssue_Response.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new managerIssue_Response().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_update;
    private javax.swing.JButton btn_view;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbl_background;
    private javax.swing.JLabel lbl_enterCaseID;
    private javax.swing.JLabel lbl_space;
    private javax.swing.JLabel lbl_title;
    private javax.swing.JPanel pnl_ID;
    private javax.swing.JTextField txt_caseID;
    private javax.swing.JTextField txt_newMessage;
    // End of variables declaration//GEN-END:variables
}
