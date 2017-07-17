/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Pharmacy;

import java.util.ArrayList;

/**
 *
 * @author Pamnani
 */
public class DrugCatalog {
    private ArrayList<Drug> drugCatalog;

    public DrugCatalog() {
        drugCatalog=new ArrayList<Drug>();
    }
    public ArrayList<Drug> getDrugCatalog() {
        return drugCatalog;
    }
    public Drug addDrug(String name, int avail) {
        
        Drug drug = new Drug();
        drug.setDrugName(name);
        drug.setAvailableQuantity(avail);
        drugCatalog.add(drug);
        return drug;
    }
   
}
