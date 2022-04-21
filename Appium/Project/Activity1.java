package activities;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Activity1 {
    AndroidDriver<MobileElement> driver;

    @BeforeClass
    public void initialize() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "Pixel 8 API128");
        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("appPackage", "com.google.android.apps.tasks");
        caps.setCapability("appActivity", ".ui.TaskListsActivity");
        caps.setCapability("noReset", true);

        URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
        driver = new AndroidDriver<>(appServer, caps);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void tasks(){

        String addIcon = "resourceId(\"com.google.android.apps.tasks:id/tasks_fab\")";
        driver.findElement(MobileBy.AndroidUIAutomator(addIcon)).click();

        MobileElement task1 = driver.findElement(MobileBy.id("add_task_title"));
        task1.sendKeys("Complete Activity with Google Tasks");

        String save = "resourceId(\"com.google.android.apps.tasks:id/add_task_done\")";
        driver.findElement(MobileBy.AndroidUIAutomator(save)).click();

        String firstText = driver.findElement(MobileBy.xpath("//android.widget.TextView[@text='Complete Activity with Google Tasks']")).getText();
        System.out.println(firstText);

        driver.findElement(MobileBy.AndroidUIAutomator(addIcon)).click();

        MobileElement task2 = driver.findElement(MobileBy.id("add_task_title"));
        task2.sendKeys("Complete Activity with Google Keep");

        driver.findElement(MobileBy.AndroidUIAutomator(save)).click();

        String SecondText = driver.findElement(MobileBy.xpath("//android.widget.TextView[@text='Complete Activity with Google Keep']")).getText();
        System.out.println(SecondText);

        driver.findElement(MobileBy.AndroidUIAutomator(addIcon)).click();

        MobileElement task3 = driver.findElement(MobileBy.id("add_task_title"));
        task3.sendKeys("Complete the second Activity Google Keep");

        driver.findElement(MobileBy.AndroidUIAutomator(save)).click();

        String ThirdText = driver.findElement(MobileBy.xpath("//android.widget.TextView[@text='Complete the second Activity Google Keep']")).getText();
        System.out.println(ThirdText);

        String expectedFirstTask = "Complete Activity with Google Tasks";
        String expectedSecondTask = "Complete Activity with Google Keep";
        String expectedThirdTask = "Complete the second Activity Google Keep";

        Assert.assertEquals(expectedFirstTask ,firstText);
        Assert.assertEquals(expectedSecondTask,SecondText);
        Assert.assertEquals(expectedThirdTask,ThirdText);
    }
}
