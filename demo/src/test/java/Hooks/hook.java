package Hooks;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class hook {	
		
		private static AndroidDriver<MobileElement> driver;
		
		@Before
		public void setUp() throws MalformedURLException
		{
			DesiredCapabilities caps = new DesiredCapabilities();
			caps.setCapability("deviceName","emulator-5554");
			caps.setCapability("platformVersion","11");
			caps.setCapability("platformName","Android");
			caps.setCapability("app","Users/nagabhushan/Downloads/tatler_1.3.137.apk");
			caps.setCapability("automationName","UIAutomator2");
			caps.setCapability("appActivity","com.kaldorgroup.pugpig.products.AppViewController");
			caps.setCapability("appPackage","uk.co.condenast.tatler");
			caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "60");
			driver=new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"),caps);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		
		@After
		public void teardown()
		{
			driver.quit();
		}
		
		public static AndroidDriver<MobileElement> getDriver()
		{
			return driver;
		}
		

	}




