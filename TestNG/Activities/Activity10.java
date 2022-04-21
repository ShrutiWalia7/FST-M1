package activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.*;

import javax.swing.*;

public class Activity10 {
    WebDriver driver;
    Actions action;

    @BeforeClass(alwaysRun = true)
    public void initBrowser(){
        driver = new FirefoxDriver();
        action = new Actions(driver);
        driver.get("https://www.training-support.net/selenium/sliders");
    }

    @Test
    public void middleValueSlider() throws InterruptedException {
        Reporter.log("Test Case started Middle Slider");
        WebElement slider = driver.findElement(By.id("slider"));
        slider.click();
        String sliderValue = driver.findElement(By.id("value")).getText();
        Assert.assertEquals(sliderValue,"50");
        Reporter.log("-----Test Case ends middle slider----");
    }

    @Test
    public void maxValueSlider(){
        Reporter.log("Test Case started Middle Slider");
        WebElement slider = driver.findElement(By.id("slider"));
        action.clickAndHold(slider).moveByOffset(100,0).release().build().perform();
        String sliderValue = driver.findElement(By.id("value")).getText();
        Assert.assertEquals(sliderValue,"100");
        Reporter.log("-----Test Case ends middle slider----");
    }

    @Test
    public void minValueSlider() {
            Reporter.log("Test Case started Middle Slider");
            WebElement slider = driver.findElement(By.id("slider"));
            action.clickAndHold(slider).moveByOffset(-75,0).release().build().perform();
            String sliderValue = driver.findElement(By.id("value")).getText();
            System.out.println(sliderValue);
            Assert.assertEquals(sliderValue,"0");
            Reporter.log("-----Test Case ends middle slider----");
        }

    @Test
    public void thirtyValueSlider() {
            Reporter.log("Test Case started Middle Slider");
            WebElement slider = driver.findElement(By.id("slider"));
            action.clickAndHold(slider).moveByOffset(-30,0).release().build().perform();
            String sliderValue = driver.findElement(By.id("value")).getText();
            System.out.println(sliderValue);
            Assert.assertEquals(sliderValue,"30");
            Reporter.log("-----Test Case ends middle slider----");
        }

    @Test
    public void eightyValueSlider() {
            Reporter.log("Test Case started Middle Slider");
            WebElement slider = driver.findElement(By.id("slider"));
            action.clickAndHold(slider).moveByOffset(44,0).release().build().perform();
            String sliderValue = driver.findElement(By.id("value")).getText();
            System.out.println(sliderValue);
            Assert.assertEquals(sliderValue,"80");
            Reporter.log("-----Test Case ends middle slider----");
    }
        @AfterClass
    public void closeBrowser(){
        Reporter.log("driver close");
        driver.close();
    }
}
