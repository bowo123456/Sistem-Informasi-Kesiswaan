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
public class Mnilai {
    String Kd_Nilai,NIS,Kd_Pelajaran,UlanganHarian,Tugas,UTS,UAS,Total,
            Semester,TahunAjaran, nama, kelas;

    public String getKd_Nilai() {
        return Kd_Nilai;
    }

    public String getNama() {
        return nama;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setKd_Nilai(String Kd_Nilai) {
        this.Kd_Nilai = Kd_Nilai;
    }

    public String getNIS() {
        return NIS;
    }

    public void setNIS(String NIS) {
        this.NIS = NIS;
    }

    public String getKd_Pelajaran() {
        return Kd_Pelajaran;
    }

    public void setKd_Pelajaran(String Kd_Pelajaran) {
        this.Kd_Pelajaran = Kd_Pelajaran;
    }

    public String getUlanganHarian() {
        return UlanganHarian;
    }

    public void setUlanganHarian(String UlanganHarian) {
        this.UlanganHarian = UlanganHarian;
    }

    public String getTugas() {
        return Tugas;
    }

    public void setTugas(String Tugas) {
        this.Tugas = Tugas;
    }

    public String getUTS() {
        return UTS;
    }

    public void setUTS(String UTS) {
        this.UTS = UTS;
    }

    public String getUAS() {
        return UAS;
    }

    public void setUAS(String UAS) {
        this.UAS = UAS;
    }

    public String getTotal() {
        return Total;
    }

    public void setTotal(String Total) {
        this.Total = Total;
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
