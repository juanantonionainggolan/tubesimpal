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
public class nilai {

    public nilai(String nim, String mata_kuliah, int nilai) {
        this.nim = nim;
        this.mata_kuliah = mata_kuliah;
        this.nilai = nilai;
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

    /**
     * @return the mata_kuliah
     */
    public String getMata_kuliah() {
        return mata_kuliah;
    }

    /**
     * @param mata_kuliah the mata_kuliah to set
     */
    public void setMata_kuliah(String mata_kuliah) {
        this.mata_kuliah = mata_kuliah;
    }

    /**
     * @return the nilai
     */
    public int getNilai() {
        return nilai;
    }

    /**
     * @param nilai the nilai to set
     */
    public void setNilai(int nilai) {
        this.nilai = nilai;
    }
    private String nim;
    private String mata_kuliah;
    private int nilai;
}
