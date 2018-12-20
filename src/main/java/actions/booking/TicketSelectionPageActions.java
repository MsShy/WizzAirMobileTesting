package actions.booking;

import actions.BasePageActions;
import pages.booking.TicketSelectionPage;

public class TicketSelectionPageActions extends BasePageActions {



	private TicketSelectionPage ticketSelectionPage=new TicketSelectionPage();

	public TicketTypeActions selectTickets() {

		ticketSelectionPage.getPriceButton().click();



		return new TicketTypeActions();
	}


}
