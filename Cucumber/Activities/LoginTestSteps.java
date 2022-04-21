package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginTestSteps {
    WebDriver driver;
    WebDriverWait wait ;

    @Given("User is on Login page")
    public void loginPage(){
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver , Duration.ofSeconds(15));
        driver.get("https://www.training-support.net/selenium/login-form");
    }

    @When("^User enters username and password$")
        public void enterCredentials() {
            //Enter username
            driver.findElement(By.id("username")).sendKeys("admin");
            //Enter password
            driver.findElement(By.id("password")).sendKeys("password");
            //Click Login
            driver.findElement(By.xpath("//button[@type='submit']")).click();
        }

    @When("^User enters \"(.*)\" and \"(.*)\"$")
    public void enterCredentialParameters(String Username , String Password){
        WebElement username = driver.findElement(By.name("Username"));
        username.sendKeys(Username);
        WebElement password = driver.findElement(By.name("Password"));
        password.sendKeys(Password);
        driver.findElement(By.xpath("//button[@class='ui button']")).click();
    }
    @Then("Read the page title and confirmation message")
    public void readThePageTitleAndConfirmationMessage() {
        String title = driver.getTitle();
        System.out.println(title);
        String message = driver.findElement(By.id("action-confirmation")).getText();
        System.out.println(message);

        if(message.contains("admin")){
            System.out.println("Welcome admin");
        }
        else
        {
            System.out.println("Invalid Credentials");
        }
    }

    @And("Close the Browser")
    public void closeTheBrowser() {
        driver.close();
    }
}
