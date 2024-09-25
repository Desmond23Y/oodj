
package oodjassignment.manager;

public class Case {
    private String caseId;
    private String response;
    
    // CONSTRUCTOR -------------------------------------------------------------
    public Case(String caseId, String response) {
        this.caseId = caseId;
        this.response = response;
    }
    
    // SETTERS -----------------------------------------------------------------
    public void setResponse(String response) { this.response = response; }
    public void setCaseId(String caseId) { this.caseId = caseId; }
    
    // GETTERS -----------------------------------------------------------------
    public String getResponse() { return response; }
    public String getCaseId() { return caseId; }
}