/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

/**
 *
 * @author Pamnani
 */
public class DoctorReport {
    private String disease;
    private String medicine;

    public DoctorReport() {
        disease = "";
        medicine = "";
    }
    
    
    public void add(String disease, String medicine)
    {
        DoctorReport docreport = new DoctorReport();
        docreport.setDisease(disease);
        docreport.setMedicine(medicine);
        //return;
    }
    
    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public String getMedicine() {
        return medicine;
    }

    public void setMedicine(String medicine) {
        this.medicine = medicine;
    }
    
    
    
}
