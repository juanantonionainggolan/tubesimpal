package controller;
import view.loginPage;

public class Main {

    public static void main(String[] args) {
       DBConnect connect = new DBConnect();
       new ControllerloginPage();
    }
    
}
