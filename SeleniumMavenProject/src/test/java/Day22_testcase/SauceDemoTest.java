package Day22_testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceDemoTest {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");

        driver.manage().window().maximize();

        Thread.sleep(8000);

        driver.findElement(By.id("user-name")).sendKeys("standard_user");

        driver.findElement(By.id("password")).sendKeys("secret_sauce");

        driver.findElement(By.id("login-button")).click();

        Thread.sleep(5000);

        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();

        Thread.sleep(5000);

        driver.findElement(By.className("shopping_cart_link")).click();

        Thread.sleep(5000);

        System.out.println("Product Added To Cart Successfully");

        driver.quit();
    }
}