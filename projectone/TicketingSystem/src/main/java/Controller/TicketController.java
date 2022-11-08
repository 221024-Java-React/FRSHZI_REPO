package Controller;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;

import DAO.ITicketDAO;
import Exception.EmptyDescriptionException;
import Exception.InvalidAmountException;
import Model.Person;
import Model.Role;
import Model.Ticket;
import Model.TicketStatus;
import Service.TicketService;
import Service.TicketServiceFactory;
import Utils.Helper;
import io.javalin.http.Handler;

public class TicketController {

	ITicketDAO iTicketDAO;
	private ObjectMapper objectMapper;
	private TicketService ticketService;

	public TicketController(ITicketDAO iTicketDAO) {
		super();
		this.objectMapper = new ObjectMapper();
		this.iTicketDAO = iTicketDAO;
		ticketService = TicketServiceFactory.createTicketService(iTicketDAO);
	}

	public Handler handleSubmitTicket = (context) -> {
		if (Helper.getPerson() == null || Helper.getPerson().getRole() == Role.MANAGER) {
			System.out.println("You are not authorized to submit a ticket");
			context.status(401);
		}

		else {
			Ticket ticket = objectMapper.readValue(context.body(), Ticket.class);
			if (ticket.getAmount() <= 0) {
				context.status(400);
				throw new InvalidAmountException();

			} else if (ticket.getDescription().isEmpty()) {
				context.status(400);
				throw new EmptyDescriptionException();

			}
			ticket.setEmployee_id(Helper.getPerson().getID());
			LocalDateTime now = LocalDateTime.now();
			Timestamp timestamp = Timestamp.valueOf(now);
			ticket.setCreated_date(timestamp);
			ticketService.submitNewTicketByEmloyee(ticket);
			context.status(201);

			context.result(objectMapper.writeValueAsString(ticket));
		}
	};

	public Handler handleViewTicketHistory = (context) -> {
		if (Helper.getPerson() == null || Helper.getPerson().getRole() == Role.MANAGER) {
			System.out.println("You are not authorized to view tickets history");
			context.status(401);
		} else {

			List<Ticket> pList = ticketService.viewTicketHistory();
			context.status(200);
			context.result(objectMapper.writeValueAsString(pList));
		}
	};

	public Handler handleGetTicketsByType = (context) -> {
		if (Helper.getPerson() == null || Helper.getPerson().getRole() == Role.MANAGER) {
			System.out.println("You are not authorized to view tickets");
			context.status(401);
		} else {
			Map<String, String> body = objectMapper.readValue(context.body(), LinkedHashMap.class);
			List<Ticket> pList = ticketService.getTicketsBYType(body.get("type"));
			context.status(200);
			context.result(objectMapper.writeValueAsString(pList));
		}
	};

	public Handler handleGetTicketsByStatus = (context) -> {
		if (Helper.getPerson() == null || Helper.getPerson().getRole() == Role.MANAGER) {
			System.out.println("You are not authorized to view tickets");
			context.status(401);
		} else {
			Map<String, String> body = objectMapper.readValue(context.body(), LinkedHashMap.class);
			List<Ticket> pList = ticketService.getTicketsBYStatus(body.get("status"));
			context.status(200);
			context.result(objectMapper.writeValueAsString(pList));
		}
	};

	public Handler handleViewPendingTickets = (context) -> {
		if (Helper.getPerson() == null || Helper.getPerson().getRole() == Role.EMPLOYEE) {
			System.out.println("You are not authorized to view pending tickets");
			context.status(401);
		} else {
			List<Ticket> pList = ticketService.getPendingTickets();
			context.status(200);
			context.result(objectMapper.writeValueAsString(pList));
		}
	};

	public Handler handleProcessPendingTickets = (context) -> {
		if (Helper.getPerson() == null || Helper.getPerson().getRole() == Role.EMPLOYEE) {
			System.out.println("You are not authorized to process pending tickets");
			context.status(401);
		} else {
			List<Ticket> tickets = ticketService.processPendingTickets();

			context.status(200);
			context.result("Tickets was processed");
		}
	};

	public Handler handleProcessPendingTicket = (context) -> {
		if (Helper.getPerson() == null || Helper.getPerson().getRole() == Role.EMPLOYEE) {
			System.out.println("You are not authorized to process pending ticket");
			context.status(401);
		} else {
			Map<String, Integer> body = objectMapper.readValue(context.body(), LinkedHashMap.class);
			ticketService.processPendingTicket(body.get("ticket_id"), body.get("status"));

			context.status(200);
			if(body.get("status")==2) 
				context.result("Ticket "+body.get("ticket_id") +" was approved");
				else context.result("Ticket "+body.get("ticket_id") +" was denied");
		}
	};

}
