package Controller;

import java.util.LinkedHashMap;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;

import DAO.IAuthDAO;
import Model.Person;
import Service.AuthService;
import Service.AuthServiceFactory;
import io.javalin.http.Handler;

public class AuthController {

	IAuthDAO iAuthDAO;
	private ObjectMapper objectMapper;
	private AuthService authService;
	
	
        public AuthController(IAuthDAO iAuthDAO) {
        	
		super();
		this.objectMapper = new ObjectMapper();
		this.iAuthDAO = iAuthDAO;
		authService = AuthServiceFactory.createAuthService(iAuthDAO);
	}



		public Handler handleRegister = (context) -> {
	
		Person person = objectMapper.readValue(context.body(), Person.class);
		System.out.println(person);
		boolean emailExist = authService.Register(person);
		if(emailExist) context.status(403);
		else
		{
		context.status(201);
		context.result(objectMapper.writeValueAsString(person));
		}
		};
	
	public Handler handleLogin = (context) -> {
		
		Map<String, String> body = objectMapper.readValue(context.body(), LinkedHashMap.class);
		Person login=  authService.Login(body.get("email"), body.get("password"));
		if(login ==null)context.status(404);
		else
		{
		context.status(200);
		context.result(objectMapper.writeValueAsString(login));
		}
		};
	
        public Handler handleEditProfile = (context) -> {
 		
        Person person = objectMapper.readValue(context.body(), Person.class);
		authService.EditProfile(person);
		context.status(200);
		context.result(objectMapper.writeValueAsString(person));
	};
}
