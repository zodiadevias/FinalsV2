package Forms;

import Forms.employee;
import Forms.db;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;


public class employeeDeductions extends javax.swing.JFrame {
Connection conn=null;
ResultSet rs=null;
PreparedStatement pst=null;
    
    public employeeDeductions() {
        initComponents();
         conn=db.java_db();
         
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2, 
        size.height/2 - getHeight()/2);
         
         
         lbl_emp.setText(String.valueOf(employee.empID).toString());
         
         
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_id = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txt_search = new javax.swing.JTextField();
        txt_firstname = new javax.swing.JTextField();
        txt_surname = new javax.swing.JTextField();
        txt_dob = new javax.swing.JTextField();
        txt_dep = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txt_desig = new javax.swing.JTextField();
        txt_status = new javax.swing.JTextField();
        txt_doj = new javax.swing.JTextField();
        txt_job = new javax.swing.JTextField();
        txt_salary = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        txt_Save = new javax.swing.JButton();
        txt_reason = new javax.swing.JTextField();
        lbl_total = new javax.swing.JLabel();
        lbl_emp = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        r_percentage = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        r_amount2 = new javax.swing.JRadioButton();
        txt_deduction = new javax.swing.JTextField();
        txt_percentage = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbl_sal = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        r_percentage1 = new javax.swing.JRadioButton();
        r_amount3 = new javax.swing.JRadioButton();
        txt_deduction1 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txt_percentage1 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        r_percentage2 = new javax.swing.JRadioButton();
        r_amount4 = new javax.swing.JRadioButton();
        txt_deduction2 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        txt_percentage2 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        r_percentage3 = new javax.swing.JRadioButton();
        r_amount5 = new javax.swing.JRadioButton();
        txt_deduction3 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        txt_percentage3 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        r_percentage4 = new javax.swing.JRadioButton();
        r_amount6 = new javax.swing.JRadioButton();
        txt_deduction4 = new javax.swing.JTextField();
        txt_percentage4 = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lbl_remarks = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Deductions");
        setResizable(false);

        txt_id.setEditable(false);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Adobe Arabic", 1, 14))); // NOI18N

        jLabel11.setText("Employee ID :");

        txt_search.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentRemoved(java.awt.event.ContainerEvent evt) {
                txt_searchComponentRemoved(evt);
            }
        });
        txt_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_searchActionPerformed(evt);
            }
        });
        txt_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_searchKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(txt_search, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txt_firstname.setEditable(false);
        txt_firstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_firstnameActionPerformed(evt);
            }
        });

        txt_surname.setEditable(false);

        txt_dob.setEditable(false);

        txt_dep.setEditable(false);

        jLabel13.setText("Basic Salary :");

        jLabel20.setText("Job Title :");

        jLabel19.setText("Date Hired :");

        jLabel18.setText("Status :");

        jLabel17.setText("Designation :");

        txt_desig.setEditable(false);

        txt_status.setEditable(false);

        txt_doj.setEditable(false);

        txt_job.setEditable(false);
        txt_job.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_jobActionPerformed(evt);
            }
        });

        txt_salary.setEditable(false);
        txt_salary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_salaryActionPerformed(evt);
            }
        });

        jLabel9.setText("Department :");

        jLabel8.setText("Date of Birth :");

        jLabel7.setText("Surname :");

        jLabel4.setText("First name :");

        jLabel6.setText("Employee id :");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Calculate.png"))); // NOI18N
        jButton1.setText("Calculate");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Reason:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Total Deduction:");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/erase-128.png"))); // NOI18N
        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        txt_Save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Save-icon.png"))); // NOI18N
        txt_Save.setText("Save");
        txt_Save.setEnabled(false);
        txt_Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_SaveActionPerformed(evt);
            }
        });

        txt_reason.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_reasonKeyReleased(evt);
            }
        });

        lbl_total.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_total.setText("0.00");

        lbl_emp.setText("user");

        jLabel10.setText("Logged in:");

        r_percentage.setText("Percentage (%)");
        r_percentage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_percentageActionPerformed(evt);
            }
        });

        jLabel12.setText("Update Salary by :");

        r_amount2.setText("Amount");
        r_amount2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_amount2ActionPerformed(evt);
            }
        });

        txt_deduction.setEditable(false);
        txt_deduction.setText("0");
        txt_deduction.setEnabled(false);
        txt_deduction.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_deductionKeyReleased(evt);
            }
        });

        txt_percentage.setEditable(false);
        txt_percentage.setText("0");
        txt_percentage.setEnabled(false);
        txt_percentage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_percentageActionPerformed(evt);
            }
        });
        txt_percentage.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_percentageKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_percentageKeyReleased(evt);
            }
        });

        jLabel14.setText("Percentage :");

        jLabel15.setText("Amount:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Salary after deduction:");

        lbl_sal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_sal.setText("0.00");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("SSS");

        jLabel16.setText("Update Salary by :");

        r_percentage1.setText("Percentage (%)");
        r_percentage1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_percentage1ActionPerformed(evt);
            }
        });

        r_amount3.setText("Amount");
        r_amount3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_amount3ActionPerformed(evt);
            }
        });

        txt_deduction1.setEditable(false);
        txt_deduction1.setText("0");
        txt_deduction1.setEnabled(false);
        txt_deduction1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_deduction1KeyReleased(evt);
            }
        });

        jLabel21.setText("Amount:");

        txt_percentage1.setEditable(false);
        txt_percentage1.setText("0");
        txt_percentage1.setEnabled(false);
        txt_percentage1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_percentage1KeyReleased(evt);
            }
        });

        jLabel22.setText("Percentage :");

        jLabel23.setText("Update Salary by :");

        r_percentage2.setText("Percentage (%)");
        r_percentage2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_percentage2ActionPerformed(evt);
            }
        });

        r_amount4.setText("Amount");
        r_amount4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_amount4ActionPerformed(evt);
            }
        });

        txt_deduction2.setEditable(false);
        txt_deduction2.setText("0");
        txt_deduction2.setEnabled(false);
        txt_deduction2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_deduction2KeyReleased(evt);
            }
        });

        jLabel24.setText("Amount:");

        txt_percentage2.setEditable(false);
        txt_percentage2.setText("0");
        txt_percentage2.setEnabled(false);
        txt_percentage2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_percentage2KeyReleased(evt);
            }
        });

        jLabel25.setText("Percentage :");

        jLabel26.setText("Update Salary by :");

        r_percentage3.setText("Percentage (%)");
        r_percentage3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_percentage3ActionPerformed(evt);
            }
        });

        r_amount5.setText("Amount");
        r_amount5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_amount5ActionPerformed(evt);
            }
        });

        txt_deduction3.setEditable(false);
        txt_deduction3.setText("0");
        txt_deduction3.setEnabled(false);
        txt_deduction3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_deduction3KeyReleased(evt);
            }
        });

        jLabel27.setText("Amount:");

        txt_percentage3.setEditable(false);
        txt_percentage3.setText("0");
        txt_percentage3.setEnabled(false);
        txt_percentage3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_percentage3KeyReleased(evt);
            }
        });

        jLabel28.setText("Percentage :");

        jLabel29.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel29.setText("Pag-Ibig");

        jLabel30.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel30.setText("Philhealth");

        jLabel31.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel31.setText("Tax");

        jLabel32.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel32.setText("Other");

        jLabel33.setText("Update Salary by :");

        r_percentage4.setText("Percentage (%)");
        r_percentage4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_percentage4ActionPerformed(evt);
            }
        });

        r_amount6.setText("Amount");
        r_amount6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_amount6ActionPerformed(evt);
            }
        });

        txt_deduction4.setEditable(false);
        txt_deduction4.setText("0");
        txt_deduction4.setEnabled(false);
        txt_deduction4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_deduction4KeyReleased(evt);
            }
        });

        txt_percentage4.setEditable(false);
        txt_percentage4.setText("0");
        txt_percentage4.setEnabled(false);
        txt_percentage4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_percentage4KeyReleased(evt);
            }
        });

        jLabel35.setText("Percentage :");

        jLabel36.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel36.setText("Remarks:");

        lbl_remarks.setEditable(false);
        lbl_remarks.setColumns(20);
        lbl_remarks.setRows(5);
        jScrollPane1.setViewportView(lbl_remarks);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel31)
                        .addGap(207, 207, 207))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txt_surname, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_firstname)
                                    .addComponent(txt_dob, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_id)
                                    .addComponent(txt_dep, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(53, 53, 53)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel18)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel19)
                                            .addComponent(jLabel13)
                                            .addComponent(jLabel17)
                                            .addComponent(jLabel20))
                                        .addGap(14, 14, 14)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txt_doj)
                                            .addComponent(txt_salary)
                                            .addComponent(txt_status)
                                            .addComponent(txt_desig)
                                            .addComponent(txt_job, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel5)
                                                    .addComponent(jLabel2))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(49, 49, 49)
                                                        .addComponent(lbl_sal, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(18, 18, 18)
                                                        .addComponent(lbl_total, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txt_Save, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(36, 36, 36))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel36)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jScrollPane1))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_emp)
                                .addGap(502, 502, 502)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(203, 203, 203)
                                        .addComponent(jLabel3))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(188, 188, 188)
                                        .addComponent(jLabel30)))
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(txt_percentage1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLabel21))
                                                    .addComponent(r_percentage1))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(r_amount3)
                                                    .addComponent(txt_deduction1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(r_percentage)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addComponent(jLabel29)
                                                            .addComponent(txt_percentage, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLabel15)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(r_amount2)
                                                    .addComponent(txt_deduction, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.TRAILING))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(txt_percentage2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLabel24))
                                                    .addComponent(r_percentage2))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(r_amount4)
                                                    .addComponent(txt_deduction2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jLabel35, javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addComponent(jLabel33, javax.swing.GroupLayout.Alignment.TRAILING))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(txt_percentage4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(r_percentage4))
                                                        .addGap(45, 45, 45)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(r_amount6)
                                                            .addComponent(txt_deduction4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel1)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(txt_reason, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.TRAILING))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                            .addComponent(txt_percentage3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(jLabel27))
                                                        .addComponent(r_percentage3))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(r_amount5)
                                                        .addComponent(txt_deduction3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                        .addGap(19, 19, 19))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel32)
                                        .addGap(196, 196, 196))))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(7, 7, 7)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(txt_firstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel29)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(r_percentage1)
                                            .addComponent(r_amount3)
                                            .addComponent(jLabel16))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel22)
                                            .addComponent(txt_percentage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_deduction1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel21)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txt_desig, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel17))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel18)
                                            .addComponent(txt_status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(44, 44, 44)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel19)
                                            .addComponent(txt_doj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_surname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel7))))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(13, 13, 13)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel20)
                                            .addComponent(txt_job, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_dob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel8))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel30)
                                        .addGap(1, 1, 1)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(r_percentage2)
                                            .addComponent(r_amount4)
                                            .addComponent(jLabel23))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel25)
                                            .addComponent(txt_percentage2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_deduction2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel24)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel13)
                                            .addComponent(txt_salary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel9)
                                            .addComponent(txt_dep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txt_Save, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(r_percentage)
                            .addComponent(r_amount2)
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(txt_percentage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_deduction, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))))
                .addGap(25, 25, 25)
                .addComponent(jLabel31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(r_percentage3)
                            .addComponent(r_amount5)
                            .addComponent(jLabel26))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28)
                            .addComponent(txt_percentage3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_deduction3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel2))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(lbl_total)
                            .addGap(18, 18, 18)
                            .addComponent(lbl_sal))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel36)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(r_percentage4)
                            .addComponent(r_amount6)
                            .addComponent(jLabel33))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel35)
                            .addComponent(txt_percentage4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_deduction4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_reason, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(lbl_emp))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_searchComponentRemoved(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_txt_searchComponentRemoved
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_searchComponentRemoved

    private void txt_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_searchActionPerformed

    private void txt_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchKeyReleased
        // TODO add your handling code here:
        try{

            String sql ="select * from Staff_information where id=? ";

            pst=conn.prepareStatement(sql);
            pst.setString(1,txt_search.getText());
            rs=pst.executeQuery();

            String add1 =rs.getString("id");
            txt_id.setText(add1);

            String add2 =rs.getString("first_name");
            txt_firstname.setText(add2);

            String add3 =rs.getString("surname");
            txt_surname.setText(add3);

            String add4 =rs.getString("Dob");
            txt_dob.setText(add4);

            String add5 =rs.getString("Department");
            txt_dep.setText(add5);

            String add7 =rs.getString("Salary");
            txt_salary.setText(add7);

            String add8 =rs.getString("Status");
            txt_status.setText(add8);

            String add9 =rs.getString("Date_hired");
            txt_doj.setText(add9);

            String add10 =rs.getString("job_title");
            txt_job.setText(add10);

            String add17 =rs.getString("Designation");
            txt_desig.setText(add17);

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "No Data");
        }
        finally {

            try{

                rs.close();
                pst.close();

            }
            catch(Exception e){

            }
        }
    }//GEN-LAST:event_txt_searchKeyReleased

    private void txt_firstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_firstnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_firstnameActionPerformed

    private void txt_jobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_jobActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_jobActionPerformed

    private void txt_salaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_salaryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_salaryActionPerformed

    private void txt_SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_SaveActionPerformed
        // TODO add your handling code here:
        
        int p = JOptionPane.showConfirmDialog(null, "Are you sure you want to add record?","Add Record",JOptionPane.YES_NO_OPTION);
        if(p==0){
              deleteRecords("Deductions",txt_id.getText());
              String value3 = lbl_emp.getText();
            try {

                String sql ="insert into Deductions (firstname,surname,salary,deduction_amount,deduction_reason,emp_id,made_by) values (?,?,?,?,?,?,'"+value3+"')";
                pst=conn.prepareStatement(sql);
                pst.setString(1,txt_firstname.getText());
                pst.setString(2,txt_surname.getText());
                pst.setString(3,txt_salary.getText());
                pst.setString(4,lbl_total.getText());
                pst.setString(5,lbl_remarks.getText());
                pst.setString(6,txt_id.getText());
  
                pst.execute();
                JOptionPane.showMessageDialog(null,"Data is saved successfully");

            }
            catch (Exception e)

            {
                JOptionPane.showMessageDialog(null,e);
            }
             try{
            Date currentDate = GregorianCalendar.getInstance().getTime();
            DateFormat df = DateFormat.getDateInstance();
            String dateString = df.format(currentDate);

            Date d = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
            String timeString = sdf.format(d);

            String value0 = timeString;
            String values = dateString;
            String val = lbl_emp.getText().toString();
            
            
                String reg= "insert into Audit (emp_id, date, status) values ('"+val+"','"+value0+" / "+values+"','Updated Deduction Record')";
                pst=conn.prepareStatement(reg);
                pst.execute();
            }
          catch (Exception e)

            {
                JOptionPane.showMessageDialog(null,e);
            }
         finally {

                try{
                    rs.close();
                    pst.close();

                }
                 catch(Exception e){
                   JOptionPane.showMessageDialog(null,e);
                }
            }
        }
        
    }//GEN-LAST:event_txt_SaveActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        txt_Save.setEnabled(true);
        double sss = 0;
        double pagibig = 0;
        double philhealth = 0;
        double tax = 0;
        double other = 0;
        
        double salary = Double.parseDouble(txt_salary.getText());
         
        //SSS
         if(r_percentage.isSelected()== true){
            sss = salary /100 * Double.parseDouble(txt_percentage.getText());
         }
        
        if(r_amount2.isSelected()== true){
            sss = Double.parseDouble(txt_deduction.getText());
        }
        //end SSS
        
        //Pag-ibig
        if(r_percentage1.isSelected()== true){
            pagibig = salary /100 * Double.parseDouble(txt_percentage1.getText());
         }
        
        if(r_amount3.isSelected()== true){
            pagibig = Double.parseDouble(txt_deduction1.getText());
        }
        //end Pag-ibig
        
        //Philhealth
        if(r_percentage2.isSelected()== true){
            philhealth = salary /100 * Double.parseDouble(txt_percentage2.getText());
         }
        
        if(r_amount4.isSelected()== true){
            philhealth = Double.parseDouble(txt_deduction2.getText());
        }
        //end Philhealth
        
        //Tax
        if(r_percentage3.isSelected()== true){
            tax = salary /100 * Double.parseDouble(txt_percentage3.getText());
         }
        
        if(r_amount5.isSelected()== true){
            tax = Double.parseDouble(txt_deduction3.getText());
        }
        //end Tax
        
        //other
        if(r_percentage4.isSelected()== true){
            other = salary /100 * Double.parseDouble(txt_percentage4.getText());
         }
        
        if(r_amount6.isSelected()== true){
            other = Double.parseDouble(txt_deduction4.getText());
        }
        
        if(txt_reason.getText().equals("")){
            lbl_remarks.setText("SSS:"+sss+"|Pag-ibig:"+pagibig+"|Philhealth:"+philhealth+"|Tax:"+tax+"|"+"Other:"+other);
        }else{
            lbl_remarks.setText("SSS:"+sss+"|Pag-ibig:"+pagibig+"|Philhealth:"+philhealth+"|Tax:"+tax+"|"+txt_reason.getText()+":"+other);
        }
        
        
        double totalDeduct = sss+pagibig+philhealth+tax+other;
        String a = String.valueOf(totalDeduct);
        lbl_total.setText(a);
        
        double salaryAfterDeduct = salary - totalDeduct;
        String b = String.valueOf(salaryAfterDeduct);
        lbl_sal.setText(b);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        txt_id.setText("");
        txt_firstname.setText("");
        txt_surname.setText("");
        txt_dob.setText("");
        txt_dep.setText("");
        txt_status.setText("");
        txt_salary.setText("");
        txt_desig.setText("");
        txt_job.setText("");
        txt_doj.setText("");
        lbl_total.setText("0.00");
        txt_percentage.setText("");
        txt_deduction.setText("");
        txt_reason.setText("");
        txt_search.setText("");
        lbl_sal.setText("0.00");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void r_percentageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_percentageActionPerformed
        // TODO add your handling code here:
        r_percentage.setSelected(true);
        r_amount2.setSelected(false);
        //r_amount.setEnabled(false);
        txt_deduction.setEnabled(false);
        txt_percentage.setEditable(true);
        txt_percentage.setEnabled(true);
        txt_deduction.setText("0");
        txt_Save.setEnabled(false);

    }//GEN-LAST:event_r_percentageActionPerformed

    private void r_amount2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_amount2ActionPerformed
        // TODO add your handling code here:
        r_amount2.setSelected(true);
        r_percentage.setSelected(false);
        //r_percentage.setEnabled(false);
        txt_percentage.setEnabled(false);
        txt_deduction.setEditable(true);
        txt_deduction.setEnabled(true);
        txt_percentage.setText("0");
        txt_Save.setEnabled(false);
    }//GEN-LAST:event_r_amount2ActionPerformed

    private void r_percentage1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_percentage1ActionPerformed
        // TODO add your handling code here:
        r_percentage1.setSelected(true);
        r_amount3.setSelected(false);
        //r_amount.setEnabled(false);
        txt_deduction1.setEnabled(false);
        txt_percentage1.setEditable(true);
        txt_percentage1.setEnabled(true);
        txt_deduction1.setText("0");
        txt_Save.setEnabled(false);
    }//GEN-LAST:event_r_percentage1ActionPerformed

    private void r_amount3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_amount3ActionPerformed
        // TODO add your handling code here:
        r_amount3.setSelected(true);
        r_percentage1.setSelected(false);
        //r_percentage.setEnabled(false);
        txt_percentage1.setEnabled(false);
        txt_deduction1.setEditable(true);
        txt_deduction1.setEnabled(true);
        txt_percentage1.setText("0");
        txt_Save.setEnabled(false);
    }//GEN-LAST:event_r_amount3ActionPerformed

    private void r_percentage2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_percentage2ActionPerformed
        // TODO add your handling code here:
        r_percentage2.setSelected(true);
        r_amount4.setSelected(false);
        //r_amount.setEnabled(false);
        txt_deduction2.setEnabled(false);
        txt_percentage2.setEditable(true);
        txt_percentage2.setEnabled(true);
        txt_deduction2.setText("0");
        txt_Save.setEnabled(false);
    }//GEN-LAST:event_r_percentage2ActionPerformed

    private void r_amount4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_amount4ActionPerformed
        // TODO add your handling code here:
        r_amount4.setSelected(true);
        r_percentage2.setSelected(false);
        //r_percentage.setEnabled(false);
        txt_percentage2.setEnabled(false);
        txt_deduction2.setEditable(true);
        txt_deduction2.setEnabled(true);
        txt_percentage2.setText("0");
        txt_Save.setEnabled(false);
    }//GEN-LAST:event_r_amount4ActionPerformed

    private void r_percentage3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_percentage3ActionPerformed
        // TODO add your handling code here:
        r_percentage3.setSelected(true);
        r_amount5.setSelected(false);
        //r_amount.setEnabled(false);
        txt_deduction3.setEnabled(false);
        txt_percentage3.setEditable(true);
        txt_percentage3.setEnabled(true);
        txt_deduction3.setText("0");
        txt_Save.setEnabled(false);
    }//GEN-LAST:event_r_percentage3ActionPerformed

    private void r_amount5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_amount5ActionPerformed
        // TODO add your handling code here:
        r_amount5.setSelected(true);
        r_percentage3.setSelected(false);
        //r_percentage.setEnabled(false);
        txt_percentage3.setEnabled(false);
        txt_deduction3.setEditable(true);
        txt_deduction3.setEnabled(true);
        txt_percentage3.setText("0");
        txt_Save.setEnabled(false);
    }//GEN-LAST:event_r_amount5ActionPerformed

    private void r_percentage4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_percentage4ActionPerformed
        // TODO add your handling code here:
        r_percentage4.setSelected(true);
        r_amount6.setSelected(false);
        //r_amount.setEnabled(false);
        txt_deduction4.setEnabled(false);
        txt_percentage4.setEditable(true);
        txt_percentage4.setEnabled(true);
        txt_deduction4.setText("0");
        txt_Save.setEnabled(false);
    }//GEN-LAST:event_r_percentage4ActionPerformed

    private void r_amount6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_amount6ActionPerformed
        // TODO add your handling code here:
        r_amount6.setSelected(true);
        r_percentage4.setSelected(false);
        //r_percentage.setEnabled(false);
        txt_percentage4.setEnabled(false);
        txt_deduction4.setEditable(true);
        txt_deduction4.setEnabled(true);
        txt_percentage4.setText("0");
        txt_Save.setEnabled(false);
    }//GEN-LAST:event_r_amount6ActionPerformed

    private void txt_percentageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_percentageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_percentageActionPerformed

    private void txt_percentageKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_percentageKeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txt_percentageKeyPressed

    private void txt_percentageKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_percentageKeyReleased
        // TODO add your handling code here:
        txt_Save.setEnabled(false);
    }//GEN-LAST:event_txt_percentageKeyReleased

    private void txt_deductionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_deductionKeyReleased
        // TODO add your handling code here:
        txt_Save.setEnabled(false);
    }//GEN-LAST:event_txt_deductionKeyReleased

    private void txt_percentage1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_percentage1KeyReleased
        // TODO add your handling code here:
        txt_Save.setEnabled(false);
    }//GEN-LAST:event_txt_percentage1KeyReleased

    private void txt_deduction1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_deduction1KeyReleased
        // TODO add your handling code here:
        txt_Save.setEnabled(false);
    }//GEN-LAST:event_txt_deduction1KeyReleased

    private void txt_percentage2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_percentage2KeyReleased
        // TODO add your handling code here:
        txt_Save.setEnabled(false);
    }//GEN-LAST:event_txt_percentage2KeyReleased

    private void txt_deduction2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_deduction2KeyReleased
        // TODO add your handling code here:
        txt_Save.setEnabled(false);
    }//GEN-LAST:event_txt_deduction2KeyReleased

    private void txt_percentage3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_percentage3KeyReleased
        // TODO add your handling code here:
        txt_Save.setEnabled(false);
    }//GEN-LAST:event_txt_percentage3KeyReleased

    private void txt_deduction3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_deduction3KeyReleased
        // TODO add your handling code here:
        txt_Save.setEnabled(false);
    }//GEN-LAST:event_txt_deduction3KeyReleased

    private void txt_percentage4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_percentage4KeyReleased
        // TODO add your handling code here:
        txt_Save.setEnabled(false);
    }//GEN-LAST:event_txt_percentage4KeyReleased

    private void txt_deduction4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_deduction4KeyReleased
        // TODO add your handling code here:
        txt_Save.setEnabled(false);
    }//GEN-LAST:event_txt_deduction4KeyReleased

    private void txt_reasonKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_reasonKeyReleased
        // TODO add your handling code here:
        txt_Save.setEnabled(false);
    }//GEN-LAST:event_txt_reasonKeyReleased

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
            java.util.logging.Logger.getLogger(employeeDeductions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(employeeDeductions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(employeeDeductions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(employeeDeductions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new employeeDeductions().setVisible(true);
            }
        });
    }
    
    private void deleteRecords(String tbl,String id){
        
            
                try{
                    String reg= "delete from "+tbl+" where emp_id = "+id;
                pst=conn.prepareStatement(reg);
                pst.execute();
                }catch(Exception e){
                    
                }
                finally{
                    try{
                        rs.close();
                        pst.close();
                    }catch(Exception e)
                    {
                        
                    }
                }
            
                
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_emp;
    private javax.swing.JTextArea lbl_remarks;
    private javax.swing.JLabel lbl_sal;
    private javax.swing.JLabel lbl_total;
    private javax.swing.JRadioButton r_amount2;
    private javax.swing.JRadioButton r_amount3;
    private javax.swing.JRadioButton r_amount4;
    private javax.swing.JRadioButton r_amount5;
    private javax.swing.JRadioButton r_amount6;
    private javax.swing.JRadioButton r_percentage;
    private javax.swing.JRadioButton r_percentage1;
    private javax.swing.JRadioButton r_percentage2;
    private javax.swing.JRadioButton r_percentage3;
    private javax.swing.JRadioButton r_percentage4;
    private javax.swing.JButton txt_Save;
    private javax.swing.JTextField txt_deduction;
    private javax.swing.JTextField txt_deduction1;
    private javax.swing.JTextField txt_deduction2;
    private javax.swing.JTextField txt_deduction3;
    private javax.swing.JTextField txt_deduction4;
    private javax.swing.JTextField txt_dep;
    private javax.swing.JTextField txt_desig;
    private javax.swing.JTextField txt_dob;
    private javax.swing.JTextField txt_doj;
    private javax.swing.JTextField txt_firstname;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_job;
    private javax.swing.JTextField txt_percentage;
    private javax.swing.JTextField txt_percentage1;
    private javax.swing.JTextField txt_percentage2;
    private javax.swing.JTextField txt_percentage3;
    private javax.swing.JTextField txt_percentage4;
    private javax.swing.JTextField txt_reason;
    private javax.swing.JTextField txt_salary;
    private javax.swing.JTextField txt_search;
    private javax.swing.JTextField txt_status;
    private javax.swing.JTextField txt_surname;
    // End of variables declaration//GEN-END:variables
}
