package com.cognizant.truyum.dao;

import java.text.ParseException;
import java.util.List;

import com.cognizant.truyum.model.MenuItem;
import com.cognizant.truyum.util.DateUtil;

public class MenuItemDaoSqlImplTest {

	/**
	 * tests the getMenuItemListAdmin() method
	 */
	public static void testGetMenuItemListAdmin() {
		MenuItemDao menuItemDao = new MenuItemDaoSqlImpl();
		List<MenuItem> menuItemList = menuItemDao.getMenuItemListAdmin();

		for (MenuItem menuItem : menuItemList) {
			System.out.println(menuItem);
		}
	}

	/**
	 * tests the getMenuItemListCustomer() method
	 */
	public static void testGetMenuItemListCustomer() {
		MenuItemDao menuItemDao = new MenuItemDaoSqlImpl();
		List<MenuItem> menuItemList = menuItemDao.getMenuItemListCustomer();

		for (MenuItem menuItem : menuItemList) {
			System.out.println(menuItem);
		}
	}

	/**
	 * tests the modifyMenuItem() method
	 */
	public static void testModifyMenuItem() {
		MenuItemDao menuItemDao = new MenuItemDaoSqlImpl();
		try {
			MenuItem menuItem = new MenuItem(1, "Paneer", 170.00f, true, DateUtil.convertToDate("04/09/2019"),
					"Main Course", false);
			menuItemDao.modifyMenuItem(menuItem);
			List<MenuItem> menuItemList = menuItemDao.getMenuItemListCustomer();
		  	for (MenuItem menu : menuItemList) {
				System.out.println(menu);
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

	/**
	 * tests the getMenuItem() method
	 */
	public static void testGetMenuItem() {
		  	MenuItemDao menuItemDao = new MenuItemDaoSqlImpl();
		  	//List<MenuItem> menuItemList = menuItemDao.getMenuItemListCustomer();
		  
			System.out.println(menuItemDao.getMenuItem(1));		
		  	
	  }
	 

	/**
	 * main method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		testGetMenuItemListAdmin();
		System.out.println("");
		testGetMenuItemListCustomer();
		System.out.println("");
		testModifyMenuItem();
		System.out.println("");
		testGetMenuItem();

	}
}
