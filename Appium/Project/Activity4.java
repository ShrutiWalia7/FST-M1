package activities;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Activity4 { AndroidDriver<MobileElement> driver;

    @BeforeClass
    public void setup() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "<FST_Appium");
        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("appPackage", "com.android.chrome");
        caps.setCapability("appActivity", "com.google.android.apps.chrome.Main");
        caps.setCapability("noReset", true);
// Instantiate Appium Driver
        URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
        driver = new AndroidDriver<MobileElement>(appServer, caps);
    }
    @Test
    public void googleTest() throws InterruptedException {
        driver.get("https://www.training-support.net/selenium");
        Thread.sleep(1000);
        driver.findElementByXPath("//android.widget.Button[@text = 'Get Started!']").click();
        Thread.sleep(1000);
        //scroll
        String UiScrollable = "UiScrollable(UiSelector().scrollable(true))";
        driver.findElement(
                MobileBy.AndroidUIAutomator(UiScrollable + ".scrollIntoView(text(\"To-Do List\"))")).click();
        Thread.sleep(1000);
        driver.findElementByClassName("android.widget.EditText").sendKeys("Add tasks to list");
        driver.findElementByXPath("//android.widget.Button[@text = 'Add Task']").click();
        driver.findElementByClassName("android.widget.EditText").sendKeys("Get number of tasks");
        driver.findElementByXPath("//android.widget.Button[@text = 'Add Task']").click();
        driver.findElementByClassName("android.widget.EditText").sendKeys("Clear the list");
        driver.findElementByXPath("//android.widget.Button[@text = 'Add Task']").click();
        Thread.sleep(1000);
        driver.findElementByXPath("//android.view.View[@text = 'Add tasks to list']").click();
        driver.findElementByXPath("//android.view.View[@text = 'Get number of tasks']").click();
        driver.findElementByXPath("//android.view.View[@text = 'Clear the list']").click();
        Thread.sleep(1000);
        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View[3]").click();
        Thread.sleep(1000);

    }
    @AfterClass
    public void afterClass(){
        driver.quit();
    }
}
