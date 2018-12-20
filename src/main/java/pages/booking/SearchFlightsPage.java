package pages.booking;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import models.Country;
import models.Month;

import org.openqa.selenium.By;
import pages.BasePage;

import java.util.List;

public class SearchFlightsPage extends BasePage {


	@AndroidFindBy(id = "com.wizzair.WizzAirApp:id/homescreen_pick_departure_station_btn")
	private AndroidElement departureButton;

	@AndroidFindBy(id = "com.wizzair.WizzAirApp:id/homescreen_pick_arrival_station_btn")
	private AndroidElement arrivalButton;

	@AndroidFindBy(id = "com.wizzair.WizzAirApp:id/airport_list_searchbar")
	private AndroidElement searchBarField;

	@AndroidFindBy(id = "com.wizzair.WizzAirApp:id/btn_new_search")
	private AndroidElement newSearchButton;

	@AndroidFindBy(id = "com.wizzair.WizzAirApp:id/btn_search")
	private AndroidElement searchFlightsButton;

	@AndroidFindBy(id = "com.wizzair.WizzAirApp:id/home_date_picker")
	private AndroidElement datesButton;

	@AndroidFindBy(id = "com.wizzair.WizzAirApp:id/search_fragment_switch_stations")
	private AndroidElement swapCountriesButton;

	@AndroidFindBy(id = "com.wizzair.WizzAirApp:id/departure_name")
	private AndroidElement departureCountryText;

	@AndroidFindBy(id = "com.wizzair.WizzAirApp:id/arrival_name")
	private AndroidElement arrivalCountryText;

	@AndroidFindBy(id = "com.wizzair.WizzAirApp:id/btn_select_date")
	private AndroidElement submitDates;

	public AndroidElement getSubmitDates() {
		return submitDates;
	}

	public SearchFlightsPage() {
		super();
	}


	public AndroidElement getDepartureButton() {
		return departureButton;
	}

	public AndroidElement getArrivalButton() {
		return arrivalButton;
	}

	public AndroidElement getSearchBarField() {
		return searchBarField;
	}

	public AndroidElement getNewSearchButton() {
		return newSearchButton;
	}

	public AndroidElement getSearchFlightsButton() {
		return searchFlightsButton;
	}

	public AndroidElement getDatesButton() {
		return datesButton;
	}

	public AndroidElement getSwapCountriesButton() {
		return swapCountriesButton;
	}

	public AndroidElement getDepartureCountryText() {
		return departureCountryText;
	}

	public AndroidElement getArrivalCountryText() {
		return arrivalCountryText;
	}

	public By getCountryElement(Country country) {

		//MobileBy.xpath("//android.widget.TextView[contains(@text,'" + country.getValue() + "')]");
		return By.xpath("//android.widget.TextView[contains(@text,'" + country.getValue() + "')]");
	}


	public List<AndroidElement> getdates(Month month) {


		List<AndroidElement> elements = driver.findElements(MobileBy.className("android.widget.TextView"));


		int indexFirst = 0;
		int indexLast = 0;
		for (AndroidElement text : elements) {

			if (text.getText().contains(month.getMonth())) {
				indexFirst = elements.indexOf(text) + 8;
			}

			if (text.getText().contains(month.getMonthByCode(month.getCode() + 1))) {

				indexLast = elements.indexOf(text);
			}

		}

		List<AndroidElement> datesOfMonth = elements.subList(indexFirst, indexLast);

		return datesOfMonth;


	}

}
