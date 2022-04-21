package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.*;

public class Activity5 {
    WebDriver driver;

    @BeforeMethod(alwaysRun = true)
    public void initBrowser(){
        driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/target-practice");
    }
    @Test
    public void pageTitle(){
       String Title = driver.getTitle();
        Assert.assertEquals("Target Practice" , Title);
    }
    @Test (groups = {"HeaderTests"})
    public void headerTest(){
        String thirdHeaderText = driver.findElement(By.id("third-header")).getText();
        Assert.assertEquals(thirdHeaderText,"Third header" );

        String FifthHeaderColor = driver.findElement(By.cssSelector("h5.ui.green.header")).getCssValue("color");
        Assert.assertEquals(FifthHeaderColor , "rgb(33, 186, 69)");
    }
@Test (groups = "ButtonTests")
    public void buttonTest(){
        String oliveButtonText = driver.findElement(By.cssSelector("button.ui.olive.button")).getText();
        Assert.assertEquals(oliveButtonText , "Olive");

    String ThirdButtonColor = driver.findElement(By.cssSelector("button.ui.brown.button")).getCssValue("color");
    System.out.println(ThirdButtonColor);
    Assert.assertEquals(ThirdButtonColor , "rgb(255, 255, 255)");
}
    @AfterMethod
    public  void  closeBrowser(){driver.close(); }
}
