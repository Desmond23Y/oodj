
package oodjassignment.manager;

public class Booking {
    private String bookingID;
    private String userID;
    private String venue;
    private String hall;
    private String price;
    private String date;
    private String time;
    private String duration;
    private String status;
    private String remarks;

    // Constructor
    public Booking(String bookingID, String userID, String venue, String hall, String price, String date, String time, String duration, String status, String remarks) {
        this.bookingID = bookingID;
        this.userID = userID;
        this.venue = venue;
        this.hall = hall;
        this.price = price;
        this.date = date;
        this.time = time;
        this.duration = duration;
        this.status = status;
        this.remarks = remarks;
    }

    // Getters and Setters
    // (Include getters and setters for all fields)
}