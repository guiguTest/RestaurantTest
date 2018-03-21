package com.guigu.restaurant.menu.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;

import com.guigu.restaurant.data.service.DataDictorytionService;
import com.guigu.restaurant.menu.service.MenuService;
import com.guigu.restaurant.po.DataDictorytion;
import com.guigu.restaurant.po.Menu;
import com.guigu.restaurant.po.MenuOrder;

@Controller
@RequestMapping("/menu")
public class MenuController {
	@Resource(name="menuServiceImpl")
	private MenuService menuService;
	@Resource(name="dataDictorytionServiceImpl")
	private DataDictorytionService dataDictorytionService;
	
	@RequestMapping("list.action")
	public String findMenuList(Menu menu,Model model) {
		List<Menu> list=menuService.findMenu(menu);
		model.addAttribute("list",list);
		return "menu/menu_list";
	}
	@RequestMapping("show.action")
	public String showMenuOrderById(Integer menuId,Model model) {
		Menu menu=menuService.findMenuById(menuId);
		model.addAttribute("menu",menu);
		System.out.println("222");
		return "menu/menu_show";
	}
	@RequestMapping("load.action")
	public String findMenuOrderById(Integer menuId,Model model) {
		List<DataDictorytion> list=this.findDataDictorytion();
		Menu menu=menuService.findMenuById(menuId);
		model.addAttribute("dataList",list);
		model.addAttribute("menu",menu);
		return "menu/menu_update";
	}
	@RequestMapping("beforeAdd.action")
	public String beforeAdd(Model model) {
		List<DataDictorytion> list=this.findDataDictorytion();
		System.out.println(list.get(0).getDataDetail());
		System.out.println(list.size());
		model.addAttribute("dataList",list);
		return "menu/menu_add";
	}
	@RequestMapping("add.action")
	public String addMenu(Model model,Menu menu) {
		System.out.println("123");
		boolean result=menuService.addMenu(menu);
		if(result) {
			model.addAttribute("info","��ӳɹ�");
			System.out.println("success");
		}else {
			model.addAttribute("info","���ʧ��");
			System.out.println("fail");
		}
		return this.findMenuList(new Menu(), model);
	}
	@RequestMapping("update.action")
	public String updateMenu(Model model,Menu menu) {
		boolean result=menuService.updateMenu(menu);
		System.out.println("1231");
		if(result) {
			model.addAttribute("info","�޸ĳɹ�");
		}else {
			model.addAttribute("info","�޸�ʧ��");
		}
		return this.findMenuList(new Menu(), model);
	}
	@RequestMapping("delete.action")
	public String deleteMenu(Model model,Integer menuId) {
		boolean result=menuService.deteleMenu(menuId);
		if(result) {
			model.addAttribute("info","ɾ���ɹ�");
		}else {
			model.addAttribute("info","ɾ��ʧ��");
		}
		return this.findMenuList(new Menu(), model);
	}
	public List<DataDictorytion> findDataDictorytion(){
		DataDictorytion dataDictorytion=new DataDictorytion();
	    dataDictorytion.setDataNote("��Ʒ����");
	    return dataDictorytionService.findDataDictorytion(dataDictorytion);
	}
}
