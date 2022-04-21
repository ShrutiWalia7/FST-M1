package suiteExample;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class DemoTwo {

    WebDriver driver;

    @Test
    public void test1(){
        System.out.println("I'm in the test case from DemoTwo Class");
    }
}
