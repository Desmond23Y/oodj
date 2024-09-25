
package oodjassignment.manager;
        
public class Feedback {
    private String caseId;
    private String customerId;
    private String hallType;
    private String hallNumber;
    private String date;
    private String feedback;
    private String assignedStaff;
    private String status;

    // CONSTRUCTOR -------------------------------------------------------------
    public Feedback(String caseId, String customerId, String hallType, String hallNumber, String date, String feedback, String assignedStaff, String status) {
        this.caseId = caseId;
        this.customerId = customerId;
        this.hallType = hallType;
        this.hallNumber = hallNumber;
        this.date = date;
        this.feedback = feedback;
        this.assignedStaff = assignedStaff;
        this.status = status;
    }

    // GETTERS -----------------------------------------------------------------
    public String getCaseId() { return caseId; }
    public String getCustomerId() { return customerId; }
    public String getHallType() { return hallType; }
    public String getHallNumber() { return hallNumber; }
    public String getDate() { return date; }
    public String getFeedback() { return feedback; }
    public String getAssignedStaff() { return assignedStaff; }
    public String getStatus() { return status; }
}
