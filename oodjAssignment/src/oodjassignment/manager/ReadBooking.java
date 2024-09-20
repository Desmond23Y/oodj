
package oodjassignment.manager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadBooking {
    private List<Booking> bookings;

    // Constructor
    public ReadBooking(String filePath) {
        bookings = new ArrayList<>();
        readBookingsFromFile(filePath);
    }

    // Method to read bookings from file
    private void readBookingsFromFile(String filePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split("/");
                Booking booking = new Booking(data[0], data[1], data[2], data[3], data[4], data[5], data[6], data[7], data[8], data[9]);
                bookings.add(booking);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to get bookings
    public List<Booking> getBookings() {
        return bookings;
    }
}