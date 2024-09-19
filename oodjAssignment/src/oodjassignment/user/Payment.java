/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package oodjassignment.user;

import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

public class Payment extends javax.swing.JFrame {
   
    public Payment() {
    initComponents();
    autofillUserData();
    id.setEditable(false);
    type.setEditable(false);
    hall.setEditable(false);
    Price.setEditable(false);
    cfPrice.setEditable(false);
    }
    

    
    private void autofillUserData() {
        try (BufferedReader reader = new BufferedReader(new FileReader("src/oodjassignment/database/Pending.txt"))) {
            String line;
            
            // Read the first line from the file
            if ((line = reader.readLine()) != null) {
                // Split the line to extract user data
                String[] userData = line.split("/");

                // Check if the file has the correct format
                if (userData.length == 10) {
                    // Auto-fill the text fields with user data
                    id.setText(userData[1]);
                    type.setText(userData[2]);
                    hall.setText(userData[3]);
                    Price.setText(userData[4]);
                    cfPrice.setText(userData[4]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error loading user data.");
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

        title = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cfPrice = new javax.swing.JTextField();
        pay = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        Price = new javax.swing.JTextField();
        type = new javax.swing.JTextField();
        hall = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("Payment");
        getContentPane().add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Hall Type:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 100, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Hall:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 310, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Confirm Price:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 450, -1, -1));
        getContentPane().add(cfPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 450, 180, 30));

        pay.setBackground(new java.awt.Color(0, 137, 248));
        pay.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        pay.setForeground(new java.awt.Color(255, 255, 255));
        pay.setText("Pay");
        pay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payActionPerformed(evt);
            }
        });
        getContentPane().add(pay, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 550, 80, 30));

        logout.setBackground(new java.awt.Color(0, 137, 248));
        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oodjassignment/picture/logout.png"))); // NOI18N
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        getContentPane().add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 10, 60, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Price:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 380, -1, -1));
        getContentPane().add(Price, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 380, 180, 30));
        getContentPane().add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, 180, 30));

        hall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hallActionPerformed(evt);
            }
        });
        getContentPane().add(hall, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 310, 180, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Customer ID:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, -1, -1));
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, 180, 30));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oodjassignment/picture/blue.jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

     
     
    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
    new 
    homepage().setVisible(true);
    dispose();
    }//GEN-LAST:event_logoutActionPerformed

    private void payActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payActionPerformed
    // Construct the string to save to the file
        String paymentData = "Hall Type: " + type.getText()+ ", Hall: " + hall.getText() + ", Price: " + Price.getText();

        // Save the data to payment.txt
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("src\\oodjassignment\\database\\payment.txt", true))) {
            writer.write(paymentData);
            writer.newLine();  // Write a new line after the payment data
            JOptionPane.showMessageDialog(null, "Payment successful! Please Review your receipt");

            // Call the method to generate the receipt
            generateReceipt(type.getText(), hall.getText(), Price.getText());

            new homepage().setVisible(true);
            dispose();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error saving payment data.");
            e.printStackTrace();
        }
    }

    // Method to generate and display a receipt
    private void generateReceipt(String hallType, String hall, String price) {
        // Get the current date and time
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

        // Create receipt details
        String receipt = "----------- Receipt -----------\n" +
                         "Date: " + dtf.format(now) + "\n" +
                         "Hall Type: " + hallType + "\n" +
                         "Hall: " + hall + "\n" +
                         "Price: " + price + "\n" +
                         "-------------------\n" +
                         "Thank you for your payment!";

        // Option 1: Display the receipt in a dialog box
        JOptionPane.showMessageDialog(null, receipt, "Payment Receipt", JOptionPane.INFORMATION_MESSAGE);
        new
        homepage().setVisible(true);
        dispose();
    }//GEN-LAST:event_payActionPerformed

    private void hallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hallActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hallActionPerformed


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
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Payment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Price;
    private javax.swing.JLabel background;
    private javax.swing.JTextField cfPrice;
    private javax.swing.JTextField hall;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton logout;
    private javax.swing.JButton pay;
    private javax.swing.JLabel title;
    private javax.swing.JTextField type;
    // End of variables declaration//GEN-END:variables



}
