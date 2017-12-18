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
import view.homeMahasiswa;

/**
 *
 * @author vedricovarinduripane
 */
public class ControllerHomeMahasiswa implements ActionListener {
    
    homeMahasiswa hMhs;
    
    public ControllerHomeMahasiswa() {
        hMhs = new homeMahasiswa();
        hMhs.setVisible(true);
        hMhs.addListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object a = e.getSource();
        if (a == hMhs.getEditprofilehomemahasiswa()) {
            new ControllerEditProfilm();
            hMhs.dispose();
        }
        else if (a == hMhs.getDownloadmaterihomemahasiswa()) {
            try {
                new ControllerdownloadMateri();
            } catch (SQLException ex) {
                Logger.getLogger(ControllerHomeMahasiswa.class.getName()).log(Level.SEVERE, null, ex);
            }
            hMhs.dispose();
        }
        else if (a == hMhs.getUploadjawabanhomemahasiswa()) {
            new ControlleruploadJawaban();
            hMhs.dispose();
        }
        else if (a == hMhs.getLihatnilaihomemahasiswa()) {
            new ControllerlihatNilai();
            hMhs.dispose();
        }
        else if (a == hMhs.getLihatkehadiranhomemahasiswa()) {
            new ControllerlihatKehadiran();
            hMhs.dispose();
        }
        else if (a == hMhs.getSignouthomemahasiswa()) {
            hMhs.dispose();
        }
    }
    
}
