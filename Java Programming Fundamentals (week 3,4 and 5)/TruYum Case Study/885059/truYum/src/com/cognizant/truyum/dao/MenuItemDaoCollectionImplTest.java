package com.cognizant.truyum.dao;

import java.util.List;

import com.cognizant.truyum.model.MenuItem;
import com.cognizant.truyum.util.DateUtil;

public class MenuItemDaoCollectionImplTest {

	public static void testGetMenuItemListAdmin() {

		MenuItemDao menuItemDao = new MenuItemDaoCollectionImpl();
		List<MenuItem> items = menuItemDao.getMenuItemListAdmin();
		for (MenuItem item : items) {
			System.out.println(item);
		}

	}

	public static void testGetMenuItemListCustomer() {
		MenuItemDao menuItemDao = new MenuItemDaoCollectionImpl();
		List<MenuItem> items = menuItemDao.getMenuItemListCustomer();
		for (MenuItem item : items) {
			System.out.println(item);
		}
	}

	public static void testModifyMenuItem() {
		MenuItem newItem = new MenuItem(1, "Ice-cream", 75, true, DateUtil.convertToDate("27/11/2018"), "Dessert",
				false);
		MenuItemDao menuItemDao = new MenuItemDaoCollectionImpl();
		menuItemDao.modifyMenuItem(newItem);
	}

	public static void testGetMenuItem() {
		MenuItemDao menuItemDao = new MenuItemDaoCollectionImpl();
		System.out.println(menuItemDao.getMenuItem(1));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testGetMenuItemListAdmin();
		testGetMenuItemListCustomer();
		testModifyMenuItem();
		testGetMenuItem();
	}

}
