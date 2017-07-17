/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Pharmacy.DrugCatalog;
import java.util.ArrayList;

/**
 *
 * @author Pamnani
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    public void initialize(PharmacyOrganization organization)
    {
        DrugCatalog drugCatalog = organization.getDrugCatalog();
        //Drug d1 = new Drug();
        drugCatalog.addDrug("Abilify",40);
        drugCatalog.addDrug("Nexium",0);
        drugCatalog.addDrug("Humira",0);
        drugCatalog.addDrug("Crestor",22);
        drugCatalog.addDrug("Advair",98);
        drugCatalog.addDrug("Diskus",45);
        drugCatalog.addDrug("Enbrel",86);
        drugCatalog.addDrug("Remicade",0);
        drugCatalog.addDrug("Cymbalta",78);
        drugCatalog.addDrug("Copaxone",0);
        drugCatalog.addDrug("Neulasta",0);
        drugCatalog.addDrug("Lantus",0);
        drugCatalog.addDrug("Solostar",72);
        drugCatalog.addDrug("Rituxan",0);
        drugCatalog.addDrug("Spiriva",31);
        drugCatalog.addDrug("Handihaler",0);
        drugCatalog.addDrug("Januvia",40);
        drugCatalog.addDrug("Atripla",0);
        drugCatalog.addDrug("Lantus",65);
        drugCatalog.addDrug("Avastin",35);
        drugCatalog.addDrug("Lyrica",0);
        drugCatalog.addDrug("Oxycontin",0);
        drugCatalog.addDrug("Epogen",0);
        
        
    }
    
    public Organization createOrganization(Organization.Type type){
        Organization organization = null;
        
        if (type.getValue().equals(Organization.Type.Doctor.getValue())){
            organization = new DoctorOrganization();
            organizationList.add(organization);
            
        }
        
        if (type.getValue().equals(Organization.Type.Receptionist.getValue())){
            organization = new ReceptionistOrganization();
            organizationList.add(organization);
            
        }
        if (type.getValue().equals(Organization.Type.Nurse.getValue())){
            organization = new NurseOrganization();
            organizationList.add(organization);
            
        }
        if (type.getValue().equals(Organization.Type.Patient.getValue())){
            organization = new PatientOrganization();
            organizationList.add(organization);
            
        }
        if (type.getValue().equals(Organization.Type.Pharmacy.getValue())){
            organization = new PharmacyOrganization();
            organizationList.add(organization);
            initialize((PharmacyOrganization)organization);
            
        }
         if (type.getValue().equals(Organization.Type.EnvQualityCheck.getValue())){
            organization = new EnvQualityCheckOrganization();
            organizationList.add(organization);
           
        }
         if (type.getValue().equals(Organization.Type.Mayor.getValue())){
            organization = new MayorOrganization();
            organizationList.add(organization);
           
        }
        return organization;
    }
}
