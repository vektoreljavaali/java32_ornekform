/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import MODELS.tblEvrak;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author vektorel
 */
public class frmEvrakKayit extends javax.swing.JFrame {
    List<tblEvrak> evraklistesi = new ArrayList<tblEvrak>();
  
    /**
     * Creates new form frmEvrakKayit
     */
    public frmEvrakKayit() {
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
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txttarih = new javax.swing.JFormattedTextField();
        txtevrakkayitnumarasi = new javax.swing.JTextField();
        cmbgelisyeri = new javax.swing.JComboBox<>();
        txtevraktarihi = new javax.swing.JTextField();
        txtevraksayi = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtevrakkonusu = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtevrakekleri = new javax.swing.JTextArea();
        cmbhavalebirimi = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnYeniKayit = new javax.swing.JButton();
        btnKaydet = new javax.swing.JButton();
        btnDuzenle = new javax.swing.JButton();
        btnIptal = new javax.swing.JButton();
        btnCikis = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Gelen Evrak Kayıt Tarihi");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, -1, -1));

        jLabel2.setText("Gelen Evrak Kayıt Numarasi");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jLabel3.setText("Geliş Yeri");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jLabel4.setText("Evrak Tarih / Sayı");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jLabel5.setText("Evrak Konusu");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jLabel6.setText("Evrak Ekleri");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        jLabel7.setText("Havale Birimi");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        try {
            txttarih.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(txttarih, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 11, 214, -1));
        getContentPane().add(txtevrakkayitnumarasi, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 214, -1));

        cmbgelisyeri.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Banka", "Kamu Kurumu", "Özel Sektör", "Bireysel" }));
        getContentPane().add(cmbgelisyeri, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 214, -1));
        getContentPane().add(txtevraktarihi, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 100, -1));
        getContentPane().add(txtevraksayi, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 80, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("/");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, -1, -1));

        txtevrakkonusu.setColumns(10);
        txtevrakkonusu.setLineWrap(true);
        txtevrakkonusu.setRows(2);
        jScrollPane1.setViewportView(txtevrakkonusu);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 380, 57));

        txtevrakekleri.setColumns(20);
        txtevrakekleri.setRows(2);
        jScrollPane2.setViewportView(txtevrakekleri);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 380, 60));

        cmbhavalebirimi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "İnsan Kaynakları", "Mutemetlik", "Arge", "Yönetim", "İdari İşler" }));
        getContentPane().add(cmbhavalebirimi, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 212, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable1);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 550, 170));

        btnYeniKayit.setText("Yeni Kayıt");
        getContentPane().add(btnYeniKayit, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 100, 90));

        btnKaydet.setText("Kaydet");
        btnKaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKaydetActionPerformed(evt);
            }
        });
        getContentPane().add(btnKaydet, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 100, 90));

        btnDuzenle.setText("Düzenle");
        btnDuzenle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDuzenleActionPerformed(evt);
            }
        });
        getContentPane().add(btnDuzenle, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, 100, 90));

        btnIptal.setText("İptal");
        getContentPane().add(btnIptal, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, 100, 90));

        btnCikis.setText("ÇIKIŞ");
        getContentPane().add(btnCikis, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 310, 120, 90));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnKaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKaydetActionPerformed
        tblEvrak model = new tblEvrak();
        
        model.setEkler(txtevrakekleri.getText());
        model.setEvrakkayitnumarasi(txtevrakkayitnumarasi.getText());
        model.setEvrakkayittarihi(txttarih.getText());
        model.setGelisyeri(cmbgelisyeri.getSelectedItem().toString());
        model.setHavale(cmbhavalebirimi.getSelectedItem().toString());
        model.setKonu(txtevrakkonusu.getText());
        model.setSayi(txtevraksayi.getText());
        model.setTarih(txtevraktarihi.getText());
        
        evraklistesi.add(model);
        JOptionPane.showMessageDialog(null, "Evrak Başarı ile Kayıt Eddilmiştir.");
        
    }//GEN-LAST:event_btnKaydetActionPerformed

    private void btnDuzenleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDuzenleActionPerformed
       String mesaj="";
        for (tblEvrak evrak : evraklistesi) {
            mesaj += "Evrak Konusu....:"+evrak.getKonu()+"\n";
            mesaj += "Evrak Gelişyeri....:"+evrak.getGelisyeri()+"\n";
            mesaj +="Evrak Kayıt Tarihi....:"+evrak.getEvrakkayittarihi()+"\n";
            mesaj +="---------------------------------------------------"+"\n";
            
        }
        JOptionPane.showMessageDialog(null, mesaj);
    }//GEN-LAST:event_btnDuzenleActionPerformed

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
            java.util.logging.Logger.getLogger(frmEvrakKayit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmEvrakKayit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmEvrakKayit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmEvrakKayit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmEvrakKayit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCikis;
    private javax.swing.JButton btnDuzenle;
    private javax.swing.JButton btnIptal;
    private javax.swing.JButton btnKaydet;
    private javax.swing.JButton btnYeniKayit;
    private javax.swing.JComboBox<String> cmbgelisyeri;
    private javax.swing.JComboBox<String> cmbhavalebirimi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea txtevrakekleri;
    private javax.swing.JTextField txtevrakkayitnumarasi;
    private javax.swing.JTextArea txtevrakkonusu;
    private javax.swing.JTextField txtevraksayi;
    private javax.swing.JTextField txtevraktarihi;
    private javax.swing.JFormattedTextField txttarih;
    // End of variables declaration//GEN-END:variables
}
