/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package oodjassignment.scheduler;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Acer
 */
public class Task extends javax.swing.JFrame {

    private ReadData readData;

    /**
     * Creates new form Admin_message
     */
    public Task() {
        initComponents();
        readData = new ReadData();
        readData.loadTasksForUser(Task);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Task = new javax.swing.JTable();
        logout = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Edit = new javax.swing.JButton();
        Save = new javax.swing.JButton();
        Remarks = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 800));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Task.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        Task.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Case ID", "User ID", "Hall Type", "Hall No", "Date", "Issues", "Scheduler ID", "Status", "Remarks"
            }
        ));
        jScrollPane1.setViewportView(Task);
        if (Task.getColumnModel().getColumnCount() > 0) {
            Task.getColumnModel().getColumn(0).setMinWidth(85);
            Task.getColumnModel().getColumn(0).setPreferredWidth(85);
            Task.getColumnModel().getColumn(0).setMaxWidth(85);
            Task.getColumnModel().getColumn(1).setMinWidth(85);
            Task.getColumnModel().getColumn(1).setPreferredWidth(85);
            Task.getColumnModel().getColumn(1).setMaxWidth(85);
            Task.getColumnModel().getColumn(2).setMinWidth(100);
            Task.getColumnModel().getColumn(2).setPreferredWidth(100);
            Task.getColumnModel().getColumn(2).setMaxWidth(100);
            Task.getColumnModel().getColumn(3).setMinWidth(85);
            Task.getColumnModel().getColumn(3).setPreferredWidth(85);
            Task.getColumnModel().getColumn(3).setMaxWidth(85);
            Task.getColumnModel().getColumn(4).setMinWidth(95);
            Task.getColumnModel().getColumn(4).setPreferredWidth(95);
            Task.getColumnModel().getColumn(4).setMaxWidth(95);
            Task.getColumnModel().getColumn(5).setMinWidth(100);
            Task.getColumnModel().getColumn(5).setPreferredWidth(100);
            Task.getColumnModel().getColumn(5).setMaxWidth(100);
            Task.getColumnModel().getColumn(6).setMinWidth(85);
            Task.getColumnModel().getColumn(6).setPreferredWidth(85);
            Task.getColumnModel().getColumn(6).setMaxWidth(85);
            Task.getColumnModel().getColumn(7).setMinWidth(100);
            Task.getColumnModel().getColumn(7).setPreferredWidth(100);
            Task.getColumnModel().getColumn(7).setMaxWidth(100);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 120, 950, -1));

        logout.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        logout.setForeground(new java.awt.Color(102, 102, 102));
        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oodjassignment/picture/logout.png"))); // NOI18N
        logout.setText("Back");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        getContentPane().add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Update  Remarks:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, -1, -1));

        Edit.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        Edit.setText("Edit");
        Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditActionPerformed(evt);
            }
        });
        getContentPane().add(Edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, -1, -1));

        Save.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        Save.setText("Update");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });
        getContentPane().add(Save, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 80, -1, -1));

        Remarks.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        Remarks.setForeground(new java.awt.Color(153, 153, 153));
        Remarks.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Remarks.setText("-");
        Remarks.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                RemarksFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                RemarksFocusLost(evt);
            }
        });
        getContentPane().add(Remarks, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 40, 160, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oodjassignment/picture/blue.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        int a = JOptionPane.showConfirmDialog(null, "Do you want to return to the Homepage?", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            setVisible(false);
            new schedulerhomepage().setVisible(true);
        }
    }//GEN-LAST:event_logoutActionPerformed

    private void EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditActionPerformed
        DefaultTableModel model = (DefaultTableModel) Task.getModel();
        Remarks.setText(model.getValueAt(Task.getSelectedRow(), 8).toString());
    }//GEN-LAST:event_EditActionPerformed

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        DefaultTableModel model = (DefaultTableModel) Task.getModel();
        int selectedRow = Task.getSelectedRow(); // Get the currently selected row

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a row to update.");
            return;
        }
        String caseID = (String) model.getValueAt(selectedRow, 0); // Assuming Case ID is in column 0
        String newRemarks = Remarks.getText(); // Get the new remarks from the text field
        model.setValueAt(newRemarks, selectedRow, 8); // Update the remarks in the table (assuming remarks are in column 8)

        try {
            // Define the file path
            File file = new File("src\\\\oodjassignment\\\\database\\\\caseStaffNStatus.txt");

            // Read the current file content
            BufferedReader br = new BufferedReader(new FileReader(file));
            StringBuilder fileContent = new StringBuilder();
            String line;

            // Loop through each line in the file
            while ((line = br.readLine()) != null) {
                String[] fields = line.split(","); // Assuming fields are separated by commas

                if (fields[0].equals(caseID)) { // If the Case ID matches
                    // Update the last field with the new remarks
                    fields[8] = newRemarks; // Update the remarks field

                    // Rebuild the updated line
                    String updatedLine = String.join(",", fields);
                    fileContent.append(updatedLine).append("\n"); // Append the updated line to the file content
                } else {
                    // Keep the other lines unchanged
                    fileContent.append(line).append("\n");
                }
            }
            br.close();

            // Write the modified content back to the file
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            bw.write(fileContent.toString());
            bw.close();

            JOptionPane.showMessageDialog(this, "Remarks updated successfully.");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Something went wrong: " + ex.getMessage());
        }
    }//GEN-LAST:event_SaveActionPerformed

    private void RemarksFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_RemarksFocusGained
        if (Remarks.getText().equals("-")) {
            Remarks.setText("");
            Remarks.setForeground(newColor(0, 118, 221));
        }
    }//GEN-LAST:event_RemarksFocusGained

    private void RemarksFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_RemarksFocusLost
        if (Remarks.getText().equals("")) {
            Remarks.setText("-");
            Remarks.setForeground(newColor(0, 118, 221));

        }
    }//GEN-LAST:event_RemarksFocusLost

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
            java.util.logging.Logger.getLogger(Task.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Task.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Task.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Task.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Task().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Edit;
    private javax.swing.JTextField Remarks;
    private javax.swing.JButton Save;
    private javax.swing.JTable Task;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logout;
    // End of variables declaration//GEN-END:variables

    private Color newColor(int i, int i0, int i1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
