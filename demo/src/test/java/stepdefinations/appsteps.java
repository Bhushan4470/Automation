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
	public void open_the_application_on_mobile_device() {
		try {
		Assert.assertTrue(driver.findElement(By.id("org.openintents.shopping:id/layout_choice_bottom")).isDisplayed());
		driver.findElement(By.xpath("//android.widget.RadioButton[@index='1']")).click();
	}catch (Exception e) {
		System.out.print("User is not able to click on layout selection");
	}
		
	}	

	@When("^click on second layout of the app$")
	public void click_on_second_layout_of_the_app() {
		try {
			driver.findElement(By.id("org.openintents.shopping:id/autocomplete_add_item")).sendKeys("Item1");
			driver.findElement(By.id("org.openintents.shopping:id/button_add_item")).click();
			
		}catch (Exception e) {
			System.out.println("User is not able to add items in shopping list");		}
	}

	@When("^click on main menu of the app$")
	public void click_on_main_menu_of_the_app() {
		try {
			driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\'Open navigation drawer\']")).click();
		}catch (Exception e) {
			System.out.println("User is not able to click on menu button");
		}
	   
	}

	@When("^click on add list$")
	public void click_on_add_list() {
	    try {
	    	driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().textContains(\"New list\")")).click();
	    	driver.findElement(By.id("android:id/alertTitle")).isDisplayed(); 
	    	driver.findElement(By.id("org.openintents.shopping:id/edittext")).sendKeys("Zebra");
	    	driver.findElement(By.id("android:id/button1")).click();
	    }catch (Exception e) {
			System.out.println("User is not able to add one list from the menu");
		}
	    
	}

	@When("^click on another add list$")
	public void click_on_another_add_list()  {
		try {
			driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\'Open navigation drawer\']")).click();
			driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().textContains(\"New list\")")).click();
	    	driver.findElement(By.id("android:id/alertTitle")).isDisplayed();
	    	driver.findElement(By.id("org.openintents.shopping:id/edittext")).clear();
	    	driver.findElement(By.id("org.openintents.shopping:id/edittext")).sendKeys("Cat");
	    	driver.findElement(By.id("android:id/button1")).click();
			
		}
	   catch (Exception e) {
		System.out.println("User is not able to add second list from the menu");	
		}
	}

	@Then("^select and delete one list$")
	public void select_and_delete_one_list()  {
		try {
			driver.findElement(By.id("org.openintents.shopping:id/autocomplete_add_item")).sendKeys("Item1");
			driver.findElement(By.id("org.openintents.shopping:id/button_add_item")).click();
			driver.findElement(By.id("org.openintents.shopping:id/autocomplete_add_item")).sendKeys("Item2");
			driver.findElement(By.id("org.openintents.shopping:id/button_add_item")).click();
			driver.findElement(By.id("org.openintents.shopping:id/autocomplete_add_item")).sendKeys("Item3");
			driver.findElement(By.id("org.openintents.shopping:id/button_add_item")).click();
			
			if(!driver.findElement(By.id("org.openintents.shopping:id/check")).isSelected()==true) {
			driver.findElement(By.id("org.openintents.shopping:id/check")).click();
			}
			
			driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\'More options\']")).click();
			driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().textContains(\"Delete list\")")).click();
			if(!driver.findElement(By.id("android:id/alertTitle")).isDisplayed()==true) {
				driver.findElement(By.id("android:id/button1")).click();
				}
			
		}catch (Exception e) {
			System.out.println("User is not able to delete item from the list");
			}
	    
	}
	
	
	@Then("^click on setting and sort the list created$")
	public void click_on_setting_and_sort_the_list_created() {
		try {
			driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\'More options\']")).click();
			driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().textContains(\"Settings\")")).click();
			driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().textContains(\"Sort order\")")).click();
			driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().textContains(\"alphabetical\")")).click();
			driver.navigate().back();
			driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\'Open navigation drawer\']")).click();
		}catch (Exception e) {
			System.out.println("User is not able to sort the item");		}
	}




}

