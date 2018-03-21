package com.guigu.restaurant.user.service;

import java.util.List;

import com.guigu.restaurant.po.User;

public interface UserService {

	public List<User> findUserList(User user);
	
	public User findUserById(Integer userId);
	
	public boolean addUser(User user);
	
	public boolean updateUser(User user);
	
	public boolean deleteUser(Integer userId);
	
}
