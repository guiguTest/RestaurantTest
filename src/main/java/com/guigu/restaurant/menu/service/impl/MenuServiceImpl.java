package com.guigu.restaurant.menu.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import com.guigu.restaurant.mapper.MenuMapper;
import com.guigu.restaurant.mapper.MenuOrderMapper;
import com.guigu.restaurant.menu.service.MenuService;
import com.guigu.restaurant.po.Menu;
import com.guigu.restaurant.po.MenuExample;
import com.guigu.restaurant.po.MenuExample.Criteria;
import com.guigu.restaurant.po.MenuOrder;
import com.mchange.util.MEnumeration;

@Service("menuServiceImpl")
public class MenuServiceImpl implements MenuService{

	@Resource(name="menuMapper")
	private MenuMapper menuMapper;
	@Resource(name="menuOrderMapper")
	private MenuOrderMapper menuOrderMapper;
	@Override
	public List<Menu> findMenu(Menu menu) {
		MenuExample menuExample=new MenuExample();
		Criteria criteria=menuExample.createCriteria();
		if(menu!=null) {
			if(menu.getMenuName()!=null) {
				menu.setMenuName("%"+menu.getMenuName()+"%");
				criteria.andMenuNameLike(menu.getMenuName());
			}
			if(menu.getMenuType()!=null) {
				criteria.andMenuTypeEqualTo(menu.getMenuType());
			}
		}
		return menuMapper.selectByExample(menuExample);
	}

	@Override
	public boolean addMenu(Menu menu) {
		int i=menuMapper.insert(menu);
		if(i>0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean updateMenu(Menu menu) {
		int i=menuMapper.updateByPrimaryKeySelective(menu);
		if(i>0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean deteleMenu(Integer menuId) {
		int i=menuMapper.deleteByPrimaryKey(menuId);
		if(i>0) {
			return true;
		}
		return false;
	}

	@Override
	public Menu findMenuById(Integer menuId) {
		return menuMapper.selectByPrimaryKey(menuId);
	}

}
