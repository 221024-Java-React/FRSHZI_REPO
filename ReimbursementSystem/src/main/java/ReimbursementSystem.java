
import io.javalin.Javalin;

public class ReimbursementSystem {

	
	public static void main (String [] args)
	{
		Javalin app = Javalin.create(config -> {
		    config.plugins.enableCors(cors -> {
		        cors.add(it -> {
		            it.anyHost();
		        });
		    });
		});
		
	//	app.post("/user/register", AuthController.handleRegister);
	//	app.get("/user/login", AuthController.handleLogin);
   //	app.put("/user/editProfile", AuthController.handleEditProfile);
 //		app.put("/user/uploadPicture", AuthController.handleUploadPicture);
	//	app.get("/ticket/getTicketsbyFilter", TicketController.handleGetTicketsByFilter);
	//	app.post("ticket/submitTicket", TickerController.handleSubmitTicket);
	//	app.post("ticket/ProcessPendingTickets", TickerController.handleProcessPendingTickets);
	//	app.post("ticket/ViewTicketHistory", TickerController.handleViewTicketHistory);
		
		app.start(8000);
		
	}
}