package Service;

import java.util.List;

import DAO.ITicketDAO;
import Model.Ticket;

public class TicketServiceFactory {

	static TicketService createTicketService(ITicketDAO iTicketDAO)
	{
		
		return new TicketService(iTicketDAO);
	}
}
