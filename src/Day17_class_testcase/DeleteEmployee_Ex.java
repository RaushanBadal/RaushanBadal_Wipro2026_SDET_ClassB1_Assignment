package Day17_class_testcase;

import java.sql.*;

public class DeleteEmployee_Ex {

    public static void main(String[] args) {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/class_assignment",
                    "root",
                    "Raushan@8009"
            );

            String query =
            "DELETE FROM employees1 WHERE emp_id=?";

            PreparedStatement ps =
                    con.prepareStatement(query);

            ps.setInt(1, 5);

            int rows = ps.executeUpdate();

            System.out.println(rows + " row deleted");

            con.close();

        } catch(Exception e) {

            System.out.println(e);

        }
    }
}
