package com.dao;

import java.util.List;

import com.model.Menu;

public interface MenuDao {

	int addMenu(Menu menu);

	Menu getMenu(int menuId);

	void updateMenu(Menu menu);

	int deleteMenu(int menuId);

	List<Menu> getAll();

	List<Menu> getMenuByResto(int restauratId);
}