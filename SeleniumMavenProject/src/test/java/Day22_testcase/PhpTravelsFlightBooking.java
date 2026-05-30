package Day22_testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PhpTravelsFlightBooking {

    public static void main(String[] args) throws Exception {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://phptravels.net/");

        Thread.sleep(5000);

        driver.findElement(
                By.xpath("//button[contains(text(),'I Understand & Continue')]"))
                .click();

        Thread.sleep(3000);

        driver.findElement(
                By.xpath("//span[text()='Flights']"))
                .click();

        Thread.sleep(3000);

        WebElement fromCity = driver.findElement(
                By.xpath("//input[@placeholder='Departure City or Airport']"));

        fromCity.click();

        Thread.sleep(2000);

        fromCity.sendKeys("Delhi");

        Thread.sleep(3000);

        fromCity.sendKeys(Keys.ARROW_DOWN);

        fromCity.sendKeys(Keys.ENTER);

        Thread.sleep(3000);

        WebElement toCity = driver.findElement(
                By.xpath("//input[@placeholder='Arrival City or Airport']"));

        toCity.click();

        Thread.sleep(2000);

        toCity.sendKeys("Mumbai");

        Thread.sleep(3000);

        toCity.sendKeys(Keys.ARROW_DOWN);

        toCity.sendKeys(Keys.ENTER);

        Thread.sleep(3000);

        driver.findElement(
                By.xpath("//button[contains(text(),'Search Flights')]"))
                .click();

        Thread.sleep(8000);

        String result = driver.findElement(
                By.tagName("body")).getText();

        if(result.contains("No flights found")) {

            System.out.println("Flight Search Executed Successfully");
            System.out.println("No Flights Available");

        } else {

            System.out.println("Flights Found Successfully");
        }

        Thread.sleep(5000);

        driver.quit();
    }
}