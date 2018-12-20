package pages.booking;


import models.TypeOfTicket;
import org.openqa.selenium.By;
import pages.BasePage;

public class TicketType extends BasePage {


	//0 5 15 index prices


	public TicketType() {
		super();
	}


	public By getTicketButton(TypeOfTicket type) {
		return By.xpath("//android.widget.LinearLayout[contains(@resource-id, " +
				"'com.wizzair.WizzAirApp:id/flight_select_fare_card_fare_colored_button_container') " +
				"and @index='"+type.getValue()+"']");
	}




}
