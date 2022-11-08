package Service;

import java.awt.Image;
import java.io.File;
import java.time.LocalDateTime;
import DAO.IAuthDAO;
import Exception.EmailAlreadyExistException;
import Exception.PersonNotFoundException;
import Model.Person;
import Utils.Helper;
import Utils.Logging;

public class AuthService {
   private IAuthDAO iAuthDAO;
   
   
	public AuthService(IAuthDAO iAuthDAO) {
	super();
	this.iAuthDAO = iAuthDAO;
}

	
	public boolean Register(Person person) throws EmailAlreadyExistException{
		
		boolean result =  iAuthDAO.Register(person);
		if(result)
		{
			Logging.getLogger().info(LocalDateTime.now()+" New person was registered: " + person);

		}
		return result;
	}


	public Person Login(String username, String password) throws PersonNotFoundException{
		Person result =  iAuthDAO.Login(username, password);
		if(result!= null)
		{
			Logging.getLogger().info("Person with email address="+result.getEmail()+" was logged in on "+LocalDateTime.now());
		}
		return result;
		 
	}

	
	public boolean EditProfile(Person user) {
		boolean result =  iAuthDAO.updateUserProfile(user);
		if(result)
		{
			Logging.getLogger().info("The user with email "+user.getEmail()+" updated the profile on "+LocalDateTime.now());
            return result;
			
		}
		return result;
	}


	public boolean UploadPicture(File file) {
		boolean result =  iAuthDAO.uploadUserPicture(file);
		if(result)
		{
			Logging.getLogger().info("The user with email "+Helper.getPerson().getEmail()+" uploaded a new picture on"+LocalDateTime.now());
            return result;
			
		}
		return result;
	}


	public boolean changePersonRole(int person_id , int role_id) {
		boolean result =  iAuthDAO.updatePersonRole(person_id, role_id);
		if(result)
		{
			Logging.getLogger().info("The manager with email "+Helper.getPerson().getEmail() +" changed the role for user "+person_id+" to "+role_id);
            return result;
		}
	return result;
	}
	

}
