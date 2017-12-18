/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.lihatKehadiran;


public class ControllerlihatKehadiran implements ActionListener{
    private lihatKehadiran lihatkehadiran;
    public ControllerlihatKehadiran(){
        lihatkehadiran= new lihatKehadiran();
        lihatkehadiran.setVisible(true);
        lihatkehadiran.addListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object a = e.getSource();
        DBConnect d = new DBConnect();
        if (a== lihatkehadiran.getKembalib()){
            lihatkehadiran.dispose();
            new ControllerhomeMahasiswa();
        }
    }
}
