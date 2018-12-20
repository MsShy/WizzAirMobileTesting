import modal_windows.NotifactionWindow;
import models.Country;
import org.testng.annotations.Test;


public class NewSearchButtonFunctionality extends BaseTest {


	@Test(description = "verify new search button functionality to clear field")
	void testBooking() {


		new NotifactionWindow()
				.setNotifactionsOptions()
				.goToMenu()
				.searchFlights()
				.selectLeavingFrom(Country.KYIV)
				.selectGoingTo(Country.WROCLAW)
				.selectNewSearch()
				.verifyDefaultStateDepartureCountryField()
				.verifyDefaultStateArrivalCountryField();


	}


}


