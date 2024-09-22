
package oodjassignment.manager;

import javax.swing.JLabel;

public class managerIssueView {
    private JLabel lbl_showCaseId;
    private JLabel lbl_showCaseStatus;
    private JLabel lbl_showCustomerID;
    private JLabel lbl_showDate;
    private JLabel lbl_showDescription;
    private JLabel lbl_showHallNumber;
    private JLabel lbl_showHallType;
    private JLabel lbl_showStaff;

    public managerIssueView(JLabel lbl_showCaseId, JLabel lbl_showCaseStatus, JLabel lbl_showCustomerID, JLabel lbl_showDate, JLabel lbl_showDescription, JLabel lbl_showHallNumber, JLabel lbl_showHallType, JLabel lbl_showStaff) {
        this.lbl_showCaseId = lbl_showCaseId;
        this.lbl_showCaseStatus = lbl_showCaseStatus;
        this.lbl_showCustomerID = lbl_showCustomerID;
        this.lbl_showDate = lbl_showDate;
        this.lbl_showDescription = lbl_showDescription;
        this.lbl_showHallNumber = lbl_showHallNumber;
        this.lbl_showHallType = lbl_showHallType;
        this.lbl_showStaff = lbl_showStaff;
    }

    public void displayData(String[] data) {
        lbl_showCaseId.setText(data[0]);
        lbl_showCustomerID.setText(data[1]);
        lbl_showHallType.setText(data[2]);
        lbl_showHallNumber.setText(data[3]);
        lbl_showDate.setText(data[4]);
        lbl_showDescription.setText(data[5]);
        lbl_showStaff.setText(data[6]);
        lbl_showCaseStatus.setText(data[7]);
    }
}
