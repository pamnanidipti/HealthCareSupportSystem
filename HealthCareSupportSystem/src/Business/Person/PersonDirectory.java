/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Person;

import Business.Doctor.Doctor;
import Business.Organization.DoctorOrganization;
import Business.Organization.NurseOrganization;
import Business.Organization.Organization;
import static Business.Organization.Organization.Type.Nurse;
import java.util.ArrayList;

/**
 *
 * @author Pamnani
 */
public class PersonDirectory {
    private ArrayList<Person> personDirectory;

    public PersonDirectory() {
        personDirectory = new ArrayList<>();
    }

    public ArrayList<Person> getPersonHistory() {
        return personDirectory;
    }

    public void setPersonHistory(ArrayList<Person> personHistory) {
        this.personDirectory = personHistory;
    }
    public Person createAndAddPerson(String name) {
        Person person = new Person();
        
        person.setPersonName(name);
        personDirectory.add(person);
        return person;
    }

    public void createAndAddPerson(Organization organization,String name) {
        Person person = new Person();
        if(organization instanceof DoctorOrganization)
        {
            Doctor doctor=new Doctor();
            doctor.setPersonName(name);
            personDirectory.add(doctor);
        }
        else
        {
            person.setPersonName(name);
            personDirectory.add(person);
        }
        /*if(organization instanceof NurseOrganization)
        {
            Nurse nurse=new Nurse();
            doctor.setPersonName(name);
            personDirectory.add(doctor);
        }*/
        /*person.setPersonName(name);
        personDirectory.add(person);
        return person;*/
    }

    public void deletePerson(Person person) {
        personDirectory.remove(person);
    }
    
    public ArrayList<Person> searchPerson(String key)
    {
        ArrayList<Person> searchPersonDirectory = new ArrayList();
        for(Person person: personDirectory)
        {
            if(person.getPersonName().toLowerCase().startsWith(key.toLowerCase()))
            {
                searchPersonDirectory.add(person);
            }
        }
        return searchPersonDirectory;
    }
}
