/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author RX
 */
public class MJadwalPelajaran {

    String Kd_Pelajaran, NIP, Kd_Kelas, Hari, Jamke, 
            mulaijam, selesaijam, semester, tahunAjaran,Kd_Jadwal,Pelajaran;

    public String getKd_Jadwal() {
        return Kd_Jadwal;
    }

    public String getPelajaran() {
        return Pelajaran;
    }

    public void setPelajaran(String Pelajaran) {
        this.Pelajaran = Pelajaran;
    }

    public void setKd_Jadwal(String Kd_Jadwal) {
        this.Kd_Jadwal = Kd_Jadwal;
    }

    public String getKd_Pelajaran() {
        return Kd_Pelajaran;
    }

    public void setKd_Pelajaran(String Kd_Pelajaran) {
        this.Kd_Pelajaran = Kd_Pelajaran;
    }

    public String getNIP() {
        return NIP;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    public String getKd_Kelas() {
        return Kd_Kelas;
    }

    public void setKd_Kelas(String Kd_Kelas) {
        this.Kd_Kelas = Kd_Kelas;
    }

    public String getHari() {
        return Hari;
    }

    public void setHari(String Hari) {
        this.Hari = Hari;
    }

    public String getJamke() {
        return Jamke;
    }

    public void setJamke(String Jamke) {
        this.Jamke = Jamke;
    }

    public String getMulaijam() {
        return mulaijam;
    }

    public void setMulaijam(String mulaijam) {
        this.mulaijam = mulaijam;
    }

    public String getSelesaijam() {
        return selesaijam;
    }

    public void setSelesaijam(String selesaijam) {
        this.selesaijam = selesaijam;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getTahunAjaran() {
        return tahunAjaran;
    }

    public void setTahunAjaran(String tahunAjaran) {
        this.tahunAjaran = tahunAjaran;
    }
}
