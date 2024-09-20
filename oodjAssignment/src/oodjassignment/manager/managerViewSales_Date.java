
package oodjassignment.manager;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class managerViewSales_Date extends javax.swing.JFrame {
    
    public managerViewSales_Date() {
        initComponents();
        generate_DateCombobx();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_back = new javax.swing.JButton();
        lbl_title = new javax.swing.JLabel();
        lbl_viewBy = new javax.swing.JLabel();
        rbtn_daily = new javax.swing.JRadioButton();
        rbtn_Weekly = new javax.swing.JRadioButton();
        rbtn_monthly = new javax.swing.JRadioButton();
        rbtn_yearly = new javax.swing.JRadioButton();
        lbl_start = new javax.swing.JLabel();
        lbl_end = new javax.swing.JLabel();
        cbx_startday = new javax.swing.JComboBox<>();
        cbx_endday = new javax.swing.JComboBox<>();
        cbx_startmonth = new javax.swing.JComboBox<>();
        cbx_endyear = new javax.swing.JComboBox<>();
        cbx_endmonth = new javax.swing.JComboBox<>();
        cbx_startyear = new javax.swing.JComboBox<>();
        btn_View = new javax.swing.JButton();
        spnl_showSales = new javax.swing.JScrollPane();
        tbl_showSales = new javax.swing.JTable();
        lbl_background = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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
        lbl_title.setText("View Sales by Date");
        getContentPane().add(lbl_title, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 40, -1, -1));

        lbl_viewBy.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_viewBy.setText("VIEW BY");
        getContentPane().add(lbl_viewBy, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, -1, -1));

        rbtn_daily.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        rbtn_daily.setText("Daily");
        getContentPane().add(rbtn_daily, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, -1, -1));

        rbtn_Weekly.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        rbtn_Weekly.setText("Weekly");
        getContentPane().add(rbtn_Weekly, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, -1, -1));

        rbtn_monthly.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        rbtn_monthly.setText("Monthly");
        getContentPane().add(rbtn_monthly, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, -1, -1));

        rbtn_yearly.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        rbtn_yearly.setText("Yearly");
        getContentPane().add(rbtn_yearly, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 130, -1, -1));

        lbl_start.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_start.setText("STARTS FROM");
        getContentPane().add(lbl_start, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, -1, -1));

        lbl_end.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_end.setText("ENDS AT");
        getContentPane().add(lbl_end, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, -1, -1));

        cbx_startday.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbx_startday.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cbx_startday, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, -1, -1));
        cbx_startday.getAccessibleContext().setAccessibleName("1\n2\n3\n4\n5\n6\n7\n8\n9\n10\n11\n12\n13\n14\n15\n16\n17\n18\n19\n20\n21\n22\n23\n24\n25\n26\n27\n28\n29\n30\n31");

        cbx_endday.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbx_endday.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cbx_endday, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, -1, -1));
        cbx_endday.getAccessibleContext().setAccessibleName("1\n2\n3\n4\n5\n6\n7\n8\n9\n10\n11\n12\n13\n14\n15\n16\n17\n18\n19\n20\n21\n22\n23\n24\n25\n26\n27\n28\n29\n30\n31");

        cbx_startmonth.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbx_startmonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cbx_startmonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, -1, -1));
        cbx_startmonth.getAccessibleContext().setAccessibleName("JAN\nFEB\nMAR\nAPR\nMAY\nJUN\nJUL\nAUG\nSEP\nOCT\nNOV\nDEC");

        cbx_endyear.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbx_endyear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cbx_endyear, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 210, -1, -1));
        cbx_endyear.getAccessibleContext().setAccessibleName("2024\n2025\n2026\n2027\n2028");

        cbx_endmonth.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbx_endmonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cbx_endmonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, -1, -1));
        cbx_endmonth.getAccessibleContext().setAccessibleName("JAN\nFEB\nMAR\nAPR\nMAY\nJUN\nJUL\nAUG\nSEP\nOCT\nNOV\nDEC");

        cbx_startyear.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbx_startyear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cbx_startyear, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 170, -1, -1));
        cbx_startyear.getAccessibleContext().setAccessibleName("2024\n2025\n2026\n2027\n2028");

        btn_View.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btn_View.setText("VIEW");
        btn_View.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ViewActionPerformed(evt);
            }
        });
        getContentPane().add(btn_View, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 210, -1, -1));

        tbl_showSales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Date", "Customer ID", "Hall Type", "Hall ID", "Time", "Duration", "Price", "Status", "Remark"
            }
        ));
        spnl_showSales.setViewportView(tbl_showSales);

        getContentPane().add(spnl_showSales, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 800, 400));

        lbl_background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oodjassignment/picture/blue.jpg"))); // NOI18N
        lbl_background.setText("jLabel4");
        lbl_background.setPreferredSize(new java.awt.Dimension(1000, 800));
        getContentPane().add(lbl_background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Starts from");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ViewActionPerformed
        if (validateInputs()) {
            String startDate = cbx_startday.getSelectedItem() + " " + cbx_startmonth.getSelectedItem() + " " + cbx_startyear.getSelectedItem();
            String endDate = cbx_endday.getSelectedItem() + " " + cbx_endmonth.getSelectedItem() + " " + cbx_endyear.getSelectedItem();
            FilterDate filterDate = new FilterDate(startDate, endDate);
            if (filterDate.isValidDateRange()) {
                ReadBooking readBooking = new ReadBooking("Booking.txt");
                List<Booking> bookings = readBooking.getBookings();
                // Filter and display bookings in JTable
                // (Implement the logic to filter and display bookings based on the selected date range and radio button)
            } else {
                JOptionPane.showMessageDialog(null, "Invalid date range.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please fill all required fields.");
        }
    }//GEN-LAST:event_btn_ViewActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        managerHomepage managerHomepage = new managerHomepage();
        managerHomepage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_backActionPerformed

    private boolean validateInputs() {
        // Validate radio buttons and combo boxes
        if (!rbtn_daily.isSelected() && !rbtn_Weekly.isSelected() && !rbtn_monthly.isSelected() && !rbtn_yearly.isSelected()) {
            return false;
        }
        if (cbx_startday.getSelectedItem() == null || cbx_startmonth.getSelectedItem() == null || cbx_startyear.getSelectedItem() == null) {
            return false;
        }
        if ((rbtn_Weekly.isSelected() || rbtn_monthly.isSelected() || rbtn_yearly.isSelected()) &&
            (cbx_endday.getSelectedItem() == null || cbx_endmonth.getSelectedItem() == null || cbx_endyear.getSelectedItem() == null)) {
            return false;
        }
        return true;
    }
    
    private void generate_DateCombobx(){
        GenerateDatecbx dateGenerator = new GenerateDatecbx();
        dateGenerator.populateComboBox(cbx_startday, "day");
        dateGenerator.populateComboBox(cbx_startmonth, "month");
        dateGenerator.populateComboBox(cbx_startyear, "year");
        dateGenerator.populateComboBox(cbx_endday, "day");
        dateGenerator.populateComboBox(cbx_endmonth, "month");
        dateGenerator.populateComboBox(cbx_endyear, "year");
    }

    public static void main(String args[]) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new managerViewSales_Date().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_View;
    private javax.swing.JButton btn_back;
    private javax.swing.JComboBox<String> cbx_endday;
    private javax.swing.JComboBox<String> cbx_endmonth;
    private javax.swing.JComboBox<String> cbx_endyear;
    private javax.swing.JComboBox<String> cbx_startday;
    private javax.swing.JComboBox<String> cbx_startmonth;
    private javax.swing.JComboBox<String> cbx_startyear;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lbl_background;
    private javax.swing.JLabel lbl_end;
    private javax.swing.JLabel lbl_start;
    private javax.swing.JLabel lbl_title;
    private javax.swing.JLabel lbl_viewBy;
    private javax.swing.JRadioButton rbtn_Weekly;
    private javax.swing.JRadioButton rbtn_daily;
    private javax.swing.JRadioButton rbtn_monthly;
    private javax.swing.JRadioButton rbtn_yearly;
    private javax.swing.JScrollPane spnl_showSales;
    private javax.swing.JTable tbl_showSales;
    // End of variables declaration//GEN-END:variables
}
