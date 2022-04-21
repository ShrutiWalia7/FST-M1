import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Activity9_1 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/selects");
        System.out.println("Page title :" + driver.getTitle());
        WebElement dropDown = driver.findElement(By.id("single-select"));
        Select select = new Select(dropDown);
        select.selectByVisibleText("Option 2");
        select.selectByIndex(3);
        select.selectByValue("4");

        List<WebElement> options = select.getOptions();
        //Print them
        for(WebElement option : options) {
            System.out.println("Option: " + option.getText());
        }
    }
}