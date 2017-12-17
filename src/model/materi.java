/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Dunia Imajinasiku
 */
public class materi {

    public materi(String kode_materi, String nama_materi) {
        this.kode_materi = kode_materi;
        this.nama_materi = nama_materi;
    }

    /**
     * @return the kode_materi
     */
    public String getKode_materi() {
        return kode_materi;
    }

    /**
     * @param kode_materi the kode_materi to set
     */
    public void setKode_materi(String kode_materi) {
        this.kode_materi = kode_materi;
    }

    /**
     * @return the nama_materi
     */
    public String getNama_materi() {
        return nama_materi;
    }

    /**
     * @param nama_materi the nama_materi to set
     */
    public void setNama_materi(String nama_materi) {
        this.nama_materi = nama_materi;
    }
    private String kode_materi;
    private String nama_materi;
}
