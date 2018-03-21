package com.guigu.restaurant.po;

import java.util.List;

public class UserOrder {
	
	private User user;
	
	private List<UserLogin> list;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<UserLogin> getList() {
		return list;
	}

	public void setList(List<UserLogin> list) {
		this.list = list;
	}
}
