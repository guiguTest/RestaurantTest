package com.guigu.restaurant.user.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.w3c.dom.ls.LSInput;

import com.guigu.restaurant.po.User;
import com.guigu.restaurant.po.UserLogin;
import com.guigu.restaurant.po.UserLoginOrder;
import com.guigu.restaurant.user.service.UserLoginService;
import com.guigu.restaurant.user.service.UserService;
@Controller
@RequestMapping("/userLogin")
public class UserLoginController {
	@Resource(name="userLoginServiceImpl")
	private UserLoginService userLoginService;
	@Resource(name="userServiceImpl")
	private UserService userService;
	@RequestMapping("list.action")
	public String findUserLoginList(Model model,UserLogin userLogin) {
		List<UserLogin> list=userLoginService.findUserList(userLogin);
		model.addAttribute("list",list);
		return "userLogin/userLogin_list";
	}
	@RequestMapping("show.action")
	public String findUserLoginAndUserList(Model model,Integer loginId) {
		UserLogin userLogin=userLoginService.finduserById(loginId);
		User user=new User();
		List<User> list=userService.findUserList(user);
		model.addAttribute("userLogin",userLogin);
		return "userLogin/userLogin_list";
	}
	@RequestMapping("load.action")
	public String findUserLoginById(Model model,Integer loginId) {
		UserLogin userLogin=userLoginService.finduserById(loginId);
		model.addAttribute("userLogin",userLogin);
		return "userLogin/userLogin_update";
	}
	@RequestMapping("add.action")
	public String addUserLogin(Model model,UserLogin userLogin) {
		boolean result=userLoginService.addUserLogin(userLogin);
		if(result) {
			model.addAttribute("info","添加成功");
		}else {
			model.addAttribute("info","添加失败");
		}
		return this.findUserLoginList(model,new UserLogin());
	}
	@RequestMapping("update.action")
	public String updateUserLogin(Model model,UserLogin userLogin) {
		boolean result=userLoginService.updateUserLogin(userLogin);
		if(result) {
			model.addAttribute("info","修改成功");
		}else {
			model.addAttribute("info","修改失败");
		}
		return this.findUserLoginList(model,new UserLogin());
	}
	@RequestMapping("delete.action")
	public String deleteUserLogin(Model model,Integer userId) {
		boolean result=userLoginService.deleteUserLogin(userId);
		if(result) {
			model.addAttribute("info","删除成功");
		}else {
			model.addAttribute("info","删除失败");
		}
		return this.findUserLoginList(model,new UserLogin());
	}

}

