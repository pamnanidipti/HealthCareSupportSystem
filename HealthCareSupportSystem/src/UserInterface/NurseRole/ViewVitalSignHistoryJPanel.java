/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.NurseRole;

import Business.Enterprise.Enterprise;
import Business.Patient.Patient;
import Business.Patient.PatientDirectory;
import Business.Patient.VitalSign;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pamnani
 */
public class ViewVitalSignHistoryJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private PatientDirectory patientdirectory;
    private Enterprise enterprise;
    private Patient patient;
    /**
     * Creates new form ViewVitalSignHistoryJPanel
     */
    public ViewVitalSignHistoryJPanel(JPanel userProcessContainer,Patient patient,
            PatientDirectory patientDirectory,Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.patient=patient;
        this.patientdirectory=patientDirectory;
        nameLabel.setText(patient.getPersonName());
        populateTable();
        //System.out.println(vitalsignHistoryTable.getModel().getValueAt(0, 1));
        check();
    }

    public void populateTable()
    {
        DefaultTableModel model = (DefaultTableModel) vitalsignHistoryTable.getModel();
        model.setRowCount(0);
        ArrayList<VitalSign> vitalSignList = patient.getVitalSignHistory().getHistory();

        for (VitalSign vitalSign : vitalSignList) {
            Object[] row = new Object[2];
            row[0] = vitalSign;
            row[1] = VitalSignStatus(vitalSign);
            model.addRow(row);
            //System.out.print(row[1]);
        }
    }
    public void check()
    {
        ArrayList<VitalSign> vitalSignList = patient.getVitalSignHistory().getHistory();
        for(int i=1; i<vitalsignHistoryTable.getRowCount();i++)
        {
            if(vitalsignHistoryTable.getModel().getValueAt(i-1, 1).equals(vitalsignHistoryTable.getModel().getValueAt(i, 1)))
            {
               // for (VitalSign vitalSign : vitalSignList)
                //{
                if(vitalsignHistoryTable.getModel().getValueAt(i-1, 1).equals((Object)"Normal"))
                {
                JOptionPane.showMessageDialog(this, "Patient normal");
                patient.setHealthStatus("Can be discharged");
                break;
                }
                //}
            }
        }
        //ArrayList<VitalSign> vitalSignList = patient.getVitalSignHistory().getHistory();

//        TableData td = new TableData(vitalsignHistoryTable, projObj);
//
//        DefaultTableModel model = (DefaultTableModel)vitalsignHistoryTable.getModel();
//            for (int i = 0; i < rowData.length; i++)
//
//                for (int j = 0; j < colData.length; j++)

   //             {
        
       /* for (VitalSign vitalSign : vitalSignList) { 
            for(int i=1; i < vitalSignList.size(); i++)
            {
                int count=0;
                if((VitalSignStatus(vitalSign)).equalsIgnoreCase("Normal"))
                {
                    for(int j=i-1; j<=i ; j--)
                    {
                        
                    } */
//                    while(count<=2)
//                    {
//                    count++;
//                    i--;
//                    continue;
//                    }
//                    JOptionPane.showMessageDialog(this, "Patient normal");
//                    break;
    //            }
           //    JOptionPane.showMessageDialog(this, "Patient normal");
         //      break;
        //    }
       //} 
    } 
    
     private String VitalSignStatus(VitalSign vitalSign) {
        String vitalSignStatus = "Normal";

        int patientAge = patient.getAge();
        int respirationRate = vitalSign.getRespiratoryRate();
        int heartRate = vitalSign.getHeartRate();
        int bloodPressure = vitalSign.getBloodPressure();
        int weight = vitalSign.getWeight();

        /*Toddler*/
        if (patientAge >= 1 && patientAge <= 3) {
            if ((respirationRate < 20 || respirationRate > 30) /*Respiration Rate*/
                    || (heartRate < 80 || heartRate > 130) /*Heart Rate*/
                    || (bloodPressure < 80 || bloodPressure > 110) /*Blood Pressure*/
                    || (weight < 22 || weight > 31)) /*Weight*/ {
                vitalSignStatus = "Abnormal";
            }
        }
        /*Preschooler*/
        if (patientAge >= 4 && patientAge <= 5) {
            if ((respirationRate < 20 || respirationRate > 30)
                    || (heartRate < 80 || heartRate > 120)
                    || (bloodPressure < 80 || bloodPressure > 110)
                    || (weight < 31 || weight > 40)) {
                vitalSignStatus = "Abnormal";
            }
        }
        /*School Age*/
        if (patientAge >= 6 && patientAge <= 12) {
            if ((respirationRate < 20 || respirationRate > 30)
                    || (heartRate < 70 || heartRate > 110)
                    || (bloodPressure < 80 || bloodPressure > 120)
                    || (weight < 41 || weight > 92)) {
                vitalSignStatus = "Abnormal";
            }
        }
        /*Adolescent*/
        if (patientAge >= 13) {
            if ((respirationRate < 12 || respirationRate > 20)
                    || (heartRate < 55 || heartRate > 105)
                    || (bloodPressure < 110 || bloodPressure > 120)
                    || (weight > 110)) {
                vitalSignStatus = "Abnormal";
            }
        }
        return vitalSignStatus;
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
        nameLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        vitalsignHistoryTable = new javax.swing.JTable();
        viewDetailsJButton = new javax.swing.JButton();
        heartRateJTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        respiratoryRateJTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        bloodPressureJTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        weightJTextField = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setEnabled(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 3, 36)); // NOI18N
        jLabel1.setText("Vital Sign History");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/vsHistory.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 34, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Vital Signs of Patient");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 68, -1, -1));

        nameLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        nameLabel.setText("<<name>>");
        add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 68, -1, -1));

        vitalsignHistoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Timestamp", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        vitalsignHistoryTable.setGridColor(new java.awt.Color(255, 255, 255));
        vitalsignHistoryTable.setOpaque(false);
        vitalsignHistoryTable.setSelectionBackground(new java.awt.Color(51, 255, 204));
        jScrollPane2.setViewportView(vitalsignHistoryTable);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 101, 362, 115));

        viewDetailsJButton.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        viewDetailsJButton.setText("View Details");
        viewDetailsJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDetailsJButtonActionPerformed(evt);
            }
        });
        add(viewDetailsJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 234, -1, -1));

        heartRateJTextField.setEnabled(false);
        add(heartRateJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 315, 148, -1));

        jLabel5.setText("Systolic blood pressure");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 356, -1, -1));

        jLabel6.setText("Weight in pounds");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 394, -1, -1));

        respiratoryRateJTextField.setEnabled(false);
        respiratoryRateJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                respiratoryRateJTextFieldActionPerformed(evt);
            }
        });
        add(respiratoryRateJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 277, 148, -1));

        jLabel7.setText("Heart rate");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 318, -1, -1));

        bloodPressureJTextField.setEnabled(false);
        add(bloodPressureJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 353, 148, -1));

        jLabel8.setText("Respiratory rate");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        weightJTextField.setEnabled(false);
        add(weightJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 391, 148, -1));

        backJButton.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void respiratoryRateJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_respiratoryRateJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_respiratoryRateJTextFieldActionPerformed

    private void viewDetailsJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDetailsJButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = vitalsignHistoryTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row from table.");
            return;
        }
        VitalSign vitalSign = (VitalSign) vitalsignHistoryTable.getValueAt(selectedRow, 0);

        respiratoryRateJTextField.setText(String.valueOf(vitalSign.getRespiratoryRate()));
        heartRateJTextField.setText(String.valueOf(vitalSign.getHeartRate()));
        bloodPressureJTextField.setText(String.valueOf(vitalSign.getBloodPressure()));
        weightJTextField.setText(String.valueOf(vitalSign.getWeight()));
    }//GEN-LAST:event_viewDetailsJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        NurseWorkAreaJPanel panel = (NurseWorkAreaJPanel) component;
        panel.populateTable();
        CardLayout layout= (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JTextField bloodPressureJTextField;
    private javax.swing.JTextField heartRateJTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField respiratoryRateJTextField;
    private javax.swing.JButton viewDetailsJButton;
    private javax.swing.JTable vitalsignHistoryTable;
    private javax.swing.JTextField weightJTextField;
    // End of variables declaration//GEN-END:variables
}
