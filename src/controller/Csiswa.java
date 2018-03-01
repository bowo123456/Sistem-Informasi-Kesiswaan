/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.InputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Msiswa;
import model.koneksiMysql;

/**
 *
 * @author Tri Wibowo
 */
public class Csiswa extends Msiswa {

    public DefaultTableModel TampilSiswa() {
        try {
            koneksiMysql konn = new koneksiMysql();
            PreparedStatement stm = konn.connect("select*from siswa");

            ResultSet rs = stm.executeQuery();

            DefaultTableModel isi = new DefaultTableModel();

            isi.addColumn("NO");
            isi.addColumn("NIS");
            isi.addColumn("NISN");
            isi.addColumn("Nama Lengkap");
            isi.addColumn("Tempat");
            isi.addColumn("Tanggal");
            isi.addColumn("Jenis Kelamin");
            isi.addColumn("Agama");
            isi.addColumn("Kewarganegaraan");
            isi.addColumn("Anak Ke");
            isi.addColumn("Saudara");
            isi.addColumn("Sekolah Asal");
            isi.addColumn("Nomor ijazah");
            isi.addColumn("Tahun Angkatan");
            isi.addColumn("No Hp");
            isi.addColumn("Alamat");
            isi.addColumn("Gambar");
            isi.addColumn("Nama Ayah");
            isi.addColumn("Tempat");
            isi.addColumn("Tanggal Lahir");
            isi.addColumn("Agama");
            isi.addColumn("Penidikan");
            isi.addColumn("Pekerjaan");
            isi.addColumn("Penghasilan");
            isi.addColumn("Nama Ibu");
            isi.addColumn("Tempat");
            isi.addColumn("Tangal Lahir");
            isi.addColumn("Agama");
            isi.addColumn("Pendidikan");
            isi.addColumn("Pekerjaan");
            isi.addColumn("Penghasilan");

            Object[] os;
            os = new Object[31];
            int no = 0;

            while (rs.next()) {
                no++;
                os[0] = String.valueOf(no).toString();
                os[1] = rs.getInt("NIS");
                os[2] = rs.getString("NISN");
                os[3] = rs.getString("Nama");
                os[4] = rs.getString("Tempat_Lahir");
                os[5] = rs.getString("Tanggal_Lahir");
                os[6] = rs.getString("Jenis_Kelamin");
                os[7] = rs.getString("Agama_siswa");
                os[8] = rs.getString("Kewarganegaraan");
                os[9] = rs.getString("Anak_Ke");
                os[10] = rs.getString("Saudara");
                os[11] = rs.getString("Asal_Sekolah");
                os[12] = rs.getString("Nomor_Ijazah");
                os[13] = rs.getString("Tahun_Angkatan");
                os[14] = rs.getString("HP");
                os[15] = rs.getString("Alamat");
                os[16] = rs.getString("image");
                os[17] = rs.getString("Nama_Ayah");
                os[18] = rs.getString("Tempat_Lahir_ayah");
                os[19] = rs.getString("Tanggal_Lahir_ayah");
                os[20] = rs.getString("Agama_ayah");
                os[21] = rs.getString("Pendidikan_ayah");
                os[22] = rs.getString("pekerjaan_ayah");
                os[23] = rs.getString("penghasilan_ayah");
                os[24] = rs.getString("Nama_ibu");
                os[25] = rs.getString("tempat_Lahir_ibu");
                os[26] = rs.getString("Tanggal_Lahir_ibu");
                os[27] = rs.getString("Agama_ibu");
                os[28] = rs.getString("Pendidikan_ibu");
                os[29] = rs.getString("pekerjaan_ibu");
                os[30] = rs.getString("penghasilan_ibu");

                isi.addRow(os);
            }
            return isi;
        } catch (SQLException ex) {
            Logger.getLogger(Csiswa.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }

    public void tambahsiswa() {
        try {
            koneksiMysql konn = new koneksiMysql();
            PreparedStatement stm = konn.connect("INSERT INTO siswa\n"
                    + "            (NIS,\n"
                    + "             NISN,\n"
                    + "             Nama,\n"
                    + "             Tempat_Lahir,\n"
                    + "             Tanggal_Lahir,\n"
                    + "             Jenis_Kelamin,\n"
                    + "             Agama_siswa,\n"
                    + "             kewarganegaraan,\n"
                    + "             Anak_Ke,\n"
                    + "             Saudara,\n"
                    + "             Asal_Sekolah,\n"
                    + "             Nomor_Ijazah,\n"
                    + "             Tahun_Angkatan,\n"
                    + "             HP,\n"
                    + "             Alamat,\n"
                    + "             image,\n"
                    + "             Nama_Ayah,\n"
                    + "             Tempat_Lahir_ayah,\n"
                    + "             Tanggal_Lahir_ayah,\n"
                    + "             Agama_ayah,\n"
                    + "             Pendidikan_ayah,\n"
                    + "             pekerjaan_ayah,\n"
                    + "             penghasilan_ayah,\n"
                    + "             Nama_ibu,\n"
                    + "             tempat_Lahir_ibu,\n"
                    + "             Tanggal_Lahir_ibu,\n"
                    + "             Agama_ibu,\n"
                    + "             Pendidikan_ibu,\n"
                    + "             pekerjaan_ibu,\n"
                    + "             penghasilan_ibu)\n"
                    + "VALUES (?,?,?,?,?,?,?,?,?,?,\n"
                    + "	?,?,?,?,?,?,?,?,?,?,\n"
                    + "	?,?,?,?,?,?,?,?,?,?);");
            stm.setInt(1, getNIS());
            stm.setString(2, getNISN());
            stm.setString(3, getNama_Lengkap());
            stm.setString(4, getTempat_Lahir());
            stm.setString(5, getTanggal());
            stm.setString(6, getJenis_Kelamin());
            stm.setString(7, getAgama_siswa());
            stm.setString(8, getKewarganegaraan());
            stm.setString(9, getAnakKe());
            stm.setString(10, getSaudara());
            stm.setString(11, getAsalSekolah());
            stm.setString(12, getNomor_IJazah());
            stm.setString(13, getTahun_Ankatan());
            stm.setString(14, getHp());
            stm.setString(15, getAlamat());
            stm.setString(16, getGambar());
            stm.setString(17, getNama_ayah());
            stm.setString(18, getTempat_Lahir_ayah());
            stm.setString(19, getTanggal_Ayah());
            stm.setString(20, getAgama_Ayah());
            stm.setString(21, getPendidikan_ayah());
            stm.setString(22, getPekrjaan_Ayah());
            stm.setString(23, getPenghasilan_ayah());
            stm.setString(24, getNama_Ibu());
            stm.setString(25, getTempat_Lahir_Ibu());
            stm.setString(26, getTanggal_Lahir());
            stm.setString(27, getAgama_Ibu());
            stm.setString(28, getPendidikan_Ibu());
            stm.setString(29, getPekerjaan_ibu());
            stm.setString(30, getPengahsilan_ibu());
            stm.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data berhasil diinput", "sukses", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/icon/success_icon-icons.com_52365.png"));
        } catch (SQLException ex) {
            Logger.getLogger(Csiswa.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void ubah() {
        try {
            koneksiMysql con = new koneksiMysql();

            PreparedStatement stm = con.connect("UPDATE siswa\n"
                    + "SET NIS = ?,\n"
                    + "NISN = ?,\n"
                    + "Nama = ?,\n"
                    + "Tempat_Lahir = ?,\n"
                    + "Tanggal_Lahir = ?,\n"
                    + "Jenis_Kelamin = ?,\n"
                    + "Agama_siswa = ?,\n"
                    + "kewarganegaraan = ?,\n"
                    + "Anak_Ke = ?,\n"
                    + "Saudara = ?,\n"
                    + "Asal_Sekolah = ?,\n"
                    + "Nomor_Ijazah = ?,\n"
                    + "Tahun_Angkatan = ?,\n"
                    + "Hp = ?,\n"
                    + "Alamat = ?,\n"
                    + "image = ?,\n"
                    + "Nama_Ayah = ?,\n"
                    + "Tempat_Lahir_ayah = ?,\n"
                    + "Tanggal_Lahir_ayah = ?,\n"
                    + "Agama_ayah = ?,\n"
                    + "Pendidikan_ayah = ?,\n"
                    + "pekerjaan_ayah = ?,\n"
                    + "penghasilan_ayah = ?,\n"
                    + "Nama_ibu = ?,\n"
                    + "tempat_Lahir_ibu = ?,\n"
                    + "Tanggal_Lahir_ibu = ?,\n"
                    + "Agama_ibu = ?,\n"
                    + "Pendidikan_ibu = ?,\n"
                    + "pekerjaan_ibu = ?,\n"
                    + "penghasilan_ibu = ?\n"
                    + "WHERE NIS = ?;");

            stm.setInt(1, getNIS());
            stm.setString(2, getNISN());
            stm.setString(3, getNama_Lengkap());
            stm.setString(4, getTempat_Lahir());
            stm.setString(5, getTanggal());
            stm.setString(6, getJenis_Kelamin());
            stm.setString(7, getAgama_siswa());
            stm.setString(8, getKewarganegaraan());
            stm.setString(9, getAnakKe());
            stm.setString(10, getSaudara());
            stm.setString(11, getAsalSekolah());
            stm.setString(12, getNomor_IJazah());
            stm.setString(13, getTahun_Ankatan());
            stm.setString(14, getHp());
            stm.setString(15, getAlamat());
            stm.setString(16, getGambar());
            stm.setString(17, getNama_ayah());
            stm.setString(18, getTempat_Lahir_ayah());
            stm.setString(19, getTanggal_Ayah());
            stm.setString(20, getAgama_Ayah());
            stm.setString(21, getPendidikan_ayah());
            stm.setString(22, getPekrjaan_Ayah());
            stm.setString(23, getPenghasilan_ayah());
            stm.setString(24, getNama_Ibu());
            stm.setString(25, getTempat_Lahir_Ibu());
            stm.setString(26, getTanggal_Lahir());
            stm.setString(27, getAgama_Ibu());
            stm.setString(28, getPendidikan_Ibu());
            stm.setString(29, getPekerjaan_ibu());
            stm.setString(30, getPengahsilan_ibu());
            stm.setInt(31, getNIS());
            stm.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Berhasil diubah", "Sukses", JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException ex) {
            Logger.getLogger(Csiswa.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void hapus() {
        try {
            koneksiMysql konn = new koneksiMysql();
            PreparedStatement stm = konn.connect("DELETE\n"
                    + "FROM siswa\n"
                    + "WHERE NIS = ?;");
            stm.setInt(1, getNIS());

            stm.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data verhasil di hapus", "sukses", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            Logger.getLogger(Csiswa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
  
    public DefaultTableModel carisiswa() {
        try {
            koneksiMysql con = new koneksiMysql();

            String sql
                    = "SELECT*FROM siswa\n"
                    + "WHERE Nama LIKE ?";
            PreparedStatement pst = con.connect(sql);
            pst.setString(1, "%" + getNama_Lengkap() + "%");

            ResultSet rs = pst.executeQuery();
            DefaultTableModel isi = new DefaultTableModel();
            isi.addColumn("NO");
            isi.addColumn("NIS");
            isi.addColumn("NISN");
            isi.addColumn("Nama Lengkap");
            isi.addColumn("Tempat");
            isi.addColumn("Tanggal");
            isi.addColumn("Jenis Kelamin");
            isi.addColumn("Agama");
            isi.addColumn("Kewarganegaraan");
            isi.addColumn("Anak Ke");
            isi.addColumn("Saudara");
            isi.addColumn("Sekolah Asal");
            isi.addColumn("Nomor ijazah");
            isi.addColumn("Tahun Angkatan");
            isi.addColumn("No Hp");
            isi.addColumn("Alamat");
            isi.addColumn("Gambar");
            isi.addColumn("Nama Ayah");
            isi.addColumn("Tempat");
            isi.addColumn("Tanggal Lahir");
            isi.addColumn("Agama");
            isi.addColumn("Penidikan");
            isi.addColumn("Pekerjaan");
            isi.addColumn("Penghasilan");
            isi.addColumn("Nama Ibu");
            isi.addColumn("Tempat");
            isi.addColumn("Tangal Lahir");
            isi.addColumn("Agama");
            isi.addColumn("Pendidikan");
            isi.addColumn("Pekerjaan");
            isi.addColumn("Penghasilan");

            Object[] os;
            os = new Object[31];
            int no = 0;

            while (rs.next()) {
                no++;
                os[0] = String.valueOf(no).toString();
                os[1] = rs.getInt("NIS");
                os[2] = rs.getString("NISN");
                os[3] = rs.getString("Nama");
                os[4] = rs.getString("Tempat_Lahir");
                os[5] = rs.getString("Tanggal_Lahir");
                os[6] = rs.getString("Jenis_Kelamin");
                os[7] = rs.getString("Agama_siswa");
                os[8] = rs.getString("Kewarganegaraan");
                os[9] = rs.getString("Anak_Ke");
                os[10] = rs.getString("Saudara");
                os[11] = rs.getString("Asal_Sekolah");
                os[12] = rs.getString("Nomor_Ijazah");
                os[13] = rs.getString("Tahun_Angkatan");
                os[14] = rs.getString("HP");
                os[15] = rs.getString("Alamat");
                os[16] = rs.getString("image");
                os[17] = rs.getString("Nama_Ayah");
                os[18] = rs.getString("Tempat_Lahir_ayah");
                os[19] = rs.getString("Tanggal_Lahir_ayah");
                os[20] = rs.getString("Agama_ayah");
                os[21] = rs.getString("Pendidikan_ayah");
                os[22] = rs.getString("pekerjaan_ayah");
                os[23] = rs.getString("penghasilan_ayah");
                os[24] = rs.getString("Nama_ibu");
                os[25] = rs.getString("tempat_Lahir_ibu");
                os[26] = rs.getString("Tanggal_Lahir_ibu");
                os[27] = rs.getString("Agama_ibu");
                os[28] = rs.getString("Pendidikan_ibu");
                os[29] = rs.getString("pekerjaan_ibu");
                os[30] = rs.getString("penghasilan_ibu");

                isi.addRow(os);
            }
            return isi;

        } catch (SQLException ex) {
            //Logger.getLogger(CMataPelajaran.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
  /*
    public void Cetak_Siswa() {
        try {
            koneksiMysql conn = new koneksiMysql();
            InputStream repot1 = getClass().getResourceAsStream("/Report/Biodata_Siswa.jrxml");

            HashMap parameter = new HashMap();
            parameter.put("NIS", getNIS());

            parameter.put("LokasiImage", "src/Report/");
            JasperReport jr = JasperCompileManager.compileReport(repot1);

            JasperPrint jp = JasperFillManager.fillReport(jr, parameter, conn.getConnection());

            JasperViewer viewer = new JasperViewer(jp, false);
            viewer.setFitPageZoomRatio();
            viewer.setExtendedState(viewer.getExtendedState() | 0x6);
            viewer.setVisible(true);
        } catch (Exception z) {
            Logger.getLogger(Csiswa.class.getName()).log(Level.SEVERE, null, z);
        }
    }

    public String getCariNis_UntukCetakData() {
        try {
            koneksiMysql con = new koneksiMysql();
            PreparedStatement pst = con.connect("Select Nama from Siswa"
                    + " where NIS=?");
            pst.setInt(1, getNIS());
            ResultSet rs = pst.executeQuery();
            Object[] os;
            if (rs.next()) {

                CariNis_UntukCetakData = (rs.getString("Nama"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Csiswa.class.getName()).log(Level.SEVERE, null, ex);
        }
        return CariNis_UntukCetakData;
    }
    String CariNis_UntukCetakData;

    public DefaultTableModel tampilTahunPelajaran() {
        try {
            koneksiMysql konn = new koneksiMysql();
            PreparedStatement stm = konn.connect("SELECT\n"
                    + "  id,\n"
                    + "  setTahunAjaran\n"
                    + "FROM settahunajaran");

            ResultSet rs = stm.executeQuery();
            DefaultTableModel isi = new DefaultTableModel();

            isi.addColumn("Id Tahun");
            isi.addColumn("Tahun Pelajaran");

            Object[] os;
            os = new Object[2];
            while (rs.next()) {
                os[0] = rs.getString("id");
                os[1] = rs.getString("settahunajaran");
                isi.addRow(os);
            }
            return isi;
        } catch (SQLException ex) {
            Logger.getLogger(Csiswa.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }

    public void tambahTahun() {
        try {
            koneksiMysql konn = new koneksiMysql();
            PreparedStatement stm = konn.connect("INSERT INTO settahunajaran\n"
                    + "            (id,\n"
                    + "             setTahunAjaran)\n"
                    + "VALUES (?,?);");
            stm.setString(1, getId());
            stm.setString(2, getTahun_Ankatan());
            stm.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data berhasil diinput", "sukses", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/icon/success_icon-icons.com_52365.png"));
        } catch (SQLException ex) {
            Logger.getLogger(Csiswa.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void hapustahun() {
        try {
            koneksiMysql konn = new koneksiMysql();
            PreparedStatement stm = konn.connect("DELETE\n"
                    + "FROM settahunajaran\n"
                    + "WHERE id = ?;");
            stm.setString(1, getId());

            stm.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data verhasil dihapus", "sukses", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            Logger.getLogger(Csiswa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void ubah_Tahun() {
        try {
            koneksiMysql con = new koneksiMysql();

            PreparedStatement stm = con.connect("UPDATE settahunajaran\n"
                    + "SET setTahunAjaran = ?\n"
                    + "WHERE id = ?");

            stm.setString(1, getTahun_Ankatan());
            stm.setString(2, getId());

            stm.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Berhasil diubah", "Sukses", JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException ex) {
            Logger.getLogger(Csiswa.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public DefaultComboBoxModel getTahun() {
        try {
            koneksiMysql konn = new koneksiMysql();
            PreparedStatement stm = konn.connect("SELECT\n"
                    + "  setTahunAjaran\n"
                    + "FROM settahunajaran");
            ResultSet rs = stm.executeQuery();

            DefaultComboBoxModel cbm = new DefaultComboBoxModel();

            Object os;
            os = new Object[2];
            while (rs.next()) {
                os = rs.getString("setTahunAjaran");
                cbm.addElement(os);

            }
            return cbm;
        } catch (SQLException ex) {
            Logger.getLogger(Csiswa.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public DefaultTableModel carisiswa_pertahun() {
        try {
            koneksiMysql con = new koneksiMysql();

            String sql
                    = "SELECT*FROM siswa\n"
                    + "WHERE Tahun_Angkatan LIKE ?";
            PreparedStatement pst = con.connect(sql);
            pst.setString(1, "%" + getTahun_Ankatan() + "%");

            ResultSet rs = pst.executeQuery();
            DefaultTableModel isi = new DefaultTableModel();
            isi.addColumn("NO");
            isi.addColumn("NIS");
            isi.addColumn("NISN");
            isi.addColumn("Nama Lengkap");
            isi.addColumn("Tempat");
            isi.addColumn("Tanggal");
            isi.addColumn("Jenis Kelamin");
            isi.addColumn("Agama");
            isi.addColumn("Kewarganegaraan");
            isi.addColumn("Anak Ke");
            isi.addColumn("Saudara");
            isi.addColumn("Sekolah Asal");
            isi.addColumn("Nomor ijazah");
            isi.addColumn("Tahun Angkatan");
            isi.addColumn("Hp");
            isi.addColumn("Alamat");
            isi.addColumn("Nama Ayah");
            isi.addColumn("Tempat");
            isi.addColumn("Tanggal Lahir");
            isi.addColumn("Agama");
            isi.addColumn("Penidikan");
            isi.addColumn("Pekerjaan");
            isi.addColumn("Penghasilan");
            isi.addColumn("Nama Ibu");
            isi.addColumn("Tempat");
            isi.addColumn("Tangal Lahir");
            isi.addColumn("Agama");
            isi.addColumn("Pendidikan");
            isi.addColumn("Pekerjaan");
            isi.addColumn("Penghasilan");

            Object[] os;
            os = new Object[30];
            int no = 0;

            while (rs.next()) {
                no++;
                os[0] = String.valueOf(no).toString();
                os[1] = rs.getInt("NIS");
                os[2] = rs.getString("NISN");
                os[3] = rs.getString("Nama");
                os[4] = rs.getString("Tempat_Lahir");
                os[5] = rs.getString("Tanggal_Lahir");
                os[6] = rs.getString("Jenis_Kelamin");
                os[7] = rs.getString("Agama_siswa");
                os[8] = rs.getString("Kewarganegaraan");
                os[9] = rs.getString("Anak_Ke");
                os[10] = rs.getString("Saudara");
                os[11] = rs.getString("Asal_Sekolah");
                os[12] = rs.getString("Nomor_Ijazah");
                os[13] = rs.getString("Tahun_Angkatan");
                os[14] = rs.getString("Hp");
                os[15] = rs.getString("Alamat");
                os[16] = rs.getString("Nama_Ayah");
                os[17] = rs.getString("Tempat_Lahir_ayah");
                os[18] = rs.getString("Tanggal_Lahir_ayah");
                os[19] = rs.getString("Agama_ayah");
                os[20] = rs.getString("Pendidikan_ayah");
                os[21] = rs.getString("pekerjaan_ayah");
                os[22] = rs.getString("penghasilan_ayah");
                os[23] = rs.getString("Nama_ibu");
                os[24] = rs.getString("tempat_Lahir_ibu");
                os[25] = rs.getString("Tanggal_Lahir_ibu");
                os[26] = rs.getString("Agama_ibu");
                os[27] = rs.getString("Pendidikan_ibu");
                os[28] = rs.getString("pekerjaan_ibu");
                os[29] = rs.getString("penghasilan_ibu");
                isi.addRow(os);
            }
            return isi;

        } catch (SQLException ex) {
            Logger.getLogger(CMataPelajaran.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

     */
}
