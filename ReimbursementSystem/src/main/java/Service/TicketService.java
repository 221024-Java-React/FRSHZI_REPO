package Service;

import java.util.List;

import Model.Ticket;

public class TicketService implements ITicketService{

	@Override
	public List<Ticket> getTicketsBYFilter(String filter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean submitNewTicketByEmloyee(Ticket ticket) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Ticket> getPendingTickets() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Ticket> viewTicketHistory(int employeeID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean processPendingTicket(Ticket ticket) {
		// TODO Auto-generated method stub
		return false;
	}

}
