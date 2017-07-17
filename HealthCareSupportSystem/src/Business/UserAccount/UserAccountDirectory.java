/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Person.Person;
import Business.Role.Role;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Pamnani
 */
public class UserAccountDirectory {
    private ArrayList<UserAccount> userAccountList;

    public UserAccountDirectory() {
        userAccountList = new ArrayList<>();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }
    
    public UserAccount authenticateUser(String username, String password){
        for (UserAccount ua : userAccountList)
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        return null;
    }
    
    public UserAccount createUserAccount(String username, String password,Person person,Role role){
//        for(UserAccount ua:userAccountList)
//        {
//        System.out.println(ua.getUsername()+"  "+ua.getPassword()+"  "+ua.getPerson());
//        }
        
        boolean isUnique = true;
        isUnique= checkIfUsernameIsUnique(username);
        UserAccount userAccount = new UserAccount();
        if(isUnique){
        //UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
      //  userAccount.setEmployee(employee);
        userAccount.setPerson(person);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
       // return userAccount;
        }
        if(!isUnique)
            JOptionPane.showMessageDialog(null, "Username already exists.Please enter a different username",
                    "Error",JOptionPane.ERROR_MESSAGE);
        return userAccount;
    }
    
    public boolean checkIfUsernameIsUnique(String username){
        for (UserAccount ua : userAccountList){
            if (ua.getUsername().equals(username))
                return false;
        }
        return true;
    }
    
}
