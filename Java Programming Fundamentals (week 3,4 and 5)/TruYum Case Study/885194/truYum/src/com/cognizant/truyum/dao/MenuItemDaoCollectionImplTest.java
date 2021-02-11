package com.cognizant.truyum.dao;

import java.util.List;

import com.cognizant.truyum.model.MenuItem;
import com.cognizant.truyum.util.DateUtil;

class MenuItemDaoCollectionImplTest {
	public static void main(String[] args) {
		testGetMenuItemListAdmin();
		testGetMenuItemListCustomer();
		testModifyMenuItem();
		testGetMenuItem();
	}


	static void testGetMenuItemListAdmin() {
		MenuItemDaoCollectionImpl menuItemDao = new MenuItemDaoCollectionImpl();
		List<MenuItem> menuItemList = menuItemDao.getMenuItemListAdmin();
		
		for (MenuItem m : menuItemList) {
			System.out.println(m);
		}
	}
		
		static void testGetMenuItemListCustomer() {
			MenuItemDaoCollectionImpl menuItemDao = new MenuItemDaoCollectionImpl();
			List<MenuItem> menuItemList1 = menuItemDao.getMenuItemListCustomer();
			
			for (MenuItem m : menuItemList1) {
				System.out.println(m);
			}
	}
		
		static void testModifyMenuItem() {
			MenuItem item = new MenuItem(1, "Misal", 60.00f, true, DateUtil.convertToDate("27/07/2015"),"Main Course" ,true);
			MenuItemDao menuItemDao = new MenuItemDaoCollectionImpl();
			menuItemDao.modifyMenuItem(item);
			System.out.println();
			
				
		}
		public static void testGetMenuItem() {
			MenuItemDao menuItemDao = new MenuItemDaoCollectionImpl();
			MenuItem menuItem = menuItemDao.getMenuItem(1);
			System.out.println(menuItem);

}
		
}
		
