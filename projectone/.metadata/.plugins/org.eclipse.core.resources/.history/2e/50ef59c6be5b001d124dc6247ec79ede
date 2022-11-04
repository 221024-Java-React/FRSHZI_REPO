package DAO;

import java.awt.Image;

import Model.User;

public interface IAuthDAO {

	User LoginWithUsernameAndPassword(String username , String password);
	
	boolean RegisterWithUsernameAndPassword(String username, String password);
	
	boolean checkUsernameIsAvailable(String username);
	
	boolean updateUserProfile(User user);
	
	boolean uploadUserPicture(Image image);
	
	boolean ManagerChangeRole(User user);
	
	
}
