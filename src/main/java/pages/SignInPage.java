package pages;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SignInPage extends BasePage  {

	@AndroidFindBy(xpath = "//android.widget.TextView [ @index='1']")
	private AndroidElement titleSignIn;

	@AndroidFindBy(id = "com.wizzair.WizzAirApp:id/login_email")
	private AndroidElement emailField;

	@AndroidFindBy(id = "com.wizzair.WizzAirApp:id/login_password")
	private AndroidElement passwordField;

	@AndroidFindBy(id = "com.wizzair.WizzAirApp:id/btn_login")
	private AndroidElement buttonSignIn;

	public SignInPage() {
		super();
	}

	public AndroidElement getTitleSignIn() {
		return titleSignIn;
	}

	public AndroidElement getEmailField() {
		return emailField;
	}

	public AndroidElement getPasswordField() {
		return passwordField;
	}

	public AndroidElement getButtonSignIn() {
		return buttonSignIn;
	}
}
