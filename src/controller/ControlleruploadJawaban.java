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
import view.uploadJawaban;

/**
 *
 * @author Juan Antonio
 */
public class ControlleruploadJawaban implements ActionListener {
    private uploadJawaban uploadjawaban;
    public ControlleruploadJawaban(){
        uploadjawaban= new uploadJawaban();
        uploadjawaban.setVisible(true);
        uploadjawaban.addListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object a = e.getSource();
        DBConnect d = new DBConnect();
       if (a== uploadjawaban.getUploaduploadjawaban()){
           String kode_tugas,nim, jawaban;
                kode_tugas=uploadjawaban.getKodetugasuploadjawaban();
                nim=uploadjawaban.getNimuploadjawaban();
                jawaban=uploadjawaban.getJawabanuploadjawaban();
                try {
                    d.masukDatabaseJawaban(kode_tugas,jawaban, nim);
                } catch (SQLException ex) {
                    Logger.getLogger(ControllerSignUp.class.getName()).log(Level.SEVERE, null, ex);
                }
       }
    }
}
