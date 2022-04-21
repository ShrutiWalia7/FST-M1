package activities;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.net.MalformedURLException;
import java.net.URL;

public class Activity2 {

    AndroidDriver<MobileElement> driver = null;
    WebDriverWait wait;
    @BeforeClass
    public void initialize() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "<device name>");
        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("appPackage", "com.android.chrome");
        caps.setCapability("appActivity", "com.google.android.apps.chrome.Main");
        caps.setCapability("noReset", true);

// Instantiate Appium Driver
        URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
        driver = new AndroidDriver<MobileElement>(appServer, caps);
        wait = new WebDriverWait(driver,10);
    }

    @Test
    public void getURL() throws InterruptedException {
        driver.get("https://www.training-support.net/");
        //wait.until(ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("About Us")));
        Thread.sleep(1000);

        String pageTitle = driver.findElementByXPath("//android.view.View[@text='Training Support']").getText();
        System.out.println("Title on Homepage: " + pageTitle);
        MobileElement aboutUS = driver.findElementByXPath("//android.view.View[@text='About Us']");
        aboutUS.click();
    }
    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
