package pembelajaranonline;
import view.loginPage;

public class Main {

    public static void main(String[] args) {
       DBConnect connect = new DBConnect();
       connect.getData();
       new loginPage().setVisible(true);
    }
    
}
