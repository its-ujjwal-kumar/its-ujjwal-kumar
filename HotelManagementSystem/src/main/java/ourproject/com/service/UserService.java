package ourproject.com.service;

import java.util.List;

import ourproject.com.model.User;

public interface UserService {
	User createUser(User user);
	List<User> getAllUsers();
	User getUser(int userId);
	User updateUser(int userId,User user);
	String deleteUser(int userId);
	
	
   
}

