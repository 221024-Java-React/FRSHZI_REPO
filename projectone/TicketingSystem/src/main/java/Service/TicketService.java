package Service;

import java.util.List;

import DAO.ITicketDAO;
import Model.Ticket;

public class TicketService {
	ITicketDAO iTicketDAO;

	public TicketService(ITicketDAO iTicketDAO) {
		super();
		this.iTicketDAO = iTicketDAO;
	}

	public List<Ticket> getTicketsBYType(int employee_id, int type) {
		// TODO Auto-generated method stub
		return iTicketDAO.getTicketsByType(employee_id, type);
	}

	public List<Ticket> getTicketsBYStatus(int employee_id, int status) {
		// TODO Auto-generated method stub
		return iTicketDAO.getTicketsByStatus(employee_id, status);
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

	public List<Ticket> processPendingTickets() {
		// TODO Auto-generated method stub
		return iTicketDAO.processPendingTickets();
	}

}
