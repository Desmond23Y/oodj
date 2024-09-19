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
    // Date format: 23 May 2024
    DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd MMM yyyy", Locale.ENGLISH);

    // Time format for parsing: 10:00 AM
    DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("h:mm a", Locale.ENGLISH);

    // Current date and time
    LocalDateTime now = LocalDateTime.now();

    try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
        String line;
        while ((line = br.readLine()) != null) {
            String[] data = line.split("/");

            // Debugging: Print out the raw data
            System.out.println("Raw Data: " + String.join(" | ", data));

            // Check if status is "Booked" before processing
            String status = data[8].trim();
            if (!"Booked".equalsIgnoreCase(status)) {
                continue; // Skip if status is not "Booked"
            }

            String bookingDate = data[5];
            String bookingTime = data[6];

            try {
                // Extract start time from the time range
                String startTime = bookingTime.split(" - ")[0].trim().toLowerCase();

                // Normalize time format to 12-hour clock
                String normalizedTime = startTime.replaceAll("([0-9]{1,2})(am|pm)", "$1:00 $2").toUpperCase();

                // Debugging: Print out the time being parsed
                System.out.println("Time to parse: " + normalizedTime);

                // Parse the time string into LocalTime
                LocalTime startLocalTime = LocalTime.parse(normalizedTime, timeFormatter);

                // Convert LocalTime to LocalDateTime for comparison
                LocalDateTime bookingDateTime = LocalDateTime.of(
                        LocalDate.parse(bookingDate, dateFormatter),
                        startLocalTime
                );

                // Create a new array excluding the "Status" column
                String[] displayData = new String[9];
                System.arraycopy(data, 0, displayData, 0, 8);  // Copy everything except the status column
                displayData[8] = data[9];
                // Compare the booking date and time with the current date and time
                if (bookingDateTime.isAfter(now)) {
                    // Future booking, add to upcoming bookings table
                    upcomingModel.addRow(displayData);
                } else {
                    // Past booking, add to past bookings table
                    pastModel.addRow(displayData);
                }
            } catch (DateTimeParseException e) {
                System.err.println("Error parsing date/time for booking: " + data[0] + " Time: " + bookingTime);
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
