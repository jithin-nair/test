package in.edu.ktu.test.service;

import java.util.List;

import in.edu.ktu.test.entity.User;

public interface UserService {

	public List<User> getAllUsers();
	public User getUserById(Long id);
	public boolean saveUser(User user);
	public boolean deleteUserById(Long id);

}