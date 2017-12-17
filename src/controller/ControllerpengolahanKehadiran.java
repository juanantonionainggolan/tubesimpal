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
import view.pengolahanKehadiran;

/**
 *
 * @author Juan Antonio
 */
public class ControllerpengolahanKehadiran implements ActionListener{
    private pengolahanKehadiran pengolahankehadiran;
    public ControllerpengolahanKehadiran(){
        pengolahankehadiran= new pengolahanKehadiran();
        pengolahankehadiran.setVisible(true);
        pengolahankehadiran.addListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object a = e.getSource();
        DBConnect d = new DBConnect();
       if (a== pengolahankehadiran.getInputkehadiranpengolahankehadiran()){
           String nim, matakuliah,kehadiran;
                nim=pengolahankehadiran.getNimpengolahankehadiran();
                matakuliah=pengolahankehadiran.getMatakuiahpengolahankehadiran();
                kehadiran=pengolahankehadiran.getKehadiranpengolahankehadiran();
                try {
                    d.masukDatabaseKehadiran(nim, matakuliah,kehadiran);
                } catch (SQLException ex) {
                    Logger.getLogger(ControllerSignUp.class.getName()).log(Level.SEVERE, null, ex);
                }
       }
    }
}
