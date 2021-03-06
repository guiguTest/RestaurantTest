package com.guigu.restaurant.user.service;

import java.util.List;

import com.guigu.restaurant.po.User;
import com.guigu.restaurant.po.UserLogin;
import com.guigu.restaurant.po.UserLoginOrder;

public interface UserLoginService {
	public List<UserLogin> findUserList(UserLogin userLogin);
	
	public UserLogin finduserById(Integer userId);
	
	public boolean addUserLogin(UserLogin userLogin);
	
	public boolean updateUserLogin(UserLogin userLogin);
	
	public boolean deleteUserLogin(Integer userId);
}
