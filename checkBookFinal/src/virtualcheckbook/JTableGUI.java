/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package virtualcheckbook;


import java.util.Date;
import java.util.Random;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JimmyWebb
 */
public class JTableGUI extends javax.swing.JFrame {

    private Object tranType;
    private Date date;
    private String tranText;
    private double amount;
    private double inputAmount;
    private Integer randomID;
    public static DefaultTableModel model;
    public double balance;
    

    /**
     * Creates new form jTable
     */
    public JTableGUI() {
        initComponents();
        model = (DefaultTableModel) table.getModel();
        model.removeRow(0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        saveBtn = new javax.swing.JButton();
        loadBtn = new javax.swing.JButton();
        balanceTxtField = new javax.swing.JTextField();
        balanceLbl = new javax.swing.JLabel();
        removeBtn = new javax.swing.JButton();
        updateBalanceBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        withdrawRadioB = new javax.swing.JRadioButton();
        despositRadioB = new javax.swing.JRadioButton();
        nameLbl = new javax.swing.JLabel();
        nameTxtField = new javax.swing.JTextField();
        amountLbl = new javax.swing.JLabel();
        amountTxtField = new javax.swing.JTextField();
        submitBtn = new javax.swing.JButton();
        dateLbl = new javax.swing.JLabel();
        newTransactionLbl = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        calendar = new com.toedter.calendar.JCalendar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        table.setAutoCreateRowSorter(true);
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "Name", "Type", "Amount", "Date", "ID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setShowGrid(true);
        jScrollPane1.setViewportView(table);

        saveBtn.setText("Save Data");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        loadBtn.setText("Load Data");
        loadBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadBtnActionPerformed(evt);
            }
        });

        balanceTxtField.setEditable(false);
        balanceTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                balanceTxtFieldActionPerformed(evt);
            }
        });

        balanceLbl.setText("Balance:");

        removeBtn.setText("Remove Selected");
        removeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeBtnActionPerformed(evt);
            }
        });

        updateBalanceBtn.setText("Update Balance");
        updateBalanceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBalanceBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(removeBtn)
                .addGap(18, 18, 18)
                .addComponent(updateBalanceBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(balanceLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(balanceTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(saveBtn)
                .addGap(18, 18, 18)
                .addComponent(loadBtn)
                .addGap(59, 59, 59))
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loadBtn)
                    .addComponent(balanceTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(balanceLbl)
                    .addComponent(saveBtn)
                    .addComponent(removeBtn)
                    .addComponent(updateBalanceBtn))
                .addContainerGap())
        );

        buttonGroup1.add(withdrawRadioB);
        withdrawRadioB.setText("Withdraw");

        buttonGroup1.add(despositRadioB);
        despositRadioB.setText("Deposit");
        despositRadioB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                despositRadioBActionPerformed(evt);
            }
        });

        nameLbl.setText("Name:");

        nameTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTxtFieldActionPerformed(evt);
            }
        });

        amountLbl.setText("Amount:");

        submitBtn.setText("Submit");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });

        dateLbl.setText("Date:");

        newTransactionLbl.setText("New Transaction Form:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(newTransactionLbl)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(38, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(withdrawRadioB)
                                        .addGap(18, 18, 18)
                                        .addComponent(despositRadioB))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(amountLbl)
                                        .addGap(18, 18, 18)
                                        .addComponent(amountTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                                .addComponent(dateLbl))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(nameLbl)
                                .addGap(30, 30, 30)
                                .addComponent(nameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(submitBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(newTransactionLbl)
                .addGap(24, 24, 24)
                .addComponent(dateLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameLbl))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(withdrawRadioB)
                    .addComponent(despositRadioB))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(amountLbl)
                    .addComponent(amountTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(submitBtn)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(calendar, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(calendar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loadBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadBtnActionPerformed
        // TODO add your handling code here:
        int rows = model.getRowCount(); 
        for(int i = rows - 1; i >=0; i--) {
            model.removeRow(i); 
        }
        ReaderWriter reader = new ReaderWriter();           //reads saved entrees in from a text file
        reader.readFromFile();
        this.updateBalance();
    }//GEN-LAST:event_loadBtnActionPerformed

    private void despositRadioBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_despositRadioBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_despositRadioBActionPerformed

    private void nameTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTxtFieldActionPerformed

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        // TODO add your handling code here:
        try{
            System.out.println("Submitting new transaction form");

            amount = Double.parseDouble(amountTxtField.getText());
            
            if(amount < 0){
            	System.out.println("Please enter a valid amount");
            	
            }else{

            	if(withdrawRadioB.isSelected()){
            		tranType = 0;
            		tranText = "Withdrawal";
            		inputAmount = amount*-1;
            	}else{
            		tranType = 1;   
            		tranText = "Deposit";
            		inputAmount = amount;
            	}

            	date = calendar.getCalendar().getTime();

            	System.out.println(nameTxtField.getText() + tranType + tranText + amountTxtField.getText() + date);

            	//System.out.println("Your total Balance is " + balance);

            	this.getRandomID();
            	transaction(nameTxtField.getText(), tranText, amount, date, randomID);

            	buttonGroup1.clearSelection();
            	nameTxtField.setText(null);
            	amountTxtField.setText(null);
            	this.updateBalance();
            }
            
        }catch(NumberFormatException e){
            System.out.println("This is not a valid number");
            System.out.println(e.getMessage());
        }
                
    }//GEN-LAST:event_submitBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        ReaderWriter writer = new ReaderWriter();
        try {
			writer.writeToFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
    }//GEN-LAST:event_saveBtnActionPerformed

    private void removeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeBtnActionPerformed
        // TODO add your handling code here:
        int[] rows = table.getSelectedRows();
        for(int i=0;i<rows.length;i++){
            model.removeRow(rows[i]-i);
        }
        this.updateBalance();
    }//GEN-LAST:event_removeBtnActionPerformed

    private void updateBalanceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBalanceBtnActionPerformed
        // TODO add your handling code here:
        this.updateBalance();
        
    }//GEN-LAST:event_updateBalanceBtnActionPerformed

    private void balanceTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_balanceTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_balanceTxtFieldActionPerformed

    public static void transaction(String name, String type, Double amnt, Date date, Integer randomID){             //adds the transactions to the JTable
        Vector myVector = new Vector();
        myVector.add(name);
        myVector.add(type);
        myVector.add(amnt);
        myVector.add(date);
        myVector.add(randomID);
        
        model.addRow(myVector);
        //System.out.println(myVector);
        
    }
    
    private void getRandomID(){                         //allows for the creation of a random integer used as the persons ID
        Random r = new Random( System.currentTimeMillis() );
        randomID = ((1 + r.nextInt(2)) * 10000 + r.nextInt(10000));
        //System.out.println(randomID);
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel amountLbl;
    private javax.swing.JTextField amountTxtField;
    private javax.swing.JLabel balanceLbl;
    private javax.swing.JTextField balanceTxtField;
    private javax.swing.ButtonGroup buttonGroup1;
    private com.toedter.calendar.JCalendar calendar;
    private javax.swing.JLabel dateLbl;
    private javax.swing.JRadioButton despositRadioB;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton loadBtn;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JTextField nameTxtField;
    private javax.swing.JLabel newTransactionLbl;
    private javax.swing.JButton removeBtn;
    private javax.swing.JButton saveBtn;
    private javax.swing.JButton submitBtn;
    private javax.swing.JTable table;
    private javax.swing.JButton updateBalanceBtn;
    private javax.swing.JRadioButton withdrawRadioB;
    // End of variables declaration//GEN-END:variables

    private void updateBalance() {
        balance = 0;
        for(int i = 0; i < model.getRowCount(); i++){
            if(model.getValueAt(i, 1).equals("Withdrawal")){
                Double tempBalance = (Double) model.getValueAt(i, 2);
                tempBalance *= -1;
                balance += tempBalance;
            }else{
                Double tempBalance = (Double) model.getValueAt(i ,2);
                balance += tempBalance;
            }
        }
        String balanceString;
        balanceString = Double.toString(balance);
        
        if(balance < 0){
            balanceTxtField.setForeground(Color.red);
        } else if (balance > 1){
            balanceTxtField.setForeground(Color.green);
        }else{
            balanceTxtField.setForeground(Color.BLACK);
        }
        
        balanceTxtField.setText(balanceString);
    }
}
