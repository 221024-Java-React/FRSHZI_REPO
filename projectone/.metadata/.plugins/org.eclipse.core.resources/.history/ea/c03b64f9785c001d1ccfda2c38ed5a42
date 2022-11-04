package Service;

import java.util.List;

import DAO.ITicketDAO;
import Model.Ticket;

public class TicketService{
ITicketDAO iTicketDAO;


	public TicketService(ITicketDAO iTicketDAO) {
	super();
	this.iTicketDAO = iTicketDAO;
}

	public List<Ticket> getTicketsBYFilter(String filter) {
		// TODO Auto-generated method stub
		return iTicketDAO.getTicketsBYFilter(filter);
	}

	public boolean submitNewTicketByEmloyee(Ticket ticket) {
		// TODO Auto-generated method stub
		return iTicketDAO.submitNewTicketByEmloyee(ticket);
	}

	public List<Ticket> getPendingTickets() {
		// TODO Auto-generated method stub
		return iTicketDAO.getPendingTickets();
	}

	public List<Ticket> viewTicketHistory(int employeeID) {
		// TODO Auto-generated method stub
		return iTicketDAO.viewTicketHistory(employeeID);
	}

	public boolean processPendingTicket(Ticket ticket) {
		// TODO Auto-generated method stub
		return iTicketDAO.processPendingTicket(ticket);
	}

}
