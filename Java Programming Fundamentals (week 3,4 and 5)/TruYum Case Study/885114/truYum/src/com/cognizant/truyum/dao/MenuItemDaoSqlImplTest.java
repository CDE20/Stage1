package com.cognizant.truyum.dao;

import java.util.List;

import com.cognizant.truyum.model.MenuItem;
import com.cognizant.truyum.util.DateUtil;

class MenuItemDaoSqlImplTest {

	public static void main(String[] args) {
		System.out.println("testGetMenuItemListAdmin()");
		testGetMenuItemListAdmin();
		
		System.out.println("\ntestGetMenuItemListCustomer()");
		testGetMenuItemListCustomer();
		
		System.out.println("\ntestmodifyMenuItem()");
		testModifyMenuItem();
		
		System.out.println("\ntestGetMenuItem()");
		testGetMenuItem();
	}

	static void testGetMenuItemListAdmin() {
		MenuItemDao menuItemDao = new MenuItemDaoSqlImpl();
		List<MenuItem> menuItemList = menuItemDao.getMenuItemListAdmin();

		menuItemList.stream().forEach(i -> System.out.println(i));
	}

	static void testGetMenuItemListCustomer() {
		MenuItemDao menuItemDao = new MenuItemDaoSqlImpl();
		List<MenuItem> menuItemList = menuItemDao.getMenuItemListCustomer();

		menuItemList.stream().forEach(i -> System.out.println(i));
	}

	static void testModifyMenuItem() {
		MenuItem menuItem = new MenuItem(1, "Sandwich pizza", 99.00f, true, DateUtil.convertToDate("10/03/2018"),
				"Main Course", true);
		MenuItemDao menuItemDao = new MenuItemDaoSqlImpl();
		menuItemDao.modifyMenuItem(menuItem);
	}

	static void testGetMenuItem() {
		MenuItemDao menuItemDao = new MenuItemDaoSqlImpl();
		MenuItem menuItem = menuItemDao.getMenuItem(1);

		System.out.println(menuItem);
	}

}
