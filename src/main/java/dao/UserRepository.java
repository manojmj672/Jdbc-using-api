package dao;

import java.util.List;

import entity.User;

public interface UserRepository {
	 User saveUser(User user);

	    User updateUser(User user);

	    User getById(int id);

	    String deleteById(int id);

	    List<User> allUsers();

}
