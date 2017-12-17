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
import view.pengolahanNilai;

/**
 *
 * @author Juan Antonio
 */
public class ControllerpengolahanNilai implements ActionListener{
    private pengolahanNilai pengolahannilai;
    public ControllerpengolahanNilai(){
        pengolahannilai= new pengolahanNilai();
        pengolahannilai.setVisible(true);
        pengolahannilai.addListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object a = e.getSource();
        DBConnect d = new DBConnect();
       if (a== pengolahannilai.getInputnilaipengolahannilai()){
           String nim, matakuliah,nilai;
                nim=pengolahannilai.getNimpengolahannilai();
                matakuliah=pengolahannilai.getMatakuliahpengolahannilai();
                nilai=pengolahannilai.getNilaipengolahannilai();
                try {
                    d.masukDatabaseNilai(nim, matakuliah,nilai);
                } catch (SQLException ex) {
                    Logger.getLogger(ControllerSignUp.class.getName()).log(Level.SEVERE, null, ex);
                }
       }
    }
}
