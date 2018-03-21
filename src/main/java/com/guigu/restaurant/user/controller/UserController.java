package com.guigu.restaurant.user.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.guigu.restaurant.po.User;
import com.guigu.restaurant.user.service.UserService;
@Controller
@RequestMapping("/user")
public class UserController {
	
	@Resource(name="userServiceimpl")
	private UserService userService;
	@RequestMapping("list.action")
	public String findUserList(Model model,User user) {
		List<User> list=userService.findUserList(user);
		model.addAttribute("list",list);
		return "user/user_list";
	}
	@RequestMapping("load.action")
	public String findUserListById(Model model,Integer userId) {
		User user=userService.findUserById(userId);
		model.addAttribute("user",user);
		return "user/user_update";
	}
	@RequestMapping("show.action")
	public String findUserById(Model model,Integer userId) {
		User user=userService.findUserById(userId);
		model.addAttribute("user",user);
		return "user/user_show";
	}
	@RequestMapping("add.action")
	public String addUser(Model model,User user) {
		boolean result=userService.addUser(user);
		if(result) {
			model.addAttribute("info","添加成功");
		}else {
			model.addAttribute("info","添加失败");
		}
		return this.findUserList(model,new User());
	}
	@RequestMapping("update.action")
	public String updateUser(Model model,User user) {
		boolean result=userService.updateUser(user);
		if(result) {
			model.addAttribute("info","修改成功");
		}else {
			model.addAttribute("info","修改失败");
		}
		return this.findUserList(model,new User());
	}
	@RequestMapping("delete.action")
	public String deleteUser(Model model,Integer userId) {
		boolean result=userService.deleteUser(userId);
		if(result) {
			model.addAttribute("info","删除成功");
		}else {
			model.addAttribute("info","删除失败");
		}
		return this.findUserList(model,new User());
	}
}
