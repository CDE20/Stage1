package com.cognizant.truyum.dao;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.cognizant.truyum.model.MenuItem;
import com.cognizant.truyum.util.DateUtil;

public class MenuItemDaoCollectionImplTest {

	private static MenuItemDaoCollectionImpl M;

	public static void main(String[] args) {

		System.out.println("Before Modification Menu Item List\n\n");
		testGetMenuItemListAdmin();
		// testGetMenuItemListCustomer();

		System.out.println("After Modification\n\n");
		testModifyMenuItem();

	}

	public static void testGetMenuItemListAdmin() {

		M = new MenuItemDaoCollectionImpl();
		List<MenuItem> list = M.getMenuItemListAdmin();
		for (MenuItem menuItem : list) {
			System.out.println(menuItem.toString());
			// System.out.println();
		}
	}

	public static void testGetMenuItemListCustomer() {
		M = new MenuItemDaoCollectionImpl();
		List<MenuItem> list = M.getMenuItemListCustomer();
		for (MenuItem menuItem : list) {
			System.out.println(menuItem.toString());
		}
	}

	public static void testModifyMenuItem() {

		MenuItem item = new MenuItem(102, "Veg Burger", 139, true, DateUtil.convertToDate("23/12/2017"), "Main Course",
				false);
		M = new MenuItemDaoCollectionImpl();
		M.modifyMenuItem(item);
		testGetMenuItem();
	}

	public static void testGetMenuItem() {

		M = new MenuItemDaoCollectionImpl();
		MenuItem item = M.getMenuItem(102);
		System.out.println(item.toString());
	}

}
