/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.DoctorRole;

import Business.Doctor.Doctor;
import Business.Enterprise.Enterprise;
import Business.Utils.MyIntegerVerifier;
import Business.Utils.MyStringVerifier;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Pamnani
 */
public class EnterOrViewDetailsJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Doctor doctor;
    private Enterprise enterprise;
    /**
     * Creates new form EnterOrViewDetailsJPanel
     */
    public EnterOrViewDetailsJPanel(JPanel userProcessContainer,Doctor doctor,
            Enterprise enterprise) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.doctor=doctor;
        this.enterprise=enterprise;
        nameJTxtField.setText(doctor.getPersonName());
        doctorIDJTxtField.setText(String.valueOf(doctor.getDoctorID()));
        MyStringVerifier myStringVerifier= new MyStringVerifier();
        genderJTxtField.setInputVerifier(myStringVerifier);
        addressJTxtField.setInputVerifier(myStringVerifier);
        
        MyIntegerVerifier myintegerVerifier= new MyIntegerVerifier();
        ageJTxtField.setInputVerifier(myintegerVerifier);
        
        populate();
                
    }

    public void populate()
    {
        if(doctor.getAge() != 0)
        {
            saveJButton.setEnabled(false);
            updateJButton.setEnabled(true);
        }
            ageJTxtField.setEnabled(false);
            genderJTxtField.setEnabled(false);
            addressJTxtField.setEnabled(false);
            saveJButton.setEnabled(false);
            
            ageJTxtField.setText(String.valueOf(doctor.getAge()));
            genderJTxtField.setText(doctor.getGender());
            addressJTxtField.setText(doctor.getPersonAddress());
            
        
        
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
        nameJTxtField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        doctorIDJTxtField = new javax.swing.JTextField();
        ageJTxtField = new javax.swing.JTextField();
        genderJTxtField = new javax.swing.JTextField();
        addressJTxtField = new javax.swing.JTextField();
        updateJButton = new javax.swing.JButton();
        saveJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 3, 36)); // NOI18N
        jLabel1.setText("Personal Details");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/docDetails.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, -1, -1));

        nameJTxtField.setEnabled(false);
        add(nameJTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 94, 96, -1));

        jLabel3.setText("Name:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 100, -1, -1));

        jLabel4.setText("Doctor ID:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 135, -1, -1));

        jLabel5.setText("Age:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 173, -1, -1));

        jLabel6.setText("Gender:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 211, -1, -1));

        jLabel7.setText("Address:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 249, -1, -1));

        doctorIDJTxtField.setEnabled(false);
        doctorIDJTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctorIDJTxtFieldActionPerformed(evt);
            }
        });
        add(doctorIDJTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 132, 96, -1));

        ageJTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageJTxtFieldActionPerformed(evt);
            }
        });
        add(ageJTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 170, 96, -1));
        add(genderJTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 208, 96, -1));
        add(addressJTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 246, 96, -1));

        updateJButton.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        updateJButton.setText("Update");
        updateJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateJButtonActionPerformed(evt);
            }
        });
        add(updateJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 336, -1, -1));

        saveJButton.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        saveJButton.setText("Save");
        saveJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveJButtonActionPerformed(evt);
            }
        });
        add(saveJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 336, -1, -1));

        backJButton.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 443, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void doctorIDJTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctorIDJTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_doctorIDJTxtFieldActionPerformed

    private void ageJTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageJTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageJTxtFieldActionPerformed

    private void updateJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateJButtonActionPerformed
        // TODO add your handling code here:
        ageJTxtField.setEnabled(true);
        genderJTxtField.setEnabled(true);
        addressJTxtField.setEnabled(true);
        
        
        saveJButton.setEnabled(true);
        updateJButton.setEnabled(false);
    }//GEN-LAST:event_updateJButtonActionPerformed

    private void saveJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveJButtonActionPerformed
        // TODO add your handling code here:
        if(ageJTxtField.getText().trim().length()==0 || 
                addressJTxtField.getText().length()==0 || genderJTxtField.getText().trim().length()==0
                )
        {
            JOptionPane.showMessageDialog(this, "Please enter all the values.","Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        doctor.setAge(Integer.parseInt(ageJTxtField.getText()));
      doctor.setGender(genderJTxtField.getText());
      doctor.setPersonAddress(addressJTxtField.getText());
      
      
      saveJButton.setEnabled(false);
      updateJButton.setEnabled(true);
      JOptionPane.showMessageDialog(null, "Details updated successfully!", "Information", JOptionPane.INFORMATION_MESSAGE);
      
        ageJTxtField.setEnabled(false);
        genderJTxtField.setEnabled(false);
        addressJTxtField.setEnabled(false);
        
    }//GEN-LAST:event_saveJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout= (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressJTxtField;
    private javax.swing.JTextField ageJTxtField;
    private javax.swing.JButton backJButton;
    private javax.swing.JTextField doctorIDJTxtField;
    private javax.swing.JTextField genderJTxtField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField nameJTxtField;
    private javax.swing.JButton saveJButton;
    private javax.swing.JButton updateJButton;
    // End of variables declaration//GEN-END:variables
}
