package lab15;
import io.javalin.Javalin;

public class Lab15 {

	public static void main (String [] args)
	{
		Javalin app = 
		Javalin.create(config -> {
		    config.plugins.enableCors(cors -> {
		        cors.add(it -> {
		            it.anyHost();
		        });
		    });
		});
		
		app.start(8080);
	}
}
