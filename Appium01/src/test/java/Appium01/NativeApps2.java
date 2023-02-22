package Appium01;

import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;

public class NativeApps2 {
	AndroidDriver<WebElement> driver;
	@BeforeClass
	public void beforeClass() throws MalformedURLException, InterruptedException {
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
		dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "io.appium.android.apis");
		dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "io.appium.android.apis.ApiDemos");
		driver = new AndroidDriver<>(new URL("http://0.0.0.0:4723/wd/hub"),dc);
		Thread.sleep(2000);
	  }

  @Test
  public void test1() throws InterruptedException {
	  System.out.println("Second native app automation");
	  Thread.sleep(2000);
	  driver.findElement(MobileBy.AccessibilityId("Animation")).click();
	  Thread.sleep(2000);
	  driver.navigate().back();
	  Thread.sleep(2000);
	  driver.openNotifications();
	  driver.findElement(MobileBy.AccessibilityId("Battery Saver")).click();
	  driver.navigate().back();
	  Thread.sleep(2000);
	  
	  
	  //driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Reversing\")")).click();
	  //driver.navigate().back();
	  
  }
  
  
}
