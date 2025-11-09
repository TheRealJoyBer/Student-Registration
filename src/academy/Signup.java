package academy;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USER
 */
public class Signup extends javax.swing.JFrame {
    
    
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Signup.class.getName());

    
    public Signup() {
        initComponents();
        
        DefaultTableModel tblModel = (DefaultTableModel) jTable1.getModel();
tblModel.setRowCount(0); // clear first
for (String[] user : UserData.users) {
    tblModel.addRow(user);
}
     
        this.setTitle("Registration");
        
              // no no max button cuz it has bad GUI xD
    setResizable(false);

    // run file go center of screen xD
    setLocationRelativeTo(null);
    
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        txtReligion = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        txtGender = new javax.swing.JTextField();
        txtUsername = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtCourse = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtYear = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtContact = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtNationality = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtDateofbirth = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        txtFullname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setBackground(new java.awt.Color(236, 221, 193));
        jTable1.setFont(new java.awt.Font("TimesNewPixel", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fullname", "Age", "Nationality", "Dateofbirth", "Address", "Contact", "Email", "Year", "Course", "Religion", "Username", "Gender", "Password"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setResizingAllowed(false);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(12).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 100, 550, 250));

        btnEdit.setBackground(new java.awt.Color(232, 197, 106));
        btnEdit.setFont(new java.awt.Font("Pixel Georgia", 0, 24)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(102, 51, 0));
        btnEdit.setText("EDIT");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        getContentPane().add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 620, -1, -1));

        btnDelete.setBackground(new java.awt.Color(232, 197, 106));
        btnDelete.setFont(new java.awt.Font("Pixel Georgia", 0, 24)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(102, 51, 0));
        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 620, -1, -1));

        btnAdd.setBackground(new java.awt.Color(232, 197, 106));
        btnAdd.setFont(new java.awt.Font("Pixel Georgia", 0, 24)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(102, 51, 0));
        btnAdd.setText("ADD");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 620, -1, -1));

        txtReligion.setBackground(new java.awt.Color(236, 221, 193));
        txtReligion.setFont(new java.awt.Font("TimesNewPixel", 0, 20)); // NOI18N
        txtReligion.setForeground(new java.awt.Color(0, 0, 0));
        txtReligion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtReligionActionPerformed(evt);
            }
        });
        getContentPane().add(txtReligion, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 450, 130, 30));

        jLabel14.setFont(new java.awt.Font("Pixel Georgia", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Religion");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 430, -1, -1));

        jLabel13.setFont(new java.awt.Font("Pixel Georgia", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Password");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 490, -1, -1));

        txtPassword.setBackground(new java.awt.Color(236, 221, 193));
        txtPassword.setFont(new java.awt.Font("TimesNewPixel", 0, 20)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(0, 0, 0));
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        getContentPane().add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 510, 420, 30));

        txtGender.setBackground(new java.awt.Color(236, 221, 193));
        txtGender.setFont(new java.awt.Font("TimesNewPixel", 0, 24)); // NOI18N
        txtGender.setForeground(new java.awt.Color(0, 0, 0));
        txtGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGenderActionPerformed(evt);
            }
        });
        getContentPane().add(txtGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, 130, 30));

        txtUsername.setBackground(new java.awt.Color(236, 221, 193));
        txtUsername.setFont(new java.awt.Font("TimesNewPixel", 0, 20)); // NOI18N
        txtUsername.setForeground(new java.awt.Color(0, 0, 0));
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });
        getContentPane().add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 450, 280, 30));

        jLabel12.setFont(new java.awt.Font("Pixel Georgia", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Username");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 430, -1, -1));

        txtCourse.setBackground(new java.awt.Color(236, 221, 193));
        txtCourse.setFont(new java.awt.Font("TimesNewPixel", 0, 20)); // NOI18N
        txtCourse.setForeground(new java.awt.Color(0, 0, 0));
        txtCourse.setText("eg; BSIT");
        txtCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCourseActionPerformed(evt);
            }
        });
        getContentPane().add(txtCourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 390, 110, 30));

        jLabel11.setFont(new java.awt.Font("Pixel Georgia", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Course");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 370, -1, -1));

        txtYear.setBackground(new java.awt.Color(236, 221, 193));
        txtYear.setFont(new java.awt.Font("TimesNewPixel", 0, 20)); // NOI18N
        txtYear.setForeground(new java.awt.Color(0, 0, 0));
        txtYear.setText("eg; 1st");
        txtYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtYearActionPerformed(evt);
            }
        });
        getContentPane().add(txtYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, 120, 30));

        jLabel10.setFont(new java.awt.Font("Pixel Georgia", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Year Level");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 370, -1, -1));

        txtEmail.setBackground(new java.awt.Color(236, 221, 193));
        txtEmail.setFont(new java.awt.Font("TimesNewPixel", 0, 20)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(0, 0, 0));
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, 260, 30));

        jLabel9.setFont(new java.awt.Font("Pixel Georgia", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Email");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, -1, -1));

        txtContact.setBackground(new java.awt.Color(236, 221, 193));
        txtContact.setFont(new java.awt.Font("TimesNewPixel", 0, 20)); // NOI18N
        txtContact.setForeground(new java.awt.Color(0, 0, 0));
        txtContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContactActionPerformed(evt);
            }
        });
        getContentPane().add(txtContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 140, 30));

        jLabel8.setFont(new java.awt.Font("Pixel Georgia", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Contact No.");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, -1, -1));

        txtAddress.setBackground(new java.awt.Color(236, 221, 193));
        txtAddress.setFont(new java.awt.Font("TimesNewPixel", 0, 20)); // NOI18N
        txtAddress.setForeground(new java.awt.Color(0, 0, 0));
        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });
        getContentPane().add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 420, 30));

        btnLogin.setBackground(new java.awt.Color(232, 197, 106));
        btnLogin.setFont(new java.awt.Font("Pixel Georgia", 0, 24)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(102, 51, 0));
        btnLogin.setText("go to login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 630, -1, -1));

        jLabel7.setFont(new java.awt.Font("Pixel Georgia", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Address");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, -1, -1));

        txtNationality.setBackground(new java.awt.Color(236, 221, 193));
        txtNationality.setFont(new java.awt.Font("TimesNewPixel", 0, 20)); // NOI18N
        txtNationality.setForeground(new java.awt.Color(0, 0, 0));
        txtNationality.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNationalityActionPerformed(evt);
            }
        });
        getContentPane().add(txtNationality, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 260, 30));

        jLabel6.setFont(new java.awt.Font("Pixel Georgia", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Nationality");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, -1, -1));

        txtDateofbirth.setBackground(new java.awt.Color(236, 221, 193));
        txtDateofbirth.setFont(new java.awt.Font("TimesNewPixel", 0, 20)); // NOI18N
        txtDateofbirth.setForeground(new java.awt.Color(0, 0, 0));
        txtDateofbirth.setText("DD/MM/YEAR");
        txtDateofbirth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateofbirthActionPerformed(evt);
            }
        });
        getContentPane().add(txtDateofbirth, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 130, 30));

        jLabel5.setFont(new java.awt.Font("Pixel Georgia", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Date of birth");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, -1, -1));

        txtAge.setBackground(new java.awt.Color(236, 221, 193));
        txtAge.setFont(new java.awt.Font("TimesNewPixel", 1, 20)); // NOI18N
        txtAge.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(txtAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 40, 30));

        txtFullname.setBackground(new java.awt.Color(236, 221, 193));
        txtFullname.setFont(new java.awt.Font("TimesNewPixel", 0, 20)); // NOI18N
        txtFullname.setForeground(new java.awt.Color(0, 0, 0));
        txtFullname.setText("Lastname, Firstname, Middle name");
        txtFullname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFullnameActionPerformed(evt);
            }
        });
        getContentPane().add(txtFullname, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 420, 30));

        jLabel4.setFont(new java.awt.Font("Pixel Georgia", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Gender");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, -1, 20));

        jLabel3.setFont(new java.awt.Font("Pixel Georgia", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Age");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, -1, -1));

        jLabel2.setFont(new java.awt.Font("Pixel Georgia", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Full name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, -1, -1));

        jLabel1.setBackground(new java.awt.Color(236, 221, 193));
        jLabel1.setFont(new java.awt.Font("BitCasual", 0, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bookopen2.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFullnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFullnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFullnameActionPerformed

    private void txtDateofbirthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateofbirthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateofbirthActionPerformed

    private void txtNationalityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNationalityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNationalityActionPerformed

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed

    private void txtContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContactActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtYearActionPerformed

    private void txtCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCourseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCourseActionPerformed

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void txtReligionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtReligionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtReligionActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        if (txtFullname.getText().equals("")||txtAge.getText().equals("")||txtNationality.getText().equals("")||txtDateofbirth.getText().equals("")||txtAddress.getText().equals("")||txtContact.getText().equals("")||txtEmail.getText().equals("")||txtYear.getText().equals("")||txtCourse.getText().equals("")||txtReligion.getText().equals("")||txtUsername.getText().equals("")||txtGender.getText().equals("")||txtPassword.getText().equals("")){
           JOptionPane.showMessageDialog(this, "Fill out every Blanks") ;
        }else{
            String data [] = {txtFullname.getText(),txtAge.getText(),txtNationality.getText(),txtDateofbirth.getText(),txtAddress.getText(),txtContact.getText(),txtEmail.getText(),txtYear.getText(),txtCourse.getText(),txtReligion.getText(),txtUsername.getText(),txtGender.getText(),txtPassword.getText()};
            DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
            tblModel.addRow(data);
           
            UserData.addUser(data);
            
            JOptionPane.showMessageDialog(this,"Goodjob, You may now login" );
            //clear text field after adds
            txtFullname.setText("Lastname, Firstname, Middlename");
            txtAge.setText("");
            txtNationality.setText("");
            txtDateofbirth.setText("");
            txtAddress.setText("");
            txtContact.setText("");
            txtEmail.setText("");
            txtYear.setText("eg; 1st year");
            txtCourse.setText("");
            txtReligion.setText("");
            txtUsername.setText("");
            txtPassword.setText("");
            txtGender.setText("");
            
            
            
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void txtGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGenderActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel ();
        
        String tblFullname = tblModel.getValueAt(jTable1.getSelectedRow(),0).toString();
        String tblAge = tblModel.getValueAt(jTable1.getSelectedRow(),1).toString();
        String tblNationality = tblModel.getValueAt(jTable1.getSelectedRow(),2).toString();
        String tblDateofbirth = tblModel.getValueAt(jTable1.getSelectedRow(),3).toString();
        String tblAddress = tblModel.getValueAt(jTable1.getSelectedRow(),4).toString();
        String tblContact = tblModel.getValueAt(jTable1.getSelectedRow(),5).toString();
        String tblEmail = tblModel.getValueAt(jTable1.getSelectedRow(),6).toString();
        String tblYear = tblModel.getValueAt(jTable1.getSelectedRow(),7).toString();
        String tblCourse = tblModel.getValueAt(jTable1.getSelectedRow(),8).toString();
        String tblReligion = tblModel.getValueAt(jTable1.getSelectedRow(),9).toString();
        String tblUsername = tblModel.getValueAt(jTable1.getSelectedRow(),10).toString();
        String tblGender = tblModel.getValueAt(jTable1.getSelectedRow(),11).toString();
        String tblPassword = tblModel.getValueAt(jTable1.getSelectedRow(),12).toString();
        
        txtFullname.setText(tblFullname);
        txtAge.setText(tblAge);
        txtNationality.setText(tblNationality);
        txtDateofbirth.setText(tblDateofbirth);
        txtAddress.setText(tblAddress);
        txtContact.setText(tblContact);
        txtEmail.setText(tblEmail);
        txtYear.setText(tblYear);
        txtCourse.setText(tblCourse);
        txtReligion.setText(tblReligion);
        txtUsername.setText(tblUsername);
        txtGender.setText(tblGender);
        txtPassword.setText(tblPassword);
        
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        
        DefaultTableModel tblModel = (DefaultTableModel) jTable1.getModel();
    
    int selectedRow = jTable1.getSelectedRow();
    
    if (selectedRow != -1) { // row is selected
        tblModel.removeRow(selectedRow);          // remove from table
        UserData.users.remove(selectedRow);       // remove from UserData as well SO REAL
        JOptionPane.showMessageDialog(this, "Entree Deleted");
    } else {
        if(tblModel.getRowCount() == 0) {
            JOptionPane.showMessageDialog(this,"No row to delete");
        } else {
            JOptionPane.showMessageDialog(this, "Select a single row to delete");
        }
    }
    

    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tblModel = (DefaultTableModel) jTable1.getModel();
        if (jTable1.getSelectedRowCount()== 1){
            
        int selectedRow = jTable1.getSelectedRow();
String[] updatedRow = {
    txtFullname.getText(),
    txtAge.getText(),
    txtNationality.getText(),
    txtDateofbirth.getText(),
    txtAddress.getText(),
    txtContact.getText(),
    txtEmail.getText(),
    txtYear.getText(),
    txtCourse.getText(),
    txtReligion.getText(),
    txtUsername.getText(),
    txtGender.getText(),
    txtPassword.getText()
};

// Update the UserData list
UserData.users.set(selectedRow, updatedRow);
            
            String Fullname = txtFullname.getText();
            String Age = txtAge.getText();
            String Nationality = txtNationality.getText();
            String Dateofbirth = txtDateofbirth.getText();
            String Address = txtAddress.getText();
            String Contact = txtContact.getText();
            String Email = txtEmail.getText();
            String Year = txtYear.getText();
            String Course = txtCourse.getText();
            String Religion = txtReligion.getText();
            String Username = txtUsername.getText();
            String Gender = txtGender.getText();
            String Password = txtPassword.getText();
            
            tblModel.setValueAt(Fullname, jTable1.getSelectedRow(), 0);
            tblModel.setValueAt(Age, jTable1.getSelectedRow(), 1);
            tblModel.setValueAt(Nationality, jTable1.getSelectedRow(), 2);
            tblModel.setValueAt(Dateofbirth, jTable1.getSelectedRow(), 3);
            tblModel.setValueAt(Address, jTable1.getSelectedRow(), 4);
            tblModel.setValueAt(Contact, jTable1.getSelectedRow(), 5);
            tblModel.setValueAt(Email, jTable1.getSelectedRow(), 6);
            tblModel.setValueAt(Year, jTable1.getSelectedRow(), 7);
            tblModel.setValueAt(Course, jTable1.getSelectedRow(), 8);
            tblModel.setValueAt(Religion, jTable1.getSelectedRow(), 9);
            tblModel.setValueAt(Username, jTable1.getSelectedRow(), 10);
            tblModel.setValueAt(Gender, jTable1.getSelectedRow(), 11);
            tblModel.setValueAt(Password, jTable1.getSelectedRow(), 12);
            
            JOptionPane.showMessageDialog(this,"Entree Updated!...");
        }else{
            //if row is empty
            if (jTable1.getRowCount()==0) {
                JOptionPane.showMessageDialog(this,"No entree");
           //if row is not selected or multiple row is selected
            }else{
                JOptionPane.showMessageDialog(this,"Please select an entree");
            }
            
        }
        
    }//GEN-LAST:event_btnEditActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        this.dispose();
        
        new Login().setVisible(true);
    }//GEN-LAST:event_btnLoginActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtCourse;
    private javax.swing.JTextField txtDateofbirth;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFullname;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtNationality;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtReligion;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JTextField txtYear;
    // End of variables declaration//GEN-END:variables
}
