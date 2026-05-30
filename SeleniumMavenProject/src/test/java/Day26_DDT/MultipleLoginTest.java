package Day26_DDT;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultipleLoginTest {

    @DataProvider(name = "loginData")
    public Object[][] getData() {

        return new Object[][] {

                {"admin", "admin123"},
                {"user", "user123"},
                {"test", "test123"}

        };
    }

    @Test(dataProvider = "loginData")
    public void loginTest(String username, String password)
            throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://practicetestautomation.com/practice-test-login/");

        driver.findElement(By.id("username")).sendKeys(username);

        driver.findElement(By.id("password")).sendKeys(password);

        driver.findElement(By.id("submit")).click();

        Thread.sleep(2000);

        System.out.println("Login tested with Username: "+ username + " | Password: "+ password);

        driver.quit();
    }
}
