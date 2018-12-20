import modal_windows.NotifactionWindow;
import models.Country;
import org.testng.annotations.Test;


public class SwapCountriesFunctionality extends BaseTest {

	@Test(description = "verify swap button functionality to swap fields")
	void testBooking() {

		new NotifactionWindow()
				.setNotifactionsOptions()
				.goToMenu()
				.searchFlights()
				.selectLeavingFrom(Country.KYIV)
				.selectGoingTo(Country.WROCLAW)
				.swapCountries()
				.verifyDepartureCountry(Country.WROCLAW)
				.verifyArrivalCountry(Country.KYIV);


	}


}
