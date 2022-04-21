import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity7_2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/dynamic-attributes");
        System.out.println(driver.getTitle());
        WebElement UserName = driver.findElement(By.cssSelector("input[name^=\"name-\"][class$=\"-username\"]"));
        UserName.sendKeys("admin");
        WebElement password = driver.findElement(By.cssSelector("input[name^=\"name-\"][class$=\"-password\"]"));
        password.sendKeys("password");
        Thread.sleep(1000);
        WebElement confirmPassword = driver.findElement(By.xpath("//label[text()='Confirm Password']/following::input[1]"));
        confirmPassword.sendKeys("password");

    }
}