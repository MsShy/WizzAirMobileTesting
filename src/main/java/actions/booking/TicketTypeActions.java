package actions.booking;

import models.TypeOfTicket;
import org.apache.commons.lang3.arch.Processor;
import org.openqa.selenium.By;
import actions.BasePageActions;
import actions.SignInPageActions;
import pages.booking.TicketType;

public class TicketTypeActions extends BasePageActions {


	private TicketType ticketType= new TicketType();

	//0 5 15 index prices

	public TicketSelectionPageActions selectOutboundTicket(TypeOfTicket type) {


		waitVisible(ticketType.getTicketButton(type)).click();

		return new TicketSelectionPageActions();
	}

	public TicketSelectionPageActions selectInboundTicketForLogged(TypeOfTicket type) {

		waitVisible(ticketType.getTicketButton(type)).click();

		return new TicketSelectionPageActions();
	}

	public SignInPageActions selectInboundTicketNotLogged(TypeOfTicket type) {

		waitVisible(ticketType.getTicketButton(type)).click();

		return new SignInPageActions();
	}

}
