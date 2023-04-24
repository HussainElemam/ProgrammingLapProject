package covidgui;

import classes.Patient;
import classes.database;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author husse
 */
public class PatientDetails extends javax.swing.JInternalFrame {

    /**
     * Creates new form NewJInternalFrame
     */
    private final DefaultListModel mod;
    Patient p;
    
    public PatientDetails() {
        initComponents();
        menu.add(jPanel1);
        mod = new DefaultListModel();
        list.setModel(mod);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        list = new javax.swing.JList<>();
        menu = new javax.swing.JPopupMenu();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        cb1 = new javax.swing.JComboBox<>();
        orlbl = new javax.swing.JLabel();
        searchtf = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        nametf = new javax.swing.JTextField();
        agetf = new javax.swing.JTextField();
        idtf = new javax.swing.JTextField();
        gendertf = new javax.swing.JTextField();
        vaccinetf = new javax.swing.JTextField();
        resulttf = new javax.swing.JTextField();
        rb1 = new javax.swing.JRadioButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        vaccine2 = new javax.swing.JTextField();
        date1 = new javax.swing.JTextField();
        date2 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        nodtf = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        list.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(list);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
        );

        menu.setFocusable(false);

        setBorder(null);
        setClosable(true);
        setPreferredSize(new java.awt.Dimension(910, 520));

        jPanel2.setPreferredSize(new java.awt.Dimension(900, 510));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        jLabel5.setText("Search with: ");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, 30));

        cb1.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        cb1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select one...", "Name", "ID" }));
        cb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb1ActionPerformed(evt);
            }
        });
        jPanel2.add(cb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 120, 30));

        orlbl.setFont(new java.awt.Font("Georgia", 3, 14)); // NOI18N
        jPanel2.add(orlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 100, 30));

        searchtf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchtfKeyReleased(evt);
            }
        });
        jPanel2.add(searchtf, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 100, 220, 30));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(755, 103, 110, 30));

        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 880, 80));

        jLabel3.setFont(new java.awt.Font("Georgia", 3, 30)); // NOI18N
        jLabel3.setText("View Patient Details");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 340, 50));

        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 70));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel7.setText("Name:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel8.setText("Age:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel9.setText("ID:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, -1, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel10.setText("Gender:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, -1, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel11.setText("Has vaccine:");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, -1, 30));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel12.setText("Last result:");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, -1, 30));

        nametf.setEditable(false);
        jPanel2.add(nametf, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 220, 30));

        agetf.setEditable(false);
        jPanel2.add(agetf, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 220, 30));

        idtf.setEditable(false);
        jPanel2.add(idtf, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 220, 30));

        gendertf.setEditable(false);
        jPanel2.add(gendertf, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, 220, 30));

        vaccinetf.setEditable(false);
        jPanel2.add(vaccinetf, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 380, 220, 30));

        resulttf.setEditable(false);
        jPanel2.add(resulttf, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 430, 220, 30));

        rb1.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        rb1.setText("view vaccination details");
        rb1.setEnabled(false);
        rb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb1ActionPerformed(evt);
            }
        });
        jPanel2.add(rb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 190, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel14.setText("Vaccine:");
        jLabel14.setEnabled(false);
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 250, -1, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel15.setText("Date of first dose:");
        jLabel15.setEnabled(false);
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 360, -1, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel16.setText("Date of second dose:");
        jLabel16.setEnabled(false);
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 420, -1, -1));

        vaccine2.setEditable(false);
        vaccine2.setEnabled(false);
        jPanel2.add(vaccine2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 240, 170, 30));

        date1.setEditable(false);
        date1.setEnabled(false);
        jPanel2.add(date1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 350, 170, 30));

        date2.setEditable(false);
        date2.setEnabled(false);
        jPanel2.add(date2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 410, 170, 30));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel17.setText("Number of doses:");
        jLabel17.setEnabled(false);
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 310, -1, -1));

        nodtf.setEditable(false);
        nodtf.setEnabled(false);
        jPanel2.add(nodtf, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 300, 170, 30));

        jLabel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jLabel13.setEnabled(false);
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 170, 460, 310));

        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 410, 310));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/lightBlue.jpg"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 901, 490));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 913, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb1ActionPerformed
        if (cb1.getSelectedIndex() == 1) {
            orlbl.setText("Enter Name");
        } else if (cb1.getSelectedIndex() == 2) {
            orlbl.setText("Enter ID");
        } else {
            orlbl.setText("");
        }
        if (!(cb1.getSelectedIndex() == 0)) {
            nametf.setText("");
            agetf.setText("");
            idtf.setText("");
            gendertf.setText("");
            vaccinetf.setText("");
            resulttf.setText("");
            rb1.setSelected(false);
            vaccine2.setText("");
            date1.setText("");
            date2.setText("");
            searchtf.setText("");
            nodtf.setText("");
            disableVData();
            
        }
    }//GEN-LAST:event_cb1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        setVDataText();
        disableVData();
        if (cb1.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Please select a search method");
        } else if (cb1.getSelectedIndex() == 1) {
            p = database.getPatientByName(searchtf.getText().split(" ")[0]);
        } else {
            p = database.getPatientById(searchtf.getText());
        }
        
        if (p == null && cb1.getSelectedIndex() != 0) {
            JOptionPane.showMessageDialog(rootPane, "We can't fined this patient\ncheck the imformation you entered");
        } else {
            nametf.setText(p.getName());
            agetf.setText(p.getAge() + "");
            idtf.setText(p.getID());
            gendertf.setText(p.getGender());
            if (p.getPaitentvaccine() != null) {
                vaccinetf.setText("YES");
                vaccine2.setEnabled(true);
                date1.setEnabled(true);
                date2.setEnabled(true);
                rb1.setEnabled(true);
                nodtf.setEnabled(true);
                jLabel14.setEnabled(true);
                jLabel15.setEnabled(true);
                jLabel16.setEnabled(true);
                jLabel17.setEnabled(true);
            } else {
                vaccinetf.setText("NO");
                disableVData();
            }
            String res = (p.getResult() == 'P') ? "Positive" : "Negative";
            resulttf.setText(res);
            searchtf.setText("");
            
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void searchtfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchtfKeyReleased
        if (cb1.getSelectedIndex() == 1) {
            mod.removeAllElements();
            for (Patient p : database.patients) {
                if (p.getName().toLowerCase().startsWith(searchtf.getText().trim().toLowerCase())) {
                    mod.addElement(p.getName() + " " + p.getID());
                }
            }
            menu.show(searchtf, 0, searchtf.getHeight());
        }
    }//GEN-LAST:event_searchtfKeyReleased

    private void listMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listMouseClicked
        searchtf.setText(list.getSelectedValue());
        menu.setVisible(false);
    }//GEN-LAST:event_listMouseClicked

    private void rb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb1ActionPerformed
        if (rb1.isSelected()) {
            if (p.getPaitentvaccine().getVaccine().getNumOfDoses() == 1) {
                date2.setEnabled(false);
                jLabel16.setEnabled(false);
            }
            vaccine2.setText(p.getPaitentvaccine().getVaccine().getvName());
            nodtf.setText(p.getPaitentvaccine().getNumOfDoses() + "");
            date1.setText(p.getPaitentvaccine().getDateOfFirstDose().toString());
            if (p.getPaitentvaccine().getNumOfDoses() == 2) {
                date2.setText(p.getPaitentvaccine().getDateOfSecondDose().toString());
            }
        } else {
            setVDataText();
        }
    }//GEN-LAST:event_rb1ActionPerformed
    
    private void disableVData() {
        vaccine2.setEnabled(false);
        date1.setEnabled(false);
        date2.setEnabled(false);
        nodtf.setEnabled(false);
        rb1.setEnabled(false);
        jLabel14.setEnabled(false);
        jLabel15.setEnabled(false);
        jLabel16.setEnabled(false);
        jLabel17.setEnabled(false);
    }
    
    private void setVDataText() {
        rb1.setSelected(false);
        vaccine2.setText("");
        date1.setText("");
        date2.setText("");
        nodtf.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField agetf;
    private javax.swing.JComboBox<String> cb1;
    private javax.swing.JTextField date1;
    private javax.swing.JTextField date2;
    private javax.swing.JTextField gendertf;
    private javax.swing.JTextField idtf;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> list;
    private javax.swing.JPopupMenu menu;
    private javax.swing.JTextField nametf;
    private javax.swing.JTextField nodtf;
    private javax.swing.JLabel orlbl;
    private javax.swing.JRadioButton rb1;
    private javax.swing.JTextField resulttf;
    private javax.swing.JTextField searchtf;
    private javax.swing.JTextField vaccine2;
    private javax.swing.JTextField vaccinetf;
    // End of variables declaration//GEN-END:variables
}
