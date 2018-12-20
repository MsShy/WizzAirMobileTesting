package pages;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class MainPage extends BasePage {



	@AndroidFindBy(className = "android.widget.ImageButton")
	private AndroidElement navigationButton;



	public MainPage() {
		super();
	}

	public AndroidElement getNavigationButton() {
		return navigationButton;
	}


}
