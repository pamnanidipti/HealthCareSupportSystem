/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ReceptionistRole;

import Business.Doctor.Doctor;
import Business.Enterprise.Enterprise;
import Business.Organization.DoctorOrganization;
import Business.Organization.Organization;
import Business.Person.Person;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pamnani
 */
public class DoctorListJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    /**
     * Creates new form DoctorListJPanel
     */
    public DoctorListJPanel(JPanel userProcessContainer, UserAccount account,Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userAccount = account;
        populateDoctorTable();
    }

    public void populateDoctorTable()
    {
        DefaultTableModel model = (DefaultTableModel) doctorlistJTable.getModel();
        model.setRowCount(0);
        Organization org = null;
        Object row[] = new Object[1];
        
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList())
        {
            if(organization instanceof DoctorOrganization)
            {
                org = organization;
                break;
            }
        }
        if(org!=null)
        {
            for(Person person:org.getPersonDirectory().getPersonHistory())
                 {
                     if(person instanceof Doctor)
                     {
                      Doctor doctor=(Doctor)person;
                     row[0]=doctor;
//                     row[1]=doctor.getStartTime();
//                     row[2]=doctor.getEndTime();
                     model.addRow(row);
                     }
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
        jScrollPane1 = new javax.swing.JScrollPane();
        doctorlistJTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 3, 36)); // NOI18N
        jLabel1.setText("Doctor List");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        doctorlistJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        doctorlistJTable.setGridColor(new java.awt.Color(255, 255, 255));
        doctorlistJTable.setOpaque(false);
        doctorlistJTable.setSelectionBackground(new java.awt.Color(51, 255, 204));
        jScrollPane1.setViewportView(doctorlistJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 367, 91));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/doctorlist.jpg"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(387, 50, -1, -1));

        backJButton.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 325, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout= (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JTable doctorlistJTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
