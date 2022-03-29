package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity3 {
    WebDriver driver;

    @BeforeMethod
    public void initializeBrowser(){
        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/lms");
    }
    @Test
    public void firstInfoBoxTitle(){
        String heading = driver.findElement(By.xpath("//h3[text()=' Actionable Training ']")).getText();
        Assert.assertEquals(heading , "Actionable Training");
    }
    @AfterMethod
    public void closeBrowser(){
        driver.close();
    }
}
