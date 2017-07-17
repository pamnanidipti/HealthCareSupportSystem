/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.AQMonitorsRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Pamnani
 */
public class EnvQualityCheckOrganization  extends Organization{
    
    public EnvQualityCheckOrganization() {
        super(Organization.Type.EnvQualityCheck.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new AQMonitorsRole());
        return roles;
    }
    
}
