import modal_windows.NotifactionWindow;
import models.Country;
import models.Flight;
import models.Month;
import models.TypeOfTicket;
import org.testng.annotations.*;
import actions.MainPageActions;
import utils.DriverManager;

import java.net.MalformedURLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BookingTestForNotLogged extends BaseTest {


	@Test(description = "test verify functionality of buking for not logged users, redirect to sign in page")
	void testBooking() {

		Flight flight = new Flight(Country.KYIV, Country.WROCLAW, Month.DECEMBER, 26, Month.DECEMBER, 28);


		new NotifactionWindow()
				.setNotifactionsOptions()
				.goToMenu()
				.searchFlights()
				.typeSarchingFlightData(flight)
				.searchFlights()
				.selectTickets()
				.selectOutboundTicket(TypeOfTicket.BASIC)
				.selectTickets()
				.selectInboundTicketNotLogged(TypeOfTicket.BASIC)
				.verifyTitleSignIn();


	}
}
