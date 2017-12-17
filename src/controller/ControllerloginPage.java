/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.loginPage;

/**
 *
 * @author Dunia Imajinasiku
 */
public class ControllerloginPage implements ActionListener {
    loginPage loginpage;
    public ControllerloginPage(){
        loginpage = new loginPage();
        loginpage.setVisible(true);
        loginpage.addListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
