/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ReceptionistRole;

import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import static Business.Organization.Organization.Type.Patient;
import Business.Organization.PatientOrganization;
import Business.Patient.Patient;
import Business.Person.Person;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pamnani
 */
public class PatientListJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private PatientOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    /**
     * Creates new form PatientListJPanel
     */
    public PatientListJPanel(JPanel userProcessContainer, UserAccount account, PatientOrganization organization, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
       // System.out.print(enterprise.getOrganizationDirectory().getOrganizationList());
        populatePatientTable();
    }
    
    public void populatePatientTable()
    {
        DefaultTableModel model = (DefaultTableModel) patientJTable.getModel();
        model.setRowCount(0);
        
        Organization org = null;
        Object row[] = new Object[2];
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
           /* if(organization instanceof PatientOrganization)
            {
                org = organization;
                break;
            }
        }
        if(org!=null)
        {*/
            for(Patient patient:organization.getPatientDirectory().getPatientHistory())
                 {
                     row[0]=patient;
                     row[1]=patient.getHealthStatus();
                     model.addRow(row);
                 }
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        patientJTable = new javax.swing.JTable();
        viewDetailsJButton = new javax.swing.JButton();
        createPatientJButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        searchTxtField = new javax.swing.JTextField();
        searchJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        dischargeJButton = new javax.swing.JButton();
        readmitJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 3, 36)); // NOI18N
        jLabel1.setText("Patient List");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Patient-List.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 55, -1, 261));

        patientJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        patientJTable.setGridColor(new java.awt.Color(255, 255, 255));
        patientJTable.setOpaque(false);
        patientJTable.setSelectionBackground(new java.awt.Color(51, 255, 204));
        jScrollPane1.setViewportView(patientJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 71, 367, 91));

        viewDetailsJButton.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        viewDetailsJButton.setText("View Details");
        viewDetailsJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDetailsJButtonActionPerformed(evt);
            }
        });
        add(viewDetailsJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 239, -1, -1));

        createPatientJButton.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        createPatientJButton.setText("Create Patient Record >>");
        createPatientJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createPatientJButtonActionPerformed(evt);
            }
        });
        add(createPatientJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 282, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setText("Search Donor by Name:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 186, -1, -1));
        add(searchTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 183, 112, -1));

        searchJButton.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        searchJButton.setText("Search");
        searchJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchJButtonActionPerformed(evt);
            }
        });
        add(searchJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 180, -1, -1));

        backJButton.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 445, -1, -1));

        dischargeJButton.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        dischargeJButton.setText("Discharge");
        dischargeJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dischargeJButtonActionPerformed(evt);
            }
        });
        add(dischargeJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 239, -1, -1));

        readmitJButton.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        readmitJButton.setText("Re-admit");
        readmitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                readmitJButtonActionPerformed(evt);
            }
        });
        add(readmitJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout= (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void createPatientJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createPatientJButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow= patientJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row from table.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Patient patient=(Patient)patientJTable.getValueAt(selectedRow, 0);
        if(patient.getGender()!=null)
        {
            JOptionPane.showMessageDialog(this, "Patient details have been entered.Click on View Details to edit.", "Information", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        CreatePatientJPanel panel = new CreatePatientJPanel(userProcessContainer,patient, enterprise, organization);
        userProcessContainer.add("CreatePatient", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_createPatientJButtonActionPerformed

    private void viewDetailsJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDetailsJButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow= patientJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row from table.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
            Patient patient = (Patient)patientJTable.getValueAt(selectedRow, 0);
            ViewPatientDetailsJPanel panel= new ViewPatientDetailsJPanel(userProcessContainer, patient,enterprise.getPatientDirectory(),enterprise);
            userProcessContainer.add("ViewPatientDetails", panel);
            CardLayout layout=(CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        
    }//GEN-LAST:event_viewDetailsJButtonActionPerformed

    private void searchJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchJButtonActionPerformed
        // TODO add your handling code here:
        String key= searchTxtField.getText().trim();
        DefaultTableModel model = (DefaultTableModel) patientJTable.getModel();
        model.setRowCount(0);
        Object row[] = new Object[1];
        if(key.length()==0)
        {
            JOptionPane.showMessageDialog(this, "Please enter key.", "Error", JOptionPane.ERROR_MESSAGE);
            populatePatientTable();
            return;
        }
        //ArrayList<Patient> searchPatients;
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
           for(Patient patient:organization.getPatientDirectory().getPatientHistory()) 
           {
               if(!patient.getPersonName().equals(key))
               {
                JOptionPane.showMessageDialog(this, "No such patient found. Please add Patient", "Warning", JOptionPane.INFORMATION_MESSAGE);
                searchTxtField.setText("");
                populatePatientTable();
                return;   
               }
               if(patient.getPersonName().equals(key))
               {
                   row[0]=patient;
                    ((DefaultTableModel) patientJTable.getModel()).addRow(row);
                    searchTxtField.setText("");
                    return;
               }
               
               
           }
        }    
    }//GEN-LAST:event_searchJButtonActionPerformed

    private void dischargeJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dischargeJButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow= patientJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row from table", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Patient patient = (Patient)patientJTable.getValueAt(selectedRow, 0);
        if(patient.getHealthStatus().equalsIgnoreCase("Admitted"))
        {
            
            JOptionPane.showMessageDialog(this, "Patient Health is not Normal yet.Cannot be Discharged", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        readmitJButton.setEnabled(true);
        patient.setHealthStatus("Discharged");
        populatePatientTable();
        
    }//GEN-LAST:event_dischargeJButtonActionPerformed

    private void readmitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_readmitJButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow= patientJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row from table", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Patient patient = (Patient)patientJTable.getValueAt(selectedRow, 0);
        if(!patient.getHealthStatus().equalsIgnoreCase("Discharged"))
        {
            JOptionPane.showMessageDialog(this, "Patient is already admitted", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if(patient.getHealthStatus().equalsIgnoreCase("Discharged"))
        {
            patient.setHealthStatus("Admitted");
            populatePatientTable();
            
        }
        
    }//GEN-LAST:event_readmitJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton createPatientJButton;
    private javax.swing.JButton dischargeJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable patientJTable;
    private javax.swing.JButton readmitJButton;
    private javax.swing.JButton searchJButton;
    private javax.swing.JTextField searchTxtField;
    private javax.swing.JButton viewDetailsJButton;
    // End of variables declaration//GEN-END:variables
}
