package ourproject.com.serviceimpl;
import java.util.List;

import ourproject.com.dao.UserDao;
import ourproject.com.daoimpl.UserDaoImpl;
import ourproject.com.model.User;
import ourproject.com.service.UserService;
public class UserServiceImpl implements UserService {

		UserDao udao=new UserDaoImpl();
	@Override
		public User createUser (User user) {
			return udao.createUser(user);
		}
/*
	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUser(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User updateUser(int userId, User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteUser(int userId) {
		// TODO Auto-generated method stub
		return null;
	}
	*/
	@Override
    public List<User> getAllUsers() {
        
		return udao.getAllUsers();
    }

    @Override
    public User getUser(int userId) {
     
		return udao.getUser(userId);
    }

    @Override
    public User updateUser(int userId, User user) {
        
		return udao.updateUser(userId, user);
    }

    @Override
    public String deleteUser(int userId) {
        
		return udao.deleteUser(userId);
    }


}
