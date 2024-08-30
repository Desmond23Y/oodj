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
            case "DATE":
                return 3;
            case "TIME":
                return 4;
            case "EVENT INFORMATION":
                return 5;
            default:
                return -1;  // Should not happen
        }
    }

    public static void showDataFromFile(String filePath, DefaultTableModel upcomingModel, DefaultTableModel pastModel) {
        // Date format: 01-Jul-2024
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd MMM yyyy", Locale.ENGLISH);
        // Time format: 5pm
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("ha");

        // Current date and time
        LocalDateTime now = LocalDateTime.now();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                String bookingDate = data[3];
                String bookingTime = data[4];

                try {
                    // Split the time range and use the start time
                    String startTime = bookingTime.split("-")[0].trim();

                    // Parse the booking date and start time separately
                    LocalDateTime bookingDateTime = LocalDateTime.of(
                            LocalDate.parse(bookingDate, dateFormatter),
                            LocalTime.parse(startTime, timeFormatter)
                    );

                    // Compare the booking date and time with the current date and time
                    if (bookingDateTime.isAfter(now)) {
                        // Future booking, add to upcoming bookings table
                        upcomingModel.addRow(data);
                    } else {
                        // Past booking, add to past bookings table
                        pastModel.addRow(data);
                    }
                } catch (DateTimeParseException e) {
                    System.err.println("Error parsing date/time for booking: " + data[0]);
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
