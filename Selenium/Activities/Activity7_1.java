import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity7_1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/dynamic-attributes");
        System.out.println(driver.getTitle());
        WebElement UserName = driver.findElement(By.xpath("//input[starts-with(@class,'username')]"));
        UserName.sendKeys("admin");
        WebElement password = driver.findElement(By.xpath("//input[starts-with(@class,'password')]"));
        password.sendKeys("password");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
        WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("action-confirmation")));
        System.out.println(driver.findElement(By.id("action-confirmation")).getText());
    }
}