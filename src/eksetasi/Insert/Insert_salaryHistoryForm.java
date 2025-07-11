/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package eksetasi;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class Insert_salaryHistoryForm extends javax.swing.JFrame {

    /**
     * Creates new form Insert_salaryHistoryForm
     */
    public Insert_salaryHistoryForm() {
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
        ID_field = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        salary_field = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        effectiveDate_field = new javax.swing.JTextField();
        Insert_button = new javax.swing.JButton();
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

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Salary History");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("EmployeeID");

        ID_field.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("Salary");

        salary_field.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        salary_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salary_fieldActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setText("Effective Date");

        effectiveDate_field.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        Insert_button.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Insert_button.setText("Insert");
        Insert_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Insert_buttonActionPerformed(evt);
            }
        });

        Select.setText("Select");

        Select_employees.setText("Employees");
        Select_employees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Select_employeesActionPerformed(evt);
            }
        });
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(ID_field, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(126, 126, 126)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(salary_field, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(91, 91, 91))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(306, 306, 306)
                                        .addComponent(Insert_button, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(233, 233, 233)
                                        .addComponent(jLabel1)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)))
                        .addComponent(effectiveDate_field, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ID_field)
                    .addComponent(effectiveDate_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salary_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addComponent(Insert_button)
                .addGap(210, 210, 210))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Select_employeesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Select_employeesActionPerformed
        // TODO add your handling code here:
        Select_employeeForm f = new Select_employeeForm();
        f.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_Select_employeesActionPerformed

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

    private void Insert_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Insert_buttonActionPerformed
        // TODO add your handling code here:
        Connection conn = null;
        try{
            conn = DriverManager.getConnection(LoginForm.CONN_STRING, LoginForm.USERNAME, LoginForm.PASSWORD);
            String salary = salary_field.getText().trim();
            String effectiveDate = effectiveDate_field.getText().trim();
            String idText = ID_field.getText().trim();
            if(idText.isEmpty() && salary.isEmpty() && effectiveDate.isEmpty()){
                JOptionPane.showMessageDialog(null, "Εισάγετε ID, μισθό και ημερομηνία έναρξης ισχύος");
                return;
            }
            else if(idText.isEmpty()){
                JOptionPane.showMessageDialog(null, "Εισάγετε ID");
                return;
            }
            else if(salary.isEmpty()){
                JOptionPane.showMessageDialog(null, "Εισάγετε μισθό");
                return;
            }
            else if(effectiveDate.isEmpty()){
                JOptionPane.showMessageDialog(null, "Εισάγετε ημερομηνία έναρξης ισχύος");
                return;
            }

            int id;
            try{
                id = Integer.parseInt(idText);
            }
            catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Το ID πρέπει να είναι αριθμός");
                return;
            }

            String sql = "INSERT INTO salaryhistory (EmployeeID, Salary, EffectiveDate) "
            + "VALUES (?, ?, ?)";
            try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
                pstmt.setInt(1, id);
                pstmt.setString(2, salary);
                pstmt.setString(3, effectiveDate);
                int rowsInserted = pstmt.executeUpdate();
                if(rowsInserted > 0){
                    JOptionPane.showMessageDialog(null, "Επιτυχής εισαγωγή!");
                }
                else{
                    JOptionPane.showMessageDialog(null, "Αποτυχία!");
                }
            }
            conn.close();
        }
        catch(SQLException exce){
            JOptionPane.showMessageDialog(null, exce.getMessage());
        }
    }//GEN-LAST:event_Insert_buttonActionPerformed

    private void salary_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salary_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salary_fieldActionPerformed

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
            java.util.logging.Logger.getLogger(Insert_salaryHistoryForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Insert_salaryHistoryForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Insert_salaryHistoryForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Insert_salaryHistoryForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Insert_salaryHistoryForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem General_payroll;
    private javax.swing.JTextField ID_field;
    private javax.swing.JMenu Insert;
    private javax.swing.JMenuItem Insert_authorizedUsers;
    private javax.swing.JButton Insert_button;
    private javax.swing.JMenuItem Insert_employee;
    private javax.swing.JMenuItem Insert_employeePhones;
    private javax.swing.JMenuItem Insert_employeeStatus;
    private javax.swing.JMenuItem Insert_leaveDays;
    private javax.swing.JMenuItem Insert_salaryHistory;
    private javax.swing.JMenuItem Insert_sickDays;
    private javax.swing.JMenuItem Insert_unpaidAbsences;
    private javax.swing.JMenuItem Insert_workHours;
    private javax.swing.JMenuItem Payment;
    private javax.swing.JMenu Salaries;
    private javax.swing.JMenuItem Salary_receipt;
    private javax.swing.JMenu Select;
    private javax.swing.JMenuItem Select_authorizedUsers;
    private javax.swing.JMenuItem Select_employeeStatus;
    private javax.swing.JMenuItem Select_employees;
    private javax.swing.JMenuItem Select_leaveDays;
    private javax.swing.JMenuItem Select_phones;
    private javax.swing.JMenuItem Select_salaryHistory;
    private javax.swing.JMenuItem Select_sickDays;
    private javax.swing.JMenuItem Select_unpaidAbsences;
    private javax.swing.JMenuItem Select_workHours;
    private javax.swing.JTextField effectiveDate_field;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JTextField salary_field;
    // End of variables declaration//GEN-END:variables
}
