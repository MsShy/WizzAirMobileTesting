package actions;


import actions.booking.SearchFlightsPageActions;
import pages.MainPage;


public class MainPageActions extends BasePageActions {



	private MainPage mainPage = new MainPage();


	public MenuActions goToMenu() {
		mainPage.getNavigationButton().click();
		return new MenuActions();
	}





}
