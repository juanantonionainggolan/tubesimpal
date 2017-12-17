package controller;
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
    public void masukDatabaseMahasiswa(String nim, String nama, String email, String alamat, String tgl_lahir, String password) throws SQLException {
            Statement statement;
            Connection connection;
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/impal", "root", "");
            statement = connection.createStatement();
            String query = "insert into mahasiswa "
                + "(nim, nama, email, alamat, tgl_lahir, password) values ("
                + "'" + nim + "',"
                + "'" + nama + "',"
                + "'" + email + "',"
                + "'" + alamat + "',"
                + "'" + tgl_lahir + "',"
                + "'" + password
                + "')";
            statement.execute(query);
        }
    public void masukDatabaseDosen(String nip, String nama, String email, String alamat, String tgl_lahir, String password) throws SQLException {
            Statement statement;
            Connection connection;
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/impal", "root", "");
            statement = connection.createStatement();
            String query = "insert into dosen "
                + "(nip, nama, email, alamat, tgl_lahir, password) values ("
                + "'" + nip + "',"
                + "'" + nama + "',"
                + "'" + email + "',"
                + "'" + alamat + "',"
                + "'" + tgl_lahir + "',"
                + "'" + password
                + "')";
            statement.execute(query);
        }
}
