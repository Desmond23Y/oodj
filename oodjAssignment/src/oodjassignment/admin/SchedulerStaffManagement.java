package oodjassignment.admin;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class SchedulerStaffManagement extends javax.swing.JFrame {

    public SchedulerStaffManagement() {
        initComponents();
        showDataFromFile("src\\oodjassignment\\database\\Scheduler.txt");
        jTable.getSelectionModel().addListSelectionListener(event -> {
            if (!event.getValueIsAdjusting() && jTable.getSelectedRow() != -1) {
                getSelectedRowText();
            }
        });
    }

    private void getSelectedRowText() {
        int selectedRow = jTable.getSelectedRow();

        // Retrieve data from the selected row
        String staffId = (String) jTable.getValueAt(selectedRow, 0);
        String name = (String) jTable.getValueAt(selectedRow, 1);
        String phone = (String) jTable.getValueAt(selectedRow, 2);
        String email = (String) jTable.getValueAt(selectedRow, 3);
        String password = (String) jTable.getValueAt(selectedRow, 4);

        // Set the data into the text fields
        tfStaffid.setText(staffId);
        tfName.setText(name);
        tfPhone.setText(phone);
        tfEmail.setText(email);
        tfPassword.setText(password);
    }

    private void createStaff() {
        // Retrieve data from the text fields
        String staffId = tfStaffid.getText();
        String name = tfName.getText();
        String phone = tfPhone.getText();
        String email = tfEmail.getText();
        String password = tfPassword.getText();

        // Check if any field is empty (optional validation)
        if (staffId.isEmpty() || name.isEmpty() || phone.isEmpty() || email.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill all fields before creating a record.");
            return;
        }

        // Prepare the data to be appended to the file (format as needed)
        String newRecord = staffId + "," + name + "," + phone + "," + email + "," + password + "\n";

        // Append the data to the file
        try (FileWriter writer = new FileWriter("src\\oodjassignment\\database\\Scheduler.txt", true)) {
            writer.write(newRecord);
            JOptionPane.showMessageDialog(this, "Record created successfully.");
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "An error occurred while writing to the file.");
        }

        // Optional: Clear the text fields
        clearTextFields();

        // Optional: Refresh the JTable to show the new data
        showDataFromFile("src\\oodjassignment\\database\\Scheduler.txt");
    }

    private void updateStaff() {
        int selectedRow = jTable.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a staff to do changes.");
            return;
        }

        String staffId = tfStaffid.getText();
        String name = tfName.getText();
        String phone = tfPhone.getText();
        String email = tfEmail.getText();
        String password = tfPassword.getText();

        if (staffId.isEmpty() || name.isEmpty() || phone.isEmpty() || email.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill all fields before updating.");
            return;
        }
        String updatedData = updateDataInFile(selectedRow, staffId, name, phone, email, password);
        // Update the table model with the new data
        DefaultTableModel model = (DefaultTableModel) jTable.getModel();
        model.setValueAt(staffId, selectedRow, 0);
        model.setValueAt(name, selectedRow, 1);
        model.setValueAt(phone, selectedRow, 2);
        model.setValueAt(email, selectedRow, 3);
        model.setValueAt(password, selectedRow, 4);

        JOptionPane.showMessageDialog(this, "Staff record updated successfully.");
    }

    private String updateDataInFile(int selectedRow, String staffId, String name, String phone, String email, String password) {
        String updatedLine = staffId + "," + name + "," + phone + "," + email + "," + password + "\n";
        StringBuilder updatedFileContent = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader("src\\oodjassignment\\database\\Scheduler.txt"))) {
            String line;
            int lineCount = 0;
            while ((line = br.readLine()) != null) {
                if (lineCount == selectedRow) {
                    updatedFileContent.append(updatedLine);
                } else {
                    updatedFileContent.append(line).append("\n");
                }
                lineCount++;
            }
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "An error occurred while reading the file.");
        }
        try (FileWriter writer = new FileWriter("src\\oodjassignment\\database\\Scheduler.txt")) {
            writer.write(updatedFileContent.toString());
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "An error occurred while writing to the file.");
        }
        return updatedLine;
    }

    private void deleteStaff() {
        int selectedRow = jTable.getSelectedRow();

        // Check if a row is selected
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a staff to delete.");
            return;
        }

        int confirmation = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this staff?", "Confirmation", JOptionPane.YES_NO_OPTION);
        if (confirmation == JOptionPane.YES_OPTION) {
            // Remove the selected row from the file
            String updatedFileContent = removeLineFromFile(selectedRow);

            // Update the table model
            DefaultTableModel model = (DefaultTableModel) jTable.getModel();
            model.removeRow(selectedRow);

            JOptionPane.showMessageDialog(this,"Staff record deleted successfully.");
        }
    }

    private String removeLineFromFile(int selectedRow) {
        StringBuilder updatedFileContent = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader("src\\oodjassignment\\database\\Scheduler.txt"))) {
            String line;
            int lineCount = 0;
            while ((line = br.readLine()) != null) {
                if (lineCount != selectedRow) {
                    updatedFileContent.append(line).append("\n");
                }
                lineCount++;
            }
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "An error occurred while reading the file.");
        }

        try (FileWriter writer = new FileWriter("src\\oodjassignment\\database\\Scheduler.txt")) {
            writer.write(updatedFileContent.toString());
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "An error occurred while writing to the file.");
        }

        return updatedFileContent.toString();
    }


    private void clearTextFields() {
        tfStaffid.setText("");
        tfName.setText("");
        tfPhone.setText("");
        tfEmail.setText("");
        tfPassword.setText("");
    }

    private void showDataFromFile(String filePath) {
        DefaultTableModel model = (DefaultTableModel) jTable.getModel();
        model.setRowCount(0);
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                model.addRow(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
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

        btSearch = new javax.swing.JButton();
        btCreate = new javax.swing.JButton();
        btUpdate = new javax.swing.JButton();
        btDelete = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        tfPassword = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfName = new javax.swing.JTextField();
        tfStaffid = new javax.swing.JTextField();
        tfPhone = new javax.swing.JTextField();
        tfEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btClear = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btSearch.setBackground(new java.awt.Color(235, 235, 235));
        btSearch.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btSearch.setForeground(new java.awt.Color(0, 0, 0));
        btSearch.setText("SEARCH");
        getContentPane().add(btSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 170, 35));

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

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("SCHEDULER MANAGEMENT");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, -1, -1));

        jPanel2.setBackground(new java.awt.Color(0, 137, 248));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("EMAIL:");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("NAME:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("PHONE:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("PASSWORD:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("STAFF ID:");

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(tfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btClear, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tfStaffid, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tfName, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(90, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfStaffid, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btClear, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -1, 250, 580));

        jTable.setAutoCreateRowSorter(true);
        jTable.setBackground(new java.awt.Color(0, 137, 248));
        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STAFF ID", "NAME", "PHONE", "EMAIL", "PASSWORD"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
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

    private void btClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btClearActionPerformed
        clearTextFields();
    }//GEN-LAST:event_btClearActionPerformed

    private void btCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCreateActionPerformed
        createStaff();
    }//GEN-LAST:event_btCreateActionPerformed

    private void btUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUpdateActionPerformed
        updateStaff();
    }//GEN-LAST:event_btUpdateActionPerformed

    private void btDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeleteActionPerformed
        deleteStaff();
    }//GEN-LAST:event_btDeleteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SchedulerStaffManagement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btClear;
    private javax.swing.JButton btCreate;
    private javax.swing.JButton btDelete;
    private javax.swing.JButton btSearch;
    private javax.swing.JButton btUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfName;
    private javax.swing.JTextField tfPassword;
    private javax.swing.JTextField tfPhone;
    private javax.swing.JTextField tfStaffid;
    // End of variables declaration//GEN-END:variables
}
