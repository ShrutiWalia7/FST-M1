package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AlertSteps {

    WebDriver driver;
    WebDriverWait wait;
    Alert alert;

    @Given("^User is on the page$")
    public void homePage(){
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.get("https://www.training-support.net/selenium/javascript-alerts");
    }

    @When("User clicks the Simple Alert button")
    public void clickSimpleAlertButton() {
        driver.findElement(By.xpath("//button[@id='simple']")).click();

    }

    @When("User clicks the Confirm Alert button")
    public void clickConfirmAlertButton() {
        driver.findElement(By.xpath("//button[@id='confirm']")).click();

    }

    @When("User clicks the Prompt Alert button")
    public void clickPromptAlertButton() {
        driver.findElement(By.xpath("//button[@id='prompt']")).click();
    }

    @Then("Alert opens")
    public void alertOpens() {
        alert = driver.switchTo().alert();
    }

    @And("Read the text from it and print it")
    public void readTheTextFromItAndPrintIt() {
        String alertText = alert.getText();
        System.out.println(alertText);
    }

    @And("Write a custom message in it")
    public void writeACustomMessageInIt() {
        alert.sendKeys("Hello");
    }

    @And("Close the alert")
    public void closeTheAlert() {
        alert.accept();
    }

    @And("Close the alert with Cancel")
    public void closeTheAlertWithCancel() {
        alert.dismiss();
    }

    @And("Close Browser")
    public void closeBrowser() {
        driver.close();
    }

    @And("Read the result text")
    public void readTheResultText() {
        String result = driver.findElement(By.tagName("p")).getText();
        System.out.println(result);
    }
}
