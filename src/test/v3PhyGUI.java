/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Amar
 */
public class v3PhyGUI extends javax.swing.JFrame {
    private keeptoo.KGradientPanel cardPnl1;
    private keeptoo.KGradientPanel cardPnl2;
    private keeptoo.KGradientPanel cardPnl3;
    private keeptoo.KButton editprofileBtn;
    private keeptoo.KButton exitBtn;
    private keeptoo.KButton homeBtn;
    private javax.swing.JPanel homePnlBtn;
    private javax.swing.JPanel homePnlBtn1;
    private javax.swing.JPanel homePnlBtn2;
    private javax.swing.JLabel jLabel1,nameLbl2,ageLb12,appLbl2,helatLbl2;
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
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private keeptoo.KButton kButton10;
    private keeptoo.KButton kButton6;
    private keeptoo.KButton kButton7;
    private keeptoo.KButton kButton9;
    private keeptoo.KButton logoutBtn;
    private keeptoo.KGradientPanel mainPnl;
    private keeptoo.KGradientPanel p1;
    private keeptoo.KGradientPanel porfilePnl;
    private javax.swing.JLabel welcomeLbl;
    // End of variables declaration          
int i=1;
int j=0;

    public v3PhyGUI() {
        setUndecorated(true);
        getRootPane().setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
      
        initComponents();
         
             JLabel nameLbl = new JLabel("Patient name");
             nameLbl.setBounds(50, 50, 100, 20);
             p1.add(nameLbl);
              JLabel ageLb1 = new JLabel("Age");
             ageLb1.setBounds(50, 100, 100, 20);
             p1.add(ageLb1);
             JLabel appLbl = new JLabel("Appointment date");
             appLbl.setBounds(50, 150, 100, 20);
             p1.add(appLbl);
              JLabel helatLbl = new JLabel("Health problem");
             helatLbl.setBounds(50, 200, 100, 20);
             p1.add(helatLbl);
             
             JLabel nameLbl2 = new JLabel("Müller");
             nameLbl2.setBounds(250, 50, 100, 20);
             p1.add(nameLbl2);
              JLabel ageLb12 = new JLabel("12");
             ageLb12.setBounds(250, 100, 100, 20);
             p1.add(ageLb12);
             JLabel appLbl2 = new JLabel("27.02.2021");
             appLbl2.setBounds(250, 150, 100, 20);
             p1.add(appLbl2);
              JLabel helatLbl2 = new JLabel("karies");
             helatLbl2.setBounds(250, 200, 100, 20);
             p1.add(helatLbl2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        mainPnl = new keeptoo.KGradientPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        homeBtn = new keeptoo.KButton();
        editprofileBtn = new keeptoo.KButton();
        logoutBtn = new keeptoo.KButton();
        exitBtn = new keeptoo.KButton();
        jLabel7 = new javax.swing.JLabel();
        welcomeLbl = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        p1 = new keeptoo.KGradientPanel();
        kButton7 = new keeptoo.KButton();
        kButton6 = new keeptoo.KButton();
        kButton9 = new keeptoo.KButton();
        kButton10 = new keeptoo.KButton();
        porfilePnl = new keeptoo.KGradientPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        mainPnl.setkEndColor(new java.awt.Color(255, 255, 255));
        mainPnl.setkStartColor(new java.awt.Color(153, 204, 255));
        mainPnl.setLayout(new java.awt.BorderLayout());

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/test/physicians-banner.jpg"))); // NOI18N
        jLabel8.setText("jLabel8");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 743, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        mainPnl.add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));

        homeBtn.setBorder(null);
        homeBtn.setText("Home");
        homeBtn.setkEndColor(new java.awt.Color(255, 255, 255));
        homeBtn.setkHoverEndColor(new java.awt.Color(255, 255, 255));
        homeBtn.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        homeBtn.setkHoverStartColor(new java.awt.Color(102, 204, 255));
        homeBtn.setkPressedColor(new java.awt.Color(102, 204, 255));
        homeBtn.setkSelectedColor(new java.awt.Color(255, 255, 255));
        homeBtn.setkStartColor(new java.awt.Color(153, 204, 255));
        homeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBtnActionPerformed(evt);
            }
        });

        editprofileBtn.setBorder(null);
        editprofileBtn.setText("Edit profile");
        editprofileBtn.setkEndColor(new java.awt.Color(255, 255, 255));
        editprofileBtn.setkHoverEndColor(new java.awt.Color(255, 255, 255));
        editprofileBtn.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        editprofileBtn.setkHoverStartColor(new java.awt.Color(102, 204, 255));
        editprofileBtn.setkPressedColor(new java.awt.Color(102, 204, 255));
        editprofileBtn.setkSelectedColor(new java.awt.Color(255, 255, 255));
        editprofileBtn.setkStartColor(new java.awt.Color(153, 204, 255));
        editprofileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editprofileBtnActionPerformed(evt);
            }
        });

        logoutBtn.setBorder(null);
        logoutBtn.setText("Logout");
        logoutBtn.setkEndColor(new java.awt.Color(255, 255, 255));
        logoutBtn.setkHoverEndColor(new java.awt.Color(255, 255, 255));
        logoutBtn.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        logoutBtn.setkHoverStartColor(new java.awt.Color(102, 204, 255));
        logoutBtn.setkPressedColor(new java.awt.Color(102, 204, 255));
        logoutBtn.setkSelectedColor(new java.awt.Color(255, 255, 255));
        logoutBtn.setkStartColor(new java.awt.Color(153, 204, 255));

        exitBtn.setBorder(null);
        exitBtn.setkEndColor(new java.awt.Color(255, 255, 255));
        exitBtn.setkHoverEndColor(new java.awt.Color(255, 255, 255));
        exitBtn.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        exitBtn.setkHoverStartColor(new java.awt.Color(102, 204, 255));
        exitBtn.setkPressedColor(new java.awt.Color(102, 204, 255));
        exitBtn.setkSelectedColor(new java.awt.Color(255, 255, 255));
        exitBtn.setkStartColor(new java.awt.Color(153, 204, 255));
        exitBtn.setLabel("Exit");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Baskerville Old Face", 2, 20)); // NOI18N
        jLabel7.setText("Welcome");

        welcomeLbl.setFont(new java.awt.Font("Baskerville Old Face", 2, 20)); // NOI18N
        welcomeLbl.setText("Name");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(homeBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
            .addComponent(editprofileBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(logoutBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(exitBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(welcomeLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(welcomeLbl)
                .addGap(32, 32, 32)
                .addComponent(homeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(editprofileBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(120, Short.MAX_VALUE))
        );

        mainPnl.add(jPanel2, java.awt.BorderLayout.LINE_START);

        jPanel3.setLayout(new java.awt.CardLayout());

        p1.setkEndColor(new java.awt.Color(255, 255, 255));
        p1.setkStartColor(new java.awt.Color(153, 204, 255));

        kButton7.setBorder(null);
        kButton7.setText("Next");
        kButton7.setkEndColor(new java.awt.Color(102, 204, 255));
        kButton7.setkForeGround(new java.awt.Color(102, 102, 102));
        kButton7.setkHoverEndColor(new java.awt.Color(255, 255, 255));
        kButton7.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton7.setkHoverStartColor(new java.awt.Color(102, 204, 255));
        kButton7.setkPressedColor(new java.awt.Color(102, 204, 255));
        kButton7.setkSelectedColor(new java.awt.Color(255, 255, 255));
        kButton7.setkStartColor(new java.awt.Color(255, 255, 255));
        kButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton7ActionPerformed(evt);
            }
        });

        kButton6.setBorder(null);
        kButton6.setText("Send alternative");
        kButton6.setkEndColor(new java.awt.Color(102, 204, 255));
        kButton6.setkForeGround(new java.awt.Color(102, 102, 102));
        kButton6.setkHoverEndColor(new java.awt.Color(255, 255, 255));
        kButton6.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton6.setkHoverStartColor(new java.awt.Color(102, 204, 255));
        kButton6.setkPressedColor(new java.awt.Color(102, 204, 255));
        kButton6.setkSelectedColor(new java.awt.Color(255, 255, 255));
        kButton6.setkStartColor(new java.awt.Color(255, 255, 255));
        kButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton6ActionPerformed(evt);
            }
        });

        kButton9.setBorder(null);
        kButton9.setkEndColor(new java.awt.Color(102, 204, 255));
        kButton9.setkForeGround(new java.awt.Color(102, 102, 102));
        kButton9.setkHoverEndColor(new java.awt.Color(255, 255, 255));
        kButton9.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton9.setkHoverStartColor(new java.awt.Color(102, 204, 255));
        kButton9.setkPressedColor(new java.awt.Color(102, 204, 255));
        kButton9.setkSelectedColor(new java.awt.Color(255, 255, 255));
        kButton9.setkStartColor(new java.awt.Color(255, 255, 255));
        kButton9.setLabel("Back");

        kButton10.setBorder(null);
        kButton10.setText("Confirm");
        kButton10.setkEndColor(new java.awt.Color(102, 204, 255));
        kButton10.setkForeGround(new java.awt.Color(102, 102, 102));
        kButton10.setkHoverEndColor(new java.awt.Color(255, 255, 255));
        kButton10.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton10.setkHoverStartColor(new java.awt.Color(102, 204, 255));
        kButton10.setkPressedColor(new java.awt.Color(102, 204, 255));
        kButton10.setkSelectedColor(new java.awt.Color(255, 255, 255));
        kButton10.setkStartColor(new java.awt.Color(255, 255, 255));
        kButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout p1Layout = new javax.swing.GroupLayout(p1);
        p1.setLayout(p1Layout);
        p1Layout.setHorizontalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p1Layout.createSequentialGroup()
                .addContainerGap(263, Short.MAX_VALUE)
                .addComponent(kButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );
        p1Layout.setVerticalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p1Layout.createSequentialGroup()
                .addContainerGap(321, Short.MAX_VALUE)
                .addComponent(kButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel3.add(p1, "card2");

        porfilePnl.setkEndColor(new java.awt.Color(255, 255, 255));
        porfilePnl.setkStartColor(new java.awt.Color(153, 204, 255));

        jLabel9.setText("Name");

        jLabel10.setText("jLabel10");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/test/edit.png"))); // NOI18N
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
          public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });

        jLabel6.setText("Family name");

        jLabel12.setText("User name");

        jLabel13.setText("Title");

        jLabel14.setText("Specification");

        jLabel15.setText("Address");

        jLabel16.setText("E-Mail");

        jLabel17.setText("Phone");

        jLabel18.setText("jLabel18");

        jTextField1.setText("jTextField1");
         jTextField1.setOpaque(false);
            jTextField1.setBorder(null);
             jTextField1.setEditable(false);

        jTextField2.setText("jTextField2");
         jTextField2.setOpaque(false);
            jTextField2.setBorder(null);
             jTextField2.setEditable(false);

        jTextField3.setText("jTextField3");
         jTextField3.setOpaque(false);
            jTextField3.setBorder(null);
             jTextField3.setEditable(false);

        jTextField4.setText("jTextField4");
         jTextField4.setOpaque(false);
            jTextField4.setBorder(null);
             jTextField4.setEditable(false);

        jTextField5.setText("jTextField5");
         jTextField5.setOpaque(false);
            jTextField5.setBorder(null);
             jTextField5.setEditable(false);

        jTextField6.setText("jTextField6");
         jTextField6.setOpaque(false);
            jTextField6.setBorder(null);
             jTextField6.setEditable(false);

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/test/edit.png"))); // NOI18N
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
            
        });

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/test/edit.png"))); // NOI18N
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
           
        });

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/test/edit.png"))); // NOI18N
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel22MouseClicked(evt);
            }
           
        });

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/test/edit.png"))); // NOI18N
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel23MouseClicked(evt);
            }
           
        });

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/test/edit.png"))); // NOI18N
        jLabel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel24MouseClicked(evt);
            }
          
        });

        javax.swing.GroupLayout porfilePnlLayout = new javax.swing.GroupLayout(porfilePnl);
        porfilePnl.setLayout(porfilePnlLayout);
        porfilePnlLayout.setHorizontalGroup(
            porfilePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(porfilePnlLayout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addGroup(porfilePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(porfilePnlLayout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel21))
                    .addGroup(porfilePnlLayout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel23))
                    .addGroup(porfilePnlLayout.createSequentialGroup()
                        .addGroup(porfilePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, porfilePnlLayout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, porfilePnlLayout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addGap(99, 99, 99)
                                .addGroup(porfilePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel14)
                            .addGroup(porfilePnlLayout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(porfilePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(porfilePnlLayout.createSequentialGroup()
                        .addGroup(porfilePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel9))
                        .addGap(70, 70, 70)
                        .addGroup(porfilePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 49, Short.MAX_VALUE)))
                .addContainerGap(167, Short.MAX_VALUE))
        );
        porfilePnlLayout.setVerticalGroup(
            porfilePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(porfilePnlLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(porfilePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(porfilePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel18))
                .addGap(18, 18, 18)
                .addGroup(porfilePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(porfilePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(porfilePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, porfilePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(porfilePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(porfilePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(porfilePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(porfilePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel15)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(porfilePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(porfilePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(138, Short.MAX_VALUE))
        );

        jPanel3.add(porfilePnl, "card4");

        mainPnl.add(jPanel3, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(mainPnl, javax.swing.GroupLayout.DEFAULT_SIZE, 743, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPnl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>                        

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {                                        
 if(evt.getSource()==homeBtn){
     
      porfilePnl.setVisible(false);
       p1.setVisible(true);
     
}
    }                                       

    private void editprofileBtnActionPerformed(java.awt.event.ActionEvent evt) {                                               
if(evt.getSource()==editprofileBtn){
     
      p1.setVisible(false);
      porfilePnl.setVisible(true);
     
}        // TODO add your handling code here:
    }                                              

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {                                        
      if(evt.getSource()==exitBtn){
      dispose();
     
}        // TODO add your handling 
    }                                       

    private void mouseEntered(java.awt.event.MouseEvent evt) {                              
        if(evt.getSource()==jLabel11){
        jLabel11.setBackground(new Color(153,204,255));
        }
    }                             

    private void mouseExited(java.awt.event.MouseEvent evt) {                             
        if(evt.getSource()==jLabel11){
        jLabel11.setBackground(new Color(0,0,255));
        }
    }                            

    private void kButton7ActionPerformed(java.awt.event.ActionEvent evt) {                                         
   i++;
      nameLbl2.setText(new testDatabase().getUsername(i));


        ageLb12.setText(new testDatabase().getAge(i));

        appLbl2.setText(new testDatabase().gethealthproblem(i));

        helatLbl2.setText(new testDatabase().getsuggestedappointmentdate(i));
      
    }                                        

    private void kButton9ActionPerformed(java.awt.event.ActionEvent evt) {   
        j=i-1;
    nameLbl2.setText(new testDatabase().getUsername(j));


        ageLb12.setText(new testDatabase().getAge(j));

        appLbl2.setText(new testDatabase().gethealthproblem(j));

        helatLbl2.setText(new testDatabase().getsuggestedappointmentdate(j));
    }    
      private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {                                      
        jTextField6.setEditable(true);
    }                              

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {                                      
        jTextField2.setEditable(true);
    }                                     

   
    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {                                      
        jTextField4.setEditable(true);
    }                                     

                  

    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {                                      
         jTextField3.setEditable(true);
    }                                     

                            

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {                                      
        jTextField5.setEditable(true);
    }                                     

                                

    private void jLabel24MouseClicked(java.awt.event.MouseEvent evt) {                                      
            jTextField1.setEditable(true);
    }                                     

    
    
    private void kButton6ActionPerformed(java.awt.event.ActionEvent evt) {                                         
    
        sendEmailfrm f=new sendEmailfrm();
        f.setLocationRelativeTo(null);
       
        f.setVisible(true);
    
        
         ///////pocetakk
    }                                        

    private void kButton10ActionPerformed(java.awt.event.ActionEvent evt) {                                          
String username = "amaramkooooo@gmail.com";
		String password = "Mnb12345!";

		MailSender sender = new MailSender();
		sender.login("smtp.gmail.com", "587", username, password);

		try {

			sender.send("amaramkooooo@gmail.com", " Amar Planincic","amaramko@live.com", "Test Test Test Betreff",
					"Your appointment is confirmed and we are looking forward to see you on :"+new testDatabase().getsuggestedappointmentdate(1));

		} catch (Exception e) {
			e.printStackTrace();
		}
                JOptionPane.showMessageDialog(new sendEmailfrm(),"Your E-Mail has been sent successfully !");  
    }                                         

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify                     
             
}