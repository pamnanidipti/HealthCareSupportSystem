/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Doctor;

import Business.Person.Person;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Pamnani
 */
public class Doctor extends Person{
  
    private int doctorID;
    private static int count=0;

    public Doctor() {
        count++;
        doctorID=count;
  }

    
    
    public int getDoctorID() {
        return doctorID;
    }
    

    @Override
    public String toString()
    {
        return this.getPersonName();
        
    }
    
}
