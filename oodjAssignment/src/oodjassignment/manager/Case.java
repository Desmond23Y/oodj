
package oodjassignment.manager;

public class Case {
    private String caseId;
    private String response;

    public Case(String caseId, String response) {
        this.caseId = caseId;
        this.response = response;
    }

    public void setResponse(String response) {
        this.response = response;
    }
    
    public void setCaseId(String caseId) {
        this.caseId = caseId;
    }
    
    public String getResponse() {
        return response;
    }

    public String getCaseId() {
        return caseId;
    }
}
