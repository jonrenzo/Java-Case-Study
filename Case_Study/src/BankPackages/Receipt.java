package BankPackages;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import Main.Main;  

public class Receipt extends javax.swing.JFrame {
	

	
	
    public Receipt() {
        initComponents();
    }
    
    
    
    LocalDate date = java.time.LocalDate.now();
    
    LocalTime time = java.time.LocalTime.now();

    public void initComponents() {

        bg = new javax.swing.JPanel();
        Jabank = new javax.swing.JLabel();
        Receipt = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        location = new javax.swing.JLabel();
        Date = new javax.swing.JLabel();
        Time = new javax.swing.JLabel();
        AccountNumber = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Amount = new javax.swing.JLabel();
        Balance = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Footer = new javax.swing.JLabel();
        locationData = new javax.swing.JLabel();
        dateData = new javax.swing.JLabel();
        timeData = new javax.swing.JLabel();
        transactionType = new javax.swing.JLabel();
        accountData = new javax.swing.JLabel();
        amountData = new javax.swing.JLabel();
        balanceData = new javax.swing.JLabel();
        Barcode = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        
        bg.setBackground(new java.awt.Color(235, 235, 235));

        Jabank.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        Jabank.setText("Jabank");
        Jabank.setToolTipText("");

        Receipt.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        Receipt.setText("Receipt");
        Receipt.setToolTipText("");
        Receipt.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        location.setText("Location: ");

        Date.setText("Date: ");

        Time.setText("Time: ");

        AccountNumber.setText("Account Number: ");

        jLabel1.setText("Transaction: ");

        jLabel2.setText("----------------------------------------------------------------------------------");

        Amount.setText("Amount: ");

        Balance.setText("Balance: ");

        jLabel3.setText("--------------------------------------------------------------------------------");

        Footer.setFont(new java.awt.Font("Fira Code", 1, 14)); // NOI18N
        Footer.setText("Thank You for Banking with Us");

        locationData.setFont(new java.awt.Font("Courier New", 2, 14)); // NOI18N
        locationData.setText("Pamantasan ng Lungsod ng Pasig");

        dateData.setFont(new java.awt.Font("Courier New", 2, 14)); // NOI18N
        dateData.setText(date.toString());

        timeData.setFont(new java.awt.Font("Courier New", 2, 14)); // NOI18N
        timeData.setText(time.toString());

        transactionType.setFont(new java.awt.Font("Courier New", 2, 14)); // NOI18N
        transactionType.setText(accountManage.transactionType);

        accountData.setFont(new java.awt.Font("Courier New", 2, 14)); // NOI18N
        accountData.setText(login.accountLogged);

        amountData.setFont(new java.awt.Font("Courier New", 2, 14)); // NOI18N
        amountData.setText(Integer.toString(accountManage.money));

        balanceData.setFont(new java.awt.Font("Courier New", 2, 14)); // NOI18N
        balanceData.setText("₱"+ Integer.toString(Main.map.get(login.accountLogged)));

        Barcode.setFont(new java.awt.Font("3 of 9 Barcode", 0, 24)); // NOI18N
        Barcode.setText("lmaoxd" );

        
        
        
        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Receipt)
                            .addComponent(Jabank)))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(Date)
                                .addGap(18, 18, 18)
                                .addComponent(dateData))
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(location)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(locationData))
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(Time)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(timeData))
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(transactionType))
                            .addComponent(jLabel2)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(bgLayout.createSequentialGroup()
                                        .addComponent(Balance)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(balanceData))
                                    .addGroup(bgLayout.createSequentialGroup()
                                        .addComponent(Amount)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(amountData))))
                            .addComponent(jLabel3)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(AccountNumber)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(accountData))))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(Footer)))
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Barcode)
                .addGap(187, 187, 187))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(Jabank)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Receipt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Barcode)
                .addGap(28, 28, 28)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(location)
                    .addComponent(locationData))
                .addGap(36, 36, 36)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Date)
                    .addComponent(dateData))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Time)
                    .addComponent(timeData))
                .addGap(18, 18, 18)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(transactionType))
                .addGap(6, 6, 6)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AccountNumber)
                    .addComponent(accountData))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Amount)
                    .addComponent(amountData))
                .addGap(26, 26, 26)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Balance)
                    .addComponent(balanceData))
                .addGap(24, 24, 24)
                .addComponent(jLabel3)
                .addGap(41, 41, 41)
                .addComponent(Footer)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    /*public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Receipt().setVisible(true);
            }
        });
    }*/
    
    
    
    public void run() {
    	
        new Receipt().setVisible(true);
    }


    public javax.swing.JLabel AccountNumber;
    public javax.swing.JLabel Amount;
    public javax.swing.JLabel Balance;
    public javax.swing.JLabel Barcode;
    public javax.swing.JLabel Date;
    public javax.swing.JLabel Footer;
    public javax.swing.JLabel Jabank;
    public javax.swing.JLabel Receipt;
    public javax.swing.JLabel Time;
    public javax.swing.JLabel accountData;
    public javax.swing.JLabel amountData;
    public javax.swing.JLabel balanceData;
    public javax.swing.JPanel bg;
    public javax.swing.JLabel dateData;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JSeparator jSeparator1;
    public javax.swing.JLabel location;
    public javax.swing.JLabel locationData;
    public javax.swing.JLabel timeData;
    public javax.swing.JLabel transactionType;
    // End of variables declaration//GEN-END:variables
}
