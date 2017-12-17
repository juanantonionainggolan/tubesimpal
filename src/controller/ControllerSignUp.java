/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.signupPage;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Dunia Imajinasiku
 */
public class ControllerSignUp implements ActionListener {
    private signupPage signup;
    public ControllerSignUp(){
        signup = new signupPage();
        signup.setVisible(true);
        signup.addListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        Object a = e.getSource();
        DBConnect d = new DBConnect();
        if (a.equals(signup.getDaftarsignup())){
            if (signup.getMahasiswasignip().isSelected()){
                String nim, nama, email, alamat, password, tgl_lahir;
                nim=signup.getNimnipsignup();
                nama=signup.getNamasignup();
                email=signup.getEmailsignup();
                alamat=signup.getAlamatsignup();
                password=signup.getPasssignup();
                tgl_lahir=signup.getTgllahirsignup();
                try {
                    d.masukDatabaseMahasiswa(nim, nama, email, alamat, tgl_lahir, password);
                } catch (SQLException ex) {
                    Logger.getLogger(ControllerSignUp.class.getName()).log(Level.SEVERE, null, ex);
                }
                signup.dispose();
                new ControllerloginPage();
            }
            else if(signup.getDosensignup().isSelected()){
                String nip, nama, email, alamat, password, tgl_lahir;
                nip=signup.getNimnipsignup();
                nama=signup.getNamasignup();
                email=signup.getEmailsignup();
                alamat=signup.getAlamatsignup();
                password=signup.getPasssignup();
                tgl_lahir=signup.getTgllahirsignup();
                try {
                    d.masukDatabaseDosen(nip, nama, email, alamat, tgl_lahir, password);
                } catch (SQLException ex) {
                    Logger.getLogger(ControllerSignUp.class.getName()).log(Level.SEVERE, null, ex);
                }
                new ControllerloginPage();
            }
      
    }
    }
}
