package com.cognizant.truyum.dao;

import java.util.List;

import com.cognizant.truyum.model.MenuItem;
import com.cognizant.truyum.util.DateUtil;

public class MenuItemDaoCollectionImplTest {

	static void testGetMenuItemListAdmin() {
		MenuItemDao menuItemDao = new MenuItemDaoCollectionImpl();
		List<MenuItem> menuItemList = menuItemDao.getMenuItemListAdmin();

		menuItemList.stream().forEach(i -> System.out.println(i));
	}

	static void testGetMenuItemListCustomer() {
		MenuItemDao menuItemDao = new MenuItemDaoCollectionImpl();
		List<MenuItem> menuItemList = menuItemDao.getMenuItemListCustomer();

		menuItemList.stream().forEach(i -> System.out.println(i));
	}

	static void testModifyMenuItem() {
		MenuItem menuItem = new MenuItem(1, "Sandwich1", 99.00f, true, DateUtil.convertToDate("15/03/2017"),
				"Main Course", true);
		MenuItemDao menuItemDao = new MenuItemDaoCollectionImpl();
		menuItemDao.modifyMenuItem(menuItem);
		
		long productId = 1;
		MenuItem menuItem2 = menuItemDao.getMenuItem(productId);
		System.out.println(menuItem2);
	}

	static void testGetMenuItem() {
		MenuItemDao menuItemDao = new MenuItemDaoCollectionImpl();
		long productId = 1;
		MenuItem menuItem = menuItemDao.getMenuItem(productId);
		System.out.println(menuItem);
	}

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
}