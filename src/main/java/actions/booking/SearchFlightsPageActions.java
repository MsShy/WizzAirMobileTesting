package actions.booking;

import io.appium.java_client.android.AndroidElement;
import models.Country;
import models.Flight;
import models.Month;
import actions.BasePageActions;
import pages.booking.SearchFlightsPage;
import utils.DriverManager;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class SearchFlightsPageActions extends BasePageActions {

	private SearchFlightsPage searchFlightsPage = new SearchFlightsPage();


	public SearchFlightsPageActions selectNewSearch() {

		searchFlightsPage.getNewSearchButton().click();
		return this;
	}

	public SearchFlightsPageActions selectLeavingFrom(Country country) {

		searchFlightsPage.getDepartureButton().click();
		searchFlightsPage.getSearchBarField().click();// visible
		fillField(searchFlightsPage.getSearchBarField(), country.getValue());
		waitClickable(searchFlightsPage.getCountryElement(country)).click();


		return this;
	}

	public SearchFlightsPageActions selectGoingTo(Country country) {

		searchFlightsPage.getArrivalButton().click();
		searchFlightsPage.getSearchBarField().click(); // visible
		fillField(searchFlightsPage.getSearchBarField(), country.getValue());
		waitClickable(searchFlightsPage.getCountryElement(country)).click();

		return this;
	}


	public SearchFlightsPageActions swapCountries() {

		searchFlightsPage.getSwapCountriesButton().click();

		return this;
	}

	public TicketSelectionPageActions searchFlights() {

		searchFlightsPage.getSearchFlightsButton().click();

		return new TicketSelectionPageActions();
	}


	public SearchFlightsPageActions selectDates() {//String month, int date

		searchFlightsPage.getDatesButton().click();

		selectDate(Month.DECEMBER,26);
		selectDate(Month.DECEMBER,28);

		searchFlightsPage.getSubmitDates().click();

	/*	List<WebElement> dates=searchFlightsPage.getdates(Month.DECEMBER);
		for (WebElement date : dates) {

			LOGGER.log(level, "date"+date.getText());
		}

		waitVisible(By.xpath("//android.widget.TextView[@text='17' and @index='0']")).click();


		DriverManager.getDriver().findElementByXPath("//android.widget.TextView[@text='21' and @index='4']").click();
		waitClickable(By.id("com.wizzair.WizzAirApp:id/btn_select_date")).click();


*/
		return this;
	}


	public SearchFlightsPageActions selectDate(Month month, int date) {//String month, int date


		List<AndroidElement> dates=searchFlightsPage.getdates(month);
		for (AndroidElement dat : dates) {
			if(dat.getText().contains(Integer.toString(date))) {
				LOGGER.log(level, "date" + dat.getText());
				dat.click();
			}
		}

		//LOGGER.log(level, "month have to Januar"+month.getMonthByCode(month.getCode()+1));


/*

		List<WebElement> dat=searchFlightsPage.getdates(Month.DECEMBER);
		for (WebElement da : dat) {

			LOGGER.log(level, "dates"+da.getText());
		}
*/



		return this;
	}



	public SearchFlightsPageActions typeSarchingFlightData(Flight flight) {

		selectLeavingFrom(flight.getDepartureCountry());
		selectGoingTo(flight.getArrivalCountry());
		searchFlightsPage.getDatesButton().click();
		selectDate(flight.getDepartureMonth(),flight.getDepartureDate());
		selectDate(flight.getArrivalMonth(),flight.getArrivalDate());
		searchFlightsPage.getSubmitDates().click();

		return this;
	}


	public SearchFlightsPageActions verifyDepartureCountry(Country expectText) {

		String actualText = getText(searchFlightsPage.getDepartureCountryText());
		assertTrue(actualText.contains(expectText.getValue()), "Not equals countries");
		return this;
	}

	public SearchFlightsPageActions verifyArrivalCountry(Country expectText) {

		String actualText = getText(searchFlightsPage.getArrivalCountryText());
		assertTrue(actualText.contains(expectText.getValue()), "Not equals countries");
		return this;
	}

	public SearchFlightsPageActions verifyDefaultStateDepartureCountryField( ) {

		String actualText = getText(searchFlightsPage.getDepartureCountryText());
		assertEquals(actualText,"Leaving from", "Not cleaned arrival field");
		return this;
	}

	public SearchFlightsPageActions verifyDefaultStateArrivalCountryField( ) {

		String actualText = getText(searchFlightsPage.getArrivalCountryText());
		assertEquals(actualText,"Going to", "Not cleaned arrival field");
		return this;
	}





}
