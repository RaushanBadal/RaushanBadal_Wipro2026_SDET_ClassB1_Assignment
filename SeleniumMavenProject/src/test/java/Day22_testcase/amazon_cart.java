package Day22_testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon_cart {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.in/");

        driver.manage().window().maximize();

        Thread.sleep(3000);

        driver.findElement(By.id("twotabsearchtextbox"))
                .sendKeys("oneplus bullets wireless z3");

        driver.findElement(By.id("nav-search-submit-button"))
                .click();

        Thread.sleep(5000);

        driver.findElement(By.cssSelector("h2 a"))
                .click();

        Thread.sleep(5000);

        String mainWindow = driver.getWindowHandle();

        for (String windowHandle : driver.getWindowHandles()) {
            if (!windowHandle.equals(mainWindow)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }

        Thread.sleep(3000);

        WebElement addToCart =
                driver.findElement(By.id("https://amzn.in/d/08cUSaqy"));

        addToCart.click();

        Thread.sleep(5000);

        System.out.println("Product Added To Cart Successfully");

        driver.quit();
    }
}