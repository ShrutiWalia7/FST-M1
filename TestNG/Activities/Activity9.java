package activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.Reporter;

public class Activity9 {
    WebDriver driver;

    @BeforeTest(alwaysRun = true)
    public void initBrowser(){
        driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/javascript-alerts");
    }
    @BeforeMethod
    public void defaultPage(){
        String ParentWindow = driver.getWindowHandle();
        Reporter.log("Test Case Setup started |");
        driver.switchTo().window(ParentWindow);
    }

    @Test
    public void simpleAlertTestCase(){
        Reporter.log("Test Case started Simple");
        driver.findElement(By.id("simple")).click();
        Alert alert = driver.switchTo().alert();
        String SimpleAlertText = alert.getText();
        System.out.println(SimpleAlertText);
        Reporter.log("Test Case ended Simple");
    }
    @Test
    public void confirmAlertTestCase(){
        Reporter.log("Test Case started Confirm");
        driver.findElement(By.id("confirm")).click();
        Alert alert = driver.switchTo().alert();
        String ConfirmAlertText = alert.getText();
        System.out.println(ConfirmAlertText);
        alert.accept();
        Reporter.log("Test Case end Confim");
    }
    @Test
    public void promptAlertTestCase(){
        Reporter.log("Test Case started prompt");
        driver.findElement(By.id("prompt")).click();
        Alert alert = driver.switchTo().alert();
        String PromptAlertText = alert.getText();
        System.out.println(PromptAlertText);
        alert.accept();
        Reporter.log("Test Case ended prompt");
    }

    @AfterTest
    public void closeBrowser(){
        Reporter.log("driver close");
        driver.close();
    }
}
