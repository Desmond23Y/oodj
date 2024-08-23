package oodjassignment.admin;

import oodjassignment.Person;

public class Scheduler extends Person {
    private String password;

    // Constructor to initialize all fields
    public Scheduler(String staffId, String name, String phone, String email, String password) {
        super(staffId, name, phone, email);
        this.password = password;
    }

    // Getter for password
    public String getPassword() {
        return password;
    }

    // Setter for password
    public void setPassword(String password) {
        this.password = password;
    }

    // toString method to provide a string representation of the User object
    @Override
    public String toString() {
        return super.toString() + "," + password;
    }
}