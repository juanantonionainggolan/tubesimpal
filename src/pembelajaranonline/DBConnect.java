package pembelajaranonline;
import java.sql.*;
public class DBConnect {
    private Connection con;
    private Statement st;
    private ResultSet rs;
    
    public DBConnect() {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/impal","root","");
            st = con.createStatement();
        }catch (Exception ex){
            System.out.println("Error: "+ex);
        }
    }
    
    public void getData(){
        try{
            String query=("select * from mahasiswa");
            rs = st.executeQuery(query);
            System.out.println("Record from database");
            while (rs.next()){
                String name = rs.getString("nama");
                String nim = rs.getString("nim");
                System.out.println("Name: "+name+"    "+"NIM:"+nim );
            }
        }catch(Exception ex) {
            System.out.println("Error: "+ex);
        }
    }
}
