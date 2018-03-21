package com.guigu.restaurant.mapper;

import java.util.List;

import com.guigu.restaurant.po.MenuOrder;

public interface MenuOrderMapper {
	
	public List<MenuOrder> findMenuOrderList(MenuOrder menuOrder);
	
	public MenuOrder findMenuOrderById(Integer id);
}
