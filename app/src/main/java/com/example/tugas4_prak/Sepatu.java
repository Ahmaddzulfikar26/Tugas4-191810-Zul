package com.example.tugas4_prak;

public class Sepatu {
    private String nama,ukuran,codeproduksi;
    private int logo;

    public Sepatu(String nama, String ukuran, String codeproduksi, int logo) {
        this.nama = nama;
        this.ukuran = ukuran;
        this.codeproduksi = codeproduksi;
        this.logo = logo;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getUkuran() {
        return ukuran;
    }

    public void setUkuran(String ukuran) {
        this.ukuran = ukuran;
    }

    public String getCodeproduksi() {
        return codeproduksi;
    }

    public void setCodeproduksi(String codeproduksi) {
        this.codeproduksi = codeproduksi;
    }

    public int getLogo() {
        return logo;
    }

    public void setLogo(int logo) {
        this.logo = logo;
    }
}
