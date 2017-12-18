/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.materi;
import view.downloadMateri;
/**
 *
 * @author Dunia Imajinasiku
 */
public class ControllerdownloadMateri implements ActionListener {
    downloadMateri downloadmateri;
    DBConnect d= new DBConnect();
    public ControllerdownloadMateri()throws SQLException{
        downloadmateri= new downloadMateri();
        downloadmateri.setVisible(true);
        downloadmateri.addListener(this);
        ArrayList<materi> m=d.loadmateri();
        int i=0;
        for (materi c : m){
            downloadmateri.getjTable1().setValueAt(c.getKode_materi(), i, 0);
            downloadmateri.getjTable1().setValueAt(c.getNama_materi(),i ,1);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object a = e.getSource();
        if (a == downloadmateri.getDownload()){
            downloadmateri.dispose();
            new ControllerhomeMahasiswa();
        }
    }
}
