package oodjassignment.admin;

import oodjassignment.Person;

public class User extends Person {
    private String password;

    public User(String userId, String name, String phone, String email, String password) {
        super(userId, name, phone, email);
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
