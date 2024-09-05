package oodjassignment.admin;

import oodjassignment.Person;

public class Admin extends Person {
    private String password;

    public Admin(String adminId, String name, String phone, String email, String password) {
        super(adminId, name, phone, email);
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return super.toString() + "," + password;
    }
}