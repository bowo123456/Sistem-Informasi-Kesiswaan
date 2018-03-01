/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.Csiswa;
import java.awt.Component;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;

/**
 *
 * @author Client
 */
public class DataSiswa extends javax.swing.JInternalFrame {
 JFileChooser jfc;
 File file;
    /**
     * Creates new form DataSiswa
     */
    public DataSiswa() {
        initComponents();
        tampil();
        setTitle(".:: DATA SISWA SMPN 28 BEKASI ::.");
           setEditButton(false);
    }
   public void tampil(){
         Csiswa cs = new Csiswa();
        tblsiswa.setModel(cs.TampilSiswa());
        setLebarKolomTabelAuto();
    }

     public void setColumnWidth(int kolom) {
        DefaultTableColumnModel modelKolom = (DefaultTableColumnModel) tblsiswa.getColumnModel();
        TableColumn kolomTabel = modelKolom.getColumn(kolom);
        int lebar = 0;
        int margin = 10;
        int a;

        TableCellRenderer renderer = kolomTabel.getHeaderRenderer();
        if (renderer == null) {
            renderer = tblsiswa.getTableHeader().getDefaultRenderer();
        }
        Component komponen = renderer.getTableCellRendererComponent(tblsiswa, kolomTabel.getHeaderValue(), false, false, 0, 0);
        lebar = komponen.getPreferredSize().width;
        for (a = 0; a < tblsiswa.getRowCount(); a++) {
            renderer = tblsiswa.getCellRenderer(a, kolom);
            komponen = renderer.getTableCellRendererComponent(tblsiswa, tblsiswa.getValueAt(a, kolom), false, false, a, kolom);
            int lebarKolom = komponen.getPreferredSize().width;
            lebar = Math.max(lebar, lebarKolom);
        }
        lebar = lebar + margin;
        kolomTabel.setPreferredWidth(lebar);
    }
  public void setLebarKolomTabelAuto() {
        int a;
        for (a = 0; a < tblsiswa.getColumnCount(); a++) {
            setColumnWidth(a);
        }
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tema1 = new Background.tema();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblsiswa = new javax.swing.JTable();
        btnSimpan = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        btncetak = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtcari = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/icon siswa.jpg"))); // NOI18N

        tblsiswa.setModel(new javax.swing.table.DefaultTableModel(
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
        tblsiswa.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tblsiswa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblsiswaMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblsiswa);

        btnSimpan.setText("Tambah");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnUpdate.setText("Edit");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        jButton5.setText("Batal");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Keluar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        btncetak.setText("Cetak");

        jLabel2.setText("cari");

        txtcari.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtcariCaretUpdate(evt);
            }
        });

        javax.swing.GroupLayout tema1Layout = new javax.swing.GroupLayout(tema1);
        tema1.setLayout(tema1Layout);
        tema1Layout.setHorizontalGroup(
            tema1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tema1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tema1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tema1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(tema1Layout.createSequentialGroup()
                        .addComponent(btnSimpan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnHapus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton5)
                        .addGap(18, 18, 18)
                        .addComponent(btncetak)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 629, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(30, 30, 30)
                        .addComponent(txtcari, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
        );
        tema1Layout.setVerticalGroup(
            tema1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tema1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 543, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tema1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tema1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(tema1Layout.createSequentialGroup()
                            .addGroup(tema1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(txtcari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(25, 25, 25))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tema1Layout.createSequentialGroup()
                            .addGroup(tema1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnUpdate)
                                .addComponent(btnSimpan)
                                .addComponent(btnHapus))
                            .addContainerGap()))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tema1Layout.createSequentialGroup()
                        .addGroup(tema1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton5)
                            .addComponent(btncetak)
                            .addComponent(jButton6))
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tema1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tema1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        inputSiswa is = new inputSiswa(null, true);
        is.setVisible(true);
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        Csiswa cs = new Csiswa();
        try {
           
            inputSiswa is = new inputSiswa(null, true);
             int baris = tblsiswa.getSelectedRow();
            is.txtNIS.setText(tblsiswa.getModel().getValueAt(baris, 1).toString());
            is.txtNISN.setText(tblsiswa.getModel().getValueAt(baris, 2).toString());
            is.txtNama.setText(tblsiswa.getModel().getValueAt(baris, 3).toString());
            is.txtTempat.setText(tblsiswa.getModel().getValueAt(baris, 4).toString());
                     String dateValue = String.valueOf(tblsiswa.getModel().getValueAt(tblsiswa.getSelectedRow(), 5));
      java.util.Date date = null;
        try {
           // date = new SimpleDateFormat("dd MMMMM yyyy").parse(dateValue);
              date = new SimpleDateFormat("dd MMMMM yyyy", new Locale("id")).parse(dateValue);
        } catch (ParseException ex) {
            System.out.println(ex);
        }
        is.tglsiwa.setDate(date);
        String kolom2 = tblsiswa.getModel().getValueAt(baris, 6).toString();
        try {
               if (kolom2.equals("Laki - laki")) {
                is.rbLaki.setSelected(true);
                is.rbCewe.setSelected(false);
               }if (kolom2.equals("Perempuan")) {
                is.rbCewe.setSelected(true);
                is.rbLaki.setSelected(false);
               }
           } catch (Exception e) {
        }
                       is.cbAgama.setSelectedItem(tblsiswa.getValueAt(baris, 7).toString());
           is.cbKWn.setSelectedItem(tblsiswa.getValueAt(baris, 8).toString());
            is.txt_anak_Ke.setText(tblsiswa.getValueAt(baris, 9).toString());
        is.txtSaudara.setText(tblsiswa.getValueAt(baris, 10).toString());
        is.txtAsal_Sekolah.setText(tblsiswa.getValueAt(baris, 11).toString());
        is.txtNomor_Ijazah.setText(tblsiswa.getValueAt(baris, 12).toString());
        is.cb_Tahun_Angkatan.setSelectedItem(tblsiswa.getValueAt(baris, 13).toString());
        is.txtHP.setText(tblsiswa.getValueAt(baris, 14).toString());
        is.txtAlamat.setText(tblsiswa.getValueAt(baris, 15).toString());
       // is.jLabelNamaFileBuku.setText(tblsiswa.getValueAt(baris, 16).toString());
              
            try {
                 Toolkit toolkit=Toolkit.getDefaultToolkit();
                            
                    String path=new File(".").getCanonicalPath();
                    Image image=toolkit.getImage(path+"/image/"+cs.getGambar());
    //                Image image=toolkit.getImage(getClass().getResource("/image/"+book.getImage()));
                    Image imagedResized=image.getScaledInstance(200, 250, Image.SCALE_DEFAULT);
                    ImageIcon icon=new ImageIcon(imagedResized);
                    is.jLabelGambar.setIcon(icon);
                                           is.jLabelNamaFileBuku.setText(jfc.getSelectedFile().getName());
                                        
                                                file=new File(jfc.getSelectedFile().getPath());
            } catch (Exception e) {
            }
     
     
 
         is.txtNAmaAyah1.setText(tblsiswa.getValueAt(baris, 17).toString());
                is.txttmpatAyah1.setText(tblsiswa.getValueAt(baris, 18).toString());
                
                String dateValue2 = String.valueOf(tblsiswa.getValueAt(tblsiswa.getSelectedRow(), 19));
      java.util.Date date2 = null;
        try {
            date2 = new SimpleDateFormat("dd MMMMM yyyy").parse(dateValue2);
      
        } catch (ParseException ex) {
            Logger.getLogger(DataSiswa.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        }
        
        is.tglAyah1.setDate(date2);
        is.cbAgamaAYah1.setSelectedItem(tblsiswa.getValueAt(baris, 20).toString());
         is.txtpekerjaanAyah1.setText(tblsiswa.getValueAt(baris, 21).toString());
        is.txtpekerjaanAyah1.setText(tblsiswa.getValueAt(baris, 22).toString());
        is.cbpenghasilanAyah1.setSelectedItem(tblsiswa.getValueAt(baris,23).toString());
        is.txtNamaIbu1.setText(tblsiswa.getValueAt(baris, 24).toString());
        is.txtTempatIbu1.setText(tblsiswa.getValueAt(baris, 25).toString());
               String dateValue3 = String.valueOf(tblsiswa.getValueAt(tblsiswa.getSelectedRow(), 26));
      java.util.Date date3 = null;
        try {
            date3 = new SimpleDateFormat("dd MMMMM yyyy").parse(dateValue3);
             is.tglIbu1.setDate(date3);
        } catch (ParseException ex) {
            Logger.getLogger(DataSiswa.class.getName()).log(Level.SEVERE, null, ex);
          JOptionPane.showMessageDialog(null, ex);
        }
          is.CbAgamaIbu1.setSelectedItem(tblsiswa.getValueAt(baris, 27).toString());
   is.      txtPekerjaanIbu1.setText(tblsiswa.getValueAt(baris, 28).toString());
       is. txtPekerjaanIbu1.setText(tblsiswa.getValueAt(baris, 29).toString());
      is.  cbPenghasilanIbu1.setSelectedItem(tblsiswa.getValueAt(baris,30).toString());
         
            is.setVisible(true);
        } catch (Exception e) {
        }
         setEditButton(false);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        Csiswa cs = new Csiswa();
        inputSiswa is = new inputSiswa(null, true);
         int konfirmasi = JOptionPane.showConfirmDialog(null, "Hapus " +is.txtNIS.getText()+" ? ","Konfirmasi",
                JOptionPane.YES_NO_OPTION);
        if(konfirmasi == JOptionPane.YES_OPTION){
            int baris = tblsiswa.getSelectedRow();
            
             is.txtNIS.setText(tblsiswa.getModel().getValueAt(baris,1).toString());
             cs.setNIS(Integer.parseInt(is.txtNIS.getText()));
             cs.hapus();
             tampil();
             
        }     
    }//GEN-LAST:event_btnHapusActionPerformed

    private void tblsiswaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblsiswaMousePressed
           setEditButton(true);
    }//GEN-LAST:event_tblsiswaMousePressed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
          //reset();
        setEditButton(false);
        tampil();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void txtcariCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtcariCaretUpdate
       Csiswa cs = new Csiswa();
        cs.setNama_Lengkap(txtcari.getText());
        cs.carisiswa();
        tblsiswa.setModel(cs.carisiswa());
      setLebarKolomTabelAuto();
    }//GEN-LAST:event_txtcariCaretUpdate
 private void setEditButton(boolean status) {
        if (status == false) {
            btnSimpan.setEnabled(true);
            btnHapus.setEnabled(false);
            btnUpdate.setEnabled(false);
            // txtKdPelajaran.setEditable(true);
            btncetak.setEnabled(false);

        } else {
            btnSimpan.setEnabled(false);
            btnHapus.setEnabled(true);
            btnUpdate.setEnabled(true);
            //txtKdPelajaran.setEditable(false);
            btncetak.setEnabled(true);
        }
    }
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
            java.util.logging.Logger.getLogger(DataSiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DataSiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DataSiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DataSiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DataSiswa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btncetak;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable tblsiswa;
    private Background.tema tema1;
    private javax.swing.JTextField txtcari;
    // End of variables declaration//GEN-END:variables
}