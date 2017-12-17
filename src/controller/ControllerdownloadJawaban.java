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
import model.jawaban;
import view.downloadJawaban;

/**
 *
 * @author Dunia Imajinasiku
 */
public class ControllerdownloadJawaban implements ActionListener {
    downloadJawaban downloadjawaban;
    DBConnect d= new DBConnect();
    
    public ControllerdownloadJawaban() throws SQLException{
        downloadjawaban= new downloadJawaban();
        downloadjawaban.setVisible(true);
        downloadjawaban.addListener(this);
        ArrayList<jawaban> j= d.loadjawaban();
        int i=0;
        for (jawaban a : j){
            downloadjawaban.getjTable1().setValueAt(a.getKode_soal(),i,0);
            downloadjawaban.getjTable1().setValueAt(a.getJawaban(), i, 1);
            downloadjawaban.getjTable1().setValueAt(a.getNim(), i, 1);
            i++;
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object a = e.getSource();
        if (a == downloadjawaban.getDbutton()){
            downloadjawaban.dispose();
            new ControllerloginPage();
        }
    }
}
