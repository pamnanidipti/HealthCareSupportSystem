/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ReceptionistRole;

import Business.Enterprise.Enterprise;
import Business.Organization.PatientOrganization;
import Business.Organization.ReceptionistOrganization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Pamnani
 */
public class ReceptionistWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private ReceptionistOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private PatientOrganization patientOrganization;
    /**
     * Creates new form ReceptionistWorkAreaJPanel
     */
    public ReceptionistWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, 
            ReceptionistOrganization organization, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        nameLabel.setText(account.getPerson().getPersonName());
       // patientOrganization=(PatientOrganization)enterprise.getOrganizationDirectory().getOrganizationList();
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
        nameLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        patientlistJButton = new javax.swing.JButton();
        doctorlistJButton = new javax.swing.JButton();
        ViewAppointmentsJButon = new javax.swing.JButton();
        viewNotificationsJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 3, 36)); // NOI18N
        jLabel1.setText("Receptionist Work Area");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Welcome");

        nameLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        nameLabel.setText("<<name>>");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/receptionist.jpg"))); // NOI18N

        patientlistJButton.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        patientlistJButton.setText("Patient's List >>");
        patientlistJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientlistJButtonActionPerformed(evt);
            }
        });

        doctorlistJButton.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        doctorlistJButton.setText("Doctor's List >>");
        doctorlistJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctorlistJButtonActionPerformed(evt);
            }
        });

        ViewAppointmentsJButon.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        ViewAppointmentsJButon.setText("Appointment Requests >>");
        ViewAppointmentsJButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewAppointmentsJButonActionPerformed(evt);
            }
        });

        viewNotificationsJButton.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        viewNotificationsJButton.setText("View Notifications from AQ Monitors >> ");
        viewNotificationsJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewNotificationsJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(239, 239, 239)
                                .addComponent(jLabel2)
                                .addGap(10, 10, 10)
                                .addComponent(nameLabel)
                                .addGap(102, 102, 102))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(patientlistJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(doctorlistJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ViewAppointmentsJButon, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(viewNotificationsJButton))
                                .addGap(55, 55, 55)))
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGap(47, 47, 47))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(nameLabel))
                        .addGap(32, 32, 32)
                        .addComponent(doctorlistJButton)
                        .addGap(30, 30, 30)
                        .addComponent(patientlistJButton)
                        .addGap(34, 34, 34)
                        .addComponent(ViewAppointmentsJButon)
                        .addGap(38, 38, 38)
                        .addComponent(viewNotificationsJButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)))
                .addGap(99, 99, 99))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void doctorlistJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctorlistJButtonActionPerformed
        // TODO add your handling code here:
        DoctorListJPanel panel = new DoctorListJPanel(userProcessContainer,userAccount,enterprise);
        userProcessContainer.add("DoctorList", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_doctorlistJButtonActionPerformed

    private void patientlistJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientlistJButtonActionPerformed
        // TODO add your handling code here:
        //for
        //patientOrganization=
        PatientListJPanel panel = new PatientListJPanel(userProcessContainer,userAccount,patientOrganization,enterprise);
        userProcessContainer.add("PatientList", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_patientlistJButtonActionPerformed

    private void ViewAppointmentsJButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewAppointmentsJButonActionPerformed
        // TODO add your handling code here:
        AppointmentRequetsJPanel panel = new AppointmentRequetsJPanel(userProcessContainer,userAccount,organization,enterprise);
        userProcessContainer.add("AppointmentRequests", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_ViewAppointmentsJButonActionPerformed

    private void viewNotificationsJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewNotificationsJButtonActionPerformed
        // TODO add your handling code here:
        ViewNotificationsJPanel panel = new ViewNotificationsJPanel(userProcessContainer,userAccount,organization,enterprise);
        userProcessContainer.add("ViewNotifications", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_viewNotificationsJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ViewAppointmentsJButon;
    private javax.swing.JButton doctorlistJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JButton patientlistJButton;
    private javax.swing.JButton viewNotificationsJButton;
    // End of variables declaration//GEN-END:variables
}
