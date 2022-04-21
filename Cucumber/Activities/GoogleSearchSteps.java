package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class GoogleSearchSteps {
    WebDriver driver;
    WebDriverWait wait;

    @Given("User is on Google Home Page")
    public void googleHomePage(){
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver , Duration.ofSeconds(15));
        driver.get("https://www.google.com/");
    }
    @When("User types in Cheese and hits ENTER")
    public  void googleSearch(){
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Cheese" , Keys.ENTER);
    }
    @And("Show how many search results were shown")
    public  void result(){
       wait.until(ExpectedConditions.visibilityOfElementLocated((By.id("result-stats"))));
        System.out.println(driver.findElement(By.id("result-stats")).getText());
    }
    @And("^Close the browser$")
    public void closeBrowser(){
        driver.quit();
    }
}
