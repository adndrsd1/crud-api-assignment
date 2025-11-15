package com.example.crud_api_assignment;

public class FoodItem {
    String nama;
    String asal_daerah;
    String bahan_utama;
    String cara_membuat;
    String cita_rasa;
    String gambar;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAsal_daerah() {
        return asal_daerah;
    }

    public void setAsal_daerah(String asal_daerah) {
        this.asal_daerah = asal_daerah;
    }

    public String getBahan_utama() {
        return bahan_utama;
    }

    public void setBahan_utama(String bahan_utama) {
        this.bahan_utama = bahan_utama;
    }

    public String getCara_membuat() {
        return cara_membuat;
    }

    public void setCara_membuat(String cara_membuat) {
        this.cara_membuat = cara_membuat;
    }

    public String getCita_rasa() {
        return cita_rasa;
    }

    public void setCita_rasa(String cita_rasa) {
        this.cita_rasa = cita_rasa;
    }

    public String getGambar() {
        return gambar;
    }

    public void setGambar(String gambar) {
        this.gambar = gambar;
    }
}
