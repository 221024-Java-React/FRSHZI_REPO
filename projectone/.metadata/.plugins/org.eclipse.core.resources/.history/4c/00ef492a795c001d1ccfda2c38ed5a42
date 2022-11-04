package DAO;

import java.util.List;

import Model.Ticket;

public interface ITicketDAO {
	
    List<Ticket> getTicketsBYFilter(String filter);
	
	boolean submitNewTicketByEmloyee(Ticket ticket);
	
	List<Ticket> getPendingTickets();
	
	List<Ticket> viewTicketHistory(int employeeID);
	
	boolean processPendingTicket(Ticket ticket);

}