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
public class jawaban {

    public jawaban(String kode_soal, String jawaban, String nim) {
        this.kode_soal = kode_soal;
        this.jawaban = jawaban;
        this.nim = nim;
    }

    /**
     * @return the kode_soal
     */
    public String getKode_soal() {
        return kode_soal;
    }

    /**
     * @param kode_soal the kode_soal to set
     */
    public void setKode_soal(String kode_soal) {
        this.kode_soal = kode_soal;
    }

    /**
     * @return the jawaban
     */
    public String getJawaban() {
        return jawaban;
    }

    /**
     * @param jawaban the jawaban to set
     */
    public void setJawaban(String jawaban) {
        this.jawaban = jawaban;
    }

    /**
     * @return the nim
     */
    public String getNim() {
        return nim;
    }

    /**
     * @param nim the nim to set
     */
    public void setNim(String nim) {
        this.nim = nim;
    }
    private String kode_soal;
    private String jawaban;
    private String nim;
        
}
