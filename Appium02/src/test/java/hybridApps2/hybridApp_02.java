package hybridApps2;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;


public class hybridApp_02 extends Capabilities_02{
	AndroidDriver<AndroidElement> driver;
	
  @Test (enabled = false)
  public void signIn_joinClass_SignOut() throws MalformedURLException, InterruptedException {
	  driver = cap();
	  System.out.println("Right Code");
	  WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.Button"))).click();
		Thread.sleep(2000);
		driver.findElements(MobileBy.className("android.widget.Button")).get(5).click();
		Thread.sleep(2000);
		driver.findElement(MobileBy.AccessibilityId("Sign in with Google")).click();
		Thread.sleep(3000);
		WebDriverWait wait1 = new WebDriverWait(driver,10);
		wait1.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(MobileBy.className("android.widget.LinearLayout"))).get(1).click();
		Thread.sleep(4000);
		System.out.println("Signed in");
		Thread.sleep(4000);
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Join class\")")).click();
		wait1.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//android.widget.Button[@content-desc=\"Dismiss\"]/android.widget.ImageView"))).click();
		driver.findElement(MobileBy.xpath("//android.widget.ImageView[@content-desc=\"Settings\"]")).click();
		  Thread.sleep(4000);
		  driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Sign out\"))").click();
		  wait1.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.id("android:id/button1"))).click();
		  Thread.sleep(3000);
		  System.out.println("Logged out");
		  Thread.sleep(3000);
		  driver.navigate().back();
  }
  
  @Test (enabled = false)
  public void KhanAcademyKids() throws MalformedURLException, InterruptedException {
	  driver = cap();
	  System.out.println("Right Code");
	  WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.Button"))).click();
		Thread.sleep(2000);
		driver.findElements(MobileBy.className("android.widget.Button")).get(5).click();
		Thread.sleep(2000);
		driver.findElement(MobileBy.AccessibilityId("Sign in with Google")).click();
		Thread.sleep(3000);
		WebDriverWait wait1 = new WebDriverWait(driver,10);
		wait1.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(MobileBy.className("android.widget.LinearLayout"))).get(1).click();
		Thread.sleep(4000);
		System.out.println("Signed in");
		Thread.sleep(4000);
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(text(\"Download now\"))")).click();
		//driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().srollable(true).scrollIntoView(text(\"Download now\"))");
		//wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.Button[2]"))).click();
		//Thread.sleep(2000);
		Thread.sleep(4000);
		System.out.println("Download Khan Academy for Kids");
	  
  }
  
  @Test (enabled = true)
  public void Search() throws InterruptedException, IOException {
	  driver = cap();
	  System.out.println("Right Code");
	  Thread.sleep(3000);
	  driver.findElement(MobileBy.id("org.khanacademy.android:id/tab_bar_button_search")).click();//search bar
	  Thread.sleep(3000);
	  driver.findElement(MobileBy.className("android.widget.EditText")).sendKeys("Math");
	  Thread.sleep(3000);
	  System.out.println("Searching Math content");
	  //driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"What is a computer?\")")).click();
	  Thread.sleep(1000);
	  //Screenshot
	  //driver.pressKey(new KeyEvent(AndroidKey.VOLUME_DOWN).withKey(AndroidKey.POWER));
	  File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scr,new File("C:/Users/91984/AppData/Local/Temp/screenshot.png"));//clicking screenshot
  }
		
  }
