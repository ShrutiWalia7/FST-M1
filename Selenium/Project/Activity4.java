package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity4 {
    WebDriver driver;

    @BeforeMethod
    public void initializeBrowser(){
        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/lms");
    }
    @Test
    public void titleSecondCourse(){
        String Title = driver.findElement(By.xpath("//h3[contains(text(),'Strategies')]")).getText();
        Assert.assertEquals(Title , "Email Marketing Strategies");
    }
    @AfterMethod
    public void closeBrowser(){
        driver.close();
    }
}
