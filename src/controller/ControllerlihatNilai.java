package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import view.lihatNilai;

public class ControllerlihatNilai implements ActionListener{
    private lihatNilai lihatnilai;
    public ControllerlihatNilai(){
        lihatnilai= new lihatNilai();
        lihatnilai.setVisible(true);
        lihatnilai.addListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object a = e.getSource();
        DBConnect d = new DBConnect();
        if (a== lihatnilai.getKembalib()){
            lihatnilai.dispose();
            new ControllerHomeMahasiswa();
        }
    }
}
