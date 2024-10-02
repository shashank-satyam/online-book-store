package com.shashanksatyam.onlinebookstore.service;

import java.util.List;

import com.shashanksatyam.onlinebookstore.entity.User;

public interface UserService {

	public List<User> getAllUsers();
	
	public User getUserByUsername(String username);
}
