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

public class Activity3 {
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
    public void newNote() throws InterruptedException {
        driver.findElement(MobileBy.AccessibilityId("New text note")).click();
        String title = "resourceId(\"com.google.android.keep:id/editable_title\")";
        Thread.sleep(1000);
        MobileElement noteTitle = driver.findElement(MobileBy.AndroidUIAutomator(title));
        noteTitle.click();
        noteTitle.sendKeys("Activity3");

        String note = "resourceId(\"com.google.android.keep:id/edit_note_text\")";
        driver.findElement(MobileBy.AndroidUIAutomator(note)).sendKeys("Note added for Activity3");
        driver.findElement(MobileBy.AccessibilityId("Reminder")).click();
        driver.findElement(MobileBy.id("com.google.android.keep:id/menu_icon")).click();
        driver.findElement(MobileBy.AccessibilityId("Open navigation drawer")).click();
        driver.findElement(MobileBy.AccessibilityId("Open navigation drawer")).click();

        driver.findElement(MobileBy.id("index_note_text_description")).click();
        String activityTitle = "resourceId(\"com.google.android.keep:id/index_note_title\")";
        String titleValue = driver.findElement(MobileBy.AndroidUIAutomator(activityTitle)).getText();
        System.out.println(titleValue);

        String reminderValue = driver.findElement(MobileBy.id("reminder_chip_text")).getText();
        System.out.println(reminderValue);
        Assert.assertEquals(titleValue,"Activity3");
        Assert.assertEquals(reminderValue,"Today, 6:00 PM");

    }
}
