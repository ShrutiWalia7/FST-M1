import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class Activity8_1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/tables");
        System.out.println("Page title :" + driver.getTitle());
        List <WebElement> columnlist = driver.findElements(By.xpath("//table[@class='ui celled striped table']/tbody/tr[1]/td"));
        List <WebElement> rowlist = driver.findElements(By.xpath("//table[@class='ui celled striped table']/tbody/tr"));

        System.out.println( columnlist.size());
        System.out.println( rowlist.size());

        for(WebElement LL : columnlist){
            System.out.println(LL.getText());
        }
        List <WebElement> thirdRow = driver.findElements(By.xpath("//table[@class='ui celled striped table']/tbody/tr[3]"));
        for(WebElement LL1 : columnlist){
            System.out.println(LL1.getText());
        }

        WebElement secondValue = driver.findElement(By.xpath("//table[@class='ui celled striped table']/tbody/tr[2]/td[2]"));
        System.out.println(secondValue);
    }
}