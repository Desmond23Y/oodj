package oodjassignment.admin;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class BookingManagement extends javax.swing.JFrame {

    private TableRowSorter<DefaultTableModel> upcomingRowSorter;
    private TableRowSorter<DefaultTableModel> pastRowSorter;

    public BookingManagement() {
        initComponents();
        DefaultTableModel upcomingModel = (DefaultTableModel) tbUpcomingBooking.getModel();
        DefaultTableModel pastModel = (DefaultTableModel) tbPastBooking.getModel();

        // Use adminClass to handle data loading
        adminClass.showDataFromFile("src\\oodjassignment\\database\\Booking.txt", upcomingModel, pastModel);

        // Initialize the row sorter
        upcomingRowSorter = new TableRowSorter<>(upcomingModel);
        tbUpcomingBooking.setRowSorter(upcomingRowSorter);

        pastRowSorter = new TableRowSorter<>(pastModel);
        tbPastBooking.setRowSorter(pastRowSorter);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        tabbedPanel1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbUpcomingBooking = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbPastBooking = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        tfSearch = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cbSearch = new javax.swing.JComboBox<>();
        btClearFilter = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("BOOKING MANAGEMENT");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, -1, -1));

        tabbedPanel1.setBackground(new java.awt.Color(0, 0, 0));
        tabbedPanel1.setForeground(new java.awt.Color(255, 255, 255));

        tbUpcomingBooking.setAutoCreateRowSorter(true);
        tbUpcomingBooking.setBackground(new java.awt.Color(0, 137, 248));
        tbUpcomingBooking.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BOOKING ID", "CUSTOMER NAME", "HALL TYPE", "DATE", "TIME", "DURATION", "PRICE", "EVENT INFORMATION"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbUpcomingBooking);
        if (tbUpcomingBooking.getColumnModel().getColumnCount() > 0) {
            tbUpcomingBooking.getColumnModel().getColumn(0).setPreferredWidth(90);
            tbUpcomingBooking.getColumnModel().getColumn(0).setMaxWidth(90);
            tbUpcomingBooking.getColumnModel().getColumn(1).setPreferredWidth(120);
            tbUpcomingBooking.getColumnModel().getColumn(1).setMaxWidth(120);
            tbUpcomingBooking.getColumnModel().getColumn(7).setMinWidth(120);
            tbUpcomingBooking.getColumnModel().getColumn(7).setPreferredWidth(120);
        }

        tabbedPanel1.addTab("Upcoming Booking", jScrollPane1);

        tbPastBooking.setAutoCreateRowSorter(true);
        tbPastBooking.setBackground(new java.awt.Color(0, 137, 248));
        tbPastBooking.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BOOKING ID", "CUSTOMER NAME", "HALL TYPE", "DATE", "TIME", "DURATION", "PRICE", "EVENT INFORMATION"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tbPastBooking);
        if (tbPastBooking.getColumnModel().getColumnCount() > 0) {
            tbPastBooking.getColumnModel().getColumn(0).setPreferredWidth(90);
            tbPastBooking.getColumnModel().getColumn(0).setMaxWidth(90);
            tbPastBooking.getColumnModel().getColumn(1).setPreferredWidth(120);
            tbPastBooking.getColumnModel().getColumn(1).setMaxWidth(120);
            tbPastBooking.getColumnModel().getColumn(7).setMinWidth(120);
            tbPastBooking.getColumnModel().getColumn(7).setPreferredWidth(120);
        }

        tabbedPanel1.addTab("Past Booking", jScrollPane2);

        getContentPane().add(tabbedPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 750, 620));

        jPanel2.setBackground(new java.awt.Color(0, 137, 248));

        tfSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfSearchKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfSearchKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel1.setText("SEARCH:");

        cbSearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BOOKING ID", "CUSTOMER NAME", "HALL TYPE", "DATE", "TIME", "EVENT INFORMATION" }));
        cbSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSearchActionPerformed(evt);
            }
        });

        btClearFilter.setText("CLEAR FILTERS");
        btClearFilter.setPreferredSize(new java.awt.Dimension(65, 22));
        btClearFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btClearFilterActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel2.setText("FILTER:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(tfSearch)
                        .addComponent(cbSearch, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btClearFilter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(49, 49, 49))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(212, 212, 212)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btClearFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(402, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -1, 250, 780));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oodjassignment/picture/blue.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 1000, 600));

        jMenuBar1.setBackground(new java.awt.Color(226, 218, 214));
        jMenuBar1.setForeground(new java.awt.Color(0, 0, 0));

        jMenu2.setText("HOME");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        AdministratorHomepage AdministratorHomepage = new AdministratorHomepage();
        AdministratorHomepage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenu2MouseClicked

    private void tfSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfSearchKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSearchKeyPressed

    private void tfSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfSearchKeyReleased
        String searchText = tfSearch.getText().trim();
        String selectedColumn = (String) cbSearch.getSelectedItem();
        int columnIndex = adminClass.getColumnIndex(selectedColumn);

        adminClass.applyFilter(upcomingRowSorter, pastRowSorter, searchText, columnIndex);
    }//GEN-LAST:event_tfSearchKeyReleased

    private void cbSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSearchActionPerformed
        tfSearchKeyReleased(null);
    }//GEN-LAST:event_cbSearchActionPerformed

    private void btClearFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btClearFilterActionPerformed
        tfSearch.setText("");
        upcomingRowSorter.setRowFilter(null);
        pastRowSorter.setRowFilter(null);
        cbSearch.setSelectedIndex(0);
    }//GEN-LAST:event_btClearFilterActionPerformed

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
            java.util.logging.Logger.getLogger(BookingManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookingManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookingManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookingManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookingManagement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btClearFilter;
    private javax.swing.JComboBox<String> cbSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane tabbedPanel1;
    private javax.swing.JTable tbPastBooking;
    private javax.swing.JTable tbUpcomingBooking;
    private javax.swing.JTextField tfSearch;
    // End of variables declaration//GEN-END:variables
}
