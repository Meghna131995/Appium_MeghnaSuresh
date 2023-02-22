package Appium01;

import java.net.MalformedURLException;
import java.net.URL;

import org.aspectj.runtime.internal.cflowstack.ThreadCounter;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Sleeper;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class MobileTesting01 {
	
	AndroidDriver<WebElement> driver;
	
	@BeforeTest
	public void beforeTest() throws MalformedURLException
	{
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		dc.setCapability(AndroidMobileCapabilityType.CHROMEDRIVER_EXECUTABLE, "C:\\Users\\91984\\eclipse-workspace\\Appium01\\chromedriver.exe");
		driver = new AndroidDriver<>(new URL("http://0.0.0.0:4723/wd/hub"),dc);
	}
	
  @Test
  public void demo() throws InterruptedException {
	  driver.get("https://www.google.com");
	  driver.findElement(By.xpath("//*[@class='gLFyf']")).sendKeys("OrangeHRM Demo");
	  Actions act = new Actions(driver);
	  act.sendKeys(Keys.ENTER).build().perform();
	  Thread.sleep(2000);
	  driver.findElement(By.partialLinkText("OrangeHRM Demo.")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@name='username']")).sendKeys("Admin");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@name='password']")).sendKeys("admin123");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@class=\'oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\']")).click();
	
  }
}
