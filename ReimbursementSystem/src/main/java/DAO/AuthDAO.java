package DAO;

import java.awt.Image;

import Model.User;

public class AuthDAO implements IAuthDAO{

	@Override
	public User LoginWithUsernameAndPassword(String username, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int RegisterWithUsernameAndPassword(String username, String password) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean checkUsernameIsAvailable(String username) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void updateUserProfile(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void uploadUserPicture(Image image) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ManagerChangeRole(User user) {
		// TODO Auto-generated method stub
		
	}

}
