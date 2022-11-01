package Service;

import java.awt.Image;

import Model.User;

public interface IAuthService {

   boolean Register(String username, String password);
   
   User Login(String username, String password);
   
   boolean EditProfile (User user);
   
   boolean UploadPicture(Image image);
}
