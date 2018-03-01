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
public class MPembagianKelas {
   String  NIS,Kd_Kelas,Semester,TahunAjaran;
   String Kelas,Nama;

    public String getKelas() {
        return Kelas;
    }

    public void setKelas(String Kelas) {
        this.Kelas = Kelas;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getNIS() {
        return NIS;
    }

    public void setNIS(String NIS) {
        this.NIS = NIS;
    }

    public String getKd_Kelas() {
        return Kd_Kelas;
    }

    public void setKd_Kelas(String Kd_Kelas) {
        this.Kd_Kelas = Kd_Kelas;
    }

    public String getSemester() {
        return Semester;
    }

    public void setSemester(String Semester) {
        this.Semester = Semester;
    }

    public String getTahunAjaran() {
        return TahunAjaran;
    }

    public void setTahunAjaran(String TahunAjaran) {
        this.TahunAjaran = TahunAjaran;
    }
}
