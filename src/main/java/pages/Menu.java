package pages;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class Menu extends BasePage {

	@AndroidFindBy(id = "com.wizzair.WizzAirApp:id/design_menu_item_text")
	private AndroidElement languageElement;

	@AndroidFindBy(xpath = "//android.widget.CheckedTextView[contains(@text,'Book flights')]")
	private AndroidElement searchFlightsButton;



	public Menu() {
		super();
	}

	public AndroidElement getLanguageElement() {
		return languageElement;
	}

	public AndroidElement getSearchFlightsButton() {
		return searchFlightsButton;
	}
}
