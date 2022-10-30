package lab15;
import io.javalin.Javalin;

public class Lab15 {

	
	
	public static void main (String [] args)
	{
		PersonController personController = new PersonController();
		
		Javalin app = 
		Javalin.create(config -> {
		    config.plugins.enableCors(cors -> {
		        cors.add(it -> {
		            it.anyHost();
		        });
		    });
		});
		
		app.get("/person/", personController.handleGetAllPersons);
		app.post("/person/create", personController.handleCreateNewPerson);
		app.put("/person/update", personController.handleUpdatePerson);
		app.delete("/person/delete", personController.handleDeletePerson);
		
		app.start(8080);
	}
}
