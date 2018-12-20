package pages;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utils.DriverManager;

import java.time.Duration;

public abstract class BasePage {


	protected WebDriver driver= DriverManager.getDriver();
	private int defaultLook = 30; //default look for elements
	private int fastLook = 7; // wait for 7 sec

	public BasePage( ) {
		setDefaultTiming();
	}

	public void setDefaultTiming() {
		PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(defaultLook)), this);
	}


}

