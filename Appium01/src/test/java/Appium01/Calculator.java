package Appium01;

import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;

public class Calculator {
	AndroidDriver<WebElement> driver;
	
	@BeforeClass
	  public void beforeClass() throws MalformedURLException, InterruptedException {
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
		dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.android.calculator2");
		dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.android.calculator2.Calculator");
		driver = new AndroidDriver<>(new URL("http://0.0.0.0:4723/wd/hub"),dc);
		Thread.sleep(2000);
	  }
	
	
  @Test
  public void test1() throws InterruptedException {
	  System.out.println("Calculator is accessable");
	  driver.findElement(MobileBy.id("com.android.calculator2:id/digit_4")).click();
	  driver.findElement(MobileBy.id("com.android.calculator2:id/digit_5")).click();
	  driver.findElement(MobileBy.AccessibilityId("plus")).click();
	  driver.findElement(MobileBy.id("com.android.calculator2:id/digit_9")).click();
	  driver.findElement(MobileBy.AccessibilityId("equals")).click();
	  Thread.sleep(4000);
	  driver.findElement(MobileBy.AccessibilityId("clear")).click();
	  driver.navigate().back();
	  Thread.sleep(4000);
  
	  /*driver.findElement(MobileBy.AccessibilityId("key pad")).click();
		driver.findElement(MobileBy.AccessibilityId("7,PQRS")).click();
		driver.findElement(MobileBy.AccessibilityId("8,TUV")).click();
		driver.findElement(MobileBy.AccessibilityId("2,ABC")).click();
		driver.findElement(MobileBy.AccessibilityId("9,WXYZ")).click();
		driver.findElement(MobileBy.AccessibilityId("7,PQRS")).click();
		driver.findElement(MobileBy.AccessibilityId("2,ABC")).click();
		driver.findElement(MobileBy.AccessibilityId("6,MNO")).click();
		driver.findElement(MobileBy.AccessibilityId("8,TUV")).click();
		driver.findElement(MobileBy.AccessibilityId("4,GHI")).click();
		driver.findElement(MobileBy.AccessibilityId("6,MNO")).click();
		Thread.sleep(2000);
		driver.findElement(MobileBy.AccessibilityId("dial")).click();
		WebElement we = driver.findElement(MobileBy.AccessibilityId("0,+"));
		AndroidTouchAction act = new AndroidTouchAction(driver);
		act.longPress(LongPressOptions.longPressOptions().withElement(ElementOption.element(we))).perform();
		System.out.println("Longpress Tapped");
		TouchAction act = new TouchAction(driver);
		act.longPress(LongPressOptions.longPressOptions().withElement(ElementOption.element(we))).release().perform(); */
  }
  

}
