package com.guigu.restaurant.menu.service;

import java.util.List;

import com.guigu.restaurant.po.Menu;
import com.guigu.restaurant.po.MenuOrder;

public interface MenuService {
	
	public List<Menu> findMenu(Menu menu);
	
	public boolean addMenu(Menu menu);
	
	public boolean updateMenu(Menu menu);

	public boolean deteleMenu(Integer menuId);
	
	public Menu findMenuById(Integer menuId);
}
