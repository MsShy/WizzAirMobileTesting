package actions;

import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.DriverManager;

import java.util.logging.Level;
import java.util.logging.Logger;

public class BasePageActions {


	protected static final Logger LOGGER = Logger.getLogger(BasePageActions.class.getName());
	protected Level level = Level.INFO;


	protected WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), 30);

	protected AndroidElement waitClickable(By element) {
		return (AndroidElement)wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	protected AndroidElement waitVisible(By element) {
		return (AndroidElement)wait.until(ExpectedConditions.visibilityOfElementLocated(element));
	}

	protected AndroidElement waitClickable(WebElement element) {
		return (AndroidElement)wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	protected String getText(AndroidElement element) {
		return wait.until(ExpectedConditions.elementToBeClickable(element)).getText();
	}

	protected void fillField(AndroidElement element, String value) {//todo

		element.sendKeys(value);
		DriverManager.getDriver().hideKeyboard();
	}



}
