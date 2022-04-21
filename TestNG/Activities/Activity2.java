package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity2 {
    WebDriver driver;

    @BeforeTest
    public void initBrowser(){
        driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/target-practice");
    }
    @Test
    public void test1(){
       String Title = driver.getTitle();
        Assert.assertEquals("Target Practice" , Title);
    }
    @Test
    public void test2(){
        String ButtonColor = driver.findElement(By.xpath("//button[text()='Black']")).getText();
        Assert.assertEquals("bbb" , ButtonColor);
    }
    @Test (enabled = false)
    public void test3() {
        String ButtonColor = driver.findElement(By.xpath("//button[text()='Black']")).getText();
        Assert.assertEquals("Blue" , ButtonColor);
    }
    @Test
    public void test4() throws SkipException {
        String condition ="Skip Test";

        if(condition.equals("Skip Test")){
            throw new SkipException("Skipping - This is not ready for testing ");
        } else {
            System.out.println("test");
        }
    }
    @AfterTest
    public  void  closeBrowser(){
        driver.close();
    }
}
