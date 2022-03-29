package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity2 {
    WebDriver driver;

    @BeforeMethod
    public void initializeBrowser(){
        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/lms");
    }
    @Test
    public void websiteHeading(){
        String heading = driver.findElement(By.cssSelector(".uagb-ifb-title")).getText();
        Assert.assertEquals(heading , "Learn from Industry Experts");
    }
    @AfterMethod
    public void closeBrowser(){
        driver.close();
    }
}
