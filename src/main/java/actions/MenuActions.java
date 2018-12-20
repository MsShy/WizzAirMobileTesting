package actions;

import org.openqa.selenium.By;
import actions.booking.SearchFlightsPageActions;
import pages.Menu;

public class MenuActions extends BasePageActions {

	Menu  menu =new Menu();

	public MainPageActions selectLanguage(String language)  {

		waitClickable(menu.getLanguageElement()).click();
		waitClickable(By.id("//android.widget.TextView[contains(text(),‘"+language+"’)]")).click();
		return  new MainPageActions();
	}



	public SearchFlightsPageActions searchFlights()  {

		waitClickable(menu.getSearchFlightsButton()).click();

		return new SearchFlightsPageActions();
}

}
