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

public class Activity9 {
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
        driver.findElement(By.partialLinkText("All Courses")).click();
       // List<WebElement> Courses = driver.findElements(By.xpath("//div[@id='ld_course_list']//article"));
        List<WebElement> Courses = driver.findElements(By.xpath("//div[@class='caption']/h3"));

        int size = Courses.size();
        System.out.println(size);

        for(WebElement Course :Courses){
            System.out.println(Course.getText());
        }
        driver.findElement(By.xpath("(//*[text()='See more...'])[3]")).click();
        String Title = driver.getTitle();
        Assert.assertEquals(Title , "Content Marketing – Alchemy LMS");

    }
    @AfterMethod
    public void closeBrowser(){
        driver.close();
    }
}
