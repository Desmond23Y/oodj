
package oodjassignment.manager;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class managerIssue_Response extends javax.swing.JFrame {
    String feedbackFilePath;
    String caseStaffNStatusFilePath;
    
    public managerIssue_Response() {
        initComponents();
        caseStaffNStatusFilePath = "src/oodjassignment/database/caseStaffNStatus.txt";
        generateCBX();
        clearTable(tbl_history);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_back = new javax.swing.JButton();
        lbl_title = new javax.swing.JLabel();
        pnl_Id = new javax.swing.JPanel();
        lbl_enterCaseId = new javax.swing.JLabel();
        cbx_caseId = new javax.swing.JComboBox<>();
        lbl_space = new javax.swing.JLabel();
        btn_view = new javax.swing.JButton();
        lbl_history = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_history = new javax.swing.JTable();
        btn_update = new javax.swing.JButton();
        lbl_newMessage = new javax.swing.JLabel();
        txt_newMessage = new javax.swing.JTextField();
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
        lbl_title.setText("Response to Customer Issue");
        getContentPane().add(lbl_title, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 40, -1, -1));

        pnl_Id.setBackground(new java.awt.Color(255, 255, 255));
        pnl_Id.setMinimumSize(new java.awt.Dimension(900, 45));
        pnl_Id.setPreferredSize(new java.awt.Dimension(900, 45));

        lbl_enterCaseId.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        lbl_enterCaseId.setText("CASE ID");
        pnl_Id.add(lbl_enterCaseId);

        cbx_caseId.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        pnl_Id.add(cbx_caseId);

        lbl_space.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        lbl_space.setText("                                                                                           ");
        pnl_Id.add(lbl_space);

        btn_view.setFont(new java.awt.Font("Segoe UI Black", 0, 20)); // NOI18N
        btn_view.setText("VIEW");
        btn_view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_viewActionPerformed(evt);
            }
        });
        pnl_Id.add(btn_view);

        getContentPane().add(pnl_Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 900, -1));

        lbl_history.setFont(new java.awt.Font("Segoe UI Black", 0, 20)); // NOI18N
        lbl_history.setText("HISTORY");
        getContentPane().add(lbl_history, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, -1, -1));

        jScrollPane1.setPreferredSize(new java.awt.Dimension(900, 402));

        tbl_history.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Case ID", "Response by Manager", "Response by Staff"
            }
        ));
        tbl_history.setMinimumSize(new java.awt.Dimension(900, 80));
        tbl_history.setPreferredSize(new java.awt.Dimension(900, 80));
        jScrollPane1.setViewportView(tbl_history);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, -1, 230));

        btn_update.setFont(new java.awt.Font("Segoe UI Black", 0, 16)); // NOI18N
        btn_update.setText("UPDATE");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });
        getContentPane().add(btn_update, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 590, -1, -1));

        lbl_newMessage.setFont(new java.awt.Font("Segoe UI Black", 0, 20)); // NOI18N
        lbl_newMessage.setText("NEW MESSAGE");
        getContentPane().add(lbl_newMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 500, -1, -1));
        getContentPane().add(txt_newMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 530, 540, 90));

        lbl_background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oodjassignment/picture/blue.jpg"))); // NOI18N
        lbl_background.setText("jLabel4");
        lbl_background.setMinimumSize(new java.awt.Dimension(1200, 800));
        lbl_background.setPreferredSize(new java.awt.Dimension(1200, 800));
        getContentPane().add(lbl_background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        String selectedCaseId = (String) cbx_caseId.getSelectedItem();
        String newMessage = txt_newMessage.getText();
        updateMessageInFile(selectedCaseId, newMessage);
        btn_viewActionPerformed(evt);
        JOptionPane.showMessageDialog(this, "New message updated successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        managerHomepage managerHomepage = new managerHomepage();
        managerHomepage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_backActionPerformed

    private void btn_viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_viewActionPerformed
        clearTable(tbl_history);
        String selectedCaseId = (String) cbx_caseId.getSelectedItem();
        try (BufferedReader br = new BufferedReader(new FileReader(caseStaffNStatusFilePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data[0].equals(selectedCaseId)) {
                    displayDataInTable(data);
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_viewActionPerformed
    
    // GET DATA ----------------------------------------------------------------
    public void updateMessageInFile(String caseId, String newMessage) {
        List<String> fileContent = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(caseStaffNStatusFilePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data[0].equals(caseId)) {
                    data[8] = newMessage; // Update the 8th element
                }
                fileContent.add(String.join(",", data));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(caseStaffNStatusFilePath))) {
            for (String line : fileContent) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // DISPLAY -------------------------------------------------------------
    private void displayDataInTable(String[] data) {
        DefaultTableModel model = (DefaultTableModel) tbl_history.getModel();
        model.setRowCount(0); // Clear existing data
        model.addRow(new Object[]{data[0], data[8], data[9]});
    }
    
    // INITIAL -----------------------------------------------------------------    
    public void clearTable(JTable table) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0); // Clear existing rows
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
            java.util.logging.Logger.getLogger(managerIssue_Response.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(managerIssue_Response.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(managerIssue_Response.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(managerIssue_Response.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

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
    private javax.swing.JComboBox<String> cbx_caseId;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_background;
    private javax.swing.JLabel lbl_enterCaseId;
    private javax.swing.JLabel lbl_history;
    private javax.swing.JLabel lbl_newMessage;
    private javax.swing.JLabel lbl_space;
    private javax.swing.JLabel lbl_title;
    private javax.swing.JPanel pnl_Id;
    private javax.swing.JTable tbl_history;
    private javax.swing.JTextField txt_newMessage;
    // End of variables declaration//GEN-END:variables
}