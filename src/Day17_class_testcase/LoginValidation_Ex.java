package Day17_class_testcase;


import java.sql.*;
import java.util.Scanner;

public class LoginValidation_Ex {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/class_assignment",
                    "root",
                    "Raushan@8009"
            );

            System.out.println("Enter Username:");
            String username = sc.nextLine();

            System.out.println("Enter Password:");
            String password = sc.nextLine();

            String query =
            "SELECT * FROM employees1 WHERE username=? AND password=?";

            PreparedStatement ps =
                    con.prepareStatement(query);

            ps.setString(1, username);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();

            if(rs.next()) {

                System.out.println("Login Successful");

            } else {

                System.out.println("Invalid Login");

            }

            con.close();

        } catch(Exception e) {

            System.out.println(e);

        }
    }
}