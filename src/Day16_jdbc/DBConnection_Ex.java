package Day16_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection_Ex {

    public static void main(String[] args) {

        try {

            // Load Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Database URL
            String url = "jdbc:mysql://localhost:3306/wipro_db";

            // Username & Password
            String username = "root";
            String password = "Raushan@8009";

            // Create Connection
            Connection con = DriverManager.getConnection(
                    url,
                    username,
                    password
            );

            System.out.println("Database Connected Successfully");

            // Close Connection
            con.close();

        } catch (Exception e) {

            System.out.println(e);

        }
    }
}
