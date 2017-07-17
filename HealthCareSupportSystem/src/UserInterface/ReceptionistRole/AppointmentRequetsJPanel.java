/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ReceptionistRole;

import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.ReceptionistOrganization;
import Business.Patient.Patient;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.AppointmentWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pamnani
 */
public class AppointmentRequetsJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private ReceptionistOrganization organization;
    
    /**
     * Creates new form AppointmentRequetsJPanel
     */
    public AppointmentRequetsJPanel(JPanel userProcessContainer, UserAccount account, ReceptionistOrganization organization, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        
        populateTable();
    }

    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel)appointmentTable.getModel();
        
        model.setRowCount(0);
        for(WorkRequest request : organization.getWorkQueue().getWorkRequestList())
        {
            if(request instanceof AppointmentWorkRequest)
            {
                //AppointmentWorkRequest appReq = new AppointmentWorkRequest();
            Object[] row = new Object[4];
            row[0] = request;
            row[1] = request.getSender().getPerson().getPersonName();
            row[2] = request.getReceiver() == null ? null : request.getReceiver().getPerson().getPersonName();
            row[3] = request.getStatus();
            
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
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        appointmentTable = new javax.swing.JTable();
        confirmJButton = new javax.swing.JButton();
        rejectJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 3, 36)); // NOI18N
        jLabel1.setText("Appointment Requests");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/appReq.jpg"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Patient Appointments:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        appointmentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Message", "Sender", "Receiver", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        appointmentTable.setGridColor(new java.awt.Color(255, 255, 255));
        appointmentTable.setOpaque(false);
        appointmentTable.setSelectionBackground(new java.awt.Color(51, 255, 204));
        jScrollPane1.setViewportView(appointmentTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 500, 140));

        confirmJButton.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        confirmJButton.setText("Confirm");
        confirmJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmJButtonActionPerformed(evt);
            }
        });
        add(confirmJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, -1, -1));

        rejectJButton.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        rejectJButton.setText("Reject");
        rejectJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rejectJButtonActionPerformed(evt);
            }
        });
        add(rejectJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, -1, -1));

        backJButton.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 357, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void confirmJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmJButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = appointmentTable.getSelectedRow();
        
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row from the table!","Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        AppointmentWorkRequest request = (AppointmentWorkRequest)appointmentTable.getValueAt(selectedRow, 0);
        request.setStatus("Confirmed");
        populateTable();
        for(Organization org:enterprise.getOrganizationDirectory().getOrganizationList())
        {
             for(Patient patient:org.getPatientDirectory().getPatientHistory())
             {
                 if(request.getSender().getPerson().getPersonName().equals(patient.getPersonName()))
                 {
                     String notify = "Your appointment for "+request.getMessage()+" with Dr. "
                     +request.getReceiver().getPerson().getPersonName()+" at "+request.getRequestedTime()+" has been confirmed";
                     patient.getNotificationList().add(notify);
                     
                 }
                 
                /* String nfl[]=patient.getNotificationList();
             if(request.getSender().getPerson().getPersonName().equals(patient.getPersonName()))
                 for(int i=0;i<patient.getNotificationList().length;i++)
                 {
                    nfl[i]="Confirmed";
                    i++;
                    patient.setNotificationList(nfl);
                 }*/
              
             }        
        }
    }//GEN-LAST:event_confirmJButtonActionPerformed

    private void rejectJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rejectJButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = appointmentTable.getSelectedRow();
        
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row from the table!","Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        AppointmentWorkRequest request = (AppointmentWorkRequest)appointmentTable.getValueAt(selectedRow, 0);
        request.setStatus("No Availability.Please reschedule!");
        populateTable();
        for(Organization org:enterprise.getOrganizationDirectory().getOrganizationList())
        {
             for(Patient patient:org.getPatientDirectory().getPatientHistory())
             {
             if(request.getSender().getPerson().getPersonName().equals(patient.getPersonName()))
             {
                 String notify = "Your appointment for "+request.getMessage()+" with Dr. "
                     +request.getReceiver().getPerson().getPersonName()+" at "+request.getRequestedTime()+" has been rejected due to non-availability. Please reschedule.";
             patient.getNotificationList().add(notify);
             }
             }        
        }
    }//GEN-LAST:event_rejectJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable appointmentTable;
    private javax.swing.JButton backJButton;
    private javax.swing.JButton confirmJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton rejectJButton;
    // End of variables declaration//GEN-END:variables
}