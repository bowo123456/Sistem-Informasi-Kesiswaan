/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Tri Wibowo
 */
public class Mabsensi_Guru {
private String kd_Absensi,NIP,Nama_Guru,Keterangan,Semester,Tahun_Ajaran,tgl;

    public Mabsensi_Guru() {
    }

    public String getTgl() {
        return tgl;
    }

    public void setTgl(String tgl) {
        this.tgl = tgl;
    }

    public String getKd_Absensi() {
        return kd_Absensi;
    }

    public void setKd_Absensi(String kd_Absensi) {
        this.kd_Absensi = kd_Absensi;
    }

    public String getNIP() {
        return NIP;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    public String getNama_Guru() {
        return Nama_Guru;
    }

    public void setNama_Guru(String Nama_Guru) {
        this.Nama_Guru = Nama_Guru;
    }

    public String getKeterangan() {
        return Keterangan;
    }

    public void setKeterangan(String Keterangan) {
        this.Keterangan = Keterangan;
    }

    public String getSemester() {
        return Semester;
    }

    public void setSemester(String Semester) {
        this.Semester = Semester;
    }

    public String getTahun_Ajaran() {
        return Tahun_Ajaran;
    }

    public void setTahun_Ajaran(String Tahun_Ajaran) {
        this.Tahun_Ajaran = Tahun_Ajaran;
    }
    
    
}
