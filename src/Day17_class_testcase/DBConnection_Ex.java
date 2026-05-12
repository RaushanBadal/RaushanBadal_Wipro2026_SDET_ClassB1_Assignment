package Day17_class_testcase;
import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection_Ex {

    public static void main(String[] args) {

        try {

            
            Class.forName("com.mysql.cj.jdbc.Driver");

            
            String url = "jdbc:mysql://localhost:3306/class_assignment";

           
            String username = "root";
            String password = "Raushan@8009";

           
            Connection con = DriverManager.getConnection(
                    url,
                    username,
                    password
            );

            System.out.println("Database Connected Successfully");

            
            con.close();

        } catch (Exception e) {

            System.out.println(e);

        }
    }
}