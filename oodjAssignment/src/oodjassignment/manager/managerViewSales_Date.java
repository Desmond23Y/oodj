
package oodjassignment.manager;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.ArrayList;
import java.io.*;
import javax.swing.table.DefaultTableModel;

public class managerViewSales_Date extends javax.swing.JFrame {
    private BookingManager bookingManager = new BookingManager();
    
    public managerViewSales_Date() {
        initComponents();
        initial_cbxAllVisibility(false);
        generate_DateCombobx();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_back = new javax.swing.JButton();
        lbl_title = new javax.swing.JLabel();
        lbl_viewBy = new javax.swing.JLabel();
        rbtn_daily = new javax.swing.JRadioButton();
        rbtn_weekly = new javax.swing.JRadioButton();
        rbtn_monthly = new javax.swing.JRadioButton();
        rbtn_yearly = new javax.swing.JRadioButton();
        rbtn_all = new javax.swing.JRadioButton();
        lbl_selectDay = new javax.swing.JLabel();
        lbl_selectMonth = new javax.swing.JLabel();
        lbl_selectYear = new javax.swing.JLabel();
        lbl_selectMonday = new javax.swing.JLabel();
        cbx_day = new javax.swing.JComboBox<>();
        cbx_month = new javax.swing.JComboBox<>();
        cbx_year = new javax.swing.JComboBox<>();
        cbx_monday = new javax.swing.JComboBox<>();
        btn_view = new javax.swing.JButton();
        lbl_sales = new javax.swing.JLabel();
        spnl_showSales = new javax.swing.JScrollPane();
        tbl_showSales = new javax.swing.JTable();
        lbl_background = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbl_background1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1200, 800));
        setPreferredSize(new java.awt.Dimension(1200, 800));
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

        lbl_title.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        lbl_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_title.setText("View Sales by Date");
        getContentPane().add(lbl_title, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 40, -1, -1));

        lbl_viewBy.setFont(new java.awt.Font("Segoe UI Black", 0, 20)); // NOI18N
        lbl_viewBy.setText("VIEW BY");
        getContentPane().add(lbl_viewBy, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, -1, -1));

        rbtn_daily.setFont(new java.awt.Font("Segoe UI Black", 0, 16)); // NOI18N
        rbtn_daily.setText("Daily");
        rbtn_daily.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtn_dailyActionPerformed(evt);
            }
        });
        getContentPane().add(rbtn_daily, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, -1, -1));

        rbtn_weekly.setFont(new java.awt.Font("Segoe UI Black", 0, 16)); // NOI18N
        rbtn_weekly.setText("Weekly");
        rbtn_weekly.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtn_weeklyActionPerformed(evt);
            }
        });
        getContentPane().add(rbtn_weekly, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, -1, -1));

        rbtn_monthly.setFont(new java.awt.Font("Segoe UI Black", 0, 16)); // NOI18N
        rbtn_monthly.setText("Monthly");
        rbtn_monthly.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtn_monthlyActionPerformed(evt);
            }
        });
        getContentPane().add(rbtn_monthly, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 130, -1, -1));

        rbtn_yearly.setFont(new java.awt.Font("Segoe UI Black", 0, 16)); // NOI18N
        rbtn_yearly.setText("Yearly");
        rbtn_yearly.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtn_yearlyActionPerformed(evt);
            }
        });
        getContentPane().add(rbtn_yearly, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 130, -1, -1));

        rbtn_all.setFont(new java.awt.Font("Segoe UI Black", 0, 16)); // NOI18N
        rbtn_all.setText("All");
        rbtn_all.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtn_allActionPerformed(evt);
            }
        });
        getContentPane().add(rbtn_all, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 130, -1, -1));

        lbl_selectDay.setFont(new java.awt.Font("Segoe UI Black", 0, 20)); // NOI18N
        lbl_selectDay.setText("DAY");
        getContentPane().add(lbl_selectDay, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, -1, -1));

        lbl_selectMonth.setFont(new java.awt.Font("Segoe UI Black", 0, 20)); // NOI18N
        lbl_selectMonth.setText("MONTH");
        getContentPane().add(lbl_selectMonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, -1, -1));

        lbl_selectYear.setFont(new java.awt.Font("Segoe UI Black", 0, 20)); // NOI18N
        lbl_selectYear.setText("YEAR");
        getContentPane().add(lbl_selectYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, -1, -1));

        lbl_selectMonday.setFont(new java.awt.Font("Segoe UI Black", 0, 20)); // NOI18N
        lbl_selectMonday.setText("SELECT THE DATE OF THE MONDAY OF THE WEEK");
        getContentPane().add(lbl_selectMonday, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, -1, -1));

        cbx_day.setFont(new java.awt.Font("Segoe UI Black", 0, 16)); // NOI18N
        cbx_day.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cbx_day, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, -1, -1));
        cbx_day.getAccessibleContext().setAccessibleName("1\n2\n3\n4\n5\n6\n7\n8\n9\n10\n11\n12\n13\n14\n15\n16\n17\n18\n19\n20\n21\n22\n23\n24\n25\n26\n27\n28\n29\n30\n31");

        cbx_month.setFont(new java.awt.Font("Segoe UI Black", 0, 16)); // NOI18N
        cbx_month.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cbx_month, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, -1, -1));
        cbx_month.getAccessibleContext().setAccessibleName("JAN\nFEB\nMAR\nAPR\nMAY\nJUN\nJUL\nAUG\nSEP\nOCT\nNOV\nDEC");

        cbx_year.setFont(new java.awt.Font("Segoe UI Black", 0, 16)); // NOI18N
        cbx_year.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cbx_year, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, -1, -1));
        cbx_year.getAccessibleContext().setAccessibleName("2024\n2025\n2026\n2027\n2028");

        cbx_monday.setFont(new java.awt.Font("Segoe UI Black", 0, 16)); // NOI18N
        cbx_monday.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbx_monday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_mondayActionPerformed(evt);
            }
        });
        getContentPane().add(cbx_monday, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 290, -1, -1));

        btn_view.setFont(new java.awt.Font("Segoe UI Black", 0, 16)); // NOI18N
        btn_view.setText("VIEW");
        btn_view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_viewActionPerformed(evt);
            }
        });
        getContentPane().add(btn_view, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 350, -1, -1));

        lbl_sales.setFont(new java.awt.Font("Segoe UI Black", 0, 20)); // NOI18N
        lbl_sales.setText("SALES");
        getContentPane().add(lbl_sales, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, -1, -1));

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

        getContentPane().add(spnl_showSales, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 390, 800, 400));

        lbl_background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oodjassignment/picture/blue.jpg"))); // NOI18N
        lbl_background.setText("jLabel4");
        lbl_background.setMinimumSize(new java.awt.Dimension(1200, 800));
        lbl_background.setPreferredSize(new java.awt.Dimension(1200, 800));
        getContentPane().add(lbl_background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Starts from");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, -1, -1));

        lbl_background1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oodjassignment/picture/blue.jpg"))); // NOI18N
        lbl_background1.setText("jLabel4");
        getContentPane().add(lbl_background1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_viewActionPerformed
        boolean valid_filled = areAllComboBoxesSelected();
        if (valid_filled){
            record_date();
            showFilteredBookings();
        }
        else {
            JOptionPane.showMessageDialog(null, "Please select all required information.", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btn_viewActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        managerHomepage managerHomepage = new managerHomepage();
        managerHomepage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_backActionPerformed

    private void rbtn_yearlyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtn_yearlyActionPerformed
        initial_cbxAllVisibility(false);
        inital_selectYearlyVisibility();
        btn_view.setVisible(true);
        ////////
    }//GEN-LAST:event_rbtn_yearlyActionPerformed

    private void cbx_mondayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_mondayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx_mondayActionPerformed

    private void rbtn_allActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtn_allActionPerformed
        initial_cbxAllVisibility(false);
        btn_view.setVisible(true);
    }//GEN-LAST:event_rbtn_allActionPerformed

    private void rbtn_monthlyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtn_monthlyActionPerformed
        initial_cbxAllVisibility(false);
        initial_selectMonthlyVisibility();
        btn_view.setVisible(true);
    }//GEN-LAST:event_rbtn_monthlyActionPerformed

    private void rbtn_dailyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtn_dailyActionPerformed
        initial_cbxAllVisibility(false);
        initial_selectDailyVisibility(true);
        btn_view.setVisible(true);
    }//GEN-LAST:event_rbtn_dailyActionPerformed

    private void rbtn_weeklyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtn_weeklyActionPerformed
        initial_cbxAllVisibility(false);
        initial_selectWeeklyVisibility1();
        btn_view.setVisible(true);
    }//GEN-LAST:event_rbtn_weeklyActionPerformed

     // GET DATA ----------------------------------------------------------------
    
    private void showFilteredBookings() {
        List<String> dateList = record_date();
        BookingManager bookingManager = new BookingManager();
        List<Booking> filteredBookings = bookingManager.filterBookings(dateList);
        bookingManager.displayBookings(filteredBookings, tbl_showSales);
    }

    // VALIDIVITY --------------------------------------------------------------
    private boolean areAllComboBoxesSelected() {
        if (rbtn_daily.isSelected()) {
            return cbx_day.getSelectedIndex() != 0 && cbx_month.getSelectedIndex() != 0 && cbx_year.getSelectedIndex() != 0;
        } 
        else if (rbtn_weekly.isSelected()) {
            return cbx_year.getSelectedIndex() != 0 && cbx_monday.getSelectedIndex() != 0;
        } 
        else if (rbtn_monthly.isSelected()) {
            return cbx_year.getSelectedIndex() != 0 && cbx_month.getSelectedIndex() != 0;
        } 
        else if (rbtn_yearly.isSelected()) {
            return cbx_year.getSelectedIndex() != 0;
        }
        return false;
    }

    private List<String> record_date() {
        List<String> date_list = new ArrayList<>();

        if (rbtn_daily.isSelected()) {
            String day = (String) cbx_day.getSelectedItem();
            String month = (String) cbx_month.getSelectedItem();
            String year = (String) cbx_year.getSelectedItem();
            if (day != null && month != null && year != null) {
                date_list.add(day);
                date_list.add(month);
                date_list.add(year);
            }
        } 
        else if (rbtn_weekly.isSelected()) {
            String monday = (String) cbx_monday.getSelectedItem();
            String year = (String) cbx_year.getSelectedItem();
            if (monday != null && year != null) {
                date_list.add(monday);
                date_list.add(year);
            }
        }
        else if (rbtn_monthly.isSelected()) {
            String month = (String) cbx_month.getSelectedItem();
            String year = (String) cbx_year.getSelectedItem();
            if (month != null && year != null) {
                date_list.add(month);
                date_list.add(year);
            }
        } else if (rbtn_yearly.isSelected()) {
            String year = (String) cbx_year.getSelectedItem();
            if (year != null) {
                date_list.add(year);
            }
        }
    return date_list;
    }
    
    // GENERATION OF DATE ------------------------------------------------------
    private void generate_DateCombobx(){
        GenerateDatecbx dateGenerator = new GenerateDatecbx();
        dateGenerator.populateComboBox(cbx_day, "day");
        dateGenerator.populateComboBox(cbx_month, "month");
        dateGenerator.populateComboBox(cbx_year, "year");
    }
    
    // CONTROL OF COMPONENT ----------------------------------------------------
    private void initial_cbxAllVisibility(boolean tf){
        lbl_selectDay.setVisible(tf);
        lbl_selectMonth.setVisible(tf);
        lbl_selectYear.setVisible(tf);
        cbx_day.setVisible(tf);
        cbx_month.setVisible(tf);
        cbx_year.setVisible(tf);
        
        lbl_selectMonday.setVisible(tf);
        cbx_monday.setVisible(tf);
        
        btn_view.setVisible(tf);
    }
    
    private void initial_selectDailyVisibility(boolean tf){
        initial_cbxAllVisibility(tf);
        lbl_selectMonday.setVisible(!tf);
        cbx_monday.setVisible(!tf);
    }
    
    private void initial_selectWeeklyVisibility1(){
        lbl_selectYear.setVisible(true);
        cbx_year.setVisible(true);
        lbl_selectMonday.setVisible(true);
        cbx_monday.setVisible(true);
    }
    
    private void initial_selectMonthlyVisibility(){
        lbl_selectMonth.setVisible(true);
        lbl_selectYear.setVisible(true);
        cbx_month.setVisible(true);
        cbx_year.setVisible(true);
    }
    
    private void inital_selectYearlyVisibility(){
        lbl_selectYear.setVisible(true);
        cbx_year.setVisible(true);
    }  
    
    // main --------------------------------------------------------------------
    public static void main(String args[]) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new managerViewSales_Date().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_view;
    private javax.swing.JComboBox<String> cbx_day;
    private javax.swing.JComboBox<String> cbx_monday;
    private javax.swing.JComboBox<String> cbx_month;
    private javax.swing.JComboBox<String> cbx_year;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lbl_background;
    private javax.swing.JLabel lbl_background1;
    private javax.swing.JLabel lbl_sales;
    private javax.swing.JLabel lbl_selectDay;
    private javax.swing.JLabel lbl_selectMonday;
    private javax.swing.JLabel lbl_selectMonth;
    private javax.swing.JLabel lbl_selectYear;
    private javax.swing.JLabel lbl_title;
    private javax.swing.JLabel lbl_viewBy;
    private javax.swing.JRadioButton rbtn_all;
    private javax.swing.JRadioButton rbtn_daily;
    private javax.swing.JRadioButton rbtn_monthly;
    private javax.swing.JRadioButton rbtn_weekly;
    private javax.swing.JRadioButton rbtn_yearly;
    private javax.swing.JScrollPane spnl_showSales;
    private javax.swing.JTable tbl_showSales;
    // End of variables declaration//GEN-END:variables
}
