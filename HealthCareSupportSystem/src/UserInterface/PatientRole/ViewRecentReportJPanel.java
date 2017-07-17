/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.PatientRole;

import Business.Enterprise.Enterprise;
import Business.Patient.Patient;
import Business.Patient.VitalSign;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Pamnani
 */
public class ViewRecentReportJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
     private Enterprise enterprise;
     private Patient patient;

    /**
     * Creates new form ViewRecentReportJPanel
     */
    public ViewRecentReportJPanel(JPanel userProcessContainer,Patient patient, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.patient=patient;
        populate();
    }
    public void populate()
    {
        ageTxtField.setText(String.valueOf(patient.getAge()));
        int size = patient.getVitalSignHistory().getHistory().size();
        for(int i =size-1; i>=0;i-- )
        {
            VitalSign visi = patient.getVitalSignHistory().getHistory().get(i);
            resprateTxtField.setText(String.valueOf(visi.getRespiratoryRate()));
            hearRateTxtField.setText(String.valueOf(visi.getHeartRate()));
            bpTxtField.setText(String.valueOf(visi.getBloodPressure()));
            weightTxtField.setText(String.valueOf(visi.getWeight()));
            dateLabel.setText(String.valueOf(visi.getTimestamp()));
            break;
        }
        diseaseTxtField.setText(patient.getDocReport().getDisease());
        medicineTxtField.setText(patient.getDocReport().getMedicine());
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
        dateLabel = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        medicineTxtField = new javax.swing.JTextField();
        ageTxtField = new javax.swing.JTextField();
        hearRateTxtField = new javax.swing.JTextField();
        resprateTxtField = new javax.swing.JTextField();
        bpTxtField = new javax.swing.JTextField();
        weightTxtField = new javax.swing.JTextField();
        diseaseTxtField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 3, 36)); // NOI18N
        jLabel1.setText("Report");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        dateLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        dateLabel.setText("<< date >>");
        add(dateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(588, 23, -1, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setText("Date:");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(541, 23, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Age:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 82, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Respiratory Rate:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 120, -1, -1));

        medicineTxtField.setEnabled(false);
        add(medicineTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 309, 113, -1));

        ageTxtField.setEnabled(false);
        add(ageTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 81, 113, -1));

        hearRateTxtField.setEnabled(false);
        add(hearRateTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 157, 113, -1));

        resprateTxtField.setEnabled(false);
        resprateTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resprateTxtFieldActionPerformed(evt);
            }
        });
        add(resprateTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 119, 113, -1));

        bpTxtField.setEnabled(false);
        add(bpTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 195, 113, -1));

        weightTxtField.setEnabled(false);
        add(weightTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 233, 113, -1));

        diseaseTxtField.setEnabled(false);
        diseaseTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diseaseTxtFieldActionPerformed(evt);
            }
        });
        add(diseaseTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 271, 113, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText("Suggested Medication :");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 310, -1, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("Suffering from :");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 272, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Weight:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 234, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Systolic Blood Pressure:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 196, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Heart Rate:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 158, -1, -1));

        backJButton.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 433, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void resprateTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resprateTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resprateTxtFieldActionPerformed

    private void diseaseTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diseaseTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_diseaseTxtFieldActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout= (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ageTxtField;
    private javax.swing.JButton backJButton;
    private javax.swing.JTextField bpTxtField;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JTextField diseaseTxtField;
    private javax.swing.JTextField hearRateTxtField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField medicineTxtField;
    private javax.swing.JTextField resprateTxtField;
    private javax.swing.JTextField weightTxtField;
    // End of variables declaration//GEN-END:variables
}
