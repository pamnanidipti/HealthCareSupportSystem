/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Person.Person;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author Pamnani
 */
public class ConfigureASystem {
    
    public static Ecosystem configure(){
        
        Ecosystem system = Ecosystem.getInstance();
        
        Person person = system.getPersonDirectory().createAndAddPerson("SysAdmin");
        
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", person, new SystemAdminRole());
        
        return system;
    }
}
