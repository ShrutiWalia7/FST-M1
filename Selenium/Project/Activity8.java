package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Activity8 {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeMethod
    public void initializeBrowser(){
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.get("https://alchemy.hguy.co/lms");
    }

    @Test
    public void courseSelect(){
        driver.findElement(By.partialLinkText("Contact")).click();
        driver.findElement(By.id("wpforms-8-field_0")).sendKeys("Shruti");
        driver.findElement(By.id("wpforms-8-field_1")).sendKeys("Shruti@gmail.com");
        driver.findElement(By.id("wpforms-8-field_3")).sendKeys("subject");
        driver.findElement(By.xpath("//textarea[@id='wpforms-8-field_2']")).sendKeys("Message");
        driver.findElement(By.id("wpforms-submit-8")).click();

        String Expected = "Thanks for contacting us! We will be in touch with you shortly.";
        String Actual = driver.findElement(By.xpath("//div[@id='wpforms-confirmation-8']/p")).getText();
        Assert.assertEquals(Actual,Expected);
        System.out.println(Actual);

    }
    @AfterMethod
    public void closeBrowser(){
        driver.close();
    }
}
