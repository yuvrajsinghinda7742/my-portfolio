// import java.sql.*;
// public class App {
//     public static void main(String[] args) throws Exception {
//         System.out.println("Hello, World!");
//         Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/world",
//         "root",
//         "yuvraj@7742");
//         System.out.println(con);
//         System.out.println("Connection established successfully!");
//         con.close();
//     }
// }





import java.sql.*;
import javax.swing.*;
public class App {
    public static void insertStudent(String name, String rollno,String branch, String gender) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/form",
                    "root",
                    "yuvraj@7742");

            PreparedStatement ps = con.prepareStatement(
                "INSERT INTO student VALUES (?, ?, ?, ?)");

            ps.setString(1, name);
            ps.setString(2, rollno);
            ps.setString(3, branch);
            ps.setString(4, gender);

            ps.executeUpdate();

            JOptionPane.showMessageDialog(null,
                    "Data Inserted Successfully!");

            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}