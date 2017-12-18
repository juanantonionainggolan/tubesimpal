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
import view.homeDosen;

/**
 *
 * @author vedricovarinduripane
 */
public class ControllerHomeDosen implements ActionListener {
    
    homeDosen hDsn;
    
    public ControllerHomeDosen() {
        hDsn = new homeDosen();
        hDsn.setVisible(true);
        hDsn.addListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object a = e.getSource();
        if (a == hDsn.getUploadmaterihomedosen() ) {
            new ControllerUploadMateri();
            hDsn.dispose();
        }
        else if (a == hDsn.getEditprofilhomedosen()) {
            new ControllereditProfil();
            hDsn.dispose();
        }
        else if (a == hDsn.getInputsoalhomedosen()) {
            new ControllerinputSoal();
            hDsn.dispose();
        }
        else if (a == hDsn.getDownloadjawabanhomedosen()) {
            try {
                new ControllerdownloadJawaban();
            } catch (SQLException ex) {
                Logger.getLogger(ControllerHomeDosen.class.getName()).log(Level.SEVERE, null, ex);
            }
            hDsn.dispose();
        }
        else if (a == hDsn.getPengolahannilaihomedosen()) {
            new ControllerpengolahanNilai();
            hDsn.dispose();
        }
        else if (a == hDsn.getPengolahankehadiranhomedosen()) {
            new ControllerpengolahanKehadiran();
            hDsn.dispose();
        }
        else if (a == hDsn.getSignouthomedosen()) {
            hDsn.dispose();
        }
    }
    
}
