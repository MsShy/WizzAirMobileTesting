package utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import actions.BasePageActions;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DriverManager {

	protected static final Logger LOGGER = Logger.getLogger(BasePageActions.class.getName());
	protected static Level level = Level.INFO;

	private static AppiumDriver driver;


	private DriverManager() {

	}




	public static AppiumDriver setDriver() throws MalformedURLException {

		DesiredCapabilities caps = new DesiredCapabilities();

		caps.setPlatform(Platform.ANDROID);
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "4.4.4");
		caps.setCapability("appPackage","com.wizzair.WizzAirApp");
		 caps.setCapability("appActivity", "com.wizzair.app.MainActivity");

		caps.setCapability("deviceName","30045c7135029200");

		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),caps);


		if(!driver.isAppInstalled("com.wizzair.WizzAirApp")) {
			LOGGER.log(level, "app is NOT installed...process run..");
			caps.setCapability(MobileCapabilityType.APP, new File("src\\main\\resources\\wizzair.apk").getPath());

		} else
		{
			LOGGER.log(level, "app is installed");
		}
		return driver;
	}

	public static AppiumDriver getDriver() {
		if(driver != null){
			return driver;
		}

		throw new IllegalStateException("WebBrowser is not initialized");
	}
}
