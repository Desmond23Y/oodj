package oodjassignment.admin;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import javax.swing.table.DefaultTableModel;

public class adminClass {

    private DefaultTableModel upcomingModel;
    private DefaultTableModel pastModel;

    public adminClass(DefaultTableModel upcomingModel, DefaultTableModel pastModel) {
        this.upcomingModel = upcomingModel;
        this.pastModel = pastModel;
    }

    public void showDataFromFile(String filePath) {
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("ha");
        LocalDateTime now = LocalDateTime.now();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                String bookingDate = data[3];
                String bookingTime = data[4];

                try {
                    LocalDateTime bookingDateTime = LocalDateTime.of(
                            LocalDate.parse(bookingDate, dateFormatter),
                            LocalTime.parse(bookingTime, timeFormatter)
                    );

                    if (bookingDateTime.isAfter(now)) {
                        upcomingModel.addRow(data);
                    } else {
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
}

