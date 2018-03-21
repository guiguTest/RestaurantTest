package com.guigu.restaurant.user.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.guigu.restaurant.mapper.UserLoginMapper;
import com.guigu.restaurant.mapper.UserMapper;
import com.guigu.restaurant.po.User;
import com.guigu.restaurant.po.UserLogin;
import com.guigu.restaurant.po.UserLoginExample;
import com.guigu.restaurant.po.UserLoginExample.Criteria;
import com.guigu.restaurant.po.UserLoginOrder;
import com.guigu.restaurant.po.UserOrder;
import com.guigu.restaurant.user.service.UserLoginService;
@Service("userLoginServiceImpl")
public class UserLoginServiceImpl implements UserLoginService{
	
	@Resource(name="userLoginMapper")
	private UserLoginMapper userLoginMapper;
	@Resource(name="userMapper")
	private UserMapper userMapper;
	@Override
	public List<UserLogin> findUserList(UserLogin userLogin){
		UserLoginExample userLoginExample=new UserLoginExample();
		Criteria criteria=userLoginExample.createCriteria();
		if(userLogin!=null) {
				if(userLogin.getUsername()!=null) {
					criteria.andUsernameLike("%"+userLogin.getUsername()+"%");
				}
		}
		List<UserLogin> list=userLoginMapper.selectByExample(userLoginExample);
		return list;
	}

	public UserLogin finduserById(Integer userId) {
		System.out.println(userId);
		UserLogin userLogin=userLoginMapper.selectByPrimaryKey(userId);
		return userLogin;
	}
	@Override
	public boolean addUserLogin(UserLogin userLogin) {
		int i=userLoginMapper.insertSelective(userLogin);
		if(i>0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean updateUserLogin(UserLogin userLogin) {
		int i=userLoginMapper.updateByPrimaryKeySelective(userLogin);
		if(i>0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteUserLogin(Integer userId) {
		int i=userLoginMapper.deleteByPrimaryKey(userId);
		if(i>0) {
			return true;
		}
		return false;
	}

}
