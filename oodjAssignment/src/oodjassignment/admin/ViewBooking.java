package oodjassignment.admin;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Locale;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import java.util.regex.PatternSyntaxException;

public class ViewBooking {

    public static int getColumnIndex(String selectedColumn) {
        switch (selectedColumn) {
            case "BOOKING ID":
                return 0;
            case "CUSTOMER NAME":
                return 1;
            case "HALL TYPE":
                return 2;
            case "HALL NO":
                return 3;
            case "PRICE":
                return 4;
            case "DATE":
                return 5;
            case "TIME":
                return 6;
            case "DURATION":
                return 7;
            case "EVENT INFORMATION":
                return 8;
            default:
                return -1;  // Should not happen
        }
    }

    public static void showDataFromFile(String filePath, DefaultTableModel upcomingModel, DefaultTableModel pastModel) {
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("d MMM yyyy", Locale.ENGLISH);
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("h:mm a", Locale.ENGLISH);
        LocalDateTime now = LocalDateTime.now();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split("/");
                String status = data[8].trim();
                if (!"Booked".equalsIgnoreCase(status)) {
                    continue;
                }
                String bookingDate = data[5];
                String bookingTime = data[6];
                try {
                    String startTime = bookingTime.split(" - ")[0].trim().toLowerCase();
                    String normalizedTime = startTime.replaceAll("([0-9]{1,2})(am|pm)", "$1:00 $2").toUpperCase();
                    LocalTime startLocalTime = LocalTime.parse(normalizedTime, timeFormatter);
                    LocalDateTime bookingDateTime = LocalDateTime.of(
                            LocalDate.parse(bookingDate, dateFormatter),
                            startLocalTime
                    );
                    String[] displayData = new String[9];
                    System.arraycopy(data, 0, displayData, 0, 8);
                    displayData[8] = data[9];
                    if (bookingDateTime.isAfter(now)) {
                        upcomingModel.addRow(displayData);
                    } else {
                        pastModel.addRow(displayData);
                    }
                } catch (DateTimeParseException e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    
    public static void applyFilter(TableRowSorter<DefaultTableModel> upcomingRowSorter, TableRowSorter<DefaultTableModel> pastRowSorter, String searchText, int columnIndex) {
        if (searchText.length() == 0) {
            upcomingRowSorter.setRowFilter(null);
            pastRowSorter.setRowFilter(null);
        } else if (columnIndex != -1) { // Ensure the selected column is valid
            try {
                RowFilter<DefaultTableModel, Object> filter = RowFilter.regexFilter("(?i)" + searchText, columnIndex);
                upcomingRowSorter.setRowFilter(filter);
                pastRowSorter.setRowFilter(filter);
            } catch (PatternSyntaxException e) {
                System.err.println("Invalid regex pattern: " + searchText);
            }
        }
    }
}
