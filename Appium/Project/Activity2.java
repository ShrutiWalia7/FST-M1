package activities;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Activity2 {
    AndroidDriver<MobileElement> driver = null;

    @BeforeClass
    public void initialize() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "Pixel 8 API128");
        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("appPackage", "com.google.android.keep");
        caps.setCapability("appActivity", ".activities.BrowseActivity");
        caps.setCapability("noReset", true);

        URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
        driver = new AndroidDriver<>(appServer, caps);
       // driver.manage().timeouts().implicitlyWait(Duration.ofDays(1000));
    }

    @Test
    public void newNote(){
        driver.findElement(MobileBy.AccessibilityId("New text note")).click();
        String title = "resourceId(\"com.google.android.keep:id/editable_title\")";
        MobileElement noteTitle = driver.findElement(MobileBy.AndroidUIAutomator(title));
        noteTitle.click();
        noteTitle.sendKeys("Activity2");

        String note = "resourceId(\"com.google.android.keep:id/edit_note_text\")";
        driver.findElement(MobileBy.AndroidUIAutomator(note)).sendKeys("Note added for Activity2");
        driver.findElement(MobileBy.AccessibilityId("Open navigation drawer")).click();

        String value = driver.findElement(MobileBy.id("com.google.android.keep:id/index_note_title")).getText();
        System.out.println(value);
        Assert.assertEquals(value,"Activity2");
    }
}
