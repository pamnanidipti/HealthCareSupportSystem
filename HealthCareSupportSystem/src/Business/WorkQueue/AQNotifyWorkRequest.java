/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.Date;

/**
 *
 * @author Pamnani
 */
public class AQNotifyWorkRequest extends WorkRequest {
    
    private Date trackedOn;

    public Date getTrackedOn() {
        return trackedOn;
    }

    public void setTrackedOn(Date trackedOn) {
        this.trackedOn = trackedOn;
    }
    
    
    
}
