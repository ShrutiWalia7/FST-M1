import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_1 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/dynamic-controls");
        System.out.println(driver.getTitle());
        WebElement checkbox = driver.findElement(By.xpath("//input[@class='willDisappear']"));
        boolean status = checkbox.isDisplayed();
        System.out.println(status);

        WebElement toggleButton = driver.findElement(By.xpath("//button[@id='toggleCheckbox']"));
        toggleButton.click();

        boolean status1 = checkbox.isDisplayed();
        System.out.println(status1);
        driver.close();
    }
}
