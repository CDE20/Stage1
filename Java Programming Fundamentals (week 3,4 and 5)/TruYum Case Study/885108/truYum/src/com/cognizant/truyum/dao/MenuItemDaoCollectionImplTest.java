package com.cognizant.truyum.dao;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.cognizant.truyum.model.MenuItem;
import com.cognizant.truyum.util.DateUtil;

public class MenuItemDaoCollectionImplTest {
	public static void main(String args[]) {
		testGetMenuItemListAdmin();
		testGetMenuItemListCustomer();
	}
	
	public static void testGetMenuItemListAdmin() {
		MenuItemDao menuItemDao = new MenuItemDaoCollectionImpl();
		List<MenuItem> menuItemList  = menuItemDao.getMenuItemListAdmin();
		for(MenuItem m : menuItemList) {
			System.out.println(m.toString());
		}
	}
	
	public static void testGetMenuItemListCustomer(){
		MenuItemDao menuItemDao = new MenuItemDaoCollectionImpl();
		List<MenuItem> menuItemList = menuItemDao.getMenuItemListCustomer();
		for(MenuItem m : menuItemList) {
			System.out.println(m.toString());
		}
	}
	public static void testModifyMenuItem() {
		MenuItem m ;
		long id = 1;
		String name = "Sandwich",category="Main Course";
		float price = (float) 110.00;
		boolean active = true,free_delivery  =true;
		Date dateOfLaunch;
		try {
			dateOfLaunch = DateUtil.convertToDate("15/03/2017");
			m = new MenuItem(id, name, price, active, dateOfLaunch, category, free_delivery);
			MenuItemDao menuItemDao = new MenuItemDaoCollectionImpl();
			menuItemDao.modifyMenuItem(m);
			System.out.println(menuItemDao.getMenuItem(m.getId()));
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
}
