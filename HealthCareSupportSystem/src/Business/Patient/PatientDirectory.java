/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

import java.util.ArrayList;

/**
 *
 * @author Pamnani
 */
public class PatientDirectory {
    private ArrayList<Patient> patientDirectory;

    public PatientDirectory() {
        patientDirectory = new ArrayList<>();
    }

    public ArrayList<Patient> getPatientHistory() {
        return patientDirectory;
    }

    public void setPatientHistory(ArrayList<Patient> patientHistory) {
        this.patientDirectory = patientHistory;
    }

    public Patient createAndAddPatient(String name) {
        Patient patient = new Patient();
        patient.setPersonName(name);
        patient.setHealthStatus("Admitted");
        patientDirectory.add(patient);
        return patient;
    }

    public void deletePatient(Patient patient) {
        patientDirectory.remove(patient);
    }
    
    public ArrayList<Patient> searchPatient(String key)
    {
        ArrayList<Patient> searchPatientDirectory = new ArrayList();
        for(Patient patient: patientDirectory)
        {
            if(patient.getPersonName().toLowerCase().startsWith(key.toLowerCase()))
            {
                searchPatientDirectory.add(patient);
            }
        }
        return searchPatientDirectory;
    }
    
}
