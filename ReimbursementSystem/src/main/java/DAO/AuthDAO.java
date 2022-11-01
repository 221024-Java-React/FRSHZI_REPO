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
	public boolean RegisterWithUsernameAndPassword(String username, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean checkUsernameIsAvailable(String username) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateUserProfile(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean uploadUserPicture(Image image) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean ManagerChangeRole(User user) {
		// TODO Auto-generated method stub
		return false;
	}

}
