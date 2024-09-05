package oodjassignment.admin;

import oodjassignment.Person;

public class Manager extends Person {
    private String password;

    public Manager(String managerId, String name, String phone, String email, String password) {
        super(managerId, name, phone, email);
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
