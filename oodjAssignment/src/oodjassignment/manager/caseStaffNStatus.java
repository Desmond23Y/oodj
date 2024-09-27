
package oodjassignment.manager;

public class caseStaffNStatus {
    private String caseId;
    private String cusId;
    private String hallType;
    private String hallNumber;
    private String date;
    private String description;
    private String staffId;
    private String status;
    private String managerResponse;
    private String StuffResponse;
    //C0004,U0010,Meeting Room,ROOM 1,2024-09-26,Aircond malfunction,S0004,No,-

    public caseStaffNStatus(String caseId, String cusId, String hallType, String hallNumber, String date, String description, String staffId, String status, String managerResponse, String StuffResponse) {
        this.caseId = caseId;
        this.cusId = cusId;
        this.hallType = hallType;
        this.hallNumber = hallNumber;
        this.date = date;
        this.description = description;
        this.staffId = staffId;
        this.status = status;
        this.managerResponse = managerResponse;
        this.StuffResponse = StuffResponse;
    }

    public String getCaseId() {
        return caseId;
    }

    public String getCusId() {
        return cusId;
    }

    public String getHallType() {
        return hallType;
    }

    public String getHallNumber() {
        return hallNumber;
    }

    public String getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public String getStaffId() {
        return staffId;
    }

    public String getStatus() {
        return status;
    }

    public String getManagerResponse() {
        return managerResponse;
    }

    public String getStuffResponse() {
        return StuffResponse;
    }

    public void setCaseId(String caseId) {
        this.caseId = caseId;
    }

    public void setCusId(String cusId) {
        this.cusId = cusId;
    }

    public void setHallType(String hallType) {
        this.hallType = hallType;
    }

    public void setHallNumber(String hallNumber) {
        this.hallNumber = hallNumber;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setManagerResponse(String managerResponse) {
        this.managerResponse = managerResponse;
    }

    public void setStuffResponse(String StuffResponse) {
        this.StuffResponse = StuffResponse;
    }
}