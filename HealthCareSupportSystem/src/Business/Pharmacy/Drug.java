/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Pharmacy;

/**
 *
 * @author Pamnani
 */
public class Drug {
    private String drugName;
    private int availableQuantity;

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public int getAvailableQuantity() {
        return availableQuantity;
    }

    public void setAvailableQuantity(int availableQuantity) {
        this.availableQuantity = availableQuantity;
    }
    
    @Override
    public String toString() {
        return drugName; //To change body of generated methods, choose Tools | Templates.
    }
    
}
