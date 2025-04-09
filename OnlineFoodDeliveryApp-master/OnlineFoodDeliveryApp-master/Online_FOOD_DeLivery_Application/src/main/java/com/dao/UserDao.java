package com.dao;

import java.util.List;

import com.model.User;

public interface UserDao {
	void addUser(User user);

	User getUser(int userId);

	void updateUser(User user);

	void deleteUser(int userId);

	List<User> getAllUser();

	public boolean isValidUser(String userName, String password);

	void addUserSignUp(User user);

	User getUserByuserNameAndPassword(String userName, String Password);

	String getUserRole(String userName, String Password);

	int getRestaurantOwnerId(String userName, String encryptedPassword);

	List<User> getAllUserByRole(String role);

	void addRUser(User user);
}