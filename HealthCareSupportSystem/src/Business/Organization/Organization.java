/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.AirQuality.AirQualityHistory;
import Business.Patient.PatientDirectory;
import Business.Person.PersonDirectory;
import Business.Pharmacy.DrugCatalog;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author Pamnani
 */
public abstract class Organization {
    
    private String name;
    private WorkQueue workQueue;
    //private EmployeeDirectory employeeDirectory;
    private PatientDirectory patientDirectory;
    private PersonDirectory personDirectory;
    private UserAccountDirectory userAccountDirectory;
    private AirQualityHistory airQualityHistory;
    private int organizationID;
    private static int counter;
    private DrugCatalog drugCatalog;
    private ArrayList<String> notificationList;
    
    public enum Type{
        Admin("Admin"), Doctor("Doctor"),Receptionist("Receptionist"),
        Nurse("Nurse"),Patient("Patient"),Pharmacy("Pharmacy"),
        EnvQualityCheck("EnvQualityCheck"),Mayor("Mayor");
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }
    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        //employeeDirectory = new EmployeeDirectory();
        patientDirectory =  new PatientDirectory();
        personDirectory = new PersonDirectory();
        airQualityHistory =  new AirQualityHistory();
        userAccountDirectory = new UserAccountDirectory();
        drugCatalog =  new DrugCatalog();
        notificationList = new ArrayList();
        organizationID = counter;
        ++counter;
    }

    public abstract ArrayList<Role> getSupportedRole();

    public ArrayList<String> getNotificationList() {
        return notificationList;
    }

    public void setNotificationList(ArrayList<String> notificationList) {
        this.notificationList = notificationList;
    }
    public AirQualityHistory getAirQualityHistory() {
        return airQualityHistory;
    }

    public void setAirQualityHistory(AirQualityHistory airQualityHistory) {
        this.airQualityHistory = airQualityHistory;
    }
    
    public DrugCatalog getDrugCatalog() {
        return drugCatalog;
    }

    public void setDrugCatalog(DrugCatalog drugCatalog) {
        this.drugCatalog = drugCatalog;
    }
    
    public PatientDirectory getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(PatientDirectory patientDirectory) {
        this.patientDirectory = patientDirectory;
    }
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public PersonDirectory getPersonDirectory() {
        return personDirectory;
    }

    public void setPersonDirectory(PersonDirectory personDirectory) {
        this.personDirectory = personDirectory;
    }
    
    @Override
    public String toString() {
        return name;
    }
}
