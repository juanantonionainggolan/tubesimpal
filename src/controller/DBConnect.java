package controller;
import java.sql.*;
import java.util.ArrayList;
import model.dosen;
import model.jawaban;
import model.mahasiswa;
import model.materi;
import model.nilai;
public class DBConnect {
    private Connection con;
    private Statement st;
    private ResultSet rs;
    
    public DBConnect() {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/impal","root","");
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
            connection = DriverManager.getConnection("jdbc:mysql://localhost/impal", "root", "");
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
            connection = DriverManager.getConnection("jdbc:mysql://localhost/impal", "root", "");
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
    public mahasiswa cekuserm(String nim, String password) throws SQLException {
            mahasiswa m = null;
            Statement statement;
            Connection connection;
            connection = DriverManager.getConnection("jdbc:mysql://localhost/impal", "root", "");
            statement = connection.createStatement();
            String query = "select nim from mahasiswa where"
                +" nim=" +"'"+nim+"'"
                +" and " +"password=" +"'" +password+ "'";
            ResultSet cs=statement.executeQuery(query);
            while (cs.next()){
                m= new mahasiswa(cs.getString(1), cs.getString(2), cs.getString(3), cs.getString(4), cs.getString(5), cs.getString(6));
            }
            return m;
    }
    public dosen cekuserd(String nim, String password) throws SQLException {
            dosen d=null;
            Statement statement;
            Connection connection;
            connection = DriverManager.getConnection("jdbc:mysql://localhost/impal", "root", "");
            statement = connection.createStatement();
            String query1 = "select nip from dosen where"
                +" nip=" +"'"+nim+"'"
                +" and " +"password=" +"'" +password+ "'";
            ResultSet ds=statement.executeQuery(query1);
            while (ds.next()){
                d= new dosen(ds.getString(1), ds.getString(2), ds.getString(3), ds.getString(4), ds.getString(5), ds.getString(6));
            }
            return d;
    }
    public void masukDatabaseMateri(String kode_materi, String nama_materi)throws SQLException {
                    Statement statement;
            Connection connection;
            connection = DriverManager.getConnection("jdbc:mysql://localhost/impal", "root", "");
            statement = connection.createStatement();
            String query = "insert into materi "
                + "(kode_materi, nama_materi) values ("
                + "'" + kode_materi + "',"
                + "'" + nama_materi
                + "')";
            statement.execute(query);
    }
    public void masukDatabaseKehadiran(String nim, String matakuliah, String kehadiran)throws SQLException {
                    Statement statement;
            Connection connection;
            connection = DriverManager.getConnection("jdbc:mysql://localhost/impal", "root", "");
            statement = connection.createStatement();
            String query = "insert into kehadiran "
                + "(nim, matakuliah, kehadiran) values ("
                + "'" + nim + "',"
                + "'" + matakuliah + "',"
                + "'" + kehadiran
                + "')";
            statement.execute(query);
    }
    public void masukDatabaseNilai(String nim, String matakuliah, String nilai)throws SQLException {
                    Statement statement;
            Connection connection;
            connection = DriverManager.getConnection("jdbc:mysql://localhost/impal", "root", "");
            statement = connection.createStatement();
            String query = "insert into nilai "
                + "(nim, matakuliah, nilai) values ("
                + "'" + nim + "',"
                + "'" + matakuliah + "',"
                + "'" + nilai
                + "')";
            statement.execute(query);
    }
    public void masukDatabaseSoal(String kode_tugas, String kode_materi,String file_soal)throws SQLException {
                    Statement statement;
            Connection connection;
            connection = DriverManager.getConnection("jdbc:mysql://localhost/impal", "root", "");
            statement = connection.createStatement();
            String query = "insert into soal "
                + "(kode_tugas, kode_materi, file_soal) values ("
                + "'" + kode_tugas + "',"
                + "'" + kode_materi + "',"
                + "'" + file_soal
                + "')";
            statement.execute(query);
    }
    public void masukDatabaseJawaban(String kode_tugas,String nim, String jawaban)throws SQLException {
                    Statement statement;
            Connection connection;
            connection = DriverManager.getConnection("jdbc:mysql://localhost/impal", "root", "");
            statement = connection.createStatement();
            String query = "insert into Jawaban "
                + "(kode_tugas, jawaban, nim) values ("
                + "'" + kode_tugas + "',"
                + "'" + nim + "',"
                + "'" + jawaban
                + "')";
            statement.execute(query);
    }
    public ArrayList<jawaban> loadjawaban() throws SQLException {
            Statement statement;
            Connection connection;
            connection = DriverManager.getConnection("jdbc:mysql://localhost/impal", "root", "");
            statement = connection.createStatement();
            try{
                ArrayList<jawaban> daftarjawaban =new ArrayList<>();
                String query = "select *from jawaban";
                ResultSet rs = statement.executeQuery(query);
                while (rs.next()) {
                    jawaban j= new jawaban(rs.getString("kode_soal"), rs.getString("jawaban"), rs.getString("nim"));
                    daftarjawaban.add(j);
                }
                return daftarjawaban;
            }catch (Exception e) {
            throw new IllegalArgumentException("terjadi kesalahan saat load jawaban");
            }
            
    }
    
    public ArrayList<materi> loadmateri() throws SQLException {
            Statement statement;
            Connection connection;
            connection = DriverManager.getConnection("jdbc:mysql://localhost/impal", "root", "");
            statement = connection.createStatement();
            try{
                ArrayList<materi> daftarmateri =new ArrayList<>();
                String query = "select *from materi";
                ResultSet rs = statement.executeQuery(query);
                while (rs.next()) {
                    materi m= new materi(rs.getString("kode_materi"), rs.getString("nama_materi"));
                    daftarmateri.add(m);
                }
                return daftarmateri;
            }catch (Exception e) {
            throw new IllegalArgumentException("terjadi kesalahan saat load");
            }
            
    }
        
    public void updateDatabaseDosen(String password, String email, String alamat,String nip)throws SQLException {
            Statement statement;
            Connection connection;
            connection = DriverManager.getConnection("jdbc:mysql://localhost/impal", "root", "");
            statement = connection.createStatement();
            String query1="select*from dosen where nip="
                + "'" + nip + "';";
            ResultSet ds=statement.executeQuery(query1);
            String nama=ds.getString("nama");
            String tgl_lahir=ds.getString("tgl_lahir");
            String query = "update dosen "
                + "set nip="
                + "'" + nip + "',"
                + "nama="
                + "'" + nama + "'"
                + "email="
                + "'" + email + "'"
                + "alamat="
                + "'" + alamat + "'"
                + "tgl_lahir="
                + "'" + tgl_lahir + "'"
                + "password="
                + "'" + password + "'"
                + "where nip="
                + "'" + nip + "';";
            statement.execute(query);

    }
}
