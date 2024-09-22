
package oodjassignment.manager;

public class managerHomepage extends javax.swing.JFrame {

    public managerHomepage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_title = new javax.swing.JLabel();
        btn_date = new javax.swing.JButton();
        btn_viewCaseChangeStatus = new javax.swing.JButton();
        btn_assignStaff = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        lbl_viewSales = new javax.swing.JLabel();
        lbl_cusIssue = new javax.swing.JLabel();
        btn_venue = new javax.swing.JButton();
        lbl_background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1000, 800));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_title.setFont(new java.awt.Font("Segoe UI Black", 0, 48)); // NOI18N
        lbl_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_title.setText("Welcome to Manager Menu!");
        lbl_title.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_title)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lbl_title)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, -1, -1));

        btn_date.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btn_date.setText("Date");
        btn_date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dateActionPerformed(evt);
            }
        });
        getContentPane().add(btn_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, -1, -1));

        btn_viewCaseChangeStatus.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btn_viewCaseChangeStatus.setText("View Case & Change Status");
        btn_viewCaseChangeStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_viewCaseChangeStatusActionPerformed(evt);
            }
        });
        getContentPane().add(btn_viewCaseChangeStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 290, -1, -1));

        btn_assignStaff.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btn_assignStaff.setText("Assign Staff to Fix Issues");
        btn_assignStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_assignStaffActionPerformed(evt);
            }
        });
        getContentPane().add(btn_assignStaff, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 330, -1, -1));

        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton4.setText("Reply Customer Issues");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 370, -1, -1));

        lbl_viewSales.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        lbl_viewSales.setText("View Sales by");
        getContentPane().add(lbl_viewSales, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, -1, -1));

        lbl_cusIssue.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        lbl_cusIssue.setText("Customer Issue");
        getContentPane().add(lbl_cusIssue, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 240, -1, -1));

        btn_venue.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btn_venue.setText("Venue");
        btn_venue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_venueActionPerformed(evt);
            }
        });
        getContentPane().add(btn_venue, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 330, -1, -1));

        lbl_background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oodjassignment/picture/blue.jpg"))); // NOI18N
        lbl_background.setText("jLabel4");
        lbl_background.setPreferredSize(new java.awt.Dimension(1000, 800));
        getContentPane().add(lbl_background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_viewCaseChangeStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_viewCaseChangeStatusActionPerformed
        managerIssue_View managerIssue_View = new managerIssue_View();
        managerIssue_View.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_viewCaseChangeStatusActionPerformed

    private void btn_assignStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_assignStaffActionPerformed
        managerIssue_AssignStaff managerIssue_AssignStaff = new managerIssue_AssignStaff();
        managerIssue_AssignStaff.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_assignStaffActionPerformed

    private void btn_venueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_venueActionPerformed
        managerViewSales_Venue managerViewSales_Venue = new managerViewSales_Venue();
        managerViewSales_Venue.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_venueActionPerformed

    private void btn_dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dateActionPerformed
        managerViewSales_Date managerViewSales_Date = new managerViewSales_Date();
        managerViewSales_Date.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_dateActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        managerIssue_Response managerIssue_Response = new managerIssue_Response();
        managerIssue_Response.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(managerHomepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(managerHomepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(managerHomepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(managerHomepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new managerHomepage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_assignStaff;
    private javax.swing.JButton btn_date;
    private javax.swing.JButton btn_venue;
    private javax.swing.JButton btn_viewCaseChangeStatus;
    private javax.swing.JButton jButton4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_background;
    private javax.swing.JLabel lbl_cusIssue;
    private javax.swing.JLabel lbl_title;
    private javax.swing.JLabel lbl_viewSales;
    // End of variables declaration//GEN-END:variables
}
