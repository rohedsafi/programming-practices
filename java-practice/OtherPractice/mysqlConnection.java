import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class mysqlConnection {
    public static void main(String[] args) {
           
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school_mis", "root", "");

            PreparedStatement ps = con.prepareStatement("SELECT * FROM student");

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String firstname = rs.getString(2); // we can give parameter through table column name or column index
                String lastname = rs.getString("lastname");
                String Email = rs.getString("Email");
                System.out.printf("ID: %-5d  First Name: %-10s  Last Name: %-10s  Email: %s%n", id, firstname, lastname, Email);
            }

        }catch (ClassNotFoundException | java.sql.SQLException e) {
            e.printStackTrace();
        }
        
    }
}
