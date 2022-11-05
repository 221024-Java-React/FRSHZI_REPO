package Utils;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Model.Person;
import Model.Ticket;
import Model.TicketStatus;
import Model.TicketType;

public class Helper {

	private static Person person;

	public static Person getPerson() {
		return person;
	}

	public static void setPerson(Person person) {
		Helper.person = person;
	}
	
	
	public static List<Ticket> populateTickets(ResultSet result) throws SQLException {
		List<Ticket> tickets = new ArrayList<>();
		while (result.next()) {
			Ticket ticket = new Ticket();
			ticket = new Ticket();
			ticket.setID(result.getInt(1));
			ticket.setAmount(result.getDouble(2));
			ticket.setDescription(result.getString(3));
			ticket.setEmployee_id(result.getInt(4));
			if (result.getInt(5) == 1)
				ticket.setStatus(TicketStatus.PENDING);
			else if (result.getInt(5) == 2)
				ticket.setStatus(TicketStatus.APPROVED);
			else
				ticket.setStatus(TicketStatus.DENIED);
			if (result.getInt(6) == 1)
				ticket.setType(TicketType.TRAVEL);
			else if (result.getInt(6) == 2)
				ticket.setType(TicketType.LODGING);
			else if (result.getInt(6) == 3)
				ticket.setType(TicketType.FOOD);
			else
				ticket.setType(TicketType.OTHER);
			ticket.setReceipt_image(result.getString(7));
			ticket.setCreated_date(result.getTimestamp(8));
			tickets.add(ticket);
			System.out.println(ticket.toString());
			
		}
		return tickets;
	}

	
}
