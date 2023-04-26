/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package covidgui;

import classes.Patient;
import classes.VaccinationData;
import classes.Vaccine;
import classes.database;
import java.time.LocalDate;
import java.time.Period;
import javax.swing.JOptionPane;

/**
 *
 * @author husse
 */
public class Vaccination extends javax.swing.JInternalFrame {

    /**
     * Creates new form NewJInternalFrame
     */
    Patient p;

    public Vaccination() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        CB = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        TF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setPreferredSize(new java.awt.Dimension(910, 520));

        jPanel2.setPreferredSize(new java.awt.Dimension(900, 510));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select one....", "Pfizer", "Sinopharm", "AstraZeneca", "Janssen", "Moderna" }));
        CB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBActionPerformed(evt);
            }
        });
        jPanel2.add(CB, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 120, -1));

        jButton1.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 110, 30));
        jPanel2.add(TF, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 90, 120, -1));

        jLabel5.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jLabel5.setText("Enter your ID");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 130, -1));

        jLabel4.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jLabel4.setText("Choose the vaccine:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 140, 50));

        jLabel3.setFont(new java.awt.Font("Georgia", 3, 30)); // NOI18N
        jLabel3.setText("Vaccination");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 340, 50));

        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/lightBlue.jpg"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 901, 490));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 901, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Vaccine v;
        p = database.getPatientById(TF.getText());
        if (p == null) {
            JOptionPane.showMessageDialog(rootPane, "Please Enter a Valid ID");

        } else {

            Vaccine vaccine = database.getVaccineByName(CB.getSelectedItem().toString());

            if (p.getPaitentvaccine() == null) {

                if (vaccine != null) {

                    if (!p.isSuitable(vaccine)) {
                        JOptionPane.showMessageDialog(rootPane, "Unfortunately you can't take this vaccine because you are below the required age ");

                    } else if (p.isSuitable(vaccine)) {
                        VaccinationData VD = new VaccinationData(vaccine, LocalDate.now(), null, 1);
                        p.setPaitentvaccine(VD);
                        JOptionPane.showMessageDialog(rootPane, "Please Take your Ticket");

                    }

                } else {
                    JOptionPane.showMessageDialog(rootPane, "Please select your vaccine");
                }

            } else if (CB.getSelectedIndex() == 4) {
                JOptionPane.showMessageDialog(rootPane, "You can't take a second dose for Janssen");

            } else if (p.getPaitentvaccine().getNumOfDoses() == 2) {
                JOptionPane.showMessageDialog(rootPane, "You already took 2 doses");
            } else if (Period.between(p.getPaitentvaccine().getDateOfFirstDose(), LocalDate.now()).getDays() >= vaccine.getTimeBetweenDoses()) {
                p.getPaitentvaccine().setDateOfSecondDose(LocalDate.now().getDayOfMonth(), LocalDate.now().getMonthValue(), LocalDate.now().getYear());
                JOptionPane.showMessageDialog(rootPane, "Added Succesfully");
            } else {
                JOptionPane.showMessageDialog(rootPane, "YoU didnt reach the required time between first and second dose");
            }


    }//GEN-LAST:event_jButton1ActionPerformed

    }
    private void CBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CB;
    private javax.swing.JTextField TF;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
