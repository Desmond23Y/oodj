package oodjassignment.user;

import javax.swing.JTextField;

public interface Updatable {
    void updateBookingAndSchedule(JTextField type, JTextField hall);
    void updatePendingFile(JTextField type, JTextField hall);
}
