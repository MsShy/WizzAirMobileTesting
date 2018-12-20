package pages.booking;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import pages.BasePage;

public class TicketSelectionPage extends BasePage {


	@AndroidFindBy(id = "com.wizzair.WizzAirApp:id/flight_select_journey_normal_price")
	private AndroidElement priceButton;

	@AndroidFindBy(id = "com.wizzair.WizzAirApp:id/flight_select_bottom_sheet_total_price")
	private AndroidElement totalPrice;


	public TicketSelectionPage() {
		super();
	}

	public AndroidElement getPriceButton() {
		return priceButton;
	}

	public AndroidElement getTotalPrice() {
		return totalPrice;
	}
}
