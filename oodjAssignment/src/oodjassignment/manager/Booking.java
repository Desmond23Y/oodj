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
    private String initials;

    // Constructor
    public Booking(String bookingID, String userID, String venue, String hall, String price, String date, String time, String duration, String status, String initials) {
        this.bookingID = bookingID;
        this.userID = userID;
        this.venue = venue;
        this.hall = hall;
        this.price = price;
        this.date = date;
        this.time = time;
        this.duration = duration;
        this.status = status;
        this.initials = initials;
    }

    // Getters
    public String getBookingID() { return bookingID; }
    public String getUserID() { return userID; }
    public String getVenue() { return venue; }
    public String getHall() { return hall; }
    public String getPrice() { return price; }
    public String getDate() { return date; }
    public String getTime() { return time; }
    public String getDuration() { return duration; }
    public String getStatus() { return status; }
    public String getInitials() { return initials; }
}
