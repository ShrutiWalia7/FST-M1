import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {
    public static void main(String arg[]){
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net");
       System.out.println(driver.getTitle());
        //String AboutUSText = driver.findElement(By.linkText("About Us")).getText();
      // String AboutUSText = driver.findElement(By.id("about-link")).getText();
        WebElement cssLocator = driver.findElement(By.cssSelector(".green"));
        System.out.println("Text in element: " + cssLocator.getText());
        //System.out.println(AboutUSText);
        driver.close();
    }
}
