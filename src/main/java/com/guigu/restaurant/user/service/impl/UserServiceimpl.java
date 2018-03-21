package com.guigu.restaurant.user.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.guigu.restaurant.mapper.UserMapper;
import com.guigu.restaurant.po.User;
import com.guigu.restaurant.po.UserExample;
import com.guigu.restaurant.po.UserExample.Criteria;
import com.guigu.restaurant.user.service.UserService;
@Service("userServiceimpl")
public class UserServiceimpl implements UserService{

	@Resource(name="userMapper")
	private UserMapper userMapper;
	
	@Override
	public List<User> findUserList(User user) {
		UserExample userExample=new UserExample();
		Criteria criteria=userExample.createCriteria();
		if(user.getUserName()!=null) {
			user.setUserName("%"+user.getUserName()+"%");
			criteria.andUserNameLike(user.getUserName());
		}
		return userMapper.selectByExample(userExample);
	}

	@Override
	public User findUserById(Integer userId) {
		return userMapper.selectByPrimaryKey(userId);
	}

	@Override
	public boolean addUser(User user) {
		int i=userMapper.insertSelective(user);
		if(i>0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean updateUser(User user) {
		int i=userMapper.updateByPrimaryKeySelective(user);
		if(i>0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteUser(Integer userId) {
		int i=userMapper.deleteByPrimaryKey(userId);
		if(i>0) {
			return true;
		}
		return false;
	}

}
