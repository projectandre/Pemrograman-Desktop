/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kamera.model;

/**
 *
 * @author ANDRE
 */
public class Kamera {

    
    private String nama;
    private String alamat;
    private String tanggalSewa;
    private String gender;
    private String Jenis;

    public Kamera(String nama, String alamat, String tanggalSewa, String gender, String Jenis) {
        this.nama = nama;
        this.alamat = alamat;
        this.tanggalSewa = tanggalSewa;
        this.gender = gender;
        this.Jenis = Jenis;
    }

   public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTanggalSewa() {
        return tanggalSewa;
    }

    public void setTanggalSewa(String tanggalSewa) {
        this.tanggalSewa = tanggalSewa;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getJenis() {
        return Jenis;
    }

    public void setJenis(String Jenis) {
        this.Jenis = Jenis;
    }
    
}

