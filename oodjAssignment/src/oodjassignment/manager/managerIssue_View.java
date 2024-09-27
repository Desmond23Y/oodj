
package oodjassignment.manager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.*;
import java.util.List;

public class managerIssue_View extends javax.swing.JFrame {
    String caseStaffNStatusfilePath = "src/oodjassignment/database/caseStaffNStatus.txt";
    
    
    public managerIssue_View() {
        initComponents();
        clear_lbl();
        hide_changeStatus();
        btn_responses.setVisible(false);
        generateCBX();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        btn_back = new javax.swing.JButton();
        lbl_title = new javax.swing.JLabel();
        lbl_case = new javax.swing.JLabel();
        pnl_ID = new javax.swing.JPanel();
        lbl_enterCaseId = new javax.swing.JLabel();
        cbx_caseId = new javax.swing.JComboBox<>();
        lbl_space = new javax.swing.JLabel();
        btn_view = new javax.swing.JButton();
        pnl_case = new javax.swing.JPanel();
        lbl_caseID = new javax.swing.JLabel();
        lbl_date = new javax.swing.JLabel();
        lblhallType = new javax.swing.JLabel();
        lbl_hallNumber = new javax.swing.JLabel();
        lbl_CusID = new javax.swing.JLabel();
        lbl_assignedstaff = new javax.swing.JLabel();
        lbl_description = new javax.swing.JLabel();
        lbl_caseStatus = new javax.swing.JLabel();
        lbl_showCaseId = new javax.swing.JLabel();
        lbl_showDate = new javax.swing.JLabel();
        lbl_showHallType = new javax.swing.JLabel();
        lbl_showHallNumber = new javax.swing.JLabel();
        lbl_showCustomerID = new javax.swing.JLabel();
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
        btn_responses = new javax.swing.JButton();
        lbl_background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("Segoe UI Black", 0, 10)); // NOI18N
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
        lbl_title.setText("View Customer Issue");
        getContentPane().add(lbl_title, new org.netbeans.lib.awtextra.AbsoluteConstraints(354, 40, -1, -1));

        lbl_case.setFont(new java.awt.Font("Segoe UI Black", 0, 20)); // NOI18N
        lbl_case.setText("CASE");
        getContentPane().add(lbl_case, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, -1, -1));

        pnl_ID.setBackground(new java.awt.Color(255, 255, 255));

        lbl_enterCaseId.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        lbl_enterCaseId.setText("CASE ID");
        pnl_ID.add(lbl_enterCaseId);

        cbx_caseId.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        pnl_ID.add(cbx_caseId);

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

        pnl_case.setBackground(new java.awt.Color(255, 255, 255));
        pnl_case.setMinimumSize(new java.awt.Dimension(738, 560));
        pnl_case.setPreferredSize(new java.awt.Dimension(738, 560));
        pnl_case.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_caseID.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        lbl_caseID.setText("Case ID");
        pnl_case.add(lbl_caseID, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        lbl_date.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        lbl_date.setText("Date");
        pnl_case.add(lbl_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        lblhallType.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        lblhallType.setText("Hall Type");
        pnl_case.add(lblhallType, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        lbl_hallNumber.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        lbl_hallNumber.setText("Hall Number");
        pnl_case.add(lbl_hallNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        lbl_CusID.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        lbl_CusID.setText("Customer ID");
        pnl_case.add(lbl_CusID, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        lbl_assignedstaff.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        lbl_assignedstaff.setText("Assigned Staff");
        pnl_case.add(lbl_assignedstaff, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        lbl_description.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        lbl_description.setText("Description");
        pnl_case.add(lbl_description, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        lbl_caseStatus.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        lbl_caseStatus.setText("Case Status");
        pnl_case.add(lbl_caseStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, -1, -1));

        lbl_showCaseId.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbl_showCaseId.setText("Case ID");
        pnl_case.add(lbl_showCaseId, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, -1, -1));

        lbl_showDate.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbl_showDate.setText("Date");
        pnl_case.add(lbl_showDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, -1, -1));

        lbl_showHallType.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbl_showHallType.setText("Hall Type");
        pnl_case.add(lbl_showHallType, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, -1, -1));

        lbl_showHallNumber.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbl_showHallNumber.setText("Hall Number");
        pnl_case.add(lbl_showHallNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, -1, -1));

        lbl_showCustomerID.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbl_showCustomerID.setText("Cus ID");
        pnl_case.add(lbl_showCustomerID, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, -1, -1));

        lbl_showStaff.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbl_showStaff.setText("Staff");
        pnl_case.add(lbl_showStaff, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, -1, -1));

        lbl_showDescription.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbl_showDescription.setText("Desription");
        lbl_showDescription.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        pnl_case.add(lbl_showDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 480, 60));

        lbl_showCaseStatus.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbl_showCaseStatus.setText("Case Status");
        pnl_case.add(lbl_showCaseStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, -1, -1));

        btn_updateStatus.setFont(new java.awt.Font("Segoe UI Black", 0, 16)); // NOI18N
        btn_updateStatus.setText("UPDATE STATUS");
        btn_updateStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateStatusActionPerformed(evt);
            }
        });
        pnl_case.add(btn_updateStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 370, -1, -1));

        buttonGroup1.add(rbtn_cancelled);
        rbtn_cancelled.setFont(new java.awt.Font("Segoe UI Black", 0, 16)); // NOI18N
        rbtn_cancelled.setText("Cancelled");
        rbtn_cancelled.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtn_cancelledActionPerformed(evt);
            }
        });
        pnl_case.add(rbtn_cancelled, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 460, -1, -1));

        buttonGroup1.add(rbtn_closed);
        rbtn_closed.setFont(new java.awt.Font("Segoe UI Black", 0, 16)); // NOI18N
        rbtn_closed.setText("Closed");
        rbtn_closed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtn_closedActionPerformed(evt);
            }
        });
        pnl_case.add(rbtn_closed, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 430, -1, -1));

        buttonGroup1.add(rbtn_done);
        rbtn_done.setFont(new java.awt.Font("Segoe UI Black", 0, 16)); // NOI18N
        rbtn_done.setText("Done");
        rbtn_done.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtn_doneActionPerformed(evt);
            }
        });
        pnl_case.add(rbtn_done, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 400, -1, -1));

        buttonGroup1.add(rbtn_inPrograss);
        rbtn_inPrograss.setFont(new java.awt.Font("Segoe UI Black", 0, 16)); // NOI18N
        rbtn_inPrograss.setText("In prograss");
        pnl_case.add(rbtn_inPrograss, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 370, -1, -1));

        btn_cancel.setFont(new java.awt.Font("Segoe UI Black", 0, 16)); // NOI18N
        btn_cancel.setText("CANCEL");
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });
        pnl_case.add(btn_cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 410, -1, -1));

        btn_confirmStatus.setFont(new java.awt.Font("Segoe UI Black", 0, 16)); // NOI18N
        btn_confirmStatus.setText("CONFIRM");
        btn_confirmStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_confirmStatusActionPerformed(evt);
            }
        });
        pnl_case.add(btn_confirmStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 370, -1, -1));

        btn_responses.setFont(new java.awt.Font("Segoe UI Black", 0, 16)); // NOI18N
        btn_responses.setText("RESPONSES");
        btn_responses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_responsesActionPerformed(evt);
            }
        });
        pnl_case.add(btn_responses, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 500, -1, -1));

        getContentPane().add(pnl_case, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 900, 560));

        lbl_background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oodjassignment/picture/blue.jpg"))); // NOI18N
        lbl_background.setText("jLabel4");
        lbl_background.setMinimumSize(new java.awt.Dimension(1200, 800));
        lbl_background.setPreferredSize(new java.awt.Dimension(1200, 800));
        getContentPane().add(lbl_background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_updateStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateStatusActionPerformed
        unhide_changeStatus();
    }//GEN-LAST:event_btn_updateStatusActionPerformed

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        hide_changeStatus();
    }//GEN-LAST:event_btn_cancelActionPerformed

    private void btn_confirmStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_confirmStatusActionPerformed
        updateStatus1();
        updateStatusLabel();
    }//GEN-LAST:event_btn_confirmStatusActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        managerHomepage managerHomepage = new managerHomepage();
        managerHomepage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_backActionPerformed

    private void btn_viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_viewActionPerformed
        clear_lbl();
        String selectedCaseId = cbx_caseId.getSelectedItem().toString();
        caseStaffNStatus caseData = readCaseData(caseStaffNStatusfilePath, selectedCaseId);
        if (caseData != null) {
            displayData(caseData);
            updateStatusLabel();
            btn_responses.setVisible(true);
        } else {
            btn_responses.setVisible(false);
            JOptionPane.showMessageDialog(null, "No matching case ID found.", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btn_viewActionPerformed

    private void rbtn_closedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtn_closedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtn_closedActionPerformed

    private void rbtn_cancelledActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtn_cancelledActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtn_cancelledActionPerformed

    private void rbtn_doneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtn_doneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtn_doneActionPerformed

    private void btn_responsesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_responsesActionPerformed
        managerIssue_Response managerIssue_Response = new managerIssue_Response();
        managerIssue_Response.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_responsesActionPerformed

    // UPDATE STATUS -----------------------------------------------------------
    private void updateStatus1() {
        String caseId = lbl_showCaseId.getText();
        String newStatus = "";

        if (rbtn_cancelled.isSelected()) {
            newStatus = "Cancelled";
        } else if (rbtn_done.isSelected()) {
            newStatus = "Done";
        } else if (rbtn_closed.isSelected()) {
            newStatus = "Closed";
        } else if (rbtn_inPrograss.isSelected()) {
            newStatus = "In Progress";
        }
        
        updateStatus(caseId, newStatus);
    }
    
    private void updateStatus(String caseId, String status) {
        if (status != null) {
            ReadCase readCase = new ReadCase(status);
            List<String[]> fileContent = readCase.readCaseStaffStatus();
            boolean caseIDFound = false;

            for (int i = 0; i < fileContent.size(); i++) {
                String[] parts = fileContent.get(i);
                if (parts.length >= 7 && parts[0].equals(caseId)) {
                    parts[7] = status; 
                    fileContent.set(i, parts); 
                    caseIDFound = true;
                    break; 
                }
            }

            if (caseIDFound) {
                WriteCase writeCase = new WriteCase();
                writeCase.updateStaff(fileContent);
                JOptionPane.showMessageDialog(this, "Status successfully updated.");
            } else {
                JOptionPane.showMessageDialog(this, "No status selected.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "No status selected.");
        }
    }
    
    private caseStaffNStatus readCaseData(String filePath, String caseId) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data[0].equals(caseId)) {
                    return new caseStaffNStatus(data[0], data[1], data[2], data[3], data[4], data[5], data[6], data[7], data[8], data[9]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }


    // DATA --------------------------------------------------------------------
    private void displayData(caseStaffNStatus data) {
        lbl_showCaseId.setText(data.getCaseId());
        lbl_showCustomerID.setText(data.getCusId());
        lbl_showHallType.setText(data.getHallType());
        lbl_showHallNumber.setText(data.getHallNumber());
        lbl_showDate.setText(data.getDate());
        lbl_showDescription.setText(data.getDescription());
        lbl_showStaff.setText(data.getStaffId());
        lbl_showCaseStatus.setText(data.getStatus());
        btn_updateStatus.setVisible(true);
    }
       
    // CONTROLS ----------------------------------------------------------------
    private void clear_lbl(){
        lbl_showCaseId.setText("");
        lbl_showDate.setText("");
        lbl_showHallType.setText("");  
        lbl_showHallNumber.setText("");  
        lbl_showCustomerID.setText("");
        lbl_showStaff.setText("");
        lbl_showDescription.setText("");
        lbl_showCaseStatus.setText("");
        btn_updateStatus.setVisible(false);
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
    
    private void updateStatusLabel() {
        String caseId = lbl_showCaseId.getText();
        String filePath = "src/oodjassignment/database/caseStaffNStatus.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data[0].equals(caseId)) {
                    lbl_showCaseStatus.setText(data[7]);
                    break;
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    private void generateCBX(){
        GenerateCBX generateCBX = new GenerateCBX();
        generateCBX.populateComboBox(cbx_caseId, "caseId");
    }
    
    // MAIN --------------------------------------------------------------------
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new managerIssue_View().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_confirmStatus;
    private javax.swing.JButton btn_responses;
    private javax.swing.JButton btn_updateStatus;
    private javax.swing.JButton btn_view;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbx_caseId;
    private javax.swing.JLabel lbl_CusID;
    private javax.swing.JLabel lbl_assignedstaff;
    private javax.swing.JLabel lbl_background;
    private javax.swing.JLabel lbl_case;
    private javax.swing.JLabel lbl_caseID;
    private javax.swing.JLabel lbl_caseStatus;
    private javax.swing.JLabel lbl_date;
    private javax.swing.JLabel lbl_description;
    private javax.swing.JLabel lbl_enterCaseId;
    private javax.swing.JLabel lbl_hallNumber;
    private javax.swing.JLabel lbl_showCaseId;
    private javax.swing.JLabel lbl_showCaseStatus;
    private javax.swing.JLabel lbl_showCustomerID;
    private javax.swing.JLabel lbl_showDate;
    private javax.swing.JLabel lbl_showDescription;
    private javax.swing.JLabel lbl_showHallNumber;
    private javax.swing.JLabel lbl_showHallType;
    private javax.swing.JLabel lbl_showStaff;
    private javax.swing.JLabel lbl_space;
    private javax.swing.JLabel lbl_title;
    private javax.swing.JLabel lblhallType;
    private javax.swing.JPanel pnl_ID;
    private javax.swing.JPanel pnl_case;
    private javax.swing.JRadioButton rbtn_cancelled;
    private javax.swing.JRadioButton rbtn_closed;
    private javax.swing.JRadioButton rbtn_done;
    private javax.swing.JRadioButton rbtn_inPrograss;
    // End of variables declaration//GEN-END:variables
}