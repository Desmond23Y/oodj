
package oodjassignment.manager;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class managerIssue_AssignStaff extends javax.swing.JFrame {

    public managerIssue_AssignStaff() {
        initComponents();
        loadStaffData();
        generateCBX();
        processFiles();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_back = new javax.swing.JButton();
        lbl_title = new javax.swing.JLabel();
        pnl_ID = new javax.swing.JPanel();
        lbl_enterCaseID = new javax.swing.JLabel();
        cbx_caseId = new javax.swing.JComboBox<>();
        lbl_space = new javax.swing.JLabel();
        btn_update = new javax.swing.JButton();
        lbl_showStaff = new javax.swing.JLabel();
        cbx_availableStaff = new javax.swing.JComboBox<>();
        lbl_background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1200, 800));
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
        lbl_title.setText("Assign Staff to Customer Issue");
        getContentPane().add(lbl_title, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 40, -1, -1));

        pnl_ID.setBackground(new java.awt.Color(255, 255, 255));
        pnl_ID.setMinimumSize(new java.awt.Dimension(900, 45));
        pnl_ID.setPreferredSize(new java.awt.Dimension(900, 45));

        lbl_enterCaseID.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        lbl_enterCaseID.setText("CASE ID");
        pnl_ID.add(lbl_enterCaseID);

        cbx_caseId.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        pnl_ID.add(cbx_caseId);

        lbl_space.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        lbl_space.setText("                                                                                                         ");
        pnl_ID.add(lbl_space);

        getContentPane().add(pnl_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 900, -1));

        btn_update.setFont(new java.awt.Font("Segoe UI Black", 0, 16)); // NOI18N
        btn_update.setText("UPDATE");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });
        getContentPane().add(btn_update, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 300, -1, -1));

        lbl_showStaff.setFont(new java.awt.Font("Segoe UI Black", 0, 20)); // NOI18N
        lbl_showStaff.setText("CHOOSE STAFF");
        getContentPane().add(lbl_showStaff, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, -1, -1));

        cbx_availableStaff.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        cbx_availableStaff.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbx_availableStaff.setMinimumSize(new java.awt.Dimension(900, 45));
        cbx_availableStaff.setPreferredSize(new java.awt.Dimension(900, 45));
        getContentPane().add(cbx_availableStaff, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 900, -1));

        lbl_background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oodjassignment/picture/blue.jpg"))); // NOI18N
        lbl_background.setText("jLabel4");
        lbl_background.setMinimumSize(new java.awt.Dimension(1200, 800));
        lbl_background.setPreferredSize(new java.awt.Dimension(1200, 800));
        getContentPane().add(lbl_background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        updateCaseStaffStatus();
    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        managerHomepage managerHomepage = new managerHomepage();
        managerHomepage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_backActionPerformed

    // UPDATE STAFF ------------------------------------------------------------
    private void updateCaseStaffStatus() {
        String caseID = cbx_caseId.getSelectedItem().toString();
        String selectedStaff = (String) cbx_availableStaff.getSelectedItem();
        if (selectedStaff != null) {
            String staffID = selectedStaff.split(" - ")[0];
            ReadCase readCase = new ReadCase(caseID);
            List<String[]> fileContent = readCase.readCaseStaffStatus();
            boolean caseIDFound = false;

            for (String[] parts : fileContent) {
                if (parts.length >= 7 && parts[0].equals(caseID)) {
                    parts[6] = staffID;
                    caseIDFound = true;
                }
            }

            if (caseIDFound) {
                WriteCase writeCase = new WriteCase();
                String filePath = "src/oodjassignment/database/caseStaffNStatus.txt";
                writeCase.writeUpdatedCaseStaffStatus(fileContent, filePath);
                JOptionPane.showMessageDialog(this, "Data successfully updated.");
            } else {
                JOptionPane.showMessageDialog(this, "Case ID not found.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "No staff selected.");
        }
    }
    
    public void processFiles() {
        String feedbackFile = "src/oodjassignment/database/feedback.txt";
        String caseStaffFile = "src/oodjassignment/database/caseStaffNStatus.txt";

        List<String> existingCaseIds = readExistingCaseIds(caseStaffFile);
        List<String> newEntries = readFeedbackFile(feedbackFile, existingCaseIds);

        writeNewEntries(caseStaffFile, newEntries);
    }

    private List<String> readExistingCaseIds(String caseStaffFile) {
        List<String> caseIds = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(caseStaffFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length > 0) {
                    caseIds.add(parts[0]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return caseIds;
    }

    private List<String> readFeedbackFile(String feedbackFile, List<String> existingCaseIds) {
        List<String> newEntries = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(feedbackFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length > 0 && !existingCaseIds.contains(parts[0])) {
                    newEntries.add(line + "-");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return newEntries;
    }

    private void writeNewEntries(String caseStaffFile, List<String> newEntries) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(caseStaffFile, true))) {
            for (String entry : newEntries) {
                bw.write(entry);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    
    // INITIAL -----------------------------------------------------------------
    private void loadStaffData() {
        ReadCase readCase = new ReadCase(null);
        List<String> staffList = readCase.readStaffData();

        cbx_availableStaff.removeAllItems();
        for (String staff : staffList) {
            cbx_availableStaff.addItem(staff);
        }
    }
    
    private void generateCBX(){
        GenerateCBX generateCBX = new GenerateCBX();
        generateCBX.populateComboBox(cbx_caseId, "caseId");
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
            java.util.logging.Logger.getLogger(managerIssue_AssignStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(managerIssue_AssignStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(managerIssue_AssignStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(managerIssue_AssignStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new managerIssue_AssignStaff().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_update;
    private javax.swing.JComboBox<String> cbx_availableStaff;
    private javax.swing.JComboBox<String> cbx_caseId;
    private javax.swing.JLabel lbl_background;
    private javax.swing.JLabel lbl_enterCaseID;
    private javax.swing.JLabel lbl_showStaff;
    private javax.swing.JLabel lbl_space;
    private javax.swing.JLabel lbl_title;
    private javax.swing.JPanel pnl_ID;
    // End of variables declaration//GEN-END:variables
}