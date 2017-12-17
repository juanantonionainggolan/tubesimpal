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
import view.loginPage;

/**
 *
 * @author Dunia Imajinasiku
 */
public class ControllerloginPage implements ActionListener {
    private loginPage loginpage;
    public ControllerloginPage(){
        loginpage = new loginPage();
        loginpage.setVisible(true);
        loginpage.addListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        Object a = e.getSource();
        DBConnect d = new DBConnect();
        if (a==loginpage.getLupapasswordsignin()){
            loginpage.dispose();
            new ControllerlupapasswordPage();
        }
        else if (a==loginpage.getSignupsignin()){
            loginpage.dispose();
            new ControllerSignUp();
        }
//        else if (a.equals(loginpage.getSigninsignin())){
//            try {
//                String nimnimp = loginpage.getNimniplogin();
//                String password = loginpage.getPasslogin();
//                if ((d.cekuserm(nimnimp, password) == null ) && (d.cekuserd(nimnimp, password) == null )) {
//                    loginpage.dispose();
//                    new ControllerloginPage();
//                    System.out.println("Login Sukses");
//                }
//                else if (d.cekuserm(nimnimp, password)!= null) {
//                    loginpage.dispose();
//                    new ControllerSignUp();
//                    System.out.println("abc");
//                }
//                else if (d.cekuserd(nimnimp, password)!= null) {
//                    loginpage.dispose();
//                    new ControllerlupapasswordPage();
//                    System.out.println("cba");
//                }
//            } catch (SQLException ex) {
//                Logger.getLogger(ControllerloginPage.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
    }

}
