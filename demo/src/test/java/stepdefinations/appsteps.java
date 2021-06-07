package stepdefinations;


import org.junit.Assert;
import org.openqa.selenium.By;

import Hooks.hook;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class appsteps {
	
	private AndroidDriver<MobileElement> driver;
	
	 public appsteps() {
		this.driver=hook.getDriver();
	}
	
	
	
	 @Given("^open the application on mobile device$")
	 public void open_the_application_on_mobile_device() throws Throwable {
		 try {
			 //driver.findElementByName("Close").click();
			 driver.findElement(By.xpath("//android.widget.ImageView[@resource-id='uk.co.condenast.tatler:id/slideshow_close']")).click();
			 Thread.sleep(5000);
				Assert.assertTrue(driver.findElement(By.xpath("//android.widget.TextView[@text=‘ALL ISSUES’]")).isDisplayed());
				Assert.assertTrue(driver.findElement(By.xpath("//android.widget.TextView[@text=‘DOWNLOADED’]")).isDisplayed());
			}catch (Exception e) {
				System.out.print("User is not able to navigate on home screen");
			}

	 }

	 @When("^click on more option of the app$")
	 public void click_on_more_option_of_the_app() throws Throwable {
		 try {
			 driver.findElement(By.xpath("//android.widget.TextView[@text=‘More options’]")).isDisplayed();
			 driver.findElement(By.xpath("//android.widget.TextView[@text=‘More options’]")).click();
			}catch (Exception e) {
				System.out.println("User is not able to click on menu button");
			}
	 }

	 @When("^click on Scrapbook of the app$")
	 public void click_on_Scrapbook_of_the_app() throws Throwable {
		 try {
			 driver.findElement(By.xpath("//android.widget.TextView[@text=‘Scrapbook’]")).isDisplayed();
			 driver.findElement(By.xpath("//android.widget.TextView[@text=‘Scrapbook’]")).click();
			}catch (Exception e) {
				System.out.println("User is not able to click on scrapbook button");
			}
	 }

	 @When("^click on Home icon$")
	 public void click_on_Home_icon() throws Throwable {
		 try {
			 driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc='Home']")).click();
			}catch (Exception e) {
				System.out.println("User is not able to click on Home icon button");
			}
	 }

	 @When("^click on Account of the app$")
	 public void click_on_Account_of_the_app() throws Throwable {
		 try {
			 driver.findElement(By.xpath("//android.widget.TextView[@text=‘Account’]")).isDisplayed();
			 driver.findElement(By.xpath("//android.widget.TextView[@text=‘Account’]")).click();
			}catch (Exception e) {
				System.out.println("User is not able to click on Account button");
			}
	 }
	 
	 @When("^click on Setting of the app$")
	 public void click_on_Setting_of_the_app() throws Throwable {
		 try {
			 driver.findElement(By.xpath("//android.widget.TextView[@text=‘Settings’]")).isDisplayed();
			 driver.findElement(By.xpath("//android.widget.TextView[@text=‘Settings’]")).click();
			}catch (Exception e) {
				System.out.println("User is not able to click on Setting menu button");
			}
	 }
	 
	 @When("^click on BackButton icon$")
	 public void click_on_BackButton_icon() throws Throwable {
		 try {
			 driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc='Back']")).click();
			}catch (Exception e) {
				System.out.println("User is not able to click on Back button");
			}
	 }




}

