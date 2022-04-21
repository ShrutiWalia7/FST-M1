import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {
    public static void main(String arg[]) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/simple-form");
        System.out.println(driver.getTitle());

        driver.findElement(By.id("firstName")).sendKeys("Shruti");
        driver.findElement(By.id("lastName")).sendKeys("walia");
        driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
        driver.findElement(By.id("number")).sendKeys("9267567434");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".ui.green.button")).click();
        driver.close();

    }
}
