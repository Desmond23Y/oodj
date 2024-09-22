package oodjassignment.manager;

public class Booking {
    private String bookingID;
    private String customerID;
    private String hallType;
    private String hallID;
    private String price;
    private String date;
    private String time;
    private String duration;
    private String status;
    private String remark;

    // Constructor
    public Booking(String bookingID, String customerID, String hallType, String hallID, String price, String date, String time, String duration, String status, String remark) {
        this.bookingID = bookingID;
        this.customerID = customerID;
        this.hallType = hallType;
        this.hallID = hallID;
        this.price = price;
        this.date = date;
        this.time = time;
        this.duration = duration;
        this.status = status;
        this.remark = remark;
    }

    // Getters
    public String getBookingID() { return bookingID; }
    public String getCustomerID() { return customerID; }
    public String getHallType() { return hallType; }
    public String getHallID() { return hallID; }
    public String getPrice() { return price; }
    public String getDate() { return date; }
    public String getTime() { return time; }
    public String getDuration() { return duration; }
    public String getStatus() { return status; }
    public String getRemark() { return remark; }
}