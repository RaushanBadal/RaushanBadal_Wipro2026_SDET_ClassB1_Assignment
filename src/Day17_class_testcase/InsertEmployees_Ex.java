package Day17_class_testcase;


import java.sql.*;

public class InsertEmployees_Ex {

    public static void main(String[] args) {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/class_assignment",
                    "root",
                    "Raushan@8009"
            );

            String query =
            "INSERT INTO employees1 VALUES(?,?,?,?,?,?)";

            PreparedStatement ps =
                    con.prepareStatement(query);

       
            ps.setInt(1, 1);
            ps.setString(2, "Rahul");
            ps.setString(3, "IT");
            ps.setDouble(4, 60000);
            ps.setString(5, "rahul");
            ps.setString(6, "123");
            ps.executeUpdate();

       
            ps.setInt(1, 2);
            ps.setString(2, "Amit");
            ps.setString(3, "HR");
            ps.setDouble(4, 45000);
            ps.setString(5, "amit");
            ps.setString(6, "111");
            ps.executeUpdate();

           
            ps.setInt(1, 3);
            ps.setString(2, "Abisekh");
            ps.setString(3, "IT");
            ps.setDouble(4, 75000);
            ps.setString(5, "Abhisekh");
            ps.setString(6, "222");
            ps.executeUpdate();

          
            ps.setInt(1, 4);
            ps.setString(2, "Prince");
            ps.setString(3, "Finance");
            ps.setDouble(4, 55000);
            ps.setString(5, "prince");
            ps.setString(6, "333");
            ps.executeUpdate();

          
            ps.setInt(1, 5);
            ps.setString(2, "Karan");
            ps.setString(3, "HR");
            ps.setDouble(4, 40000);
            ps.setString(5, "karan");
            ps.setString(6, "444");
            ps.executeUpdate();

            System.out.println("5 Records Inserted");

            con.close();

        } catch(Exception e) {

            System.out.println(e);

        }
    }
}
