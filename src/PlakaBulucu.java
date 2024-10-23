public class PlakaBulucu extends javax.swing.JFrame {

    String[] alanKodlari = { "322", "416", "272", "472", "358", "312", "242", "466", 
        "256", "266", "228", "426", "434", "374", "248", "224", "286", "376", "364", 
        "258", "412", "284", "424", "446", "442", "222", "342", "454", "456", "438", 
        "326", "246", "324", "212", "232", "474", "366", "352", "288", "386", "262", 
        "332", "274", "422", "236", "344", "482", "252", "436", "384", "388", "452", 
        "464", "264", "362", "484", "368", "346", "282", "356", "462", "428", "414", 
        "276", "432", "354", "372", "382", "458", "338", "318", "488", "486", "378", 
        "478", "476", "226", "370", "348", "328", "380" 
    };
    
    public PlakaBulucu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cmbSehirler = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lblAlanKodu = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblSeciliSehir = new javax.swing.JLabel();
        lblPlakaKodu = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel1.setText("Plakasını ve alan kodunu öğrenmek istediğiniz şehri seçiniz.");

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel2.setText("Şehir Plaka & Alan Kodu Bulucu");

        cmbSehirler.setBackground(new java.awt.Color(204, 204, 204));
        cmbSehirler.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        cmbSehirler.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Şehir seçiniz...", "Adana", "Adıyaman", "Afyonkarahisar", "Ağrı", "Amasya", "Ankara", "Antalya", "Artvin", "Aydın", "Balıkesir", "Bilecik", "Bingöl", "Bitlis", "Bolu", "Burdur", "Bursa", "Çanakkale", "Çankırı", "Çorum", "Denizli", "Diyarbakır", "Edirne", "Elazığ", "Erzincan", "Erzurum", "Eskişehir", "Gaziantep", "Giresun", "Gümüşhane", "Hakkâri", "Hatay", "Isparta", "Mersin", "İstanbul", "İzmir", "Kars", "Kastamonu", "Kayseri", "Kırklareli", "Kırşehir", "Kocaeli", "Konya", "Kütahya", "Malatya", "Manisa", "Kahramanmaraş", "Mardin", "Muğla", "Muş", "Nevşehir", "Niğde", "Ordu", "Rize", "Sakarya", "Samsun", "Siirt", "Sinop", "Sivas", "Tekirdağ", "Tokat", "Trabzon", "Tunceli", "Şanlıurfa", "Uşak", "Van", "Yozgat", "Zonguldak", "Aksaray", "Bayburt", "Karaman", "Kırıkkale", "Batman", "Şırnak", "Bartın", "Ardahan", "Iğdır", "Yalova", "Karabük", "Kilis", "Osmaniye", "Düzce" }));
        cmbSehirler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSehirlerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbSehirler, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(138, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(cmbSehirler, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel3.setText("Seçilen Şehir:");

        lblAlanKodu.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lblAlanKodu.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel5.setText("Plaka Kodu:");

        lblSeciliSehir.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lblSeciliSehir.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        lblPlakaKodu.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lblPlakaKodu.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel8.setText("Alan Kodu:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(191, 191, 191)
                            .addComponent(jLabel5))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel3))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPlakaKodu)
                    .addComponent(lblSeciliSehir)
                    .addComponent(lblAlanKodu))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(lblSeciliSehir))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(lblPlakaKodu))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(lblAlanKodu))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmbSehirlerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSehirlerActionPerformed
        
        int seciliSehirIndex = cmbSehirler.getSelectedIndex();
        
        if (cmbSehirler.getSelectedIndex() < 10) {
            lblPlakaKodu.setText(String.valueOf("0" + seciliSehirIndex));
        } else {
            lblPlakaKodu.setText(String.valueOf(seciliSehirIndex));
        }
        
        lblSeciliSehir.setText(cmbSehirler.getSelectedItem().toString());
        
        if (seciliSehirIndex > 0) {
            lblAlanKodu.setText(alanKodlari[seciliSehirIndex - 1]);
        } else if (seciliSehirIndex == 0) {
            lblAlanKodu.setText("000");
        } 
        
    }//GEN-LAST:event_cmbSehirlerActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(PlakaBulucu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlakaBulucu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlakaBulucu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlakaBulucu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlakaBulucu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbSehirler;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblAlanKodu;
    private javax.swing.JLabel lblPlakaKodu;
    private javax.swing.JLabel lblSeciliSehir;
    // End of variables declaration//GEN-END:variables
}