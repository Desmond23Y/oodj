package oodjassignment.scheduler;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

// Base class containing common scheduling functionalities
class BaseSchedule {
    protected static final String DATE_FORMAT = "dd MMMM yyyy"; // Correct date format

    // Method: Validate date format
    protected boolean isValidDate(String dateStr) {
        SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT, Locale.ENGLISH);
        sdf.setLenient(false);
        try {
            sdf.parse(dateStr);
            return true; // Date format is valid
        } catch (ParseException e) {
            return false; // Date format is invalid
        }
    }

    // Method: Check if a string is numeric
    protected boolean isNumeric(String str) {
        return str.matches("\\d+"); // Match one or more digits
    }
}

// Scheduling management class inheriting from BaseSchedule
public class MTable extends BaseSchedule {

    // Add schedule record
    public void addScheduleRecord(JComboBox<String> hallType, JComboBox<String> hallNo, JTextField startDate, JTextField endDate, JTextField time, JTextField duration, JTextField review, JTable maintenance) {
        // Check for empty fields
        if (startDate.getText().equals("") || endDate.getText().equals("") || time.getText().equals("") || duration.getText().equals("") || review.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please fill in all fields!");
            return;
        }

        // Validate date format
        if (!isValidDate(startDate.getText()) || !isValidDate(endDate.getText())) {
            JOptionPane.showMessageDialog(null, "Please enter the date in the format: " + DATE_FORMAT);
            return;
        }

        // Process duration
        String durationText = duration.getText().trim();
        if (isNumeric(durationText)) {
            durationText += " hours"; // If input is numeric, append "hours"
        } else if (!durationText.endsWith(" hours")) {
            durationText += " hours"; // If not, append "hours"
        }

        // Add data to table model
        DefaultTableModel model = (DefaultTableModel) maintenance.getModel();
        String[] record = {
            (String) hallType.getSelectedItem(),
            (String) hallNo.getSelectedItem(),
            startDate.getText(),
            endDate.getText(),
            time.getText(),
            durationText, // Use processed duration
            review.getText()
        };
        model.addRow(record);

        // Write data to file
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("src/oodjassignment/database/Schedule_maintenance.txt", true))) {
            String rec = (String) hallType.getSelectedItem() + "/" + (String) hallNo.getSelectedItem() + "/" + startDate.getText() + "/" + endDate.getText() + "/" + time.getText() + "/" + durationText + "/" + review.getText();
            bw.write(rec + "\n");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "An error occurred: " + ex.getMessage());
        }
    }

    // Edit selected row data
    public void editSelectedRowData(JComboBox<String> hallType, JComboBox<String> hallNo, JTextField startDate, JTextField endDate, JTextField time, JTextField duration, JTextField review, JTable maintenance) {
        DefaultTableModel model = (DefaultTableModel) maintenance.getModel();

        // Check if a row is selected
        int selectedRow = maintenance.getSelectedRow();
        if (selectedRow == -1) {
            return;  // No row selected
        }

        // Set form fields' values
        hallType.setSelectedItem(model.getValueAt(selectedRow, 0).toString());
        hallNo.setSelectedItem(model.getValueAt(selectedRow, 1).toString());
        startDate.setText(model.getValueAt(selectedRow, 2).toString());
        endDate.setText(model.getValueAt(selectedRow, 3).toString());
        time.setText(model.getValueAt(selectedRow, 4).toString());
        duration.setText(model.getValueAt(selectedRow, 5).toString());
        review.setText(model.getValueAt(selectedRow, 6).toString());
    }

    // Update schedule record
    public void updateScheduleRecord(JComboBox<String> hallType, JComboBox<String> hallNo, JTextField startDate, JTextField endDate, JTextField time, JTextField duration, JTextField review, JTable maintenance) {
        DefaultTableModel model = (DefaultTableModel) maintenance.getModel();

        // Get selected row index
        int selectedRow = maintenance.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "Please select a row to update.");
            return;
        }

        // Update new data in the table model
        model.setValueAt(hallType.getSelectedItem(), selectedRow, 0);
        model.setValueAt(hallNo.getSelectedItem(), selectedRow, 1);
        model.setValueAt(startDate.getText(), selectedRow, 2);
        model.setValueAt(endDate.getText(), selectedRow, 3);
        model.setValueAt(time.getText(), selectedRow, 4);
        model.setValueAt(duration.getText(), selectedRow, 5);
        model.setValueAt(review.getText(), selectedRow, 6);

        // Write updated table data to file
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("src/oodjassignment/database/Schedule_maintenance.txt"))) {
            for (int i = 0; i < model.getRowCount(); i++) {
                String rec = model.getValueAt(i, 0).toString() + "/" +
                             model.getValueAt(i, 1).toString() + "/" +
                             model.getValueAt(i, 2).toString() + "/" +
                             model.getValueAt(i, 3).toString() + "/" +
                             model.getValueAt(i, 4).toString() + "/" +
                             model.getValueAt(i, 5).toString() + "/" +
                             model.getValueAt(i, 6).toString();
                bw.write(rec + "\n");
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "An error occurred: " + ex.getMessage());
        }
    }

    // Remove schedule record
    public void removeScheduleRecord(JTable maintenance) {
        DefaultTableModel model = (DefaultTableModel) maintenance.getModel();

        // Get selected row index
        int selectedRow = maintenance.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "Please select a row to delete.");
            return;
        }

        // Remove selected row
        model.removeRow(selectedRow);

        // Write updated table data to file
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("src/oodjassignment/database/Schedule_maintenance.txt"))) {
            for (int i = 0; i < model.getRowCount(); i++) {
                String rec = model.getValueAt(i, 0).toString() + "/" +
                             model.getValueAt(i, 1).toString() + "/" +
                             model.getValueAt(i, 2).toString() + "/" +
                             model.getValueAt(i, 3).toString() + "/" +
                             model.getValueAt(i, 4).toString() + "/" +
                             model.getValueAt(i, 5).toString() + "/" +
                             model.getValueAt(i, 6).toString();
                bw.write(rec + "\n");
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "An error occurred: " + ex.getMessage());
        }
    }
}
