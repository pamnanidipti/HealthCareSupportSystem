/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Organization.MayorOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.MayorRole.MayorWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Pamnani
 */
public class MayorRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Ecosystem business) {
        return new MayorWorkAreaJPanel(userProcessContainer, account, (MayorOrganization) organization, enterprise);
    }
    
}
