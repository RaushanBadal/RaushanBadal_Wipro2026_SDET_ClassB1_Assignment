package Day16_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertData_Ex {

    public static void main(String[] args) {

        try {

            // Load Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Database Connection
            String url = "jdbc:mysql://localhost:3306/wipro_db";
            String username = "root";
            String password = "Raushan@8009";

            Connection con = DriverManager.getConnection(
                    url,
                    username,
                    password
            );

            // Create Statement
            Statement st = con.createStatement();

            // Insert Query
            String query =
                    "INSERT INTO employees VALUES(1,'Rahul',101,25000)";

            // Execute Query
            int rows = st.executeUpdate(query);

            // Output
            System.out.println(rows + " row affected");

            // Close Connection
            con.close();

        } catch (Exception e) {

            System.out.println(e);

        }
    }
}