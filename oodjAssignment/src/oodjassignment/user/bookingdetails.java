/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package oodjassignment.user;


import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class bookingdetails extends javax.swing.JFrame {

    private final Bookdetails bookdetails = new Bookdetails();
    
    public bookingdetails() {
        initComponents();
        DefaultTableModel model = (DefaultTableModel) Aschedule.getModel();
        bookdetails.loadBookings(model);

        // Disable editing on text fields
        bkid.setEditable(false);
        customer.setEditable(false);
        type.setEditable(false);
        no.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bkid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        logout = new javax.swing.JButton();
        select = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        reason_field = new javax.swing.JTextField();
        request = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        customer = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Aschedule = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        type = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        no = new javax.swing.JTextField();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Booking Details");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 60, 310, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Request for cancel");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));
        getContentPane().add(bkid, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 140, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Reason:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, -1, -1));

        logout.setBackground(new java.awt.Color(0, 137, 248));
        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oodjassignment/picture/logout.png"))); // NOI18N
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        getContentPane().add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 10, 60, -1));

        select.setBackground(new java.awt.Color(0, 137, 248));
        select.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        select.setForeground(new java.awt.Color(255, 255, 255));
        select.setText("Select");
        select.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectActionPerformed(evt);
            }
        });
        getContentPane().add(select, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 750, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Booking ID:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        reason_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reason_fieldActionPerformed(evt);
            }
        });
        getContentPane().add(reason_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 490, 140, 120));

        request.setBackground(new java.awt.Color(0, 137, 248));
        request.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        request.setForeground(new java.awt.Color(255, 255, 255));
        request.setText("Request");
        request.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestActionPerformed(evt);
            }
        });
        getContentPane().add(request, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 660, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Customer ID:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));
        getContentPane().add(customer, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 140, 30));

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
        if (Aschedule.getColumnModel().getColumnCount() > 0) {
            Aschedule.getColumnModel().getColumn(0).setMinWidth(80);
            Aschedule.getColumnModel().getColumn(0).setPreferredWidth(80);
            Aschedule.getColumnModel().getColumn(0).setMaxWidth(80);
            Aschedule.getColumnModel().getColumn(1).setMinWidth(80);
            Aschedule.getColumnModel().getColumn(1).setPreferredWidth(80);
            Aschedule.getColumnModel().getColumn(1).setMaxWidth(80);
            Aschedule.getColumnModel().getColumn(2).setMinWidth(100);
            Aschedule.getColumnModel().getColumn(2).setPreferredWidth(100);
            Aschedule.getColumnModel().getColumn(2).setMaxWidth(100);
            Aschedule.getColumnModel().getColumn(3).setMinWidth(65);
            Aschedule.getColumnModel().getColumn(3).setPreferredWidth(65);
            Aschedule.getColumnModel().getColumn(3).setMaxWidth(65);
            Aschedule.getColumnModel().getColumn(4).setMinWidth(65);
            Aschedule.getColumnModel().getColumn(4).setPreferredWidth(65);
            Aschedule.getColumnModel().getColumn(4).setMaxWidth(65);
            Aschedule.getColumnModel().getColumn(5).setMinWidth(95);
            Aschedule.getColumnModel().getColumn(5).setPreferredWidth(95);
            Aschedule.getColumnModel().getColumn(5).setMaxWidth(95);
            Aschedule.getColumnModel().getColumn(6).setMinWidth(95);
            Aschedule.getColumnModel().getColumn(6).setPreferredWidth(95);
            Aschedule.getColumnModel().getColumn(6).setMaxWidth(95);
            Aschedule.getColumnModel().getColumn(7).setMinWidth(70);
            Aschedule.getColumnModel().getColumn(7).setPreferredWidth(70);
            Aschedule.getColumnModel().getColumn(7).setMaxWidth(70);
            Aschedule.getColumnModel().getColumn(9).setMinWidth(150);
            Aschedule.getColumnModel().getColumn(9).setPreferredWidth(150);
            Aschedule.getColumnModel().getColumn(9).setMaxWidth(150);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 880, 600));

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Hall Type:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, -1, -1));
        getContentPane().add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, 140, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Hall No:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, -1, -1));
        getContentPane().add(no, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 402, 140, 30));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oodjassignment/picture/blue.jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
       new 
       homepage().setVisible(true);
       dispose();
    }//GEN-LAST:event_logoutActionPerformed

    private void reason_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reason_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reason_fieldActionPerformed

    private void selectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectActionPerformed
    bookdetails.select(Aschedule, bkid, customer, type, no);
    }//GEN-LAST:event_selectActionPerformed

    private void requestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestActionPerformed
        int selectedRow = Aschedule.getSelectedRow();
        if (selectedRow != -1) {
            String reason = reason_field.getText();
            DefaultTableModel model = (DefaultTableModel) Aschedule.getModel();
            bookdetails.updateBookingRequest(model, selectedRow, reason);

            JOptionPane.showMessageDialog(this, "Cancellation requested.");
            new bookingdetails().setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Please select a row to request for cancel");
        }
    }//GEN-LAST:event_requestActionPerformed

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
            java.util.logging.Logger.getLogger(bookingdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bookingdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bookingdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bookingdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bookingdetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Aschedule;
    private javax.swing.JLabel background;
    private javax.swing.JTextField bkid;
    private javax.swing.JTextField customer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logout;
    private javax.swing.JTextField no;
    private javax.swing.JTextField reason_field;
    private javax.swing.JButton request;
    private javax.swing.JButton select;
    private javax.swing.JTextField type;
    // End of variables declaration//GEN-END:variables
}
