package com.guigu.restaurant.user.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.guigu.restaurant.po.UserLogin;
import com.guigu.restaurant.po.UserLoginOrder;
import com.guigu.restaurant.user.service.UserLoginService;
@Controller
@RequestMapping("/userLogin")
public class UserLoginController {
	@Resource(name="userLoginServiceImpl")
	private UserLoginService userLoginService;
	@RequestMapping("list.action")
	public String findUserLoginList(Model model,UserLoginOrder userLoginOrder) {
		List<UserLoginOrder> list=userLoginService.findUserList(userLoginOrder);
		model.addAttribute("list",list);
		return "userLogin/userLogin_list";
	}
	@RequestMapping("load.action")
	public String findUserLoginById(Model model,Integer loginId) {
		UserLoginOrder userLoginOrder=userLoginService.finduserById(loginId);
		model.addAttribute("userLoginOrder",userLoginOrder);
		return "userLogin/userLogin_update";
	}
	@RequestMapping("add.action")
	public String addUserLogin(Model model,UserLogin userLogin) {
		boolean result=userLoginService.addUserLogin(userLogin);
		if(result) {
			model.addAttribute("info","��ӳɹ�");
		}else {
			model.addAttribute("info","���ʧ��");
		}
		return this.findUserLoginList(model,new UserLoginOrder());
	}
	@RequestMapping("update.action")
	public String updateUserLogin(Model model,UserLogin userLogin) {
		boolean result=userLoginService.updateUserLogin(userLogin);
		if(result) {
			model.addAttribute("info","�޸ĳɹ�");
		}else {
			model.addAttribute("info","�޸�ʧ��");
		}
		return this.findUserLoginList(model,new UserLoginOrder());
	}
	@RequestMapping("delete.action")
	public String deleteUserLogin(Model model,Integer userId) {
		boolean result=userLoginService.deleteUserLogin(userId);
		if(result) {
			model.addAttribute("info","ɾ���ɹ�");
		}else {
			model.addAttribute("info","ɾ��ʧ��");
		}
		return this.findUserLoginList(model,new UserLoginOrder());
	}

}

