package stepdefinition;

import org.openqa.selenium.By;

import base.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginsteps extends BaseClass {

    @Given("User launches browser")
    public void launch_browser() {

        System.out.println("Browser launched successfully");
    }

    @Given("User opens login page")
    public void open_login_page() {

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        System.out.println("Application Opened");
    }

    @When("user enters username {string}")
    public void enter_username(String username) throws InterruptedException {

        Thread.sleep(2000);

        driver.findElement(By.name("username")).sendKeys(username);
    }

    @When("user enters password {string}")
    public void enter_password(String password) {

        driver.findElement(By.name("password")).sendKeys(password);
    }

    @When("clicks on login button")
    public void click_login_button() {

        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    @Then("user should navigate to dashboard")
    public void dashboard() {

        System.out.println("Dashboard Displayed");
    }

    @Then("error message should display")
    public void error_message() {

        System.out.println("Invalid Credentials");
    }
}
