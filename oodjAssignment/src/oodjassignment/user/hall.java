/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package oodjassignment.user;

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
 * @author User
 */
public class hall extends javax.swing.JFrame {

    private Hallbooking generateID = new Hallbooking();
    private Hallbooking loadSchedule = new Hallbooking(); 
    private Hallbooking selectfield = new Hallbooking();
    
    public hall() {
    initComponents();
    loadSchedule.loadSchedule(Aschedule);
    type.setEditable(false);
    no.setEditable(false);
    price.setEditable(false);
    date.setEditable(false);
    time.setEditable(false);
    duration.setEditable(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        hall = new javax.swing.JLabel();
        price = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Pay = new javax.swing.JButton();
        logout_button = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Aschedule = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        type = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        no = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        date = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        time = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        duration = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        remark = new javax.swing.JTextField();
        select = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        hall.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        hall.setForeground(new java.awt.Color(255, 255, 255));
        hall.setText("Hall information");
        getContentPane().add(hall, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 60, 330, 70));

        price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceActionPerformed(evt);
            }
        });
        getContentPane().add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 510, 140, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Date:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 100, -1));

        Pay.setBackground(new java.awt.Color(0, 137, 248));
        Pay.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        Pay.setForeground(new java.awt.Color(255, 255, 255));
        Pay.setText("Proceed to Payment");
        Pay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PayActionPerformed(evt);
            }
        });
        getContentPane().add(Pay, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 730, 190, 30));

        logout_button.setBackground(new java.awt.Color(0, 137, 248));
        logout_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oodjassignment/picture/logout.png"))); // NOI18N
        logout_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(logout_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 10, 60, -1));

        Aschedule.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        Aschedule.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Hall Type", "Hall's No", "Price", "Date", "Time", "Duration", "Status", "Remarks"
            }
        ));
        Aschedule.setSelectionBackground(new java.awt.Color(204, 204, 204));
        jScrollPane1.setViewportView(Aschedule);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 880, 600));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Select Your Hall:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Remarks:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 570, 100, -1));

        type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeActionPerformed(evt);
            }
        });
        getContentPane().add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 140, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Hall No:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 100, -1));

        no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noActionPerformed(evt);
            }
        });
        getContentPane().add(no, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 140, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Hall Type:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 100, -1));

        date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateActionPerformed(evt);
            }
        });
        getContentPane().add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, 140, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Time:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 70, -1));

        time.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeActionPerformed(evt);
            }
        });
        getContentPane().add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 390, 140, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Duration:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 100, -1));

        duration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                durationActionPerformed(evt);
            }
        });
        getContentPane().add(duration, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 450, 140, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Price:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, 100, -1));
        getContentPane().add(remark, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 570, 160, 120));

        select.setBackground(new java.awt.Color(0, 137, 248));
        select.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        select.setForeground(new java.awt.Color(255, 255, 255));
        select.setText("Select");
        select.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectActionPerformed(evt);
            }
        });
        getContentPane().add(select, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 750, 80, 30));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oodjassignment/picture/blue.jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceActionPerformed

    private void logout_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout_buttonActionPerformed
     new 
     homepage().setVisible(true);
     dispose();
    }//GEN-LAST:event_logout_buttonActionPerformed

    private void typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typeActionPerformed

    private void noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_noActionPerformed

    private void dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateActionPerformed

    private void timeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_timeActionPerformed

    private void durationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_durationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_durationActionPerformed

    private void selectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectActionPerformed
       selectfield.autofillFields(Aschedule, type, no, price, date, time, duration, remark);
    }//GEN-LAST:event_selectActionPerformed

    private void PayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PayActionPerformed
        DefaultTableModel model = (DefaultTableModel) Aschedule.getModel();
        int selectedRow = Aschedule.getSelectedRow(); // Get the selected row from the schedule table

        if (selectedRow != -1) {
            // Update the selected row's status in the table to "Pending"
            generateID.updateSchedule(Aschedule, selectedRow);

            // Generate a new booking ID
            int nextID = generateID.getNextBookingID();
            String bookingId = generateID.generateBookingID(nextID);

            // Prepare the booking record
            String customerId = Hallbooking.getCustomerID();
            String record = bookingId + "/" + customerId + "/" +
                    model.getValueAt(selectedRow, 0).toString() + "/" + // Hall Type
                    model.getValueAt(selectedRow, 1).toString() + "/" + // Hall Number
                    model.getValueAt(selectedRow, 2).toString() + "/" + // Price
                    model.getValueAt(selectedRow, 3).toString() + "/" + // Date
                    model.getValueAt(selectedRow, 4).toString() + "/" + // Time
                    model.getValueAt(selectedRow, 5).toString() + "/" + // Duration
                    "Pending" + "/" + // Status
                    model.getValueAt(selectedRow, 7).toString(); // Remarks

            // Save the booking record
            generateID.saveBooking(record, "src/oodjassignment/database/Booking.txt");
            generateID.saveBooking(record, "src/oodjassignment/database/Pending.txt");
            // Update the schedule file with the new "Pending" status
            generateID.updateScheduleFile(Aschedule, selectedRow);

            // Display a confirmation message
            JOptionPane.showMessageDialog(this, "Booking confirmed! Booking ID: " + bookingId);
            new
            Payment().setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Please select a schedule first.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_PayActionPerformed

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
            java.util.logging.Logger.getLogger(hall.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(hall.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(hall.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(hall.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new hall().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Aschedule;
    private javax.swing.JButton Pay;
    private javax.swing.JLabel background;
    private javax.swing.JTextField date;
    private javax.swing.JTextField duration;
    private javax.swing.JLabel hall;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logout_button;
    private javax.swing.JTextField no;
    private javax.swing.JTextField price;
    private javax.swing.JTextField remark;
    private javax.swing.JButton select;
    private javax.swing.JTextField time;
    private javax.swing.JTextField type;
    // End of variables declaration//GEN-END:variables
}
