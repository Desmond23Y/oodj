
package oodjassignment.manager;

public class managerViewSales_Venue extends javax.swing.JFrame {

    public managerViewSales_Venue() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        btn_back = new javax.swing.JButton();
        lbl_title = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        rbtn_auditorium = new javax.swing.JRadioButton();
        rbtn_banquetHall = new javax.swing.JRadioButton();
        rbtn_meetingRoom = new javax.swing.JRadioButton();
        btn_View = new javax.swing.JButton();
        lbl_sales = new javax.swing.JLabel();
        lbl_venueNumber = new javax.swing.JLabel();
        cbx_venueNumber = new javax.swing.JComboBox<>();
        spnl_showSales = new javax.swing.JScrollPane();
        tbl_showSales = new javax.swing.JTable();
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
        lbl_title.setText("View Sales by Venue");
        getContentPane().add(lbl_title, new org.netbeans.lib.awtextra.AbsoluteConstraints(377, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel2.setText("VENUE TYPE");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, -1, -1));

        buttonGroup1.add(rbtn_auditorium);
        rbtn_auditorium.setFont(new java.awt.Font("Segoe UI Black", 0, 20)); // NOI18N
        rbtn_auditorium.setText("Auditorium");
        rbtn_auditorium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtn_auditoriumActionPerformed(evt);
            }
        });
        getContentPane().add(rbtn_auditorium, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, -1, -1));

        buttonGroup1.add(rbtn_banquetHall);
        rbtn_banquetHall.setFont(new java.awt.Font("Segoe UI Black", 0, 20)); // NOI18N
        rbtn_banquetHall.setText("Banquet Hall");
        rbtn_banquetHall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtn_banquetHallActionPerformed(evt);
            }
        });
        getContentPane().add(rbtn_banquetHall, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, -1, -1));

        buttonGroup1.add(rbtn_meetingRoom);
        rbtn_meetingRoom.setFont(new java.awt.Font("Segoe UI Black", 0, 20)); // NOI18N
        rbtn_meetingRoom.setText("Meeting Room");
        getContentPane().add(rbtn_meetingRoom, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 140, -1, -1));

        btn_View.setFont(new java.awt.Font("Segoe UI Black", 0, 16)); // NOI18N
        btn_View.setText("View");
        getContentPane().add(btn_View, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 350, -1, -1));

        lbl_sales.setFont(new java.awt.Font("Segoe UI Black", 0, 20)); // NOI18N
        lbl_sales.setText("SALES");
        getContentPane().add(lbl_sales, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, -1, -1));

        lbl_venueNumber.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        lbl_venueNumber.setText("VENUE NUMBER");
        getContentPane().add(lbl_venueNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, -1, -1));

        cbx_venueNumber.setFont(new java.awt.Font("Segoe UI Black", 0, 20)); // NOI18N
        cbx_venueNumber.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cbx_venueNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, -1, -1));

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
        tbl_showSales.setMinimumSize(new java.awt.Dimension(900, 280));
        tbl_showSales.setPreferredSize(new java.awt.Dimension(900, 280));
        spnl_showSales.setViewportView(tbl_showSales);

        getContentPane().add(spnl_showSales, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, 900, 280));

        lbl_background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oodjassignment/picture/blue.jpg"))); // NOI18N
        lbl_background.setText("jLabel4");
        lbl_background.setMinimumSize(new java.awt.Dimension(1200, 800));
        lbl_background.setPreferredSize(new java.awt.Dimension(1200, 800));
        getContentPane().add(lbl_background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        managerHomepage managerHomepage = new managerHomepage();
        managerHomepage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_backActionPerformed

    private void rbtn_banquetHallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtn_banquetHallActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtn_banquetHallActionPerformed

    private void rbtn_auditoriumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtn_auditoriumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtn_auditoriumActionPerformed

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
            java.util.logging.Logger.getLogger(managerViewSales_Venue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(managerViewSales_Venue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(managerViewSales_Venue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(managerViewSales_Venue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new managerViewSales_Venue().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_View;
    private javax.swing.JButton btn_back;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbx_venueNumber;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbl_background;
    private javax.swing.JLabel lbl_sales;
    private javax.swing.JLabel lbl_title;
    private javax.swing.JLabel lbl_venueNumber;
    private javax.swing.JRadioButton rbtn_auditorium;
    private javax.swing.JRadioButton rbtn_banquetHall;
    private javax.swing.JRadioButton rbtn_meetingRoom;
    private javax.swing.JScrollPane spnl_showSales;
    private javax.swing.JTable tbl_showSales;
    // End of variables declaration//GEN-END:variables
}
