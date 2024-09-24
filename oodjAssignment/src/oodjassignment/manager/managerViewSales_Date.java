
package oodjassignment.manager;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.ArrayList;
import java.io.*;
import javax.swing.table.DefaultTableModel;
import java.util.stream.Collectors;

public class managerViewSales_Date extends javax.swing.JFrame {
    
    public managerViewSales_Date() {
        initComponents();
        initial_cbxAllVisibility(false);
        generate_DateCombobx();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
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
        lbl_selectWeek = new javax.swing.JLabel();
        cbx_day = new javax.swing.JComboBox<>();
        cbx_month = new javax.swing.JComboBox<>();
        cbx_year = new javax.swing.JComboBox<>();
        cbx_week = new javax.swing.JComboBox<>();
        btn_view = new javax.swing.JButton();
        lbl_sales = new javax.swing.JLabel();
        spnl_showSales = new javax.swing.JScrollPane();
        tbl_showSales = new javax.swing.JTable();
        lbl_responseNoBooking = new javax.swing.JLabel();
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
        lbl_title.setText("View Sales by Date");
        getContentPane().add(lbl_title, new org.netbeans.lib.awtextra.AbsoluteConstraints(377, 40, -1, -1));

        lbl_viewBy.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        lbl_viewBy.setText("VIEW BY");
        getContentPane().add(lbl_viewBy, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, -1, -1));

        buttonGroup1.add(rbtn_daily);
        rbtn_daily.setFont(new java.awt.Font("Segoe UI Black", 0, 20)); // NOI18N
        rbtn_daily.setText("Daily");
        rbtn_daily.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtn_dailyActionPerformed(evt);
            }
        });
        getContentPane().add(rbtn_daily, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, -1, -1));

        buttonGroup1.add(rbtn_weekly);
        rbtn_weekly.setFont(new java.awt.Font("Segoe UI Black", 0, 20)); // NOI18N
        rbtn_weekly.setText("Weekly");
        rbtn_weekly.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtn_weeklyActionPerformed(evt);
            }
        });
        getContentPane().add(rbtn_weekly, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, -1, -1));

        buttonGroup1.add(rbtn_monthly);
        rbtn_monthly.setFont(new java.awt.Font("Segoe UI Black", 0, 20)); // NOI18N
        rbtn_monthly.setText("Monthly");
        rbtn_monthly.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtn_monthlyActionPerformed(evt);
            }
        });
        getContentPane().add(rbtn_monthly, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, -1, -1));

        buttonGroup1.add(rbtn_yearly);
        rbtn_yearly.setFont(new java.awt.Font("Segoe UI Black", 0, 20)); // NOI18N
        rbtn_yearly.setText("Yearly");
        rbtn_yearly.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtn_yearlyActionPerformed(evt);
            }
        });
        getContentPane().add(rbtn_yearly, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 140, -1, -1));

        buttonGroup1.add(rbtn_all);
        rbtn_all.setFont(new java.awt.Font("Segoe UI Black", 0, 20)); // NOI18N
        rbtn_all.setText("All");
        rbtn_all.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtn_allActionPerformed(evt);
            }
        });
        getContentPane().add(rbtn_all, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 140, -1, -1));

        lbl_selectDay.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        lbl_selectDay.setText("DAY");
        getContentPane().add(lbl_selectDay, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, -1, -1));

        lbl_selectMonth.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        lbl_selectMonth.setText("MONTH");
        getContentPane().add(lbl_selectMonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, -1, -1));

        lbl_selectYear.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        lbl_selectYear.setText("YEAR");
        getContentPane().add(lbl_selectYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, -1, -1));

        lbl_selectWeek.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        lbl_selectWeek.setText("SELECT THE NUMBER OF WEEK");
        getContentPane().add(lbl_selectWeek, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, -1, -1));

        cbx_day.setFont(new java.awt.Font("Segoe UI Black", 0, 20)); // NOI18N
        getContentPane().add(cbx_day, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, -1, -1));
        cbx_day.getAccessibleContext().setAccessibleName("1\n2\n3\n4\n5\n6\n7\n8\n9\n10\n11\n12\n13\n14\n15\n16\n17\n18\n19\n20\n21\n22\n23\n24\n25\n26\n27\n28\n29\n30\n31");

        cbx_month.setFont(new java.awt.Font("Segoe UI Black", 0, 20)); // NOI18N
        getContentPane().add(cbx_month, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, -1, -1));
        cbx_month.getAccessibleContext().setAccessibleName("JAN\nFEB\nMAR\nAPR\nMAY\nJUN\nJUL\nAUG\nSEP\nOCT\nNOV\nDEC");

        cbx_year.setFont(new java.awt.Font("Segoe UI Black", 0, 20)); // NOI18N
        getContentPane().add(cbx_year, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, -1, -1));
        cbx_year.getAccessibleContext().setAccessibleName("2024\n2025\n2026\n2027\n2028");

        cbx_week.setFont(new java.awt.Font("Segoe UI Black", 0, 20)); // NOI18N
        cbx_week.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_weekActionPerformed(evt);
            }
        });
        getContentPane().add(cbx_week, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 300, -1, -1));

        btn_view.setFont(new java.awt.Font("Segoe UI Black", 0, 16)); // NOI18N
        btn_view.setText("VIEW");
        btn_view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_viewActionPerformed(evt);
            }
        });
        getContentPane().add(btn_view, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 350, -1, -1));

        lbl_sales.setFont(new java.awt.Font("Segoe UI Black", 0, 20)); // NOI18N
        lbl_sales.setText("SALES");
        getContentPane().add(lbl_sales, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, -1, -1));

        spnl_showSales.setMinimumSize(new java.awt.Dimension(900, 280));
        spnl_showSales.setPreferredSize(new java.awt.Dimension(900, 280));

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
        tbl_showSales.setMinimumSize(new java.awt.Dimension(900, 370));
        tbl_showSales.setPreferredSize(new java.awt.Dimension(900, 370));
        spnl_showSales.setViewportView(tbl_showSales);

        getContentPane().add(spnl_showSales, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, 900, 280));

        lbl_responseNoBooking.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        getContentPane().add(lbl_responseNoBooking, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 690, -1, -1));

        lbl_background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oodjassignment/picture/blue.jpg"))); // NOI18N
        lbl_background.setText("jLabel4");
        lbl_background.setMinimumSize(new java.awt.Dimension(1200, 800));
        lbl_background.setPreferredSize(new java.awt.Dimension(1200, 800));
        getContentPane().add(lbl_background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_viewActionPerformed
        clearTable(tbl_showSales); 

        List<String> filterValues = record_date();
        String filterType = "all";

        if (rbtn_daily.isSelected()) {
            filterType = "daily";
        } else if (rbtn_monthly.isSelected()) {
            filterType = "monthly";
        } else if (rbtn_yearly.isSelected()) {
            filterType = "yearly";
        }

        List<Booking> bookings = readBookingsFromFile("src/oodjassignment/database/Booking.txt");
        List<Booking> filteredBookings = filterBookings(bookings, filterType, filterValues);

        if (filteredBookings.isEmpty()) {
            lbl_responseNoBooking.setText("NO BOOKING ON THIS DURATION");
        } else {
            lbl_responseNoBooking.setText("");
            displayBookingsInTable(filteredBookings, tbl_showSales);
        }
    }//GEN-LAST:event_btn_viewActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        managerHomepage managerHomepage = new managerHomepage();
        managerHomepage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_backActionPerformed

    private void rbtn_yearlyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtn_yearlyActionPerformed
        resetComboBoxes();
        clearTable(tbl_showSales);
        initial_cbxAllVisibility(false);
        initial_selectYearlyVisibility();
        btn_view.setVisible(true);
        resetComboBoxes();
    }//GEN-LAST:event_rbtn_yearlyActionPerformed

    private void cbx_weekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_weekActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx_weekActionPerformed

    private void rbtn_allActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtn_allActionPerformed
        resetComboBoxes();
        clearTable(tbl_showSales);
        initial_cbxAllVisibility(false);
        btn_view.setVisible(true);
        resetComboBoxes();
    }//GEN-LAST:event_rbtn_allActionPerformed

    private void rbtn_monthlyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtn_monthlyActionPerformed
        resetComboBoxes();
        clearTable(tbl_showSales);
        initial_cbxAllVisibility(false);
        initial_selectMonthlyVisibility();
        btn_view.setVisible(true);
        resetComboBoxes();
    }//GEN-LAST:event_rbtn_monthlyActionPerformed

    private void rbtn_dailyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtn_dailyActionPerformed
        resetComboBoxes();
        clearTable(tbl_showSales);
        initial_cbxAllVisibility(false);
        initial_selectDailyVisibility(true);
        btn_view.setVisible(true);
        resetComboBoxes();
    }//GEN-LAST:event_rbtn_dailyActionPerformed

    private void rbtn_weeklyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtn_weeklyActionPerformed
        resetComboBoxes();
        clearTable(tbl_showSales);
        initial_cbxAllVisibility(false);
        initial_selectWeeklyVisibility1();
        btn_view.setVisible(true);
        resetComboBoxes();
    }//GEN-LAST:event_rbtn_weeklyActionPerformed

     // GET DATA ----------------------------------------------------------------
    public List<Booking> readBookingsFromFile(String filePath) {
        List<Booking> bookings = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split("/");
                Booking booking = new Booking(data[0], data[1], data[2], data[3], data[4], data[5], data[6], data[7], data[8], data[9]);
                bookings.add(booking);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bookings;
    }
    
    public List<Booking> filterBookings(List<Booking> bookings, String filterType, List<String> filterValues) {
        return bookings.stream().filter(booking -> {
            switch (filterType) {
                case "daily":
                    return booking.getDate().equals(String.join(" ", filterValues));
                case "monthly":
                    return booking.getDate().contains(filterValues.get(0) + " " + filterValues.get(1));
                case "yearly":
                    return booking.getDate().endsWith(filterValues.get(0));
                case "all":
                    return true;
                default:
                    return false;
            }
        }).collect(Collectors.toList());
    }
    
    public void displayBookingsInTable(List<Booking> bookings, JTable table) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0); // Clear existing rows

        for (Booking booking : bookings) {
            model.addRow(new Object[]{
                booking.getDate(),
                booking.getCustomerID(),
                booking.getHallType(),
                booking.getHallID(),
                booking.getTime(),
                booking.getDuration(),
                booking.getPrice(),
                booking.getStatus(),
                booking.getRemark()
            });
        }
    }

    // VALIDIVITY --------------------------------------------------------------
    private boolean areAllComboBoxesSelected() {
        if (rbtn_daily.isSelected()) {
            return cbx_day.getSelectedIndex() != 0 && cbx_month.getSelectedIndex() != 0 && cbx_year.getSelectedIndex() != 0;
        } 
        else if (rbtn_weekly.isSelected()) {
            return cbx_year.getSelectedIndex() != 0 && cbx_week.getSelectedIndex() != 0;
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
        } else if (rbtn_weekly.isSelected()) {
            String week = (String) cbx_week.getSelectedItem();
            String year = (String) cbx_year.getSelectedItem();
            if (week != null && year != null) {
                date_list.add(week);
                date_list.add(year);
            }
        } else if (rbtn_monthly.isSelected()) {
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
        GenerateCBX dateGenerator = new GenerateCBX();
        dateGenerator.populateComboBox(cbx_day, "day");
        dateGenerator.populateComboBox(cbx_week, "week");
        dateGenerator.populateComboBox(cbx_month, "month");
        dateGenerator.populateComboBox(cbx_year, "year");
    }
    
    // CONTROL OF COMPONENT ----------------------------------------------------
    public void resetComboBoxes() {
        cbx_day.setSelectedIndex(0);
        cbx_month.setSelectedIndex(0);
        cbx_year.setSelectedIndex(0);
        cbx_week.setSelectedIndex(0);
    }
    
    public void clearTable(JTable table) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0); // Clear existing rows
    }

    private void initial_cbxAllVisibility(boolean tf){
        lbl_selectDay.setVisible(tf);
        lbl_selectMonth.setVisible(tf);
        lbl_selectYear.setVisible(tf);
        cbx_day.setVisible(tf);
        cbx_month.setVisible(tf);
        cbx_year.setVisible(tf);
        lbl_selectWeek.setVisible(tf);
        cbx_week.setVisible(tf);
        btn_view.setVisible(tf);
    }
    
    private void initial_selectDailyVisibility(boolean tf){
        initial_cbxAllVisibility(tf);
        lbl_selectWeek.setVisible(!tf);
        cbx_week.setVisible(!tf);
    }
    
    private void initial_selectWeeklyVisibility1(){
        lbl_selectYear.setVisible(true);
        cbx_year.setVisible(true);
        lbl_selectWeek.setVisible(true);
        cbx_week.setVisible(true);
    }
    
    private void initial_selectMonthlyVisibility(){
        lbl_selectMonth.setVisible(true);
        lbl_selectYear.setVisible(true);
        cbx_month.setVisible(true);
        cbx_year.setVisible(true);
    }
    
    private void initial_selectYearlyVisibility(){
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
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbx_day;
    private javax.swing.JComboBox<String> cbx_month;
    private javax.swing.JComboBox<String> cbx_week;
    private javax.swing.JComboBox<String> cbx_year;
    private javax.swing.JLabel lbl_background;
    private javax.swing.JLabel lbl_responseNoBooking;
    private javax.swing.JLabel lbl_sales;
    private javax.swing.JLabel lbl_selectDay;
    private javax.swing.JLabel lbl_selectMonth;
    private javax.swing.JLabel lbl_selectWeek;
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
