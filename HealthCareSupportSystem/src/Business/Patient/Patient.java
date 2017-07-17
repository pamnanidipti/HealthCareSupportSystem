/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

import Business.Person.Person;
import java.util.ArrayList;

/**
 *
 * @author Pamnani
 */
public class Patient extends Person {
    
    private int patientID;
    private String healthStatus;
    //private String primaryDoctorName;
    private VitalSignHistory vitalSignHistory;
    private ArrayList<String> notificationList;
    private DoctorReport docReport;
    //private String[] notificationList;
    private int count=0;
    
    public Patient() {
        this.vitalSignHistory = new VitalSignHistory();
        this.docReport = new DoctorReport();
        count++;
        patientID=count;
        notificationList = new ArrayList();
    }

    public int getPatientID() {
        return patientID;
    }

    public DoctorReport getDocReport() {
        return docReport;
    }

    public void setDocReport(DoctorReport docReport) {
        this.docReport = docReport;
    }
    
    public String getHealthStatus() {
        return healthStatus;
    }

    public void setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
    }
    
    public ArrayList<String> getNotificationList() {
        return notificationList;
    }

    public void setNotificationList(ArrayList<String> notificationList) {
        this.notificationList = notificationList;
    }
    
//    public String getPrimaryDoctorName() {
//        return primaryDoctorName;
//    }
//
//    public void setPrimaryDoctorName(String primaryDoctorName) {
//        this.primaryDoctorName = primaryDoctorName;
//    }

    public VitalSignHistory getVitalSignHistory() {
        return vitalSignHistory;
    }

    public void setVitalSignHistory(VitalSignHistory vitalSignHistory) {
        this.vitalSignHistory = vitalSignHistory;
    }
    
    @Override
    public String toString()
    {
        return this.getPersonName();
    }
    
}
