import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_2 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get(" https://www.training-support.net/selenium/simple-form");
        System.out.println(driver.getTitle());

       driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Shruti");
       driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Walia");
       driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Shruti@gmail.com");
       driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("9876767675");
       driver.findElement(By.xpath("//input[@type='submit']")).click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
}