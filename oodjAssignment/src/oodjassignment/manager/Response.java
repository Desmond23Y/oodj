
package oodjassignment.manager;

public class Response {
    private String caseId;
    private String response;

    public Response(String caseId, String response) {
        this.caseId = caseId;
        this.response = response;
    }

    public String getCaseId() {
        return caseId;
    }

    public String getResponse() {
        return response;
    }

    public void setCaseId(String caseId) {
        this.caseId = caseId;
    }

    public void setResponse(String response) {
        this.response = response;
    }
}
