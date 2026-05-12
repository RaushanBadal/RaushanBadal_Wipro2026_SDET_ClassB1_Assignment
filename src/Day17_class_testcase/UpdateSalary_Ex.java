package Day17_class_testcase;

import java.sql.*;

public class UpdateSalary_Ex {

    public static void main(String[] args) {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/class_assignment",
                    "root",
                    "Raushan@8009"
            );

            String query =
            "UPDATE employees1 SET salary=? WHERE emp_id=?";

            PreparedStatement ps =
                    con.prepareStatement(query);

            ps.setDouble(1, 90000);
            ps.setInt(2, 1);

            int rows = ps.executeUpdate();

            System.out.println(rows + " row updated");

            con.close();

        } catch(Exception e) {

            System.out.println(e);

        }
    }
}
