import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Activity10_1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get(" https://www.training-support.net/selenium/input-events");
        System.out.println(driver.getTitle());

        WebElement cube = driver.findElement(By.id("D3Cube"));
        Actions actions = new Actions(driver);
        actions.click(cube).build().perform();


    }
}
