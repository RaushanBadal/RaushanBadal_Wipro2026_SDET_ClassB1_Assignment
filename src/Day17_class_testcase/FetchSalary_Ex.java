package Day17_class_testcase;


import java.sql.*;

public class FetchSalary_Ex {

    public static void main(String[] args) {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/class_assignment",
                    "root",
                    "Raushan@8009"
            );

            String query =
            "SELECT * FROM employees1 WHERE salary > 50000";

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(query);

            while(rs.next()) {

                System.out.println(
                    rs.getInt("emp_id") + " " +
                    rs.getString("emp_name") + " " +
                    rs.getDouble("salary")
                );
            }

            con.close();

        } catch(Exception e) {

            System.out.println(e);

        }
    }
}