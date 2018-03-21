package com.guigu.restaurant.data.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.guigu.restaurant.data.service.DataDictorytionService;
import com.guigu.restaurant.po.DataDictorytion;

@Controller
@RequestMapping("/data")
public class DataDictorytionController {
	@Resource(name="dataDictorytionServiceImpl")
	private DataDictorytionService dataDictorytionService;
	@RequestMapping("list.action")
	public String findDataDictorytionList(Model model,DataDictorytion dataDictorytion) {
		List<DataDictorytion> list=dataDictorytionService.findDataDictorytion(dataDictorytion);
		model.addAttribute("list",list);
		return "dataDictionary/data_list";
	}
	@RequestMapping("load.action")
	public String findDataDictorytionListById(Model model,Integer dataId) {
		DataDictorytion dataDictorytion=dataDictorytionService.findDataDictorytionById(dataId);
		model.addAttribute("dataDictorytion",dataDictorytion);
		return "dataDictionary/data_update";
	}
	@RequestMapping("add.action")
	public String addDataDictorytionList(Model model,DataDictorytion dataDictorytion) {
		boolean result=dataDictorytionService.addDataDictorytion(dataDictorytion);
		if(result) {
			model.addAttribute("info","添加成功");
		}else {
			model.addAttribute("info","添加失败");
		}
		return this.findDataDictorytionList(model,new DataDictorytion());
	}
	@RequestMapping("update.action")
	public String updateDataDictorytionList(Model model,DataDictorytion dataDictorytion) {
		boolean result=dataDictorytionService.updateDataDictorytion(dataDictorytion);
		if(result) {
			model.addAttribute("info","修改成功");
		}else {
			model.addAttribute("info","修改失败");
		}
		return this.findDataDictorytionList(model,new DataDictorytion());
	}
	@RequestMapping("delete.action")
	public String deleteDataDictorytionList(Model model,Integer dataId) {
		boolean result=dataDictorytionService.deleteDataDictorytion(dataId);
		if(result) {
			model.addAttribute("info","删除成功");
		}else {
			model.addAttribute("info","删除失败");
		}
		return this.findDataDictorytionList(model,new DataDictorytion());
	}
	
	
}
