
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author oem
 */
public class StokUygulamasi extends javax.swing.JFrame {

    /**
     * Creates new form StokUygulamasi
     */
    public StokUygulamasi() {
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
        tf_urun_ismi = new javax.swing.JTextField();
        cb_kategori = new javax.swing.JComboBox<>();
        tf_fiyat = new javax.swing.JTextField();
        mesaj_yazisi = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        urun_tablosu = new javax.swing.JTable();
        ekle_butonu = new javax.swing.JButton();
        mesaj_yazisiii = new javax.swing.JLabel();
        guncelle_butonu = new javax.swing.JButton();
        sil_butonu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(214748364, 214748364));

        jLabel1.setText("Ürün İsmi : ");

        jLabel2.setText("Kategori : ");

        jLabel3.setText("Fiyat :");

        cb_kategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kültür Sanat", "Yemek", "Elektronik" }));

        mesaj_yazisi.setForeground(new java.awt.Color(0, 255, 204));

        urun_tablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ürün İsmi", "Kategori", "Fiyat"
            }
        ));
        urun_tablosu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                urun_tablosuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(urun_tablosu);

        ekle_butonu.setText("Ürün Ekle");
        ekle_butonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ekle_butonuActionPerformed(evt);
            }
        });

        mesaj_yazisiii.setForeground(new java.awt.Color(0, 204, 204));

        guncelle_butonu.setText("Ürün Güncelle");
        guncelle_butonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guncelle_butonuActionPerformed(evt);
            }
        });

        sil_butonu.setText("Ürün Sil");
        sil_butonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sil_butonuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cb_kategori, 0, 164, Short.MAX_VALUE)
                                    .addComponent(tf_urun_ismi)
                                    .addComponent(tf_fiyat))
                                .addGap(74, 74, 74)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ekle_butonu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(guncelle_butonu, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                                    .addComponent(sil_butonu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(mesaj_yazisiii, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(203, 203, 203)
                                .addComponent(mesaj_yazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tf_urun_ismi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ekle_butonu))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cb_kategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(guncelle_butonu))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tf_fiyat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sil_butonu)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(mesaj_yazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mesaj_yazisiii, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ekle_butonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ekle_butonuActionPerformed
        mesaj_yazisiii.setText("");
        
        DefaultTableModel model = (DefaultTableModel) urun_tablosu.getModel();
        
        if(tf_urun_ismi.getText().trim().equals("")){
            //trim metodu alınan textin başındaki ve sonundaki boşlukları siler.
            
            mesaj_yazisiii.setText("Ürün İsmi boş bırakılamaz...");
        }
        else{
            Object[] eklenecek = {tf_urun_ismi.getText(),cb_kategori.getSelectedItem().toString(),tf_fiyat.getText()};
            model.addRow(eklenecek);
            
            
        }
    }//GEN-LAST:event_ekle_butonuActionPerformed

    private void guncelle_butonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guncelle_butonuActionPerformed
        mesaj_yazisiii.setText("");
       DefaultTableModel model = (DefaultTableModel) urun_tablosu.getModel();
       
       int secili_row = urun_tablosu.getSelectedRow();
       
       if(secili_row == -1){
           
           if(urun_tablosu.getRowCount() == 0){
               
               mesaj_yazisiii.setText("Ürün tablosu şu anda boş....");
               
           }
           else{
               mesaj_yazisiii.setText("Lütfen güncellenecek bir ürün seçin....");
               
           }
       }
       else{
           
           model.setValueAt(tf_urun_ismi.getText(),secili_row,0);
           model.setValueAt(cb_kategori.getSelectedItem().toString(),secili_row,1);
           model.setValueAt(tf_fiyat.getText(),secili_row,2);
           
           mesaj_yazisiii.setText("Ürün başarıyla güncellendi...");
       }
    }//GEN-LAST:event_guncelle_butonuActionPerformed

    private void urun_tablosuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_urun_tablosuMouseClicked
       DefaultTableModel model = (DefaultTableModel) urun_tablosu.getModel();
       
       int secili_row = urun_tablosu.getSelectedRow();
       
       tf_urun_ismi.setText(model.getValueAt(secili_row, 0).toString());
       cb_kategori.setSelectedItem(model.getValueAt(secili_row, 1).toString());
       tf_fiyat.setText(model.getValueAt(secili_row ,2).toString());
       
    }//GEN-LAST:event_urun_tablosuMouseClicked

    private void sil_butonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sil_butonuActionPerformed
        mesaj_yazisiii.setText("");
        
        DefaultTableModel model = (DefaultTableModel)urun_tablosu.getModel();
        
        int secili_row = urun_tablosu.getSelectedRow();
        
        if(secili_row == -1){
            
            if(urun_tablosu.getRowCount() == 0) {
                mesaj_yazisiii.setText("Ürün tablosu şu anda boş...");
            }
            else{
                mesaj_yazisiii.setText("Lütfen silinecek bir ürün seçiniz...");
                
            }
        }
        else{
            if(JOptionPane.YES_NO_CANCEL_OPTION == 0 ){
            JOptionPane.showMessageDialog(this, mesaj_yazisiii);
            model.removeRow(secili_row);
            
            mesaj_yazisiii.setText("Ürün başarıyla silindi...");
            
           
            }  
        }
        
    }//GEN-LAST:event_sil_butonuActionPerformed

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
            java.util.logging.Logger.getLogger(StokUygulamasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StokUygulamasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StokUygulamasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StokUygulamasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StokUygulamasi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cb_kategori;
    private javax.swing.JButton ekle_butonu;
    private javax.swing.JButton guncelle_butonu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel mesaj_yazisi;
    private javax.swing.JLabel mesaj_yazisiii;
    private javax.swing.JButton sil_butonu;
    private javax.swing.JTextField tf_fiyat;
    private javax.swing.JTextField tf_urun_ismi;
    private javax.swing.JTable urun_tablosu;
    // End of variables declaration//GEN-END:variables
}
