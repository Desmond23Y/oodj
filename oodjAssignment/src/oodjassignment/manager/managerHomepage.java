
package oodjassignment.manager;

import java.util.List;
import oodjassignment.Loginpage;

public class managerHomepage extends javax.swing.JFrame {

    public managerHomepage() {
        initComponents();
        initialCaseIdTXT();
        initialcaseStaffNStatusTXT();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_title = new javax.swing.JLabel();
        btn_logOut = new javax.swing.JButton();
        btn_date = new javax.swing.JButton();
        btn_viewCaseChangeStatus = new javax.swing.JButton();
        btn_assignStaff = new javax.swing.JButton();
        btn_replyCustomerIssue = new javax.swing.JButton();
        lbl_viewSales = new javax.swing.JLabel();
        lbl_cusIssue = new javax.swing.JLabel();
        btn_venue = new javax.swing.JButton();
        lbl_background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1200, 800));
        setSize(new java.awt.Dimension(1200, 800));
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 40, -1, -1));

        btn_logOut.setFont(new java.awt.Font("Segoe UI Black", 0, 16)); // NOI18N
        btn_logOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oodjassignment/picture/logout.png"))); // NOI18N
        btn_logOut.setText("LOG OUT");
        btn_logOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logOutActionPerformed(evt);
            }
        });
        getContentPane().add(btn_logOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 740, -1, -1));

        btn_date.setFont(new java.awt.Font("Segoe UI Black", 0, 28)); // NOI18N
        btn_date.setText("Date");
        btn_date.setMinimumSize(new java.awt.Dimension(404, 45));
        btn_date.setPreferredSize(new java.awt.Dimension(404, 45));
        btn_date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dateActionPerformed(evt);
            }
        });
        getContentPane().add(btn_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 310, -1, -1));

        btn_viewCaseChangeStatus.setFont(new java.awt.Font("Segoe UI Black", 0, 28)); // NOI18N
        btn_viewCaseChangeStatus.setText("View Case & Change Status");
        btn_viewCaseChangeStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_viewCaseChangeStatusActionPerformed(evt);
            }
        });
        getContentPane().add(btn_viewCaseChangeStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(698, 310, -1, -1));

        btn_assignStaff.setFont(new java.awt.Font("Segoe UI Black", 0, 28)); // NOI18N
        btn_assignStaff.setText("Assign Staff to Fix Issues");
        btn_assignStaff.setMinimumSize(new java.awt.Dimension(404, 45));
        btn_assignStaff.setPreferredSize(new java.awt.Dimension(404, 45));
        btn_assignStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_assignStaffActionPerformed(evt);
            }
        });
        getContentPane().add(btn_assignStaff, new org.netbeans.lib.awtextra.AbsoluteConstraints(698, 370, -1, -1));

        btn_replyCustomerIssue.setFont(new java.awt.Font("Segoe UI Black", 0, 28)); // NOI18N
        btn_replyCustomerIssue.setText("Reply Customer Issues");
        btn_replyCustomerIssue.setMinimumSize(new java.awt.Dimension(404, 45));
        btn_replyCustomerIssue.setPreferredSize(new java.awt.Dimension(404, 45));
        btn_replyCustomerIssue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_replyCustomerIssueActionPerformed(evt);
            }
        });
        getContentPane().add(btn_replyCustomerIssue, new org.netbeans.lib.awtextra.AbsoluteConstraints(698, 430, -1, -1));

        lbl_viewSales.setFont(new java.awt.Font("Segoe UI Black", 0, 40)); // NOI18N
        lbl_viewSales.setText("View Sales By");
        getContentPane().add(lbl_viewSales, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 240, -1, -1));

        lbl_cusIssue.setFont(new java.awt.Font("Segoe UI Black", 0, 40)); // NOI18N
        lbl_cusIssue.setText("Customer Issues");
        getContentPane().add(lbl_cusIssue, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 240, -1, -1));

        btn_venue.setFont(new java.awt.Font("Segoe UI Black", 0, 28)); // NOI18N
        btn_venue.setText("Venue");
        btn_venue.setMinimumSize(new java.awt.Dimension(404, 45));
        btn_venue.setPreferredSize(new java.awt.Dimension(404, 45));
        btn_venue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_venueActionPerformed(evt);
            }
        });
        getContentPane().add(btn_venue, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 370, -1, -1));

        lbl_background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oodjassignment/picture/blue.jpg"))); // NOI18N
        lbl_background.setText("jLabel4");
        lbl_background.setMinimumSize(new java.awt.Dimension(1200, 800));
        lbl_background.setPreferredSize(new java.awt.Dimension(1200, 800));
        getContentPane().add(lbl_background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, -1));

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

    private void btn_replyCustomerIssueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_replyCustomerIssueActionPerformed
        managerIssue_Response managerIssue_Response = new managerIssue_Response();
        managerIssue_Response.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_replyCustomerIssueActionPerformed

    private void btn_logOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logOutActionPerformed
        Loginpage Loginpage = new Loginpage();
        Loginpage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_logOutActionPerformed
    // INITAL FILES ------------------------------------------------------------
    private void initialCaseIdTXT(){
        ReadCase readCase = new ReadCase("someCaseId");
        List<String> caseIds = readCase.readCaseIds();
        List<String> existingCaseIds = readCase.readExistingCaseIds();

        WriteCase writeCase = new WriteCase();
        writeCase.writeCaseIds(caseIds, existingCaseIds);
    }
    
    private void initialcaseStaffNStatusTXT(){
        WriteCase writecase = new WriteCase();
        writecase.writeUpdatedCaseNStaffStatus();
    }
    
    // MAIN --------------------------------------------------------------------
    public static void main(String args[]) {
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

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new managerHomepage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_assignStaff;
    private javax.swing.JButton btn_date;
    private javax.swing.JButton btn_logOut;
    private javax.swing.JButton btn_replyCustomerIssue;
    private javax.swing.JButton btn_venue;
    private javax.swing.JButton btn_viewCaseChangeStatus;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_background;
    private javax.swing.JLabel lbl_cusIssue;
    private javax.swing.JLabel lbl_title;
    private javax.swing.JLabel lbl_viewSales;
    // End of variables declaration//GEN-END:variables
}