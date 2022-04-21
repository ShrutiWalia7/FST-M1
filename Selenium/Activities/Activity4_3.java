import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/target-practice");
        System.out.println(driver.getTitle());
        String thirdHeader = driver.findElement(By.id("third-header")).getText();
        System.out.println(thirdHeader);

        String fifthHeader = driver.findElement(By.xpath("//div[@class='column']/h5")).getText();
        System.out.println(fifthHeader);
        String fifthHeaderColor = driver.findElement(By.xpath("//div[@class='column']/h5")).getCssValue("color");
        System.out.println(fifthHeaderColor);

        WebElement violetButton = driver.findElement(By.xpath("//button[text()='Violet']"));
        System.out.println(violetButton.getAttribute("class"));

        String greyButton = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[3]/button[2]")).getText();
        System.out.println("The grey button's text is: " + greyButton);

        //Close the browser
        driver.close();
    }
    }
