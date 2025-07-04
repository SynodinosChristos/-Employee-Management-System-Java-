/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package eksetasi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class Select_employeeForm extends javax.swing.JFrame {
    private String firstname;
    private String lastname;
    private int id;

    /**
     * Creates new form Select_employeeForm
     */
    public Select_employeeForm() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Firstname_text = new javax.swing.JTextField();
        Lastname_text = new javax.swing.JTextField();
        ID_field = new javax.swing.JTextField();
        Select_button = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Select_table = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        Select = new javax.swing.JMenu();
        Select_employees = new javax.swing.JMenuItem();
        Select_phones = new javax.swing.JMenuItem();
        Select_employeeStatus = new javax.swing.JMenuItem();
        Select_salaryHistory = new javax.swing.JMenuItem();
        Select_leaveDays = new javax.swing.JMenuItem();
        Select_sickDays = new javax.swing.JMenuItem();
        Select_unpaidAbsences = new javax.swing.JMenuItem();
        Select_workHours = new javax.swing.JMenuItem();
        Select_authorizedUsers = new javax.swing.JMenuItem();
        Insert = new javax.swing.JMenu();
        Insert_employee = new javax.swing.JMenuItem();
        Insert_employeePhones = new javax.swing.JMenuItem();
        Insert_employeeStatus = new javax.swing.JMenuItem();
        Insert_salaryHistory = new javax.swing.JMenuItem();
        Insert_leaveDays = new javax.swing.JMenuItem();
        Insert_sickDays = new javax.swing.JMenuItem();
        Insert_unpaidAbsences = new javax.swing.JMenuItem();
        Insert_workHours = new javax.swing.JMenuItem();
        Insert_authorizedUsers = new javax.swing.JMenuItem();
        Salaries = new javax.swing.JMenu();
        Payment = new javax.swing.JMenuItem();
        Salary_receipt = new javax.swing.JMenuItem();
        General_payroll = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Firstname");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Lastname");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setText("Employees");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setText("EmployeeID");

        Firstname_text.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Firstname_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Firstname_textActionPerformed(evt);
            }
        });

        Lastname_text.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        ID_field.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        Select_button.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Select_button.setText("Select");
        Select_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Select_buttonActionPerformed(evt);
            }
        });

        Select_table.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Select_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        Select_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Select_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Select_table);

        Select.setText("Select");

        Select_employees.setText("Employees");
        Select.add(Select_employees);

        Select_phones.setText("Phones");
        Select_phones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Select_phonesActionPerformed(evt);
            }
        });
        Select.add(Select_phones);

        Select_employeeStatus.setText("Status");
        Select_employeeStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Select_employeeStatusActionPerformed(evt);
            }
        });
        Select.add(Select_employeeStatus);

        Select_salaryHistory.setText("Salary History");
        Select_salaryHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Select_salaryHistoryActionPerformed(evt);
            }
        });
        Select.add(Select_salaryHistory);

        Select_leaveDays.setText("Leave Days");
        Select_leaveDays.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Select_leaveDaysActionPerformed(evt);
            }
        });
        Select.add(Select_leaveDays);

        Select_sickDays.setText("Sick Days");
        Select_sickDays.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Select_sickDaysActionPerformed(evt);
            }
        });
        Select.add(Select_sickDays);

        Select_unpaidAbsences.setText("Absence Days");
        Select_unpaidAbsences.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Select_unpaidAbsencesActionPerformed(evt);
            }
        });
        Select.add(Select_unpaidAbsences);

        Select_workHours.setText("Hours Worked");
        Select_workHours.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Select_workHoursActionPerformed(evt);
            }
        });
        Select.add(Select_workHours);

        Select_authorizedUsers.setText("Authorization");
        Select_authorizedUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Select_authorizedUsersActionPerformed(evt);
            }
        });
        Select.add(Select_authorizedUsers);

        jMenuBar1.add(Select);

        Insert.setText("Insert");

        Insert_employee.setText("Employee");
        Insert_employee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Insert_employeeActionPerformed(evt);
            }
        });
        Insert.add(Insert_employee);

        Insert_employeePhones.setText("Phones");
        Insert_employeePhones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Insert_employeePhonesActionPerformed(evt);
            }
        });
        Insert.add(Insert_employeePhones);

        Insert_employeeStatus.setText("Status");
        Insert_employeeStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Insert_employeeStatusActionPerformed(evt);
            }
        });
        Insert.add(Insert_employeeStatus);

        Insert_salaryHistory.setText("Salary History");
        Insert_salaryHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Insert_salaryHistoryActionPerformed(evt);
            }
        });
        Insert.add(Insert_salaryHistory);

        Insert_leaveDays.setText("Leave Days");
        Insert_leaveDays.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Insert_leaveDaysActionPerformed(evt);
            }
        });
        Insert.add(Insert_leaveDays);

        Insert_sickDays.setText("Sick Days");
        Insert_sickDays.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Insert_sickDaysActionPerformed(evt);
            }
        });
        Insert.add(Insert_sickDays);

        Insert_unpaidAbsences.setText("Absence Days");
        Insert_unpaidAbsences.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Insert_unpaidAbsencesActionPerformed(evt);
            }
        });
        Insert.add(Insert_unpaidAbsences);

        Insert_workHours.setText("Hours Worked");
        Insert_workHours.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Insert_workHoursActionPerformed(evt);
            }
        });
        Insert.add(Insert_workHours);

        Insert_authorizedUsers.setText("Authorization");
        Insert_authorizedUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Insert_authorizedUsersActionPerformed(evt);
            }
        });
        Insert.add(Insert_authorizedUsers);

        jMenuBar1.add(Insert);

        Salaries.setText("Salaries");

        Payment.setText("Payment");
        Payment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PaymentActionPerformed(evt);
            }
        });
        Salaries.add(Payment);

        Salary_receipt.setText("Salary Receipt");
        Salary_receipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Salary_receiptActionPerformed(evt);
            }
        });
        Salaries.add(Salary_receipt);

        General_payroll.setText("General Payroll");
        General_payroll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                General_payrollActionPerformed(evt);
            }
        });
        Salaries.add(General_payroll);

        jMenuBar1.add(Salaries);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(276, 276, 276))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ID_field))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Select_button, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(295, 295, 295))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Firstname_text, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Lastname_text, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(113, 113, 113))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Lastname_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Firstname_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ID_field))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(Select_button, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Select_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Select_buttonActionPerformed
        // TODO add your handling code here:
        this.firstname = Firstname_text.getText().trim().toLowerCase();
        this.lastname = Lastname_text.getText().trim().toLowerCase();
        String idText = ID_field.getText().trim();
        Connection conn = null;
        try{
            conn = DriverManager.getConnection(LoginForm.CONN_STRING, LoginForm.USERNAME, LoginForm.PASSWORD);
            this.id = -1;
            if(!idText.isEmpty()){
               try{
                   this.id = Integer.parseInt(idText);
               } 
               catch(NumberFormatException e){
                   JOptionPane.showMessageDialog(null, "Το ID πρέπει να είναι αριθμός.");
                   return;
               }
            }
            if(this.id == -1 && firstname.isEmpty() && lastname.isEmpty()){
               JOptionPane.showMessageDialog(null, "Παρακαλώ εισάγετε ID ή ονοματεπώνυμο για αναζήτηση.");
               return;
            }
            
            String query = "SELECT EmployeeID, FirstName, LastName FROM employees.employees "
                         + "WHERE (? <> -1 AND EmployeeID = ?) "
                         + "OR (? = -1 AND LOWER(FirstName) LIKE ? AND LOWER(LastName) LIKE ?)";
            try (PreparedStatement pstmt = conn.prepareStatement(query)) {
                pstmt.setInt(1, this.id);
                pstmt.setInt(2, this.id);
                pstmt.setInt(3, this.id);
                pstmt.setString(4, "%" + this.firstname + "%");
                pstmt.setString(5, "%" + this.lastname + "%");
                try (ResultSet rs = pstmt.executeQuery()) {
                    ResultSetMetaData rsmd = rs.getMetaData();
                    int columnCount = rsmd.getColumnCount();
                    
                    Vector<String> columnNames = new Vector<>();
                    for(int i = 1; i <= columnCount; i++){
                        columnNames.add(rsmd.getColumnName(i));
                    }

                    Vector<Vector<Object>> data = new Vector<>();
                    while(rs.next()){
                        Vector<Object> row = new Vector<>();
                        for(int i = 1; i <= columnCount; i++){
                            row.add(rs.getObject(i));
                        }
                        data.add(row);
                    }
                    
                    if(data.isEmpty()){
                        DefaultTableModel emptyModel = new DefaultTableModel();
                        Select_table.setModel(emptyModel);
                        JOptionPane.showMessageDialog(null, "Δεν βρέθηκαν αποτελέσματα.");
                    }
                    else{
                        DefaultTableModel model = new DefaultTableModel(data, columnNames);
                        Select_table.setModel(model);
                    }
                }
            }
            conn.close();
        }
        catch(SQLException exce){
            JOptionPane.showMessageDialog(null, exce.getMessage());
        }
    }//GEN-LAST:event_Select_buttonActionPerformed

    private void Firstname_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Firstname_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Firstname_textActionPerformed

    private void Select_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Select_tableMouseClicked
        // TODO add your handling code here:
        int row = Select_table.getSelectedRow(); 
        if(row != -1){
           int employeeID = (int) Select_table.getValueAt(row, 0);
           new ShowEmployeeForm(employeeID).setVisible(true);
        }    
    }//GEN-LAST:event_Select_tableMouseClicked

    private void Select_phonesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Select_phonesActionPerformed
        // TODO add your handling code here:
        Select_employeePhonesForm f = new Select_employeePhonesForm();
        f.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_Select_phonesActionPerformed

    private void Select_employeeStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Select_employeeStatusActionPerformed
        // TODO add your handling code here:
        Select_employeeStatusForm f = new Select_employeeStatusForm();
        f.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_Select_employeeStatusActionPerformed

    private void Select_salaryHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Select_salaryHistoryActionPerformed
        // TODO add your handling code here:
        Select_salaryHistoryForm f = new Select_salaryHistoryForm();
        f.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_Select_salaryHistoryActionPerformed

    private void Select_leaveDaysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Select_leaveDaysActionPerformed
        // TODO add your handling code here:
        Select_leaveDaysForm f = new Select_leaveDaysForm();
        f.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_Select_leaveDaysActionPerformed

    private void Select_sickDaysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Select_sickDaysActionPerformed
        // TODO add your handling code here:
       Select_sickDaysForm f = new Select_sickDaysForm();
        f.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_Select_sickDaysActionPerformed

    private void Select_unpaidAbsencesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Select_unpaidAbsencesActionPerformed
        // TODO add your handling code here:
        Select_unpaidAbsencesForm f = new Select_unpaidAbsencesForm();
        f.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_Select_unpaidAbsencesActionPerformed

    private void Select_workHoursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Select_workHoursActionPerformed
        // TODO add your handling code here:
        Select_workHoursForm f = new Select_workHoursForm();
        f.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_Select_workHoursActionPerformed

    private void Select_authorizedUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Select_authorizedUsersActionPerformed
        // TODO add your handling code here:
        Select_authorizationForm f = new Select_authorizationForm();
        f.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_Select_authorizedUsersActionPerformed

    private void Insert_employeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Insert_employeeActionPerformed
        // TODO add your handling code here:
        Insert_employeeForm f = new Insert_employeeForm();
        f.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_Insert_employeeActionPerformed

    private void Insert_employeePhonesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Insert_employeePhonesActionPerformed
        // TODO add your handling code here:
        Insert_employeePhonesForm f = new Insert_employeePhonesForm();
        f.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_Insert_employeePhonesActionPerformed

    private void Insert_employeeStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Insert_employeeStatusActionPerformed
        // TODO add your handling code here:
        Insert_employeeStatusForm f = new Insert_employeeStatusForm();
        f.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_Insert_employeeStatusActionPerformed

    private void Insert_salaryHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Insert_salaryHistoryActionPerformed
        // TODO add your handling code here:
        Insert_salaryHistoryForm f = new Insert_salaryHistoryForm();
        f.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_Insert_salaryHistoryActionPerformed

    private void Insert_leaveDaysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Insert_leaveDaysActionPerformed
        // TODO add your handling code here:
        Insert_leaveDaysForm f = new Insert_leaveDaysForm();
        f.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_Insert_leaveDaysActionPerformed

    private void Insert_sickDaysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Insert_sickDaysActionPerformed
        // TODO add your handling code here:
        Insert_sickDaysForm f = new Insert_sickDaysForm();
        f.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_Insert_sickDaysActionPerformed

    private void Insert_unpaidAbsencesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Insert_unpaidAbsencesActionPerformed
        // TODO add your handling code here:
        Insert_unpaidAbsencesForm f = new Insert_unpaidAbsencesForm();
        f.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_Insert_unpaidAbsencesActionPerformed

    private void Insert_workHoursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Insert_workHoursActionPerformed
        // TODO add your handling code here:
        Insert_workHoursForm f = new Insert_workHoursForm();
        f.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_Insert_workHoursActionPerformed

    private void Insert_authorizedUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Insert_authorizedUsersActionPerformed
        // TODO add your handling code here:
        Insert_authorizationForm f = new Insert_authorizationForm();
        f.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_Insert_authorizedUsersActionPerformed

    private void PaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PaymentActionPerformed
        // TODO add your handling code here:
        PaymentForm f = new PaymentForm();
        f.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_PaymentActionPerformed

    private void Salary_receiptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Salary_receiptActionPerformed
        // TODO add your handling code here:
        SalaryReceiptForm f = new SalaryReceiptForm();
        f.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_Salary_receiptActionPerformed

    private void General_payrollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_General_payrollActionPerformed
        // TODO add your handling code here:
        GeneralPayrollForm f = new GeneralPayrollForm();
        f.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_General_payrollActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Select_employeeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Select_employeeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Select_employeeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Select_employeeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Select_employeeForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Firstname_text;
    private javax.swing.JMenuItem General_payroll;
    private javax.swing.JTextField ID_field;
    private javax.swing.JMenu Insert;
    private javax.swing.JMenuItem Insert_authorizedUsers;
    private javax.swing.JMenuItem Insert_employee;
    private javax.swing.JMenuItem Insert_employeePhones;
    private javax.swing.JMenuItem Insert_employeeStatus;
    private javax.swing.JMenuItem Insert_leaveDays;
    private javax.swing.JMenuItem Insert_salaryHistory;
    private javax.swing.JMenuItem Insert_sickDays;
    private javax.swing.JMenuItem Insert_unpaidAbsences;
    private javax.swing.JMenuItem Insert_workHours;
    private javax.swing.JTextField Lastname_text;
    private javax.swing.JMenuItem Payment;
    private javax.swing.JMenu Salaries;
    private javax.swing.JMenuItem Salary_receipt;
    private javax.swing.JMenu Select;
    private javax.swing.JMenuItem Select_authorizedUsers;
    private javax.swing.JButton Select_button;
    private javax.swing.JMenuItem Select_employeeStatus;
    private javax.swing.JMenuItem Select_employees;
    private javax.swing.JMenuItem Select_leaveDays;
    private javax.swing.JMenuItem Select_phones;
    private javax.swing.JMenuItem Select_salaryHistory;
    private javax.swing.JMenuItem Select_sickDays;
    private javax.swing.JTable Select_table;
    private javax.swing.JMenuItem Select_unpaidAbsences;
    private javax.swing.JMenuItem Select_workHours;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
