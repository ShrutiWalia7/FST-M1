package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity5 {
    WebDriver driver;

    @BeforeMethod
    public void initializeBrowser(){
        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/lms");
    }
    @Test
    public void titleSecondCourse(){
        driver.findElement(By.partialLinkText("My Account")).click();
        String ActualTitle = driver.getTitle();
        String ExpectedTitle = "My Account – Alchemy LMS";
        Assert.assertEquals(ActualTitle , ExpectedTitle);
    }
    @AfterMethod
    public void closeBrowser(){
        driver.close();
    }
}
