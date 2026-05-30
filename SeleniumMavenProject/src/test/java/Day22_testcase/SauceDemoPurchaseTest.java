package Day22_testcase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceDemoPurchaseTest {

    public static void main(String[] args) throws Exception {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");

        driver.manage().window().maximize();

        Thread.sleep(3000);

        driver.findElement(By.id("user-name")).sendKeys("standard_user");

        driver.findElement(By.id("password")).sendKeys("secret_sauce");

        driver.findElement(By.id("login-button")).click();

        Thread.sleep(3000);

        String currentURL = driver.getCurrentUrl();

        if(currentURL.contains("inventory")) {

            System.out.println("Login Successful");

        } else {

            System.out.println("Login Failed");
        }

        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();

        Thread.sleep(3000);

        System.out.println("Product Added To Cart");

        driver.findElement(By.className("shopping_cart_link")).click();

        Thread.sleep(2000);
        driver.findElement(By.id("checkout")).click();

        Thread.sleep(2000);

        driver.findElement(By.id("first-name")).sendKeys("Raushan");

        driver.findElement(By.id("last-name")).sendKeys("Badal");

        driver.findElement(By.id("postal-code")).sendKeys("800001");

        driver.findElement(By.id("continue")).click();

        Thread.sleep(2000);

        driver.findElement(By.id("finish")).click();

        Thread.sleep(4000);

        String confirmationMessage =
                driver.findElement(By.className("complete-header")).getText();

        if(confirmationMessage.equals("Thank you for your order!")) {

            System.out.println("Order Placed Successfully");

        } else {

            System.out.println("Order Failed");
        }

        Thread.sleep(3000);

        driver.quit();
    }
}
