package financialcalculators;
import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.border.*;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
 
public class Dashboard extends javax.swing.JFrame {
    
    private HashMap<String, Double> exchangeRates = new HashMap<>();
    private static final Logger LOGGER = Logger.getLogger(CCFrame.class.getName()); // Logger initialization
    
    private HashMap<String, Double> scrapeExchangeRates(String url) throws IOException {
    HashMap<String, Double> rates = new HashMap<>();
    Document document = Jsoup.connect(url).get();
    Elements rows = document.select("table.ratesTable tr");

    for (Element row : rows) {
        String countryName = row.select("td:nth-child(1)").text();
        String exchangeRate = row.select("td:nth-child(2)").text();

        if (!countryName.isEmpty() && !exchangeRate.isEmpty()) {
            rates.put(countryName, Double.parseDouble(exchangeRate));
        }
    }
    return rates;
}
    private void populateComboBoxes() {
        try {
        exchangeRates = scrapeExchangeRates("https://www.x-rates.com/table/?from=USD&amount=1");
        exchangeRates.put("USD", 1.0);

        
        java.util.List<String> countryList = new ArrayList<>(exchangeRates.keySet());
        
        
        Collections.sort(countryList);

        FromCurrency.removeAllItems();
        ToCurrency.removeAllItems();

        
        for (String country : countryList) {
            FromCurrency.addItem(country);
            ToCurrency.addItem(country);
            }

        } catch (IOException e) {
            LOGGER.log(Level.SEVERE, "Error occurred while scraping the website", e);
        }
    }
    
    public Dashboard() {
        initComponents();
        populateComboBoxes();
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
        MPayofflabel1 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel92 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel84 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jLabel85 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jLabel86 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jLabel91 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        jLabel97 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        jLabel98 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        jLabel99 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        proptaxincrease = new javax.swing.JTextField();
        homeinsinc = new javax.swing.JTextField();
        hoabvr = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        maintenencecost = new javax.swing.JTextField();
        costincrease = new javax.swing.JTextField();
        valueappreciation = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel127 = new javax.swing.JLabel();
        jLabel128 = new javax.swing.JLabel();
        jLabel129 = new javax.swing.JLabel();
        jLabel130 = new javax.swing.JLabel();
        homeprice = new javax.swing.JTextField();
        downpaymentbvr = new javax.swing.JTextField();
        intratebvr = new javax.swing.JTextField();
        termbvr = new javax.swing.JTextField();
        closingcostbvr = new javax.swing.JTextField();
        proptaxbvr = new javax.swing.JTextField();
        jLabel131 = new javax.swing.JLabel();
        avginvret = new javax.swing.JTextField();
        statetax = new javax.swing.JTextField();
        jLabel132 = new javax.swing.JLabel();
        upfrontcost = new javax.swing.JTextField();
        jLabel133 = new javax.swing.JLabel();
        jLabel134 = new javax.swing.JLabel();
        jLabel135 = new javax.swing.JLabel();
        jLabel136 = new javax.swing.JLabel();
        monthlyrentfee = new javax.swing.JTextField();
        rentfeeincrease = new javax.swing.JTextField();
        rentinsurance = new javax.swing.JTextField();
        securitydeposit = new javax.swing.JTextField();
        federaltax = new javax.swing.JTextField();
        jLabel137 = new javax.swing.JLabel();
        jLabel138 = new javax.swing.JLabel();
        jLabel139 = new javax.swing.JLabel();
        calcbvr = new javax.swing.JButton();
        clearbvr = new javax.swing.JLabel();
        taxfilingstatus = new javax.swing.JComboBox<>();
        jLabel140 = new javax.swing.JLabel();
        homerent = new javax.swing.JLabel();
        jLabel141 = new javax.swing.JLabel();
        homepurchase = new javax.swing.JLabel();
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
        Convert = new javax.swing.JButton();
        Result = new javax.swing.JTextField();
        Amount = new javax.swing.JTextField();
        EnterAmtCC = new javax.swing.JLabel();
        FromCurrency = new javax.swing.JComboBox<>();
        ToCurrency = new javax.swing.JComboBox<>();
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
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jTextField42 = new javax.swing.JTextField();
        jLabel73 = new javax.swing.JLabel();
        jTextField43 = new javax.swing.JTextField();
        jTextField44 = new javax.swing.JTextField();
        jLabel74 = new javax.swing.JLabel();
        jTextField45 = new javax.swing.JTextField();
        jLabel75 = new javax.swing.JLabel();
        jTextField46 = new javax.swing.JTextField();
        jLabel76 = new javax.swing.JLabel();
        jTextField47 = new javax.swing.JTextField();
        jLabel77 = new javax.swing.JLabel();
        jTextField48 = new javax.swing.JTextField();
        jTextField49 = new javax.swing.JTextField();
        jTextField50 = new javax.swing.JTextField();
        jTextField51 = new javax.swing.JTextField();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jTextField52 = new javax.swing.JTextField();
        jTextField53 = new javax.swing.JTextField();
        jTextField54 = new javax.swing.JTextField();
        jTextField55 = new javax.swing.JTextField();
        jRadioButton5 = new javax.swing.JRadioButton();
        jTextField56 = new javax.swing.JTextField();
        jRadioButton4 = new javax.swing.JRadioButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel80 = new javax.swing.JLabel();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
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
        jPanel14 = new javax.swing.JPanel();
        valueofcalcira = new javax.swing.JLabel();
        calcbuttonira = new javax.swing.JButton();
        yesbox = new javax.swing.JCheckBox();
        clearbuttonira = new javax.swing.JButton();
        nobox = new javax.swing.JCheckBox();
        jLabel37 = new javax.swing.JLabel();
        currBalanceira = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        annContrira = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        exprateretuira = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        currage = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        retage = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        margtaxira = new javax.swing.JTextField();
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

        jPanel9.setBackground(new java.awt.Color(96, 0, 21));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        jLabel25.setFont(new java.awt.Font("Wide Latin", 0, 48)); // NOI18N
        jLabel25.setText("MC Finance");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
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
        BvLlabel.setText("<html><u>Roth IRA</u></html>");
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

        MPayofflabel1.setForeground(new java.awt.Color(254, 96, 0));
        MPayofflabel1.setText("<html><u>Buy vs Loan</u></html>");
        MPayofflabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MPayofflabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MPayofflabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MPayofflabel1MouseExited(evt);
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
                    .addComponent(MPayofflabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(MPayofflabel1))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MPayofflabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(225, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel10);
        jPanel10.setBounds(20, 150, 140, 540);

        jPanel11.setBackground(new java.awt.Color(96, 0, 21));
        jPanel11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));
        jPanel11.setLayout(null);

        jLabel81.setFont(new java.awt.Font("Yu Gothic Medium", 0, 48)); // NOI18N
        jLabel81.setText("For All Your Financial Calculating Needs!");
        jPanel11.add(jLabel81);
        jLabel81.setBounds(56, 27, 1020, 71);

        jLabel82.setFont(new java.awt.Font("Yu Gothic Medium", 0, 36)); // NOI18N
        jLabel82.setText("We've Got: ");
        jPanel11.add(jLabel82);
        jLabel82.setBounds(56, 104, 1020, 71);

        jPanel17.setBackground(new java.awt.Color(96, 0, 21));
        jPanel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel92.setText("Buy vs Loan");

        jLabel83.setText("A calculator to help you decide whether to buy or rent housing");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel92, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel83, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel83)
                    .addComponent(jLabel92))
                .addContainerGap())
        );

        jPanel11.add(jPanel17);
        jPanel17.setBounds(26, 181, 427, 28);

        jPanel18.setBackground(new java.awt.Color(96, 0, 21));
        jPanel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel84.setText("A calculator that will find the monthly payment you'll have to pay on a loan");

        jLabel93.setText("Monthly Loan");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel93, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel84, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel84)
                    .addComponent(jLabel93))
                .addContainerGap())
        );

        jPanel11.add(jPanel18);
        jPanel18.setBounds(26, 215, 499, 28);

        jPanel19.setBackground(new java.awt.Color(96, 0, 21));
        jPanel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel85.setText("This calculator will tell you how much you will have to pay on your mortgage every month");

        jLabel94.setText("Mortgage Payment");

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel94, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel85, javax.swing.GroupLayout.DEFAULT_SIZE, 485, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel85)
                    .addComponent(jLabel94))
                .addContainerGap())
        );

        jPanel11.add(jPanel19);
        jPanel19.setBounds(26, 249, 624, 28);

        jPanel20.setBackground(new java.awt.Color(96, 0, 21));
        jPanel20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel86.setText("A simple and convenient way to convert your currency with a wide range of available currencies");

        jLabel95.setText("Currency Converter");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel95, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel86, javax.swing.GroupLayout.PREFERRED_SIZE, 643, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel86)
                    .addComponent(jLabel95))
                .addContainerGap())
        );

        jPanel11.add(jPanel20);
        jPanel20.setBounds(26, 283, 655, 28);

        jPanel21.setBackground(new java.awt.Color(96, 0, 21));
        jPanel21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel91.setText("It will also give the amount of vehicle you can affford based on your monthly payment");

        jLabel96.setText("Auto Loan");

        jLabel87.setText("A tool that will tell you the amount you will have to pay every month on your auto loan");

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel96, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel91, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel87, javax.swing.GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel87)
                    .addComponent(jLabel96))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel91)
                .addContainerGap())
        );

        jPanel11.add(jPanel21);
        jPanel21.setBounds(26, 317, 549, 50);

        jPanel22.setBackground(new java.awt.Color(96, 0, 21));
        jPanel22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel97.setText("Mortgage Payoff");

        jLabel88.setText("A calculator that will tell you how much you still have to payoff on your mortgage");

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel97, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel88, javax.swing.GroupLayout.PREFERRED_SIZE, 642, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel88)
                    .addComponent(jLabel97))
                .addContainerGap())
        );

        jPanel11.add(jPanel22);
        jPanel22.setBounds(26, 373, 549, 28);

        jPanel23.setBackground(new java.awt.Color(96, 0, 21));
        jPanel23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel98.setText("House Affordability");

        jLabel89.setText("This will tell you approximately what value house you can afford");

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel98, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel89, javax.swing.GroupLayout.PREFERRED_SIZE, 791, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel89)
                    .addComponent(jLabel98))
                .addContainerGap())
        );

        jPanel11.add(jPanel23);
        jPanel23.setBounds(26, 407, 483, 28);

        jPanel24.setBackground(new java.awt.Color(96, 0, 21));
        jPanel24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel99.setText("Roth IRA");

        jLabel90.setText("This calculator informs you of how much your Roth IRA account will compound over time");

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel99, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel90, javax.swing.GroupLayout.PREFERRED_SIZE, 642, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel90)
                    .addComponent(jLabel99))
                .addContainerGap())
        );

        jPanel11.add(jPanel24);
        jPanel24.setBounds(26, 441, 549, 28);

        jLabel101.setIcon(new javax.swing.ImageIcon(getClass().getResource("/financialcalculators/ImageDependencies/mc.png"))); // NOI18N
        jLabel101.setText("jLabel101");
        jPanel11.add(jLabel101);
        jLabel101.setBounds(700, 200, 400, 320);

        jPanel1.add(jPanel11);
        jPanel11.setBounds(200, 150, 1120, 540);

        jTabbedPane1.addTab("Dashboard", null, jPanel1, "");

        proptaxincrease.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proptaxincreaseActionPerformed(evt);
            }
        });

        homeinsinc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeinsincActionPerformed(evt);
            }
        });

        hoabvr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hoabvrActionPerformed(evt);
            }
        });

        jLabel30.setText("Down payment");

        maintenencecost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maintenencecostActionPerformed(evt);
            }
        });

        costincrease.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                costincreaseActionPerformed(evt);
            }
        });

        valueappreciation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valueappreciationActionPerformed(evt);
            }
        });

        jLabel31.setText("Home price ");

        jLabel32.setText("Interest rate ");

        jLabel33.setText("Loan term");

        jLabel34.setText("Buying closing costs");

        jLabel35.setText("Property tax ");

        jLabel36.setText("Property tax increase");

        jLabel62.setText("Home insurance ");

        jLabel127.setText("HOA fee");

        jLabel128.setText("Maintenance cost ");

        jLabel129.setText("Home value appreciation ");

        jLabel130.setText("cost/insurance increase ");

        homeprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homepriceActionPerformed(evt);
            }
        });

        downpaymentbvr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downpaymentbvrActionPerformed(evt);
            }
        });

        intratebvr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                intratebvrActionPerformed(evt);
            }
        });

        termbvr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                termbvrActionPerformed(evt);
            }
        });

        closingcostbvr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closingcostbvrActionPerformed(evt);
            }
        });

        proptaxbvr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proptaxbvrActionPerformed(evt);
            }
        });

        jLabel131.setText("Tax filing status");

        avginvret.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avginvretActionPerformed(evt);
            }
        });

        statetax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statetaxActionPerformed(evt);
            }
        });

        jLabel132.setText("Monthly rental fee");

        upfrontcost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upfrontcostActionPerformed(evt);
            }
        });

        jLabel133.setText("Rental fee increase ");

        jLabel134.setText("Renter's insurance ");

        jLabel135.setText("Security deposit");

        jLabel136.setText("Upfront cost ");

        monthlyrentfee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthlyrentfeeActionPerformed(evt);
            }
        });

        rentfeeincrease.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rentfeeincreaseActionPerformed(evt);
            }
        });

        rentinsurance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rentinsuranceActionPerformed(evt);
            }
        });

        securitydeposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                securitydepositActionPerformed(evt);
            }
        });

        federaltax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                federaltaxActionPerformed(evt);
            }
        });

        jLabel137.setText("average investment return ");

        jLabel138.setText("Marginal federal text rate ");

        jLabel139.setText("Marginal state tax rate ");

        calcbvr.setBackground(new java.awt.Color(255, 102, 102));
        calcbvr.setText("CALCULATE");
        calcbvr.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        calcbvr.setOpaque(true);
        calcbvr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcbvrActionPerformed(evt);
            }
        });

        clearbvr.setBackground(new java.awt.Color(204, 204, 204));
        clearbvr.setText("      CLEAR ");
        clearbvr.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        clearbvr.setOpaque(true);
        clearbvr.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                clearbvrAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        taxfilingstatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "single", "married filing jointly ", "married filling separately", "head of household ", "quaified widow" }));

        homerent.setBackground(java.awt.Color.gray);
        homerent.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        homerent.setText("Home Rent");
        homerent.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        homerent.setOpaque(true);

        jLabel141.setBackground(java.awt.Color.gray);
        jLabel141.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel141.setText("Your Information");
        jLabel141.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel141.setOpaque(true);

        homepurchase.setBackground(java.awt.Color.gray);
        homepurchase.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        homepurchase.setText("Home Purchase");
        homepurchase.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        homepurchase.setOpaque(true);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(homepurchase, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(120, 120, 120)
                        .addComponent(homerent, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(94, 94, 94)
                        .addComponent(homeprice, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(139, 139, 139)
                        .addComponent(jLabel132, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(129, 129, 129)
                        .addComponent(monthlyrentfee, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(94, 94, 94)
                        .addComponent(downpaymentbvr, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(139, 139, 139)
                        .addComponent(jLabel133, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(129, 129, 129)
                        .addComponent(rentfeeincrease, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(108, 108, 108)
                        .addComponent(intratebvr, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(139, 139, 139)
                        .addComponent(jLabel134, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(149, 149, 149)
                        .addComponent(rentinsurance, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(108, 108, 108)
                        .addComponent(termbvr, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(139, 139, 139)
                        .addComponent(jLabel135, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(152, 152, 152)
                        .addComponent(securitydeposit, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(closingcostbvr, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(139, 139, 139)
                        .addComponent(jLabel136, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(141, 141, 141)
                        .addComponent(upfrontcost, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(108, 108, 108)
                        .addComponent(proptaxbvr, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(139, 139, 139)
                        .addComponent(jLabel141, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(proptaxincrease, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(139, 139, 139)
                        .addComponent(jLabel138, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(115, 115, 115)
                        .addComponent(federaltax, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100)
                        .addComponent(homeinsinc, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(139, 139, 139)
                        .addComponent(jLabel137, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(109, 109, 109)
                        .addComponent(avginvret, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel127, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(108, 108, 108)
                        .addComponent(hoabvr, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(139, 139, 139)
                        .addComponent(jLabel139, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(112, 112, 112)
                        .addComponent(statetax, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel128, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel129, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(54, 54, 54)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(maintenencecost, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(valueappreciation, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(139, 139, 139)
                        .addComponent(jLabel131, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(taxfilingstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel130, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jLabel140, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(costincrease, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addComponent(calcbvr, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(clearbvr, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(691, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(homepurchase)
                    .addComponent(homerent))
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel31))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(homeprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel132, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(monthlyrentfee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel30))
                    .addComponent(downpaymentbvr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel133))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(rentfeeincrease, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(intratebvr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rentinsurance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel32)
                            .addComponent(jLabel134, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(termbvr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(securitydeposit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel33)
                            .addComponent(jLabel135))))
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel34))
                    .addComponent(closingcostbvr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel136)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(upfrontcost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel35))
                    .addComponent(proptaxbvr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel141))
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(proptaxincrease, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel138)
                    .addComponent(federaltax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel137)
                    .addComponent(avginvret, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel62)
                            .addComponent(homeinsinc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel127)
                    .addComponent(hoabvr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel139)
                    .addComponent(statetax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel128)
                        .addGap(14, 14, 14)
                        .addComponent(jLabel129))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(maintenencecost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(valueappreciation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel131))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(taxfilingstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel130, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(costincrease, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel140, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(calcbvr, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(clearbvr, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(208, Short.MAX_VALUE))
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
                .addContainerGap(469, Short.MAX_VALUE))
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
                .addContainerGap(477, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Mortgage Payment", jPanel4);
        jTabbedPane1.removeTabAt(1);

        Convert.setText("Convert");
        Convert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConvertActionPerformed(evt);
            }
        });

        Result.setEditable(false);
        Result.setText("0.00");
        Result.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResultActionPerformed(evt);
            }
        });

        Amount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AmountActionPerformed(evt);
            }
        });

        EnterAmtCC.setText("Enter Amount:");

        FromCurrency.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        ToCurrency.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FromCurrency, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Amount, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1194, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Result, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ToCurrency, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(157, 157, 157)
                                .addComponent(Convert))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(EnterAmtCC)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ToCurrency, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FromCurrency, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(EnterAmtCC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Amount, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Result, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(Convert)
                .addContainerGap(533, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Currency Converter", jPanel5);
        jTabbedPane1.removeTabAt(1);

        inputVehiclePrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputVehiclePriceActionPerformed(evt);
            }
        });

        calculateMonthlyPay.setText("Calculate");
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
                .addContainerGap(448, Short.MAX_VALUE))
        );

        AutoLoanTab.addTab("Total Price", jPanel12);

        calculateTotalPrice.setText("Calculate");
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
                .addContainerGap(950, Short.MAX_VALUE))
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
                .addContainerGap(457, Short.MAX_VALUE))
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

        jRadioButton3.setText("Biweekly payment");

        jRadioButton2.setText("Standard payment");

        jRadioButton1.setText("Repay with extra payments");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jLabel63.setText("Repayment Options:");

        jLabel64.setText("Repayment Options:");

        jLabel65.setText("Interest Rate (%):");

        jLabel66.setText("Monthly Payment ($):");

        jLabel67.setText("Principal Amount ($):");

        jLabel68.setText("one time ($):");

        jLabel69.setText("$ per year:");

        jLabel70.setText("Remaining Term (yrs):");

        jLabel71.setText("$ per month:");

        jLabel72.setText("Interest Rate (%):");

        jTextField42.setEditable(false);

        jLabel73.setText("Original Term (yrs):");

        jTextField44.setEditable(false);

        jLabel74.setText("Principal Amount ($):");

        jLabel75.setText("For use with unknown remaining loan term:");

        jLabel76.setText("For use with known remaining loan term:");

        jLabel77.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel77.setText("Mortgage Payoff Calculator");

        jLabel78.setText("$ per year:");

        jLabel79.setText("$ per month:");

        jRadioButton5.setText("Repay with extra payments");
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });

        jRadioButton4.setText("Pay altogether");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        jButton3.setText("Calculate");

        jButton4.setText("Calculate");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel80.setText("one time ($):");

        jRadioButton6.setText("Biweekly payment");

        jRadioButton7.setText("Standard payment");
        jRadioButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField49, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jRadioButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel70, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField51, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField50, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField48, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel72, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel73, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel74, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                                            .addComponent(jLabel80)
                                                            .addGap(96, 96, 96))
                                                        .addComponent(jRadioButton5)
                                                        .addGroup(jPanel7Layout.createSequentialGroup()
                                                            .addGap(94, 94, 94)
                                                            .addComponent(jTextField53, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                                        .addComponent(jLabel79)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jTextField47, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                                        .addComponent(jLabel78)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jTextField46, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                                    .addComponent(jRadioButton6)
                                                    .addGap(64, 64, 64)))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                                .addComponent(jRadioButton7)
                                                .addGap(62, 62, 62)))))
                                .addGap(20, 20, 20)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton4)
                                    .addComponent(jTextField44, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(386, 386, 386)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField56, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField43, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField45, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel75)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jLabel65, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel66, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel67, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel63))
                                        .addGap(41, 41, 41)
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton3)
                                            .addComponent(jTextField42, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jRadioButton1)
                                        .addGroup(jPanel7Layout.createSequentialGroup()
                                            .addComponent(jLabel69)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jTextField54, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                                .addComponent(jLabel68, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextField52, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel7Layout.createSequentialGroup()
                                                .addComponent(jLabel71)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextField55, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(jRadioButton3)
                                    .addComponent(jRadioButton2)))))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(jLabel77)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel75)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel67)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel66)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel65)
                        .addGap(5, 5, 5)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField56, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel63)
                            .addComponent(jTextField42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel71))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel68))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton2))
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel69))))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel77)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel74)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel73)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel72)
                        .addGap(5, 5, 5)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jTextField49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel70)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel64))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(jButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(12, 12, 12)
                        .addComponent(jRadioButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel79))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel78))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField53, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel80))))
                .addGap(18, 18, 18)
                .addComponent(jRadioButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton7)
                .addGap(187, 187, 187))
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
                .addContainerGap(444, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("House Affordability", jPanel8);
        jTabbedPane1.removeTabAt(1);

        calcbuttonira.setBackground(new java.awt.Color(255, 153, 153));
        calcbuttonira.setText("CALCULATE");
        calcbuttonira.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        calcbuttonira.setOpaque(true);
        calcbuttonira.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcbuttoniraActionPerformed(evt);
            }
        });

        yesbox.setText("Yes");
        yesbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yesboxActionPerformed(evt);
            }
        });

        clearbuttonira.setBackground(new java.awt.Color(153, 153, 153));
        clearbuttonira.setText("CLEAR");
        clearbuttonira.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        clearbuttonira.setOpaque(true);
        clearbuttonira.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearbuttoniraActionPerformed(evt);
            }
        });

        nobox.setText("No");
        nobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noboxActionPerformed(evt);
            }
        });

        jLabel37.setText("current balance");

        currBalanceira.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                currBalanceiraActionPerformed(evt);
            }
        });

        jLabel38.setText("annual contribution ");

        annContrira.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                annContriraActionPerformed(evt);
            }
        });

        jLabel39.setText("maximize contributions ");

        exprateretuira.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exprateretuiraActionPerformed(evt);
            }
        });

        jLabel40.setText("expected rate of return");

        currage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                currageActionPerformed(evt);
            }
        });

        jLabel41.setText("current age");

        retage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retageActionPerformed(evt);
            }
        });

        jLabel42.setText("retirement age");

        jLabel43.setText("marginal tax rate");

        margtaxira.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                margtaxiraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel38)))
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addGap(120, 120, 120)
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel14Layout.createSequentialGroup()
                                        .addComponent(yesbox, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(nobox, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(61, 61, 61))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(calcbuttonira, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(clearbuttonira, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)))
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(valueofcalcira, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(margtaxira, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(retage, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(currage, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(exprateretuira, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(currBalanceira, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(annContrira, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel39)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(yesbox)
                            .addComponent(nobox))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(exprateretuira, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel41)
                            .addComponent(currage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel42)
                            .addComponent(retage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(currBalanceira, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(annContrira, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel43)
                    .addComponent(margtaxira, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(calcbuttonira, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(clearbuttonira, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(valueofcalcira, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(388, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Roth IRA", jPanel14);
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
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 770, Short.MAX_VALUE)
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
        openBuyVsLoan();
    }//GEN-LAST:event_BvLlabelMouseClicked

    private void BvLlabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BvLlabelMouseEntered
        // TODO add your handling code here:
        BvLlabel.setText(String.format("<html><u><b>Roth IRA</b></u></html>"));
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_BvLlabelMouseEntered

    private void BvLlabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BvLlabelMouseExited
        // TODO add your handling code here:
        BvLlabel.setText("<html><u>Roth IRA</u></html>");
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

    private void ConvertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConvertActionPerformed
        try {
            String fromCurrency = (String) FromCurrency.getSelectedItem();
            String toCurrency = (String) ToCurrency.getSelectedItem();
            double amount = Double.parseDouble(Amount.getText());

            if (fromCurrency != null && toCurrency != null && exchangeRates.containsKey(fromCurrency) && exchangeRates.containsKey(toCurrency)) {
                double fromRate = exchangeRates.get(fromCurrency);
                double toRate = exchangeRates.get(toCurrency);
                double result = amount / fromRate * toRate;

                Result.setText(String.format("%.2f", result));
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter a valid amount.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_ConvertActionPerformed

    private void ResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResultActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ResultActionPerformed

    private void AmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AmountActionPerformed

    private void MPayofflabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MPayofflabel1MouseClicked
        // TODO add your handling code here:
        openBuyvLoan();
    }//GEN-LAST:event_MPayofflabel1MouseClicked

    private void MPayofflabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MPayofflabel1MouseEntered
        // TODO add your handling code here:
        MPayofflabel1.setText(String.format("<html><u><b>Buy vs Loan</b></u></html>"));
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_MPayofflabel1MouseEntered

    private void MPayofflabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MPayofflabel1MouseExited
        // TODO add your handling code here:
        MPayofflabel1.setText("<html><u>Buy vs Loan</u></html>");
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_MPayofflabel1MouseExited

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton5ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jRadioButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton7ActionPerformed

    private void proptaxincreaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proptaxincreaseActionPerformed
        try {
            double taxIncrease = Double.parseDouble(closingcostbvr.getText());
            JOptionPane.showMessageDialog(this, "Property Tax Increase: " + taxIncrease + "%");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid property tax increase entered.");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_proptaxincreaseActionPerformed

    private void homeinsincActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeinsincActionPerformed
        try {
            double homeInsurance = Double.parseDouble(proptaxbvr.getText());
            JOptionPane.showMessageDialog(this, "Home Insurance: $" + homeInsurance);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid home insurance entered.");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_homeinsincActionPerformed

    private void hoabvrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hoabvrActionPerformed
        try {
            double hoaFee = Double.parseDouble(proptaxincrease.getText());
            JOptionPane.showMessageDialog(this, "HOA Fee: $" + hoaFee);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid HOA fee entered.");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_hoabvrActionPerformed

    private void maintenencecostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maintenencecostActionPerformed
        try {
            double maintenanceCosts = Double.parseDouble(homeinsinc.getText());
            JOptionPane.showMessageDialog(this, "Maintenance Costs: $" + maintenanceCosts);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid maintenance costs entered.");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_maintenencecostActionPerformed

    private void costincreaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_costincreaseActionPerformed
        try {
            // Ensure jTextField12 is correctly declared and initialized
            double insuranceIncrease = Double.parseDouble(maintenencecost.getText());

            // Use null if this is not a JFrame/JDialog
            JOptionPane.showMessageDialog(null, "Insurance Cost Increase: " + insuranceIncrease + "%");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid insurance cost increase entered.");
        }
    }//GEN-LAST:event_costincreaseActionPerformed

    private void valueappreciationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valueappreciationActionPerformed
        try {
            double homeValueAppreciation = Double.parseDouble(hoabvr.getText());
            JOptionPane.showMessageDialog(this, "Home Value Appreciation: " + homeValueAppreciation + "%");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid home value appreciation entered.");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_valueappreciationActionPerformed

    private void homepriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homepriceActionPerformed
        {// Parse the input as a double
            double homePrice = Double.parseDouble(homeprice.getText());
            // Print the home price to the console
            System.out.println("Home Price entered: $" + homePrice);
            // Handle invalid input
            System.out.println("Please enter a valid number.");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_homepriceActionPerformed

    private void downpaymentbvrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downpaymentbvrActionPerformed
        try {
            double downPayment = Double.parseDouble(downpaymentbvr.getText());
            JOptionPane.showMessageDialog(this, "Down Payment: $" + downPayment);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid down payment entered.");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_downpaymentbvrActionPerformed

    private void intratebvrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_intratebvrActionPerformed
        try {
            double interestRate = Double.parseDouble(intratebvr.getText());
            JOptionPane.showMessageDialog(this, "Interest Rate: " + interestRate + "%");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid interest rate entered.");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_intratebvrActionPerformed

    private void termbvrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_termbvrActionPerformed
        try {
            int loanTerm = Integer.parseInt(downpaymentbvr.getText());
            JOptionPane.showMessageDialog(this, "Loan Term: " + loanTerm + " years");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid loan term entered.");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_termbvrActionPerformed

    private void closingcostbvrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closingcostbvrActionPerformed
        try {
            double closingCosts = Double.parseDouble(intratebvr.getText());
            JOptionPane.showMessageDialog(this, "Buying Closing Costs: $" + closingCosts);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid closing costs entered.");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_closingcostbvrActionPerformed

    private void proptaxbvrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proptaxbvrActionPerformed
        try {
            double propertyTax = Double.parseDouble(termbvr.getText());
            JOptionPane.showMessageDialog(this, "Property Tax: $" + propertyTax);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid property tax entered.");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_proptaxbvrActionPerformed

    private void avginvretActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avginvretActionPerformed
        try {
            double investmentReturn = Double.parseDouble(avginvret.getText());
            JOptionPane.showMessageDialog(this, "Average Investment Return: " + investmentReturn + "%");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid investment return.");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_avginvretActionPerformed

    private void statetaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statetaxActionPerformed
        try {
            double stateTaxRate = Double.parseDouble(statetax.getText());
            JOptionPane.showMessageDialog(this, "Marginal State Tax Rate: " + stateTaxRate + "%");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid state tax rate.");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_statetaxActionPerformed

    private void upfrontcostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upfrontcostActionPerformed
        try {
            double upfrontCost = Double.parseDouble(securitydeposit.getText());
            JOptionPane.showMessageDialog(this, "Upfront Cost: $" + upfrontCost);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid upfront cost.");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_upfrontcostActionPerformed

    private void monthlyrentfeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthlyrentfeeActionPerformed
        try {
            double rentalFee = Double.parseDouble(rentfeeincrease.getText());
            JOptionPane.showMessageDialog(this, "Monthly Rental Fee: $" + rentalFee);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid monthly rental fee entered.");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_monthlyrentfeeActionPerformed

    private void rentfeeincreaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rentfeeincreaseActionPerformed
        try {
            double increasedRentalFee = Double.parseDouble(rentfeeincrease.getText()) * (1 + Double.parseDouble(monthlyrentfee.getText()) / 100);
            JOptionPane.showMessageDialog(this, "New Rental Fee: $" + increasedRentalFee);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid input.");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_rentfeeincreaseActionPerformed

    private void rentinsuranceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rentinsuranceActionPerformed
        try {
            double rentersInsurance = Double.parseDouble(rentfeeincrease.getText());
            JOptionPane.showMessageDialog(this, "Renter's Insurance: $" + rentersInsurance);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid renter's insurance.");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_rentinsuranceActionPerformed

    private void securitydepositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_securitydepositActionPerformed
        try {
            double securityDeposit = Double.parseDouble(rentinsurance.getText());
            JOptionPane.showMessageDialog(this, "Security Deposit: $" + securityDeposit);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid security deposit.");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_securitydepositActionPerformed

    private void federaltaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_federaltaxActionPerformed
        try {
            double marginalTaxRate = Double.parseDouble(federaltax.getText());
            JOptionPane.showMessageDialog(this, "Marginal Federal Tax Rate: " + marginalTaxRate + "%");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid tax rate.");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_federaltaxActionPerformed

    private void calcbvrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcbvrActionPerformed
        try {
            // Gather input from the text fields
            double homePrice;
            homePrice = Double.parseDouble(homeprice.getText());
            double downPayment = Double.parseDouble(downpaymentbvr.getText());
            double interestRate = Double.parseDouble(intratebvr.getText()) / 100;
            int loanTerm = Integer.parseInt(termbvr.getText());
            double buyingClosingCosts = Double.parseDouble(closingcostbvr.getText());
            double propertyTax = Double.parseDouble(proptaxbvr.getText()) / 100;
            double propertyTaxIncrease = Double.parseDouble(proptaxincrease.getText()) / 100;
            double homeInsurance = Double.parseDouble(homeinsinc.getText());
            double hoaFee = Double.parseDouble(hoabvr.getText());
            double maintenanceCost = Double.parseDouble(maintenencecost.getText());
            double homeValueAppreciation = Double.parseDouble(valueappreciation.getText()) / 100;
            double costInsuranceIncrease = Double.parseDouble(costincrease.getText()) / 100;
            double monthlyRentalFee = Double.parseDouble(monthlyrentfee.getText());
            double rentalFeeIncrease = Double.parseDouble(rentfeeincrease.getText()) / 100;
            double rentersInsurance = Double.parseDouble(rentinsurance.getText());
            double securityDeposit = Double.parseDouble(securitydeposit.getText());
            double upfrontCost = Double.parseDouble(upfrontcost.getText());
            double marginalFederalTaxRate = Double.parseDouble(federaltax.getText()) / 100;
            double averageInvestmentReturn = Double.parseDouble(avginvret.getText()) / 100;
            double marginalStateTaxRate = Double.parseDouble(statetax.getText()) / 100;
            String taxFilingStatus = (String) taxfilingstatus.getSelectedItem(); // Assuming a dropdown or simple text field
            // Calculate total cost for buying
            double loanAmount = homePrice - downPayment;
            double annualLoanPayment = loanAmount * (interestRate / (1 - Math.pow(1 + interestRate, -loanTerm * 12)));
            double totalBuyingCost = downPayment + buyingClosingCosts + (annualLoanPayment * loanTerm) +
            (propertyTax * homePrice) + (homeInsurance * loanTerm) +
            (hoaFee * 12 * loanTerm) + (maintenanceCost * loanTerm);

            // Calculate total cost for renting
            double totalRentingCost = (monthlyRentalFee * 12 * loanTerm) + rentersInsurance +
            (rentalFeeIncrease * monthlyRentalFee * loanTerm) + upfrontCost;

            // Display results
            String result;
            if (totalBuyingCost < totalRentingCost) {
                jLabel140.setText(String.format("Buying is more cost-effective over %d years.",loanTerm));
                result = "Buying is more cost-effective over " + loanTerm + " years.";
            } else {
                jLabel140.setText(String.format("Renting is more cost-effective over %d years.",loanTerm));
                result = "Renting is more cost-effective over " + loanTerm + " years.";
            }
            System.out.println(result);

        } catch (NumberFormatException e) {
            System.out.println("Please ensure all fields contain valid numbers.");
        } catch (Exception e) {
        }        // TODO add your handling code here:
    }//GEN-LAST:event_calcbvrActionPerformed

    private void clearbvrAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_clearbvrAncestorAdded
        // Clear all text fields
        homeprice.setText("");
        downpaymentbvr.setText("");
        intratebvr.setText("");
        termbvr.setText("");
        proptaxbvr.setText("");
        proptaxincrease.setText("");
        homeinsinc.setText("");
        monthlyrentfee.setText("");
        rentfeeincrease.setText("");
        rentinsurance.setText("");
        securitydeposit.setText("");
        federaltax.setText("");
        statetax.setText("");

        // Reset the combo box (example for tax filing status)
        // TODO add your handling code here:
    }//GEN-LAST:event_clearbvrAncestorAdded

    private void calcbuttoniraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcbuttoniraActionPerformed
        try {
            // Retrieve and parse inputs
            double currentBalance = Double.parseDouble(currBalanceira.getText());
            double annualContribution = Double.parseDouble(annContrira.getText());
            double expectedRateOfReturn = Double.parseDouble(exprateretuira.getText());
            int currentAge = Integer.parseInt(currage.getText());
            int retirementAge = Integer.parseInt(retage.getText());
            double marginalTaxRate = Double.parseDouble(margtaxira.getText());
            boolean maximize = yesbox.isSelected();
            if (maximize){
                double ira = IRACalc.calculate_MaximizeContributionYes(currentBalance, annualContribution,expectedRateOfReturn,currentAge, retirementAge);
                valueofcalcira.setText(String.format("$%,.2f",ira));
            }

            // Example calculation (e.g., future balance after one year)
            double futureBalance = currentBalance
            + annualContribution
            + (currentBalance * (expectedRateOfReturn / 100));

            // Adjust for taxes (example calculation)
            double afterTaxBalance = futureBalance * (1 - (retirementAge / 100));

            // Display the results
            System.out.println("Future Balance (after one year): " + futureBalance);
            System.out.println("After-Tax Balance: " + afterTaxBalance);

        } catch (NumberFormatException e) {
            // Handle invalid input
            System.out.println("Invalid input. Please ensure all fields are filled correctly.");
            javax.swing.JOptionPane.showMessageDialog(null, "Invalid input in one or more fields. Please enter valid numbers!", "Input Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_calcbuttoniraActionPerformed

    private void yesboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yesboxActionPerformed
        // TODO add your handling code here:
        if (yesbox.isSelected()){
            nobox.setEnabled(false);
        }
        else {
            nobox.setEnabled(true);
        }
    }//GEN-LAST:event_yesboxActionPerformed

    private void clearbuttoniraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearbuttoniraActionPerformed
        // Clear all input fields
        currBalanceira.setText(""); // Current Balance
        annContrira.setText(""); // Annual Contribution
        exprateretuira.setText(""); // Expected Rate of Return
        currage.setText(""); // Current Age
        retage.setText(""); // Retirement Tax
        margtaxira.setText(""); // Marginal Tax Rate

        // Optionally, display a confirmation in the console or UI
        System.out.println("All fields cleared.");        // TODO add your handling code here:
    }//GEN-LAST:event_clearbuttoniraActionPerformed

    private void noboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noboxActionPerformed
        // TODO add your handling code here:
        if (nobox.isSelected()){
            yesbox.setEnabled(false);
        }
        else {
            yesbox.setEnabled(true);
        }
    }//GEN-LAST:event_noboxActionPerformed

    private void currBalanceiraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_currBalanceiraActionPerformed
        try {
            // Get the input and parse it as a double
            double currentBalance = Double.parseDouble(currBalanceira.getText());
            System.out.println("Current balance: " + currentBalance);
        } catch (NumberFormatException e) {
            // Show an error message for invalid input
            System.out.println("Invalid input. Please enter a number.");
        }  // TODO add your handling code here:
    }//GEN-LAST:event_currBalanceiraActionPerformed

    private void annContriraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_annContriraActionPerformed
        try {
            // Get the input and parse it as a double
            double annualContribution = Double.parseDouble(annContrira.getText());
            System.out.println("Annual contribution: " + annualContribution);
        } catch (NumberFormatException e) {
            // Show an error message for invalid input
            System.out.println("Invalid input. Please enter a number.");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_annContriraActionPerformed

    private void exprateretuiraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exprateretuiraActionPerformed
        try {
            // Get the input and parse it as a double
            double expectedRateOfReturn = Double.parseDouble(exprateretuira.getText());
            System.out.println("Expected rate of return: " + expectedRateOfReturn);
        } catch (NumberFormatException e) {
            // Show an error message for invalid input
            System.out.println("Invalid input. Please enter a number.");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_exprateretuiraActionPerformed

    private void currageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_currageActionPerformed
        try {
            // Get the input and parse it as an integer
            int currentAge = Integer.parseInt(currage.getText());
            System.out.println("Current age: " + currentAge);
        } catch (NumberFormatException e) {
            // Show an error message for invalid input
            System.out.println("Invalid input. Please enter a valid age.");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_currageActionPerformed

    private void retageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retageActionPerformed
        try {
            // Get the input and parse it as a double
            double retirementTax = Double.parseDouble(retage.getText());
            System.out.println("Retirement tax: " + retirementTax);
        } catch (NumberFormatException e) {
            // Show an error message for invalid input
            System.out.println("Invalid input. Please enter a valid tax rate.");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_retageActionPerformed

    private void margtaxiraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_margtaxiraActionPerformed
        try {
            // Get the input and parse it as a double
            double marginalTaxRate = Double.parseDouble(margtaxira.getText());
            System.out.println("Marginal tax rate: " + marginalTaxRate);
        } catch (NumberFormatException e) {
            // Show an error message for invalid input
            System.out.println("Invalid input. Please enter a valid tax rate.");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_margtaxiraActionPerformed

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
        jTabbedPane1.addTab("BuyvLoan", jPanel2);
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
    
    public void openBuyVsLoan(){
        jTabbedPane1.addTab("Roth IRA",jPanel14);
        int tabCount = jTabbedPane1.getTabCount();
        jTabbedPane1.setSelectedIndex(tabCount-1);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ALMenuItem;
    private javax.swing.JLabel ALlabel;
    private javax.swing.JTextField Amount;
    private javax.swing.JTabbedPane AutoLoanTab;
    private javax.swing.JMenuItem BvLMenuItem;
    private javax.swing.JLabel BvLlabel;
    private javax.swing.JMenuItem CCMenuItem;
    private javax.swing.JLabel CClabel;
    private javax.swing.JButton Convert;
    private javax.swing.JLabel EnterAmtCC;
    private javax.swing.JComboBox<String> FromCurrency;
    private javax.swing.JMenuItem HAMenuItem;
    private javax.swing.JLabel HAlabel;
    private javax.swing.JMenuItem MLMenuItem;
    private javax.swing.JLabel MLlabel;
    private javax.swing.JMenuItem MPMenuItem;
    private javax.swing.JMenuItem MPayoffMenuItem;
    private javax.swing.JLabel MPayofflabel;
    private javax.swing.JLabel MPayofflabel1;
    private javax.swing.JLabel MPlabel;
    private javax.swing.JLabel MonthlyPaymentresult1;
    private javax.swing.JLabel MonthlyPaymentresult2;
    private javax.swing.JLabel MonthlyPaymentresult3;
    private javax.swing.JLabel MonthlyPaymentresult4;
    private javax.swing.JLabel MonthlyPaymentresult5;
    private javax.swing.JLabel MonthlyPaymentresult6;
    private javax.swing.JTextField Result;
    private javax.swing.JComboBox<String> ToCurrency;
    private javax.swing.JLabel TotalPriceresult1;
    private javax.swing.JLabel TotalPriceresult2;
    private javax.swing.JLabel TotalPriceresult3;
    private javax.swing.JLabel TotalPriceresult4;
    private javax.swing.JLabel TotalPriceresult5;
    private javax.swing.JLabel TotalPriceresult6;
    private javax.swing.JTextField annContrira;
    private javax.swing.JTextField avginvret;
    private javax.swing.JButton calcbuttonira;
    private javax.swing.JButton calcbvr;
    private javax.swing.JButton calculateMonthlyPay;
    private javax.swing.JButton calculateTotalPrice;
    private javax.swing.JButton clearbuttonira;
    private javax.swing.JLabel clearbvr;
    private javax.swing.JTextField closingcostbvr;
    private javax.swing.JTextField costincrease;
    private javax.swing.JTextField currBalanceira;
    private javax.swing.JTextField currage;
    private javax.swing.JTextField downpaymentbvr;
    private javax.swing.JTextField exprateretuira;
    private javax.swing.JTextField federaltax;
    private javax.swing.JTextField hoabvr;
    private javax.swing.JTextField homeinsinc;
    private javax.swing.JTextField homeprice;
    private javax.swing.JLabel homepurchase;
    private javax.swing.JLabel homerent;
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
    private javax.swing.JTextField intratebvr;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel135;
    private javax.swing.JLabel jLabel136;
    private javax.swing.JLabel jLabel137;
    private javax.swing.JLabel jLabel138;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel141;
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
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField42;
    private javax.swing.JTextField jTextField43;
    private javax.swing.JTextField jTextField44;
    private javax.swing.JTextField jTextField45;
    private javax.swing.JTextField jTextField46;
    private javax.swing.JTextField jTextField47;
    private javax.swing.JTextField jTextField48;
    private javax.swing.JTextField jTextField49;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField50;
    private javax.swing.JTextField jTextField51;
    private javax.swing.JTextField jTextField52;
    private javax.swing.JTextField jTextField53;
    private javax.swing.JTextField jTextField54;
    private javax.swing.JTextField jTextField55;
    private javax.swing.JTextField jTextField56;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextField maintenencecost;
    private javax.swing.JTextField margtaxira;
    private javax.swing.JTextField monthlyPay;
    private javax.swing.JTextField monthlyrentfee;
    private javax.swing.JCheckBox nobox;
    private javax.swing.JTextField proptaxbvr;
    private javax.swing.JTextField proptaxincrease;
    private javax.swing.JTextField rentfeeincrease;
    private javax.swing.JTextField rentinsurance;
    private javax.swing.JTextField retage;
    private javax.swing.JTextField securitydeposit;
    private javax.swing.JTextField statetax;
    private javax.swing.JComboBox<String> taxfilingstatus;
    private javax.swing.JTextField termbvr;
    private javax.swing.JTextField upfrontcost;
    private javax.swing.JTextField valueappreciation;
    private javax.swing.JLabel valueofcalcira;
    private javax.swing.JCheckBox yesbox;
    // End of variables declaration//GEN-END:variables

}