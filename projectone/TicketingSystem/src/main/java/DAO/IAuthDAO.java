package DAO;

import java.awt.Image;
import java.io.File;

import Model.Person;

public interface IAuthDAO {

	Person Login(String username , String password);
	
	boolean Register(Person person);
	
	boolean updateUserProfile(Person user);
	
	boolean uploadUserPicture(File file);
	
	boolean ManagerChangeRole(Person user);

	boolean updatePersonRole(int person_id, int role_id);
	
	
}
