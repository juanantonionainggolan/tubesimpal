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
import view.editProfil;

/**
 *
 * @author Dunia Imajinasiku
 */
public class ControllereditProfil implements ActionListener {
    editProfil editprofil;
    public ControllereditProfil(){
        editprofil = new editProfil();
        editprofil.setVisible(true);
        editprofil.addListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object a = e.getSource();
        DBConnect d = new DBConnect();
        if(a== editprofil.getUpdateeditprofile()){
            String password,email,alamat,nip;
            password=editprofil.getPasswordeditprofil();
            email=editprofil.getEmaileditprofile();
            alamat=editprofil.getAlamateditprofil();
            nip=editprofil.getNipeditprofil();
            try {
                d.updateDatabaseDosen(password, email, alamat, nip);
            } catch (SQLException ex) {
                Logger.getLogger(ControllereditProfil.class.getName()).log(Level.SEVERE, null, ex);
            }
            editprofil.dispose();
            new ControllerhomeDosen();
        }
    }
}