package oodjassignment.admin;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import java.io.IOException;
import java.util.ArrayList;

public class UserManagement extends javax.swing.JFrame {

    private DefaultTableModel model;
    private DataHandling dataHandling; // DataHandling instance

    public UserManagement() {
        initComponents();
        model = (DefaultTableModel) jTable.getModel();
        dataHandling = new DataHandling("src\\oodjassignment\\database\\User.txt"); // Initialize DataHandling
        showDataFromFile();
        jTable.getSelectionModel().addListSelectionListener(event -> {
            if (!event.getValueIsAdjusting() && jTable.getSelectedRow() != -1) {
                getSelectedRowText();
            }
        });
    }

    private void getSelectedRowText() {
        int selectedRow = jTable.getSelectedRow();

        // Retrieve data from the selected row
        String userId = (String) jTable.getValueAt(selectedRow, 0);
        String name = (String) jTable.getValueAt(selectedRow, 1);
        String phone = (String) jTable.getValueAt(selectedRow, 2);
        String email = (String) jTable.getValueAt(selectedRow, 3);
        String password = (String) jTable.getValueAt(selectedRow, 4);

        tfUserid.setText(userId);
        tfName.setText(name);
        tfPhone.setText(phone);
        tfEmail.setText(email);
        tfPassword.setText(password);
    }

    private void createUser() {
        String userId = tfUserid.getText();
        String name = tfName.getText();
        String phone = tfPhone.getText();
        String email = tfEmail.getText();
        String password = tfPassword.getText();

        if (userId.isEmpty() || name.isEmpty() || phone.isEmpty() || email.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill all fields before creating a record.");
            return;
        }

        String newRecord = userId + "," + name + "," + phone + "," + email + "," + password + "\n";

        try {
            dataHandling.appendData(newRecord);
            JOptionPane.showMessageDialog(this, "Record created successfully.");
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "An error occurred while writing to the file.");
        }
        clearTextFields();
        showDataFromFile();
    }

    private void updateUser() {
        int selectedRow = jTable.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a user to do changes.");
            return;
        }

        String userId = tfUserid.getText();
        String name = tfName.getText();
        String phone = tfPhone.getText();
        String email = tfEmail.getText();
        String password = tfPassword.getText();

        if (userId.isEmpty() || name.isEmpty() || phone.isEmpty() || email.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill all fields before updating.");
            return;
        }

        try {
            dataHandling.updateData(selectedRow, new String[]{userId, name, phone, email, password});
            DefaultTableModel model = (DefaultTableModel) jTable.getModel();
            model.setValueAt(userId, selectedRow, 0);
            model.setValueAt(name, selectedRow, 1);
            model.setValueAt(phone, selectedRow, 2);
            model.setValueAt(email, selectedRow, 3);
            model.setValueAt(password, selectedRow, 4);
            JOptionPane.showMessageDialog(this, "User record updated successfully.");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "An error occurred while updating the file.");
        }
    }

    private void deleteUser() {
        int selectedRow = jTable.getSelectedRow();

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a user to delete.");
            return;
        }

        int confirmation = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this user?", "Confirmation", JOptionPane.YES_NO_OPTION);
        if (confirmation == JOptionPane.YES_OPTION) {
            try {
                dataHandling.deleteData(selectedRow);
                // Remove the selected row from the table model
                DefaultTableModel model = (DefaultTableModel) jTable.getModel();
                model.removeRow(selectedRow);
                JOptionPane.showMessageDialog(this, "User record deleted successfully.");
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "An error occurred while deleting the file.");
            }
        }
    }

    private void searchUser() {
        String searchUserId = tfUserid.getText().trim();
        String searchUserName = tfName.getText().trim();
        String searchPhone = tfPhone.getText().trim();
        String searchEmail = tfEmail.getText().trim();
        String searchPassword = tfPassword.getText().trim();

        DefaultTableModel model = (DefaultTableModel) jTable.getModel();
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
        jTable.setRowSorter(sorter);

        List<RowFilter<Object, Object>> filters = new ArrayList<>();
        if (!searchUserId.isEmpty()) {
            filters.add(RowFilter.regexFilter("(?i)" + searchUserId, 0));
        }
        if (!searchUserName.isEmpty()) {
            filters.add(RowFilter.regexFilter("(?i)" + searchUserName, 1));
        }
        if (!searchPhone.isEmpty()) {
            filters.add(RowFilter.regexFilter("(?i)" + searchPhone, 2));
        }
        if (!searchEmail.isEmpty()) {
            filters.add(RowFilter.regexFilter("(?i)" + searchEmail, 3));
        }
        if (!searchPassword.isEmpty()) {
            filters.add(RowFilter.regexFilter("(?i)" + searchPassword, 4));
        }

        RowFilter<Object, Object> finalFilter = RowFilter.andFilter(filters);
        sorter.setRowFilter(finalFilter);

        if (model.getRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "No matching records found.");
        }
    }

    private void clearTextFields() {
        tfUserid.setText("");
        tfName.setText("");
        tfPhone.setText("");
        tfEmail.setText("");
        tfPassword.setText("");
    }

    private void showDataFromFile() {
        DefaultTableModel model = (DefaultTableModel) jTable.getModel();
        model.setRowCount(0);
        try {
            List<String[]> data = dataHandling.readData();
            for (String[] record : data) {
                model.addRow(record);
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "An error occurred while reading the file.");
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

        jLabel3 = new javax.swing.JLabel();
        btSearch = new javax.swing.JButton();
        btDelete = new javax.swing.JButton();
        btCreate = new javax.swing.JButton();
        btUpdate = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        tfPassword = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tfName = new javax.swing.JTextField();
        tfUserid = new javax.swing.JTextField();
        tfPhone = new javax.swing.JTextField();
        tfEmail = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        btClear = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("USER MANAGEMENT");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, -1, -1));

        btSearch.setBackground(new java.awt.Color(235, 235, 235));
        btSearch.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btSearch.setForeground(new java.awt.Color(0, 0, 0));
        btSearch.setText("SEARCH");
        btSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSearchActionPerformed(evt);
            }
        });
        getContentPane().add(btSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 170, 35));

        btDelete.setBackground(new java.awt.Color(235, 235, 235));
        btDelete.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btDelete.setForeground(new java.awt.Color(0, 0, 0));
        btDelete.setText("DELETE");
        btDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 150, 170, 35));

        btCreate.setBackground(new java.awt.Color(235, 235, 235));
        btCreate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btCreate.setForeground(new java.awt.Color(0, 0, 0));
        btCreate.setText("CREATE");
        btCreate.setMaximumSize(new java.awt.Dimension(72, 30));
        btCreate.setPreferredSize(new java.awt.Dimension(72, 35));
        btCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCreateActionPerformed(evt);
            }
        });
        getContentPane().add(btCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, 170, -1));

        btUpdate.setBackground(new java.awt.Color(235, 235, 235));
        btUpdate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btUpdate.setForeground(new java.awt.Color(0, 0, 0));
        btUpdate.setText("UPDATE");
        btUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 150, 170, 35));

        jPanel3.setBackground(new java.awt.Color(0, 137, 248));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("EMAIL:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("NAME:");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText("PHONE:");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setText("PASSWORD:");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setText("USER ID:");

        btClear.setBackground(new java.awt.Color(235, 235, 235));
        btClear.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btClear.setForeground(new java.awt.Color(0, 0, 0));
        btClear.setText("CLEAR FILTER");
        btClear.setMaximumSize(new java.awt.Dimension(50, 23));
        btClear.setMinimumSize(new java.awt.Dimension(50, 23));
        btClear.setPreferredSize(new java.awt.Dimension(50, 23));
        btClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(tfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btClear, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tfUserid, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tfName, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(90, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfUserid, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btClear, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -1, 250, 580));

        jTable.setAutoCreateRowSorter(true);
        jTable.setBackground(new java.awt.Color(0, 137, 248));
        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "USER ID", "NAME", "PHONE NUMBER", "EMAIL", "PASSWORD"
            }
        ));
        jScrollPane2.setViewportView(jTable);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 750, 390));

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

    private void btCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCreateActionPerformed
        createUser();
    }//GEN-LAST:event_btCreateActionPerformed

    private void btClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btClearActionPerformed
        clearTextFields();
        TableRowSorter<DefaultTableModel> sorter = (TableRowSorter<DefaultTableModel>) jTable.getRowSorter();
        if (sorter != null) {
            sorter.setRowFilter(null);
        }
    }//GEN-LAST:event_btClearActionPerformed

    private void btSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSearchActionPerformed
        searchUser();
    }//GEN-LAST:event_btSearchActionPerformed

    private void btUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUpdateActionPerformed
        updateUser();
    }//GEN-LAST:event_btUpdateActionPerformed

    private void btDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeleteActionPerformed
        deleteUser();
    }//GEN-LAST:event_btDeleteActionPerformed

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
            java.util.logging.Logger.getLogger(UserManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserManagement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btClear;
    private javax.swing.JButton btCreate;
    private javax.swing.JButton btDelete;
    private javax.swing.JButton btSearch;
    private javax.swing.JButton btUpdate;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfName;
    private javax.swing.JTextField tfPassword;
    private javax.swing.JTextField tfPhone;
    private javax.swing.JTextField tfUserid;
    // End of variables declaration//GEN-END:variables
}
