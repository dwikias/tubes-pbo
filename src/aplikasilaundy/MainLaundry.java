/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasilaundry;

import java.awt.HeadlessException;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MainLaundry extends javax.swing.JFrame {
 public String total ="";
 public String jenis ="";
 public static String nama,alamat,jen,har;
// HashMap param = new HashMap();
 Koneksi koneksi = new Koneksi();
 int klik;

  public void SetEnabledTrue(){
        txtNama.setEnabled(true);
        txtAlamat.setEnabled(true);
        txtNotlp.setEnabled(true);
        txtTotal.setEnabled(true);
        CbPakaian.setEnabled(true);
        CbSelimut.setEnabled(true);
        CbTas.setEnabled(true);
        
    }
    
    public void SetEnabledFalse(){
        txtNama.setEnabled(false);
        txtAlamat.setEnabled(false);
        txtNotlp.setEnabled(false);
        txtTotal.setEnabled(false);
        CbPakaian.setEnabled(false);
        CbSelimut.setEnabled(false);
        CbTas.setEnabled(false);
        pake.setEnabled(false);
        sel.setEnabled(false);
        tas.setEnabled(false);
    }
  
    public MainLaundry() {
        initComponents();
        loadTable();
        SetEnabledFalse();
        
        
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt){
                   jTable1MouseClicked(evt);
            }
           });
        this.setLocationRelativeTo(null);
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
        txtNama = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        CbPakaian = new javax.swing.JRadioButton();
        CbSelimut = new javax.swing.JRadioButton();
        pake = new javax.swing.JTextField();
        CbTas = new javax.swing.JRadioButton();
        sel = new javax.swing.JTextField();
        tas = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtAlamat = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtNotlp = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        BtnTambah = new javax.swing.JButton();
        BtnSimpan = new javax.swing.JButton();
        BtnKembali = new javax.swing.JButton();
        BtnHitung = new javax.swing.JButton();
        BtnHapus = new javax.swing.JButton();
        btnCari = new javax.swing.JButton();
        txtCari = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jBtnExit = new javax.swing.JButton();
        gambar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaActionPerformed(evt);
            }
        });
        getContentPane().add(txtNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 198, 30));

        jLabel1.setBackground(new java.awt.Color(153, 255, 255));
        jLabel1.setFont(new java.awt.Font("Komika Axis", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Smart Laundry");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, 190, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Nama ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 40, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Jenis");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 40, 30));

        CbPakaian.setText("Pakaian");
        CbPakaian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbPakaianActionPerformed(evt);
            }
        });
        getContentPane().add(CbPakaian, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, -1, -1));

        CbSelimut.setText("Selimut");
        CbSelimut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbSelimutActionPerformed(evt);
            }
        });
        getContentPane().add(CbSelimut, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        pake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pakeActionPerformed(evt);
            }
        });
        getContentPane().add(pake, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 40, -1));

        CbTas.setText("Tas");
        CbTas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbTasActionPerformed(evt);
            }
        });
        getContentPane().add(CbTas, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, -1, -1));

        sel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selActionPerformed(evt);
            }
        });
        getContentPane().add(sel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 40, -1));
        getContentPane().add(tas, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 40, -1));

        jLabel4.setText("Kg");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, -1, -1));

        jLabel5.setText("Kg");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 20, 20));

        jLabel6.setText("Kg");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 20, 20));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Alamat");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 50, 20));
        getContentPane().add(txtAlamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 200, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("No. HP");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 40, 20));
        getContentPane().add(txtNotlp, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 200, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Total Bayar");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 70, 20));

        txtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalActionPerformed(evt);
            }
        });
        getContentPane().add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 120, -1));

        BtnTambah.setText("Tambah");
        BtnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTambahActionPerformed(evt);
            }
        });
        getContentPane().add(BtnTambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, -1, -1));

        BtnSimpan.setText("Simpan");
        BtnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSimpanActionPerformed(evt);
            }
        });
        getContentPane().add(BtnSimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, -1, -1));

        BtnKembali.setText("Kembali");
        BtnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnKembaliActionPerformed(evt);
            }
        });
        getContentPane().add(BtnKembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, -1, -1));

        BtnHitung.setText("Hitung");
        BtnHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnHitungActionPerformed(evt);
            }
        });
        getContentPane().add(BtnHitung, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 70, -1));

        BtnHapus.setText("Hapus");
        BtnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnHapusActionPerformed(evt);
            }
        });
        getContentPane().add(BtnHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, 69, -1));

        btnCari.setText("Cari");
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });
        getContentPane().add(btnCari, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 130, -1, 30));

        txtCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCariActionPerformed(evt);
            }
        });
        getContentPane().add(txtCari, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 130, 160, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Masukan nama untuk pencarian");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 100, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Nama", "Alamat", "No HP", "Pakaian", "Selimut", "Tas", "Harga"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTable1MouseReleased(evt);
            }
        });
        jScrollPane3.setViewportView(jTable1);
        jTable1.getAccessibleContext().setAccessibleDescription("");
        jTable1.getAccessibleContext().setAccessibleParent(jTable1);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, 570, 170));

        jBtnExit.setText("Keluar");
        jBtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExitActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 360, 80, 30));

        gambar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/interior-laundry-banner-horizontal-flat-style-vector.jpg"))); // NOI18N
        getContentPane().add(gambar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

     public void loadTable() {
       //membuat tampilan model tabel 
       DefaultTableModel model = new DefaultTableModel();
       model.addColumn("Nama");
       model.addColumn("Alamat");
       model.addColumn("No HP");
       model.addColumn("Pakaian");
       model.addColumn("Selimut");
       model.addColumn("Tas");
       model.addColumn("Harga");
       
       //menampilkan data database kedalam tabel
       try {
           String sql = "select * from laundry";
           java.sql.Connection  conn =(Connection)Koneksi.configDB();
           java.sql.Statement   stm =conn.createStatement();
           java.sql.ResultSet res=stm.executeQuery(sql);
           while (res.next()){
               model.addRow(new Object[]{res.getString(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5),res.getString(6),res.getString(7)});
              }
           jTable1.setModel(model);
    } catch (SQLException ex) {
  }
}  
     
    private void txtNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaActionPerformed

    private void selActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selActionPerformed

    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalActionPerformed
 
  
    private void txtCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCariActionPerformed


    
    private void BtnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSimpanActionPerformed
         //simpan data
         try{
            String sql = "INSERT INTO laundry VALUES ('" +txtNama.getText()
                    +"','"+txtAlamat.getText()
                    +"','"+txtNotlp.getText()
                    +"','"+pake.getText()
                    +"','"+sel.getText()
                    +"','"+tas.getText()
                    +"','"+txtTotal.getText()+"')";
            java.sql.Connection conn = (Connection) Koneksi.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement (sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Proses simpan berhasil");
            loadTable();
                               
        }catch (HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_BtnSimpanActionPerformed

    private void BtnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnKembaliActionPerformed
        // Kembali
        SetEnabledFalse();
    }//GEN-LAST:event_BtnKembaliActionPerformed

    private void BtnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTambahActionPerformed
        // tambah
        SetEnabledTrue();
    }//GEN-LAST:event_BtnTambahActionPerformed

    private void pakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pakeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pakeActionPerformed

    private void CbPakaianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbPakaianActionPerformed
        //nilai awal di set 0 pada kotak
        if(CbPakaian.isSelected()){
            CbPakaian.setEnabled(true);
            pake.setEnabled(true);
        }else {
            pake.setEnabled(false);
            pake.setText("0");
        }
    }//GEN-LAST:event_CbPakaianActionPerformed

    private void CbSelimutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbSelimutActionPerformed
        //nilai awal di set 0 pada kotak
        if(CbSelimut.isSelected()){
            CbSelimut.setEnabled(true);
            sel.setEnabled(true);
        }else {
            sel.setEnabled(false);
            sel.setText("0");
        }
    }//GEN-LAST:event_CbSelimutActionPerformed

    private void CbTasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbTasActionPerformed
        //nilai awal di set 0 pada kotak
        if(CbTas.isSelected()){
            CbTas.setEnabled(true);
            tas.setEnabled(true);
        }else {
            tas.setEnabled(false);
            tas.setText("0");
        }
    }//GEN-LAST:event_CbTasActionPerformed

    private void BtnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnHapusActionPerformed
        // hapus
        try{
            int row=jTable1.getSelectedColumn();
            String value=(jTable1.getModel().getValueAt(row,0)).toString();
            String sql="DELETE FROM laundry WHERE nama="+'"'+value+ '"';
            java.sql.Connection conn =(Connection)Koneksi.configDB();
                java.sql.PreparedStatement pst=conn.prepareStatement(sql);
                pst.execute();
            JOptionPane.showMessageDialog(null, "Data berhasil dihapus");
            loadTable();
        }catch (SQLException e){
            JOptionPane.showConfirmDialog(this,"Gagal menemukan data"+e.getMessage());
        }
        
    }//GEN-LAST:event_BtnHapusActionPerformed

    private void BtnHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnHitungActionPerformed
        // perhitungan harga pembayaran
        
        int hrgpake=0,hrgsel=0,hrgtas=0;
        if(CbPakaian.isSelected()){
            total+=Integer.valueOf(pake.getText());
            hrgpake+=Integer.valueOf(pake.getText())*3000;
            
        }
        if(CbSelimut.isSelected()){
       
            hrgsel+=Integer.valueOf(sel.getText())*5000;
            
        }
        if(CbTas.isSelected()){
         
            hrgtas+=Integer.valueOf(tas.getText())*7000;
            
        }
        har=String.valueOf(hrgpake+hrgsel+hrgtas);
        txtTotal.setText(String.valueOf(har));
        
    }//GEN-LAST:event_BtnHitungActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        DefaultTableModel model =(DefaultTableModel)jTable1.getModel();
        int sr=jTable1.getSelectedRow();
        klik = sr;
        txtNama.setText(String.valueOf(model.getValueAt(sr, 0)));
        txtAlamat.setText(String.valueOf(model.getValueAt(sr, 1)));
        txtNotlp.setText(String.valueOf(model.getValueAt(sr, 2)));
        txtTotal.setText(String.valueOf(model.getValueAt(sr, 6)));
        if(Integer.valueOf((String) model.getValueAt(sr, 3)) !=0){
            CbPakaian.setSelected(true);
            pake.setText((String) model.getValueAt(sr, 3));
        }
         if(Integer.valueOf((String) model.getValueAt(sr, 4)) !=0){
            CbSelimut.setSelected(true);
            pake.setText((String) model.getValueAt(sr, 4));
        }
         if(Integer.valueOf((String) model.getValueAt(sr, 5)) !=0){
            CbTas.setSelected(true);
            pake.setText((String) model.getValueAt(sr, 5));
        }

        try {
            String sql = "select * from laundry where nama="+"'"+String.valueOf(model.getValueAt(sr, 0))+"'";
            java.sql.Connection conn=(Connection)Koneksi.configDB();
            java.sql.Statement stm=conn.createStatement();
            java.sql.ResultSet res=stm.executeQuery(sql);
            jTable1.setModel(model);      
        } catch (SQLException e){
        }
        nama = txtNama.getText();
        alamat = txtAlamat.getText();
        jen ="Normal";
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseReleased

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        // TODO add your handling code here:
   
       DefaultTableModel model = new DefaultTableModel();
       model.addColumn("Nama");
       model.addColumn("Alamat");
       model.addColumn("No HP");
       model.addColumn("Pakaian");
       model.addColumn("Selimut");
       model.addColumn("Tas");
       model.addColumn("Harga");       
       try{
                      String sql = "SELECT * FROM laundry where nama like '%"
                    + txtCari.getText()+"%'";
                java.sql.Connection  conn =(Connection)Koneksi.configDB();
           java.sql.Statement   stm =conn.createStatement();
           java.sql.ResultSet res=stm.executeQuery(sql);
           while (res.next()){
               model.addRow(new Object[]{res.getString(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5),res.getString(6),res.getString(7)});
              }
           jTable1.setModel(model);
    } catch (SQLException ex) {
  }
         
    }//GEN-LAST:event_btnCariActionPerformed

    private void jBtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExitActionPerformed
        // TODO add your handling code here:
          System.exit(0);
    }//GEN-LAST:event_jBtnExitActionPerformed

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
            java.util.logging.Logger.getLogger(MainLaundry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainLaundry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainLaundry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainLaundry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainLaundry().setVisible(true);
            }
        });
    }
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnHapus;
    private javax.swing.JButton BtnHitung;
    private javax.swing.JButton BtnKembali;
    private javax.swing.JButton BtnSimpan;
    private javax.swing.JButton BtnTambah;
    private javax.swing.JRadioButton CbPakaian;
    private javax.swing.JRadioButton CbSelimut;
    private javax.swing.JRadioButton CbTas;
    private javax.swing.JButton btnCari;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel gambar;
    private javax.swing.JButton jBtnExit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField pake;
    private javax.swing.JTextField sel;
    private javax.swing.JTextField tas;
    private javax.swing.JTextField txtAlamat;
    private javax.swing.JTextField txtCari;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNotlp;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables

     
}
