package Controller;

import DAO.IAuthDAO;
import Service.AuthService;
import Service.AuthServiceFactory;

public class AuthController {

	IAuthDAO iAuthDAO;
	AuthService authService = AuthServiceFactory.createAuthService(iAuthDAO);
	
	
}
