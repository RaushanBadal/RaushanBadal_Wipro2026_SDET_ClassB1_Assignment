package Day17_class_testcase;


import java.sql.*;

public class CountEmployees_Ex {

    public static void main(String[] args) {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/class_assignment",
                    "root",
                    "Raushan@8009"
            );

            String query =
            "SELECT COUNT(*) FROM employees1";

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(query);

            if(rs.next()) {

                System.out.println(
                    "Total Employees = " + rs.getInt(1)
                );
            }

            con.close();

        } catch(Exception e) {

            System.out.println(e);

        }
    }
}
