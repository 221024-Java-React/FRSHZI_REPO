package DAO;

import java.awt.Image;

import Model.User;

public interface IAuthDAO {

	User LoginWithUsernameAndPassword(String username , String password);
	
	int RegisterWithUsernameAndPassword(String username, String password);
	
	boolean checkUsernameIsAvailable(String username);
	
	void updateUserProfile(User user);
	
	void uploadUserPicture(Image image);
	
	void ManagerChangeRole(User user);
	
	
}
