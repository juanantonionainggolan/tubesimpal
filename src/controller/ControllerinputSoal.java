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
import view.inputSoal;

/**
 *
 * @author Juan Antonio
 */
public class ControllerinputSoal implements ActionListener {
    private inputSoal inputsoal;
    public ControllerinputSoal(){
        inputsoal= new inputSoal();
        inputsoal.setVisible(true);
        inputsoal.addListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object a = e.getSource();
        DBConnect d = new DBConnect();
       if (a== inputsoal.getInputinputsoal()){
           String kode_soal, kode_materi,file_soal;
                kode_soal=inputsoal.getKodesoalinputsoal();
                kode_materi=inputsoal.getKodemateriinputsoal();
                file_soal=inputsoal.getFilesoalinputsoal();
                try {
                    d.masukDatabaseSoal(kode_soal, kode_materi,file_soal);
                } catch (SQLException ex) {
                    Logger.getLogger(ControllerSignUp.class.getName()).log(Level.SEVERE, null, ex);
                }
       }
    }
}
