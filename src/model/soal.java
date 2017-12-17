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
public class soal {

    public soal(String kode_soal, String kode_materi, String file_soal) {
        this.kode_soal = kode_soal;
        this.kode_materi = kode_materi;
        this.file_soal = file_soal;
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
     * @return the file_soal
     */
    public String getFile_soal() {
        return file_soal;
    }

    /**
     * @param file_soal the file_soal to set
     */
    public void setFile_soal(String file_soal) {
        this.file_soal = file_soal;
    }
    private String kode_soal;
    private String kode_materi;
    private String file_soal;
    
}
