
package oodjassignment.manager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javax.swing.*;


public class managerIssue_View extends javax.swing.JFrame {
    
    public managerIssue_View() {
        initComponents();
        clear_lbl();
        hide_changeStatus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_back = new javax.swing.JButton();
        lbl_title = new javax.swing.JLabel();
        lbl_case = new javax.swing.JLabel();
        pnl_ID = new javax.swing.JPanel();
        lbl_enterCaseID = new javax.swing.JLabel();
        txt_caseID = new javax.swing.JTextField();
        lbl_or = new javax.swing.JLabel();
        lbl_selectCaseID = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        lbl_space = new javax.swing.JLabel();
        btn_view = new javax.swing.JButton();
        pnl_case = new javax.swing.JPanel();
        lbl_caseID = new javax.swing.JLabel();
        lbl_date = new javax.swing.JLabel();
        lbl_venue = new javax.swing.JLabel();
        lbl_CusID = new javax.swing.JLabel();
        lbl_cusIssue1 = new javax.swing.JLabel();
        lbl_assignedstaff = new javax.swing.JLabel();
        lbl_description = new javax.swing.JLabel();
        lbl_caseStatus = new javax.swing.JLabel();
        lbl_showCaseID = new javax.swing.JLabel();
        lbl_showDate = new javax.swing.JLabel();
        lbl_showVenue = new javax.swing.JLabel();
        lbl_showCustomerID = new javax.swing.JLabel();
        lbl_showCustomerIssue = new javax.swing.JLabel();
        lbl_showStaff = new javax.swing.JLabel();
        lbl_showDescription = new javax.swing.JLabel();
        lbl_showCaseStatus = new javax.swing.JLabel();
        btn_updateStatus = new javax.swing.JButton();
        rbtn_cancelled = new javax.swing.JRadioButton();
        rbtn_closed = new javax.swing.JRadioButton();
        rbtn_done = new javax.swing.JRadioButton();
        rbtn_inPrograss = new javax.swing.JRadioButton();
        btn_cancel = new javax.swing.JButton();
        btn_confirmStatus = new javax.swing.JButton();
        cbx_ID = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("Segoe UI Black", 0, 10)); // NOI18N
        setPreferredSize(new java.awt.Dimension(1000, 800));
        setSize(new java.awt.Dimension(1000, 800));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_back.setText("BACK");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });
        getContentPane().add(btn_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        lbl_title.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        lbl_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_title.setText("View Customer Issue");
        getContentPane().add(lbl_title, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 40, -1, -1));

        lbl_case.setFont(new java.awt.Font("Segoe UI Black", 0, 16)); // NOI18N
        lbl_case.setText("CASE");
        getContentPane().add(lbl_case, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, -1, -1));

        pnl_ID.setBackground(new java.awt.Color(255, 255, 255));

        lbl_enterCaseID.setFont(new java.awt.Font("Segoe UI Black", 0, 16)); // NOI18N
        lbl_enterCaseID.setText("ENTER CASE ID");
        pnl_ID.add(lbl_enterCaseID);

        txt_caseID.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        pnl_ID.add(txt_caseID);

        lbl_or.setFont(new java.awt.Font("Segoe UI Black", 0, 16)); // NOI18N
        lbl_or.setText("     /     ");
        pnl_ID.add(lbl_or);

        lbl_selectCaseID.setFont(new java.awt.Font("Segoe UI Black", 0, 16)); // NOI18N
        lbl_selectCaseID.setText("SELECT CASE ID");
        pnl_ID.add(lbl_selectCaseID);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        pnl_ID.add(jComboBox1);

        lbl_space.setText("                                        ");
        pnl_ID.add(lbl_space);

        btn_view.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        btn_view.setText("VIEW");
        btn_view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_viewActionPerformed(evt);
            }
        });
        pnl_ID.add(btn_view);

        getContentPane().add(pnl_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 700, -1));

        pnl_case.setBackground(new java.awt.Color(255, 255, 255));
        pnl_case.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_caseID.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        lbl_caseID.setText("Case ID:");
        pnl_case.add(lbl_caseID, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));

        lbl_date.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        lbl_date.setText("Date:");
        pnl_case.add(lbl_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, -1, -1));

        lbl_venue.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        lbl_venue.setText("Venue:");
        pnl_case.add(lbl_venue, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, -1, -1));

        lbl_CusID.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        lbl_CusID.setText("Customer ID:");
        pnl_case.add(lbl_CusID, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, -1, -1));

        lbl_cusIssue1.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        lbl_cusIssue1.setText("Customer Issue:");
        pnl_case.add(lbl_cusIssue1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, -1, -1));

        lbl_assignedstaff.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        lbl_assignedstaff.setText("Assigned Staff:");
        pnl_case.add(lbl_assignedstaff, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, -1, -1));

        lbl_description.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        lbl_description.setText("Description");
        pnl_case.add(lbl_description, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, -1, -1));

        lbl_caseStatus.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        lbl_caseStatus.setText("Case Status:");
        pnl_case.add(lbl_caseStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, -1, -1));

        lbl_showCaseID.setText("Case ID");
        pnl_case.add(lbl_showCaseID, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, -1, -1));

        lbl_showDate.setText("Date");
        pnl_case.add(lbl_showDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, -1, -1));

        lbl_showVenue.setText("Venue");
        pnl_case.add(lbl_showVenue, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, -1, -1));

        lbl_showCustomerID.setText("Cus ID");
        pnl_case.add(lbl_showCustomerID, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, -1, -1));

        lbl_showCustomerIssue.setText("Customer Issue");
        pnl_case.add(lbl_showCustomerIssue, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, -1, -1));

        lbl_showStaff.setText("Staff");
        pnl_case.add(lbl_showStaff, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, -1, -1));

        lbl_showDescription.setText("Desription");
        pnl_case.add(lbl_showDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 430, 60));

        lbl_showCaseStatus.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        lbl_showCaseStatus.setText("Case Status");
        pnl_case.add(lbl_showCaseStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, -1, -1));

        btn_updateStatus.setText("Update Status");
        btn_updateStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateStatusActionPerformed(evt);
            }
        });
        pnl_case.add(btn_updateStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, -1, -1));

        rbtn_cancelled.setText("Cancelled");
        pnl_case.add(rbtn_cancelled, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 380, -1, -1));

        rbtn_closed.setText("Closed");
        pnl_case.add(rbtn_closed, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 360, -1, -1));

        rbtn_done.setText("Done");
        pnl_case.add(rbtn_done, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 340, -1, -1));

        rbtn_inPrograss.setText("In prograss");
        pnl_case.add(rbtn_inPrograss, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 320, -1, -1));

        btn_cancel.setText("Cancel");
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });
        pnl_case.add(btn_cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 350, -1, -1));

        btn_confirmStatus.setText("Confirm Status");
        btn_confirmStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_confirmStatusActionPerformed(evt);
            }
        });
        pnl_case.add(btn_confirmStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 320, -1, -1));

        getContentPane().add(pnl_case, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 700, 430));

        cbx_ID.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oodjassignment/picture/blue.jpg"))); // NOI18N
        cbx_ID.setText("jLabel4");
        cbx_ID.setPreferredSize(new java.awt.Dimension(1000, 800));
        getContentPane().add(cbx_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 820));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        managerHomepage managerHomepage = new managerHomepage();
        managerHomepage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_backActionPerformed

    private void btn_viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_viewActionPerformed
        String caseId = txt_caseID.getText().trim();
        if (caseId.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a Case ID.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        ViewCase viewCase = new ViewCase(caseId);
        if (viewCase.loadCaseData()) {
            lbl_showCustomerID.setText(viewCase.getCustomerId());
            lbl_showVenue.setText(viewCase.getHallNoValue());
            lbl_showDate.setText(viewCase.getDateValue());
            lbl_showDescription.setText(viewCase.getFeedbackText());
        } else {
            JOptionPane.showMessageDialog(this, "Case ID not found.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_viewActionPerformed

    private void btn_updateStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateStatusActionPerformed
        unhide_changeStatus();
    }//GEN-LAST:event_btn_updateStatusActionPerformed

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        hide_changeStatus();
    }//GEN-LAST:event_btn_cancelActionPerformed

    private void btn_confirmStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_confirmStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_confirmStatusActionPerformed

    
    // MAIN
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new managerIssue_View().setVisible(true);
            }
        });
    }
    
    // COMPONENTS
    private void clear_lbl(){
        lbl_showCaseID.setText("");
        lbl_showCaseStatus.setText("");
        lbl_showCustomerID.setText("");
        lbl_showCustomerIssue.setText("");
        lbl_showDate.setText("");
        lbl_showDescription.setText("");
        lbl_showStaff.setText("");
        lbl_showVenue.setText("");   
    }
    
    private void hide_changeStatus(){
        btn_cancel.setVisible(false);
        btn_confirmStatus.setVisible(false);
        rbtn_cancelled.setVisible(false);
        rbtn_closed.setVisible(false);
        rbtn_done.setVisible(false);
        rbtn_inPrograss.setVisible(false);
    }
    
    private void unhide_changeStatus(){
        btn_cancel.setVisible(true);
        btn_confirmStatus.setVisible(true);
        rbtn_cancelled.setVisible(true);
        rbtn_closed.setVisible(true);
        rbtn_done.setVisible(true);
        rbtn_inPrograss.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_confirmStatus;
    private javax.swing.JButton btn_updateStatus;
    private javax.swing.JButton btn_view;
    private javax.swing.JLabel cbx_ID;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel lbl_CusID;
    private javax.swing.JLabel lbl_assignedstaff;
    private javax.swing.JLabel lbl_case;
    private javax.swing.JLabel lbl_caseID;
    private javax.swing.JLabel lbl_caseStatus;
    private javax.swing.JLabel lbl_cusIssue1;
    private javax.swing.JLabel lbl_date;
    private javax.swing.JLabel lbl_description;
    private javax.swing.JLabel lbl_enterCaseID;
    private javax.swing.JLabel lbl_or;
    private javax.swing.JLabel lbl_selectCaseID;
    private javax.swing.JLabel lbl_showCaseID;
    private javax.swing.JLabel lbl_showCaseStatus;
    private javax.swing.JLabel lbl_showCustomerID;
    private javax.swing.JLabel lbl_showCustomerIssue;
    private javax.swing.JLabel lbl_showDate;
    private javax.swing.JLabel lbl_showDescription;
    private javax.swing.JLabel lbl_showStaff;
    private javax.swing.JLabel lbl_showVenue;
    private javax.swing.JLabel lbl_space;
    private javax.swing.JLabel lbl_title;
    private javax.swing.JLabel lbl_venue;
    private javax.swing.JPanel pnl_ID;
    private javax.swing.JPanel pnl_case;
    private javax.swing.JRadioButton rbtn_cancelled;
    private javax.swing.JRadioButton rbtn_closed;
    private javax.swing.JRadioButton rbtn_done;
    private javax.swing.JRadioButton rbtn_inPrograss;
    private javax.swing.JTextField txt_caseID;
    // End of variables declaration//GEN-END:variables
}