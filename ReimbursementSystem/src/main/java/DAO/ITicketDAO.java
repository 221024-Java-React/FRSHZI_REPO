package DAO;

import java.util.List;

import Model.Ticket;

public interface ITicketDAO {

	int createTicketByEmployee(Ticket ticket);
	
	int processTicketByEmployer(Ticket ticket);
	
	List<Ticket> viewPreviousTicketsByEmployee(int employeeID);
	
	
}
