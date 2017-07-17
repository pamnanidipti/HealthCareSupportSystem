/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import static Business.Role.Role.RoleType.Admin;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author Pamnani
 */
public abstract class Role {
    
    public enum RoleType{
        Admin("Admin"),
        Doctor("Doctor"),Mayor("Mayor"),Nurse("Nurse"),Patient("Patient"),
        Pharmacist ("Pharmacist"),Receptionist("Receptionist"),SystemAdmin("SystemAdmin");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organization organization, 
            Enterprise enterprise, 
            Ecosystem business);

    @Override
    public String toString() {
        //if(RoleType.equals(Admin))
        
       return String.valueOf(this.getClass().getName().substring(14));
        //    return String.valueOf(Role.RoleType.Admin.value);
    }
}
