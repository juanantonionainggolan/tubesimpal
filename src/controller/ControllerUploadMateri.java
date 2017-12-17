/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import view.uploadMateri;

/**
 *
 * @author Dunia Imajinasiku
 */
public class ControllerUploadMateri implements ActionListener {
    private uploadMateri uploadmateri;
    public ControllerUploadMateri(){
        uploadmateri= new uploadMateri();
        uploadmateri.setVisible(true);
        uploadmateri.addListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object a = e.getSource();
        DBConnect d = new DBConnect();
       if (a== uploadmateri.getUploaduploadmateri()){
           String nama_materi, kode_materi;
                kode_materi=uploadmateri.getKodemateriuploadmateri();
                nama_materi=uploadmateri.getNamamateriiploadmateri();
                try {
                    d.masukDatabaseMateri(kode_materi, nama_materi);
                } catch (SQLException ex) {
                    Logger.getLogger(ControllerSignUp.class.getName()).log(Level.SEVERE, null, ex);
                }
       }
    }
}
