
package oodjassignment.manager;

public class managerIssue_AssignStaff extends javax.swing.JFrame {

    public managerIssue_AssignStaff() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_back = new javax.swing.JButton();
        lbl_title = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lbl_datetobeAssigned = new javax.swing.JLabel();
        cbx_day = new javax.swing.JComboBox<>();
        cbx_month = new javax.swing.JComboBox<>();
        cbx_year = new javax.swing.JComboBox<>();
        lbl_space1 = new javax.swing.JLabel();
        btn_confirm = new javax.swing.JButton();
        pnl_ID = new javax.swing.JPanel();
        lbl_enterCaseID = new javax.swing.JLabel();
        txt_caseID = new javax.swing.JTextField();
        lbl_space = new javax.swing.JLabel();
        btn_view1 = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        lbl_showStaff = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        lbl_background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1000, 800));
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

        lbl_title.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        lbl_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_title.setText("Assign Stuff to Customer Issue");
        getContentPane().add(lbl_title, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 40, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        lbl_datetobeAssigned.setFont(new java.awt.Font("Segoe UI Black", 0, 16)); // NOI18N
        lbl_datetobeAssigned.setText("DATE TO ASSIGN STAFF");
        jPanel2.add(lbl_datetobeAssigned);

        cbx_day.setFont(new java.awt.Font("Segoe UI Black", 0, 16)); // NOI18N
        cbx_day.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(cbx_day);
        cbx_day.getAccessibleContext().setAccessibleName("1\n2\n3\n4\n5\n6\n7\n8\n9\n10\n11\n12\n13\n14\n15\n16\n17\n18\n19\n20\n21\n22\n23\n24\n25\n26\n27\n28\n29\n30\n31");

        cbx_month.setFont(new java.awt.Font("Segoe UI Black", 0, 16)); // NOI18N
        cbx_month.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(cbx_month);
        cbx_month.getAccessibleContext().setAccessibleName("JAN\nFEB\nMAR\nAPR\nMAY\nJUN\nJUL\nAUG\nSEP\nOCT\nNOV\nDEC");

        cbx_year.setFont(new java.awt.Font("Segoe UI Black", 0, 16)); // NOI18N
        cbx_year.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(cbx_year);
        cbx_year.getAccessibleContext().setAccessibleName("2024\n2025\n2026\n2027\n2028");

        lbl_space1.setFont(new java.awt.Font("Segoe UI Black", 0, 16)); // NOI18N
        lbl_space1.setText("               ");
        jPanel2.add(lbl_space1);

        btn_confirm.setFont(new java.awt.Font("Segoe UI Black", 0, 16)); // NOI18N
        btn_confirm.setText("CONFIRM");
        btn_confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_confirmActionPerformed(evt);
            }
        });
        jPanel2.add(btn_confirm);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 700, -1));

        pnl_ID.setBackground(new java.awt.Color(255, 255, 255));

        lbl_enterCaseID.setFont(new java.awt.Font("Segoe UI Black", 0, 16)); // NOI18N
        lbl_enterCaseID.setText("CASE ID");
        pnl_ID.add(lbl_enterCaseID);

        txt_caseID.setFont(new java.awt.Font("Segoe UI Black", 0, 16)); // NOI18N
        txt_caseID.setMinimumSize(new java.awt.Dimension(100, 29));
        txt_caseID.setPreferredSize(new java.awt.Dimension(100, 29));
        pnl_ID.add(txt_caseID);

        lbl_space.setText("                                                                                                                                  ");
        pnl_ID.add(lbl_space);

        btn_view1.setFont(new java.awt.Font("Segoe UI Black", 0, 16)); // NOI18N
        btn_view1.setText("VIEW");
        btn_view1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_view1ActionPerformed(evt);
            }
        });
        pnl_ID.add(btn_view1);

        getContentPane().add(pnl_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 700, -1));

        btn_update.setFont(new java.awt.Font("Segoe UI Black", 0, 16)); // NOI18N
        btn_update.setText("UPDATE");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });
        getContentPane().add(btn_update, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 380, -1, -1));

        lbl_showStaff.setFont(new java.awt.Font("Segoe UI Black", 0, 16)); // NOI18N
        lbl_showStaff.setText("AVAILABLE STAFF");
        getContentPane().add(lbl_showStaff, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.setPreferredSize(new java.awt.Dimension(700, 80));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 700, 80));

        lbl_background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oodjassignment/picture/blue.jpg"))); // NOI18N
        lbl_background.setText("jLabel4");
        lbl_background.setPreferredSize(new java.awt.Dimension(1000, 800));
        getContentPane().add(lbl_background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 810));

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

    private void btn_confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_confirmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_confirmActionPerformed

    private void btn_view1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_view1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_view1ActionPerformed

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
            java.util.logging.Logger.getLogger(managerIssue_AssignStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(managerIssue_AssignStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(managerIssue_AssignStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(managerIssue_AssignStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new managerIssue_AssignStaff().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_confirm;
    private javax.swing.JButton btn_update;
    private javax.swing.JButton btn_view1;
    private javax.swing.JComboBox<String> cbx_day;
    private javax.swing.JComboBox<String> cbx_month;
    private javax.swing.JComboBox<String> cbx_year;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl_background;
    private javax.swing.JLabel lbl_datetobeAssigned;
    private javax.swing.JLabel lbl_enterCaseID;
    private javax.swing.JLabel lbl_showStaff;
    private javax.swing.JLabel lbl_space;
    private javax.swing.JLabel lbl_space1;
    private javax.swing.JLabel lbl_title;
    private javax.swing.JPanel pnl_ID;
    private javax.swing.JTextField txt_caseID;
    // End of variables declaration//GEN-END:variables
}
