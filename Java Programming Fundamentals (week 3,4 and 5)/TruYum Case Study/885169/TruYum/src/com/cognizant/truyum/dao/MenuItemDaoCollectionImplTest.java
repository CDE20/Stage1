package com.cognizant.truyum.dao;

import java.text.ParseException;
import java.util.List;

import com.cognizant.truyum.model.MenuItem;
import com.cognizant.truyum.util.DateUtil;

/**
 * 
 * @author 
 *
 */
public class MenuItemDaoCollectionImplTest {

	/**
	 * Tests the getMenuItemListAdmin() method
	 */
	public static void testGetMenuItemListAdmin() {
		MenuItemDaoCollectionImpl menuItemDaoCollectionImpl = new MenuItemDaoCollectionImpl();

		List<MenuItem> menuItems = menuItemDaoCollectionImpl.getMenuItemListAdmin();

		for (MenuItem menuItem : menuItems) {

			System.out.println(menuItem.toString());
		}
	}

	/**
	 * Tests the getMenuItemListCustomer() method
	 */
	public static void testGetMenuItemListCustomer() {
		MenuItemDaoCollectionImpl menuItemDaoCollectionImpl = new MenuItemDaoCollectionImpl();

		List<MenuItem> menuItems = menuItemDaoCollectionImpl.getMenuItemListCustomer();

		for (MenuItem menuItem : menuItems) {

			System.out.println(menuItem.toString());

		}
	}
	
	/**
	 * Tests the modifyMenuItem() method
	 * @throws ParseException
	 */
	public static void testModifyMenuItem() throws ParseException {
		MenuItem menuItem = new MenuItem(1, "Paneer", 119.00f, true, DateUtil.convertToDate("09/09/2020"), "Main Course", false);
		MenuItemDaoCollectionImpl menuItemDaoCollectionImpl = new MenuItemDaoCollectionImpl();
		MenuItemDao menuItemDao = menuItemDaoCollectionImpl;
		menuItemDao.modifyMenuItem(menuItem);
		System.out.println("Updated Details:"+menuItemDao.getMenuItem(000001));
	}
	
	/**
	 * Main method
	 * @param args
	 */
	public static void main(String[] args) {
		testGetMenuItemListAdmin();
		System.out.println("");
		testGetMenuItemListCustomer();
		System.out.println("");
		try {
			testModifyMenuItem();
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
