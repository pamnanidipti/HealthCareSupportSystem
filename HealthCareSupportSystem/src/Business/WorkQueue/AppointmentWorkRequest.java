/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author Pamnani
 */
public class AppointmentWorkRequest extends WorkRequest{
    
    private String requestedTime;
    private String examinedStatus;

    public AppointmentWorkRequest() {
        examinedStatus = "Pending";
    }

    public String getExaminedStatus() {
        return examinedStatus;
    }

    public void setExaminedStatus(String examinedStatus) {
        this.examinedStatus = examinedStatus;
    }

    public String getRequestedTime() {
        return requestedTime;
    }

    public void setRequestedTime(String requestedTime) {
        this.requestedTime = requestedTime;
    }

    
    
}
