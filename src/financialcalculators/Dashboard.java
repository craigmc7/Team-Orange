package financialcalculators;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
 
public class Dashboard extends javax.swing.JFrame {

    public Dashboard() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        HAlabel = new javax.swing.JLabel();
        MLlabel = new javax.swing.JLabel();
        MPlabel = new javax.swing.JLabel();
        BvLlabel = new javax.swing.JLabel();
        CClabel = new javax.swing.JLabel();
        ALlabel = new javax.swing.JLabel();
        MPayofflabel = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        AutoLoanTab = new javax.swing.JTabbedPane();
        jPanel12 = new javax.swing.JPanel();
        inputVehiclePrice = new javax.swing.JTextField();
        inputLoanTerm2 = new javax.swing.JTextField();
        inputIntRate2 = new javax.swing.JTextField();
        inputDownPayment2 = new javax.swing.JTextField();
        inputTradeIn2 = new javax.swing.JTextField();
        inputSalesTax2 = new javax.swing.JTextField();
        calculateMonthlyPay = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        TotalPriceresult1 = new javax.swing.JLabel();
        TotalPriceresult2 = new javax.swing.JLabel();
        TotalPriceresult3 = new javax.swing.JLabel();
        TotalPriceresult4 = new javax.swing.JLabel();
        TotalPriceresult5 = new javax.swing.JLabel();
        TotalPriceresult6 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        monthlyPay = new javax.swing.JTextField();
        inputLoanTerm = new javax.swing.JTextField();
        inputIntRate = new javax.swing.JTextField();
        inputDownPayment = new javax.swing.JTextField();
        inputTradeIn = new javax.swing.JTextField();
        inputSalesTax = new javax.swing.JTextField();
        calculateTotalPrice = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        MonthlyPaymentresult6 = new javax.swing.JLabel();
        MonthlyPaymentresult5 = new javax.swing.JLabel();
        MonthlyPaymentresult4 = new javax.swing.JLabel();
        MonthlyPaymentresult3 = new javax.swing.JLabel();
        MonthlyPaymentresult2 = new javax.swing.JLabel();
        MonthlyPaymentresult1 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jSlider1 = new javax.swing.JSlider();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        HAMenuItem = new javax.swing.JMenuItem();
        MLMenuItem = new javax.swing.JMenuItem();
        MPMenuItem = new javax.swing.JMenuItem();
        BvLMenuItem = new javax.swing.JMenuItem();
        CCMenuItem = new javax.swing.JMenuItem();
        ALMenuItem = new javax.swing.JMenuItem();
        MPayoffMenuItem = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(1500, 800));
        setSize(new java.awt.Dimension(1500, 800));

        Color mcOrange = new Color(254,90,0);
        Border border = BorderFactory.createLineBorder(mcOrange, 5);
        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jTabbedPane1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPane1StateChanged(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(96, 0, 21));
        jPanel1.setEnabled(false);
        jPanel1.setMaximumSize(new java.awt.Dimension(1920, 1080));
        jPanel1.setName(""); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(1500, 800));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });
        jPanel1.setLayout(null);

        jLabel25.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel25.setText("MC Finance");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(182, Short.MAX_VALUE)
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(163, 163, 163))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel9);
        jPanel9.setBounds(430, 20, 610, 110);

        jPanel10.setBackground(new java.awt.Color(96, 0, 21));
        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        HAlabel.setForeground(new java.awt.Color(254, 90, 0));
        HAlabel.setText("<html><u>House Affordability</u></html>");
        HAlabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        HAlabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HAlabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HAlabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HAlabelMouseExited(evt);
            }
        });

        MLlabel.setForeground(new java.awt.Color(254, 96, 0));
        MLlabel.setText("<html><u>Monthly Loan</u></html>");
        MLlabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MLlabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MLlabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MLlabelMouseExited(evt);
            }
        });

        MPlabel.setForeground(new java.awt.Color(254, 96, 0));
        MPlabel.setText("<html><u>Mortage Payment</u></html>");
        MPlabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MPlabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MPlabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MPlabelMouseExited(evt);
            }
        });

        BvLlabel.setForeground(new java.awt.Color(254, 96, 0));
        BvLlabel.setText("<html><u>Buy vs Loan</u></html>");
        BvLlabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BvLlabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BvLlabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BvLlabelMouseExited(evt);
            }
        });

        CClabel.setForeground(new java.awt.Color(254, 96, 0));
        CClabel.setText("<html><u>Currency Converter</u></html>");
        CClabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CClabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CClabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CClabelMouseExited(evt);
            }
        });

        ALlabel.setForeground(new java.awt.Color(254, 96, 0));
        ALlabel.setText("<html><u>Auto Loan</u></html>");
        ALlabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ALlabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ALlabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ALlabelMouseExited(evt);
            }
        });

        MPayofflabel.setForeground(new java.awt.Color(254, 96, 0));
        MPayofflabel.setText("<html><u>Mortgage Payoff</u></html>");
        MPayofflabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MPayofflabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MPayofflabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MPayofflabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HAlabel)
                    .addComponent(MLlabel)
                    .addComponent(MPlabel)
                    .addComponent(BvLlabel)
                    .addComponent(CClabel, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(ALlabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(MPayofflabel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(HAlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MLlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MPlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BvLlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CClabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ALlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MPayofflabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(261, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel10);
        jPanel10.setBounds(20, 150, 140, 540);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1120, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel11);
        jPanel11.setBounds(200, 150, 1120, 540);

        jTabbedPane1.addTab("Dashboard", null, jPanel1, "");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1500, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 730, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Buy vs Loan", jPanel2);
        jTabbedPane1.removeTabAt(1);

        jButton1.setText("Calculate");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField4.setActionCommand("<Not Set>");

        jLabel10.setText("Principal ($):");

        jLabel11.setText("Loan Term (Years):");

        jLabel12.setText("Interest Rate (%):");

        jLabel13.setText("Monthly Payment Amount ($):");

        jTextField7.setEditable(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1)
                            .addComponent(jLabel11)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(1222, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(464, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Monthly Loan", jPanel3);
        jTabbedPane1.removeTabAt(1);

        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });

        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });

        jLabel9.setText("Principal ($):");
        jLabel9.setName(""); // NOI18N

        jLabel14.setText("Loan Term (Years):");

        jLabel15.setText("Interest Rate (%):");

        jButton2.setText("Calculate");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel16.setText("Monthly Mortgage Payment ($):");

        jTextField11.setEditable(false);
        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jTextField10, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextField9, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(1197, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(472, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Mortgage Payment", jPanel4);
        jTabbedPane1.removeTabAt(1);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1500, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 730, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Currency Converter", jPanel5);
        jTabbedPane1.removeTabAt(1);

        inputVehiclePrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputVehiclePriceActionPerformed(evt);
            }
        });

        calculateMonthlyPay.setText("calculate");
        calculateMonthlyPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateMonthlyPayActionPerformed(evt);
            }
        });

        jLabel17.setText("Auto Price");

        jLabel18.setText("Loan Term");

        jLabel19.setText("Interest Rate");

        jLabel20.setText("Down Payment");

        jLabel21.setText("Trade In Value");

        jLabel22.setText("Sales Tax");

        TotalPriceresult1.setText("Monthly Loan Payment: ");

        TotalPriceresult2.setText("Total Loan Amount: ");

        TotalPriceresult3.setText("Total Sales Tax: ");

        TotalPriceresult4.setText("Total of all Loan Payments:");

        TotalPriceresult5.setText("Total Loan Interest:");

        TotalPriceresult6.setText("Total Cost: ");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(calculateMonthlyPay)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(inputSalesTax2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                            .addComponent(inputTradeIn2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputDownPayment2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputIntRate2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputLoanTerm2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputVehiclePrice, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(72, 72, 72)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TotalPriceresult1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TotalPriceresult2, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TotalPriceresult3, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TotalPriceresult6, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TotalPriceresult5, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TotalPriceresult4, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(912, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inputVehiclePrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17)
                            .addComponent(TotalPriceresult1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inputLoanTerm2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(TotalPriceresult2)))
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inputIntRate2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inputDownPayment2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20)))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(TotalPriceresult3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TotalPriceresult4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputTradeIn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(TotalPriceresult5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputSalesTax2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)
                    .addComponent(TotalPriceresult6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(calculateMonthlyPay)
                .addContainerGap(443, Short.MAX_VALUE))
        );

        AutoLoanTab.addTab("Total Price", jPanel12);

        calculateTotalPrice.setText("calculate");
        calculateTotalPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateTotalPriceActionPerformed(evt);
            }
        });

        jLabel23.setText("Monthly Payment");

        jLabel24.setText("Loan Term");

        jLabel26.setText("Interest Rate");

        jLabel27.setText("Down Payment");

        jLabel28.setText("Trade In Value");

        jLabel29.setText("Sales Tax");

        MonthlyPaymentresult6.setText("Total Cost: ");

        MonthlyPaymentresult5.setText("Total Loan Interest:");

        MonthlyPaymentresult4.setText("Total of all Loan Payments:");

        MonthlyPaymentresult3.setText("Total Sales Tax: ");

        MonthlyPaymentresult2.setText("Total Loan Amount: ");

        MonthlyPaymentresult1.setText("Monthly Loan Payment: ");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(calculateTotalPrice)
                    .addComponent(monthlyPay)
                    .addComponent(inputLoanTerm)
                    .addComponent(inputIntRate)
                    .addComponent(inputDownPayment)
                    .addComponent(inputTradeIn)
                    .addComponent(inputSalesTax))
                .addGap(69, 69, 69)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MonthlyPaymentresult1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MonthlyPaymentresult2, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MonthlyPaymentresult3, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MonthlyPaymentresult6, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MonthlyPaymentresult5, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MonthlyPaymentresult4, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(952, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(monthlyPay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inputLoanTerm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inputIntRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inputDownPayment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inputTradeIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inputSalesTax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel29)))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(MonthlyPaymentresult1)
                                .addGap(28, 28, 28))
                            .addComponent(MonthlyPaymentresult2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(22, 22, 22)
                        .addComponent(MonthlyPaymentresult3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MonthlyPaymentresult4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MonthlyPaymentresult5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MonthlyPaymentresult6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(calculateTotalPrice)
                .addContainerGap(452, Short.MAX_VALUE))
        );

        AutoLoanTab.addTab("Monthly Payment", jPanel13);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AutoLoanTab)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AutoLoanTab)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Auto Loan", jPanel6);
        jTabbedPane1.removeTabAt(1);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1500, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 730, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Mortgage Payoff", jPanel7);
        jTabbedPane1.removeTabAt(1);

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        jLabel3.setText("Percent of Income");

        jLabel4.setText("Down Payment:");

        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField2KeyReleased(evt);
            }
        });

        jLabel5.setText("Interest Rate:");

        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField3KeyReleased(evt);
            }
        });

        jLabel6.setText("50");

        jSlider1.setMinimum(1);
        jSlider1.setSnapToTicks(true);
        jSlider1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jSlider1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider1StateChanged(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Please Select a Value", "10", "15", "20", "25", "30", " " }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });

        jLabel1.setText("Loan Length:");

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N

        jLabel2.setText("Annual Income:");

        jLabel8.setText("You can afford a house up to ");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(123, 123, 123)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel8))))))
                .addContainerGap(1090, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel8Layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addGap(28, 28, 28))
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addContainerGap(439, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("House Affordability", jPanel8);
        jTabbedPane1.removeTabAt(1);

        jMenu1.setText("Open Tab");

        HAMenuItem.setText("House Affordablity");
        HAMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HAMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(HAMenuItem);

        MLMenuItem.setText("Monthly Loan");
        MLMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MLMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(MLMenuItem);

        MPMenuItem.setText("Mortgage Payment");
        MPMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MPMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(MPMenuItem);

        BvLMenuItem.setText("Buy vs Loan");
        BvLMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BvLMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(BvLMenuItem);

        CCMenuItem.setText("Currency Converter");
        CCMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CCMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(CCMenuItem);

        ALMenuItem.setText("Auto Loan");
        ALMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ALMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(ALMenuItem);

        MPayoffMenuItem.setText("Mortgage Payoff");
        MPayoffMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MPayoffMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(MPayoffMenuItem);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Close Current Tab");
        jMenu2.setEnabled(false);
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 765, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        // TODO add your handling code here:
        if (checkType(jTextField1.getText()) && checkType(jTextField2.getText()) && checkType(jTextField3.getText()) && (jComboBox1.getSelectedItem()!="Please Select a Value")){
            double housePrice = HouseAffordability.HouseAffordabilityCalc(Double.parseDouble(jTextField1.getText()),Double.parseDouble(jTextField2.getText()), getSelectedValue(jComboBox1.getSelectedItem()), Double.parseDouble(jTextField3.getText()),Double.valueOf(jSlider1.getValue()));
            jLabel7.setText(String.format("$%.2f",housePrice));
        }
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jTextField2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyReleased
        // TODO add your handling code here:
        if (checkType(jTextField1.getText()) && checkType(jTextField2.getText()) && checkType(jTextField3.getText()) && (jComboBox1.getSelectedItem()!="Please Select a Value")){
            double housePrice = HouseAffordability.HouseAffordabilityCalc(Double.parseDouble(jTextField1.getText()),Double.parseDouble(jTextField2.getText()), getSelectedValue(jComboBox1.getSelectedItem()), Double.parseDouble(jTextField3.getText()),Double.valueOf(jSlider1.getValue()));
            jLabel7.setText(String.format("$%.2f",housePrice));
        }
    }//GEN-LAST:event_jTextField2KeyReleased

    private void jTextField3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyReleased
        // TODO add your handling code here:
        if (checkType(jTextField1.getText()) && checkType(jTextField2.getText()) && checkType(jTextField3.getText()) && (jComboBox1.getSelectedItem()!="Please Select a Value")){
            double housePrice = HouseAffordability.HouseAffordabilityCalc(Double.parseDouble(jTextField1.getText()),Double.parseDouble(jTextField2.getText()), getSelectedValue(jComboBox1.getSelectedItem()), Double.parseDouble(jTextField3.getText()),Double.valueOf(jSlider1.getValue()));
            jLabel7.setText(String.format("$%.2f",housePrice));
        }
    }//GEN-LAST:event_jTextField3KeyReleased

    private void jSlider1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider1StateChanged
        // TODO add your handling code here:
        jLabel6.setText(Integer.toString(jSlider1.getValue()));
        if (checkType(jTextField1.getText()) && checkType(jTextField2.getText()) && checkType(jTextField3.getText()) && (jComboBox1.getSelectedItem()!="Please Select a Value")){
            double housePrice = HouseAffordability.HouseAffordabilityCalc(Double.parseDouble(jTextField1.getText()),Double.parseDouble(jTextField2.getText()), getSelectedValue(jComboBox1.getSelectedItem()), Double.parseDouble(jTextField3.getText()),Double.valueOf(jSlider1.getValue()));
            jLabel7.setText(String.format("$%.2f",housePrice));
        }
    }//GEN-LAST:event_jSlider1StateChanged

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        // TODO add your handling code here:
        if (checkType(jTextField1.getText()) && checkType(jTextField2.getText()) && checkType(jTextField3.getText()) && (jComboBox1.getSelectedItem()!="Please Select a Value")){
            double housePrice = HouseAffordability.HouseAffordabilityCalc(Double.parseDouble(jTextField1.getText()),Double.parseDouble(jTextField2.getText()), getSelectedValue(jComboBox1.getSelectedItem()), Double.parseDouble(jTextField3.getText()),Double.valueOf(jSlider1.getValue()));
            jLabel7.setText(String.format("$%.2f",housePrice));
        }
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {

            double principal = Double.parseDouble(jTextField4.getText()); // Principal Amount
            double interestRate = Double.parseDouble(jTextField6.getText()); // Interest Rate
            int years = Integer.parseInt(jTextField5.getText()); // Years

            // Helper Call
            double monthlyPayment = MonthlyLoanCalc.monthlyLoanPayment(interestRate, years, principal);
            if (monthlyPayment==-1){
                jTextField4.requestFocus();
                jTextField4.setText("");
                throw new NumberFormatException();
            }
            else if (monthlyPayment==-2){
                jTextField5.requestFocus();
                jTextField5.setText("");
                throw new NumberFormatException();
            }
            else if (monthlyPayment==-3){
                jTextField6.requestFocus();
                jTextField6.setText("");
                throw new NumberFormatException();
            }
            jTextField7.setText(String.format("%.2f", monthlyPayment));
        } catch (NumberFormatException e) {
            jTextField7.setText("Invalid input");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        double initAmount=Double.parseDouble(jTextField8.getText()); // Principal Amount
        double interestRate=Double.parseDouble(jTextField10.getText()); //interest
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        // TODO add your handling code here:
        closeTab();
    }//GEN-LAST:event_jMenu2MouseClicked

    private void jTabbedPane1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPane1StateChanged
        // TODO add your handling code here:
        if (jTabbedPane1.getSelectedIndex() != 0) {
            jMenu2.setEnabled(true);
                }
        else {
            jMenu2.setEnabled(false);
        }
    }//GEN-LAST:event_jTabbedPane1StateChanged

    private void HAMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HAMenuItemActionPerformed
        // TODO add your handling code here:
        openHouseAffordability();
    }//GEN-LAST:event_HAMenuItemActionPerformed

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        // TODO add your handling code here:
        int l = jTabbedPane1.getSelectedIndex();
        System.out.println(l);
    }//GEN-LAST:event_jPanel1MouseClicked

    private void HAlabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HAlabelMouseEntered
        // TODO add your handling code here:
        HAlabel.setText(String.format("<html><u><b>House Affordability</b></u></html>"));
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_HAlabelMouseEntered

    private void HAlabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HAlabelMouseExited
        // TODO add your handling code here:
        HAlabel.setText("<html><u>House Affordability</u></html>");
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_HAlabelMouseExited

    private void HAlabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HAlabelMouseClicked
        // TODO add your handling code here:
        openHouseAffordability();
    }//GEN-LAST:event_HAlabelMouseClicked

    private void MLlabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MLlabelMouseEntered
        // TODO add your handling code here:
        MLlabel.setText(String.format("<html><u><b>Monthly Loan</b></u></html>"));
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_MLlabelMouseEntered

    private void MLlabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MLlabelMouseExited
        // TODO add your handling code here:
        MLlabel.setText("<html><u>Monthly Loan</u></html>");
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_MLlabelMouseExited

    private void MLlabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MLlabelMouseClicked
        // TODO add your handling code here:
        openMonthlyLoan();
    }//GEN-LAST:event_MLlabelMouseClicked

    private void MPlabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MPlabelMouseClicked
        // TODO add your handling code here:
        openMortgagePayment();
    }//GEN-LAST:event_MPlabelMouseClicked

    private void MPlabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MPlabelMouseEntered
        // TODO add your handling code here:
        MPlabel.setText(String.format("<html><u><b>Mortgage Payment</b></u></html>"));
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_MPlabelMouseEntered

    private void MPlabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MPlabelMouseExited
        // TODO add your handling code here:
        MPlabel.setText("<html><u>Mortgage Payment</u></html>");
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_MPlabelMouseExited

    private void BvLlabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BvLlabelMouseClicked
        // TODO add your handling code here:
        openBuyvLoan();
    }//GEN-LAST:event_BvLlabelMouseClicked

    private void BvLlabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BvLlabelMouseEntered
        // TODO add your handling code here:
        BvLlabel.setText(String.format("<html><u><b>Buy vs Loan</b></u></html>"));
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_BvLlabelMouseEntered

    private void BvLlabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BvLlabelMouseExited
        // TODO add your handling code here:
        BvLlabel.setText("<html><u>Buy vs Loan</u></html>");
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_BvLlabelMouseExited

    private void CClabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CClabelMouseClicked
        // TODO add your handling code here:
        openCurrencyConverter();
    }//GEN-LAST:event_CClabelMouseClicked

    private void CClabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CClabelMouseEntered
        // TODO add your handling code here:
        CClabel.setText(String.format("<html><u><b>Currency Converter</b></u></html>"));
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_CClabelMouseEntered

    private void CClabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CClabelMouseExited
        // TODO add your handling code here:
        CClabel.setText("<html><u>Currency Converter</u></html>");
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        
    }//GEN-LAST:event_CClabelMouseExited

    private void ALlabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ALlabelMouseClicked
        // TODO add your handling code here:
        openAutoLoan();
    }//GEN-LAST:event_ALlabelMouseClicked

    private void ALlabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ALlabelMouseEntered
        // TODO add your handling code here:
        ALlabel.setText(String.format("<html><u><b>Auto Loan</b></u></html>"));
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_ALlabelMouseEntered

    private void ALlabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ALlabelMouseExited
        // TODO add your handling code here:
        ALlabel.setText("<html><u>Auto Loan</u></html>");
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_ALlabelMouseExited

    private void MPayofflabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MPayofflabelMouseClicked
        // TODO add your handling code here:
        openMortgagePayoff();
    }//GEN-LAST:event_MPayofflabelMouseClicked

    private void MPayofflabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MPayofflabelMouseEntered
        // TODO add your handling code here:
        MPayofflabel.setText(String.format("<html><u><b>Mortgage Payoff</b></u></html>"));
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_MPayofflabelMouseEntered

    private void MPayofflabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MPayofflabelMouseExited
        // TODO add your handling code here:
        MPayofflabel.setText("<html><u>Mortgage Payoff</u></html>");
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_MPayofflabelMouseExited

    private void MPMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MPMenuItemActionPerformed
        // TODO add your handling code here:
        openMortgagePayment();
    }//GEN-LAST:event_MPMenuItemActionPerformed

    private void MLMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MLMenuItemActionPerformed
        // TODO add your handling code here:
        openMonthlyLoan();
    }//GEN-LAST:event_MLMenuItemActionPerformed

    private void BvLMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BvLMenuItemActionPerformed
        // TODO add your handling code here:
        openBuyvLoan();
    }//GEN-LAST:event_BvLMenuItemActionPerformed

    private void CCMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CCMenuItemActionPerformed
        // TODO add your handling code here:
        openCurrencyConverter();
    }//GEN-LAST:event_CCMenuItemActionPerformed

    private void ALMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ALMenuItemActionPerformed
        // TODO add your handling code here:
        openAutoLoan();
    }//GEN-LAST:event_ALMenuItemActionPerformed

    private void MPayoffMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MPayoffMenuItemActionPerformed
        // TODO add your handling code here:
        openMortgagePayoff();
    }//GEN-LAST:event_MPayoffMenuItemActionPerformed

    private void inputVehiclePriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputVehiclePriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputVehiclePriceActionPerformed

    private void calculateMonthlyPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateMonthlyPayActionPerformed
        // TODO add your handling code here:
        double vehiclePrice = Double.parseDouble(inputVehiclePrice.getText());
        int loanTerm = Integer.parseInt(inputLoanTerm2.getText());
        double intRate = Double.parseDouble(inputIntRate2.getText());
        double downPayment = Double.parseDouble(inputDownPayment2.getText());
        double tradeIn = Double.parseDouble(inputTradeIn2.getText());
        double salesTax = Double.parseDouble(inputSalesTax2.getText());
        double monthlyPayment = AutoLoan.monthlyPay(vehiclePrice, loanTerm, intRate, tradeIn, downPayment, salesTax);
        double totalCost = AutoLoan.totalCost2(vehiclePrice, downPayment, tradeIn, salesTax);
        double totalSalesTax = (vehiclePrice-downPayment)*(salesTax/100);
        double totalPaid = loanTerm*monthlyPayment;
        double loanInterest = totalPaid-totalCost;
        double totalValue = totalPaid+downPayment+tradeIn;

        TotalPriceresult1.setText(String.format("Monthly Loan Payment: %.02f",monthlyPayment));
        TotalPriceresult2.setText(String.format("Total Loan Amount: %.02f",totalCost));
        TotalPriceresult3.setText(String.format("Total Sales Tax: %.02f",totalSalesTax));
        TotalPriceresult4.setText(String.format("Total of %d Loan Payments: %.02f",loanTerm,totalPaid));
        TotalPriceresult5.setText(String.format("Total Loan Interest: %.02f",loanInterest));
        TotalPriceresult6.setText(String.format("Total Cost: %.02f",totalValue));

    }//GEN-LAST:event_calculateMonthlyPayActionPerformed

    private void calculateTotalPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateTotalPriceActionPerformed
        // TODO add your handling code here:
        double monthlyPayment = Double.parseDouble(monthlyPay.getText());
        int loanTerm = Integer.parseInt(inputLoanTerm.getText());
        double intRate = Double.parseDouble(inputIntRate.getText());
        double downPayment = Double.parseDouble(inputDownPayment.getText());
        double tradeIn = Double.parseDouble(inputTradeIn.getText());
        double salesTax = Double.parseDouble(inputSalesTax.getText());
        double totalLoanAmount = AutoLoan.totalLoanAmount(monthlyPayment, intRate, loanTerm);
        double vehiclePrice = AutoLoan.vehiclePrice(monthlyPayment, loanTerm, intRate, tradeIn, downPayment, salesTax, totalLoanAmount);
        double totalSalesTax = AutoLoan.totalTax(salesTax, downPayment, totalLoanAmount);
        double totalPaid = monthlyPayment*loanTerm;
        double loanInterest = totalPaid-totalLoanAmount;
        double totalValue = totalPaid+downPayment+tradeIn;
        MonthlyPaymentresult1.setText(String.format("Monthly Loan Payment: $%,.02f",vehiclePrice));
        MonthlyPaymentresult2.setText(String.format("Total Loan Amount: $%,.02f",totalLoanAmount));
        MonthlyPaymentresult3.setText(String.format("Total Sales Tax: $%,.02f",totalSalesTax));
        MonthlyPaymentresult4.setText(String.format("Total of %d Loan Payments: $%,.02f",loanTerm,totalPaid));
        MonthlyPaymentresult5.setText(String.format("Total Loan Interest: $%,.02f",loanInterest));
        MonthlyPaymentresult6.setText(String.format("Total Cost: $%,.02f",totalValue));
    }//GEN-LAST:event_calculateTotalPriceActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        
//<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame dashboard = new Dashboard();
                dashboard.setVisible(true);
                dashboard.setExtendedState(JFrame.MAXIMIZED_BOTH);
                dashboard.setResizable(false);
                dashboard.setTitle("Financial Calculator Pro");
                ImageIcon img = new ImageIcon("src\\financialcalculators\\calculator_icon.png");
                dashboard.setIconImage(img.getImage());
            }
        });
    }
    
    public boolean checkType(String s){
        try
        {
           double temp = Double.parseDouble(s);
           return true;
        }
        catch (NumberFormatException e)
        {
            jLabel7.setText("");
            return false;
        }
    }
    
    public static double getSelectedValue(Object o){
        String tempValue = (String) o;
        double selectedValue = Double.parseDouble(tempValue);
        return selectedValue;
    }
    
    public void closeTab(){
        int ind = jTabbedPane1.getSelectedIndex();
        if (ind==0) return;
        jTabbedPane1.removeTabAt(ind);
    }
    
    public void openHouseAffordability(){
        jTabbedPane1.addTab("House Affordability", jPanel8);
        int tabCount = jTabbedPane1.getTabCount();
        jTabbedPane1.setSelectedIndex(tabCount-1);
    }
    
    public void openMonthlyLoan(){
        jTabbedPane1.addTab("Monthly Loan", jPanel3);
        int tabCount = jTabbedPane1.getTabCount();
        jTabbedPane1.setSelectedIndex(tabCount-1);
    }
    
    public void openMortgagePayment(){
        jTabbedPane1.addTab("Mortgage Payment", jPanel4);
        int tabCount = jTabbedPane1.getTabCount();
        jTabbedPane1.setSelectedIndex(tabCount-1);
    }
    
    public void openBuyvLoan(){
        jTabbedPane1.addTab("Buy vs Loan", jPanel2);
        int tabCount = jTabbedPane1.getTabCount();
        jTabbedPane1.setSelectedIndex(tabCount-1);
    }
    
    public void openAutoLoan(){
        jTabbedPane1.addTab("Auto Loan", jPanel6);
        int tabCount = jTabbedPane1.getTabCount();
        jTabbedPane1.setSelectedIndex(tabCount-1);
    }
    
    public void openMortgagePayoff(){
        jTabbedPane1.addTab("Mortgage Payoff", jPanel7);
        int tabCount = jTabbedPane1.getTabCount();
        jTabbedPane1.setSelectedIndex(tabCount-1);
    }
    
    public void openCurrencyConverter(){
        jTabbedPane1.addTab("Currency Converter", jPanel5);
        int tabCount = jTabbedPane1.getTabCount();
        jTabbedPane1.setSelectedIndex(tabCount-1);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ALMenuItem;
    private javax.swing.JLabel ALlabel;
    private javax.swing.JTabbedPane AutoLoanTab;
    private javax.swing.JMenuItem BvLMenuItem;
    private javax.swing.JLabel BvLlabel;
    private javax.swing.JMenuItem CCMenuItem;
    private javax.swing.JLabel CClabel;
    private javax.swing.JMenuItem HAMenuItem;
    private javax.swing.JLabel HAlabel;
    private javax.swing.JMenuItem MLMenuItem;
    private javax.swing.JLabel MLlabel;
    private javax.swing.JMenuItem MPMenuItem;
    private javax.swing.JMenuItem MPayoffMenuItem;
    private javax.swing.JLabel MPayofflabel;
    private javax.swing.JLabel MPlabel;
    private javax.swing.JLabel MonthlyPaymentresult1;
    private javax.swing.JLabel MonthlyPaymentresult2;
    private javax.swing.JLabel MonthlyPaymentresult3;
    private javax.swing.JLabel MonthlyPaymentresult4;
    private javax.swing.JLabel MonthlyPaymentresult5;
    private javax.swing.JLabel MonthlyPaymentresult6;
    private javax.swing.JLabel TotalPriceresult1;
    private javax.swing.JLabel TotalPriceresult2;
    private javax.swing.JLabel TotalPriceresult3;
    private javax.swing.JLabel TotalPriceresult4;
    private javax.swing.JLabel TotalPriceresult5;
    private javax.swing.JLabel TotalPriceresult6;
    private javax.swing.JButton calculateMonthlyPay;
    private javax.swing.JButton calculateTotalPrice;
    private javax.swing.JTextField inputDownPayment;
    private javax.swing.JTextField inputDownPayment2;
    private javax.swing.JTextField inputIntRate;
    private javax.swing.JTextField inputIntRate2;
    private javax.swing.JTextField inputLoanTerm;
    private javax.swing.JTextField inputLoanTerm2;
    private javax.swing.JTextField inputSalesTax;
    private javax.swing.JTextField inputSalesTax2;
    private javax.swing.JTextField inputTradeIn;
    private javax.swing.JTextField inputTradeIn2;
    private javax.swing.JTextField inputVehiclePrice;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextField monthlyPay;
    // End of variables declaration//GEN-END:variables

}