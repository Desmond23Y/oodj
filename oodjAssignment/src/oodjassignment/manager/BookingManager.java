package oodjassignment.manager;

import java.io.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;

public class BookingManager {
    private List<Booking> bookings;

    public BookingManager() {
        bookings = new ArrayList<>();
        loadBookings("src/oodjassignment/database/Booking.txt");
    }

    private void loadBookings(String filePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split("/");
                if (data.length == 10) {
                    Booking booking = new Booking(data[0], data[1], data[2], data[3], data[4], data[5], data[6], data[7], data[8], data[9]);
                    bookings.add(booking);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Booking> filterBookings(List<String> dateList) {
        List<Booking> filteredBookings = new ArrayList<>();
        for (Booking booking : bookings) {
            if (dateList.contains(booking.getDate())) {
                filteredBookings.add(booking);
            }
        }
        return filteredBookings;
    }

    public void displayBookings(List<Booking> filteredBookings, javax.swing.JTable table) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0); // Clear existing data

        for (Booking booking : filteredBookings) {
            model.addRow(new Object[]{
                booking.getBookingID(), 
                booking.getUserID(), 
                booking.getVenue(), 
                booking.getHall(), 
                booking.getPrice(), 
                booking.getDate(), 
                booking.getTime(), 
                booking.getDuration(), 
                booking.getStatus(), 
                booking.getInitials()
            });
        }
    }
}
