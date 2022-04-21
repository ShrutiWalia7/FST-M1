import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_3 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/dynamic-controls");
        System.out.println(driver.getTitle());
        WebElement textBox = driver.findElement(By.id("dynamicText"));
        boolean status = textBox.isEnabled();
        System.out.println(status);
        textBox.click();
        WebElement toggleButton = driver.findElement(By.id("toggleInput"));
        toggleButton.click();

        boolean status1 = textBox.isEnabled();
        System.out.println(status1);
        driver.close();
    }
}
