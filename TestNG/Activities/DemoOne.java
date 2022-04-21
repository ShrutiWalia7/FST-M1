package suiteExample;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class DemoOne {
    WebDriver driver;

    @Test
    public void test1(){
        System.out.println("I'm in the test case first from DemoOne Class");
    }

    @Test
    public void test2(){
        System.out.println("I'm in the test case second from DemoOne Class");
    }
}
