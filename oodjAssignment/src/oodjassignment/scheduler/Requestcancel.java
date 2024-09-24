/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package oodjassignment.scheduler;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Acer
 */
public class Requestcancel extends javax.swing.JFrame {

    
    public Requestcancel() {
        initComponents();
        loadBookingData();
    }

    private void loadBookingData() {
    DefaultTableModel model = (DefaultTableModel) Aschedule.getModel(); // Aschedule is your JTable
    Request request = new Request("src\\\\oodjassignment\\\\database\\\\Booking.txt");
    
    try {
        // Load only records with "Request for cancel"
        request.readFileToTable(model);
        System.out.println("Booking data loaded successfully."); // Debugging: confirm successful load
    } catch (Exception ex) {
        System.out.println("Error loading booking data: " + ex.getMessage());
    }
}
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logout = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Aschedule = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        status = new javax.swing.JComboBox<>();
        Save = new javax.swing.JButton();
        HA = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1200, 800));
        setMinimumSize(new java.awt.Dimension(1200, 800));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        Aschedule.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        Aschedule.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Booking ID", "Customer ID", "Hall Type", "Hall No.", "Prices", "Date", "Time", "Duration", "Status", "Remarks"
            }
        ));
        Aschedule.setSelectionBackground(new java.awt.Color(204, 204, 204));
        jScrollPane1.setViewportView(Aschedule);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 1140, 600));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Status :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, -1, -1));

        status.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Approve", "Decline" }));
        status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusActionPerformed(evt);
            }
        });
        getContentPane().add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 40, 130, -1));

        Save.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        Save.setText("Update");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });
        getContentPane().add(Save, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 40, -1, -1));

        HA.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        HA.setForeground(new java.awt.Color(102, 102, 102));
        HA.setText("Hall Availability");
        HA.setMaximumSize(new java.awt.Dimension(155, 39));
        HA.setMinimumSize(new java.awt.Dimension(155, 39));
        HA.setPreferredSize(new java.awt.Dimension(155, 39));
        HA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HAActionPerformed(evt);
            }
        });
        getContentPane().add(HA, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 150, 40));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oodjassignment/picture/blue.jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        int a = JOptionPane.showConfirmDialog(null, "Do you want to return to the Homepage?", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            setVisible(false);
            new schedulerhomepage().setVisible(true);
        }
    }//GEN-LAST:event_logoutActionPerformed

    private void statusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusActionPerformed
        
    }//GEN-LAST:event_statusActionPerformed

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        DefaultTableModel model = (DefaultTableModel) Aschedule.getModel();
        int selectedRow = Aschedule.getSelectedRow(); // 获取当前选中的行

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a row to update.");
            return;
        }

        // 更新 JTable 中的状态列
        model.setValueAt(status.getSelectedItem(), selectedRow, 8);

        try {
            // 首先将所有文件内容读入到List中
            List<String> fileLines = new ArrayList<>();
            BufferedReader br = new BufferedReader(new FileReader("src/oodjassignment/database/Booking.txt"));
            String line;

            while ((line = br.readLine()) != null) {
                fileLines.add(line);
            }
            br.close();

            // 获取选中的行数据
            String updatedRecord = model.getValueAt(selectedRow, 0).toString() + "/" +
                                   model.getValueAt(selectedRow, 1).toString() + "/" +
                                   model.getValueAt(selectedRow, 2).toString() + "/" +
                                   model.getValueAt(selectedRow, 3).toString() + "/" +
                                   model.getValueAt(selectedRow, 4).toString() + "/" +
                                   model.getValueAt(selectedRow, 5).toString() + "/" +
                                   model.getValueAt(selectedRow, 6).toString() + "/" +
                                   model.getValueAt(selectedRow, 7).toString() + "/" +
                                   model.getValueAt(selectedRow, 8).toString();

            // 现在我们找到对应的行并更新
            fileLines.set(selectedRow, updatedRecord);

            // 重新写回文件，只更新选择行的内容
            BufferedWriter bw = new BufferedWriter(new FileWriter("src/oodjassignment/database/Booking.txt"));
            for (String fileLine : fileLines) {
                bw.write(fileLine + "\n");
            }
            bw.close();

            JOptionPane.showMessageDialog(this, "Status updated successfully.");

            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Something went wrong: " + ex.getMessage());
            }

    }//GEN-LAST:event_SaveActionPerformed

    private void HAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HAActionPerformed
        setVisible(false);
        new Hall_availability_schedule().setVisible(true);
    }//GEN-LAST:event_HAActionPerformed

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
            java.util.logging.Logger.getLogger(Requestcancel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Requestcancel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Requestcancel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Requestcancel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Requestcancel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Aschedule;
    private javax.swing.JButton HA;
    private javax.swing.JButton Save;
    private javax.swing.JLabel background;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logout;
    private javax.swing.JComboBox<String> status;
    // End of variables declaration//GEN-END:variables
}
