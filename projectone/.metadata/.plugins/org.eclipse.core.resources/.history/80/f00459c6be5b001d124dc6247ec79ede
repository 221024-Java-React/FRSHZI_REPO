package Service;

import java.awt.Image;

import DAO.IAuthDAO;
import Model.User;

public class AuthService {
   private IAuthDAO iAuthDAO;
   
   
	public AuthService(IAuthDAO iAuthDAO) {
	super();
	this.iAuthDAO = iAuthDAO;
}

	
	public boolean Register(String username, String password) {
		// TODO Auto-generated method stub
		return iAuthDAO.RegisterWithUsernameAndPassword(username, password);
	}


	public User Login(String username, String password) {
		// TODO Auto-generated method stub
		return iAuthDAO.LoginWithUsernameAndPassword(username, password);
	}

	
	public boolean EditProfile(User user) {
		// TODO Auto-generated method stub
		return iAuthDAO.updateUserProfile(user);
	}


	public boolean UploadPicture(Image image) {
		// TODO Auto-generated method stub
		return iAuthDAO.uploadUserPicture(image);
	}

}
