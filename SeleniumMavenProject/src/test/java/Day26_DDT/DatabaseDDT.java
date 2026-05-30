package Day26_DDT;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatabaseDDT {

    public static void main(String[] args) throws Exception {

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/seleniumdb1","root","Raushan@8009");

        Statement stmt = con.createStatement();

        ResultSet rs = stmt.executeQuery(
                "SELECT * FROM login_data");

        while (rs.next()) {

            String username = rs.getString("username");
            String password = rs.getString("password");

            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            driver.get("https://www.saucedemo.com/");

            driver.findElement(By.id("user-name")).sendKeys(username);

            driver.findElement(By.id("password")).sendKeys(password);

            driver.findElement(By.id("login-button")).click();

            Thread.sleep(3000);

            System.out.println("Login Tested For: " + username);

            driver.quit();
        }

        con.close();

        System.out.println("Database Testing Completed");
    }
}
