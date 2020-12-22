package com.cognizant.truyum.dao;

import java.sql.Date;
import java.util.LinkedList;
import java.util.List;

import com.cognizant.truyum.model.MenuItem;
import com.cognizant.truyum.util.DateUtil;

public class MenuItemDaoSqlImplTest {
	
	private static MenuItemDaoSqlImpl M = null;
	public static void main(String[] args) {
		
		System.out.println("Menu Item List From DB for admin\n");
		testGetMenuItemListAdmin();
		
		
		System.out.println("Menu Item List From DB for customer\n");
		testGetMenuItemListCustomer();
		
		System.out.println("Menu Item based on menu Id");
		testGetMenuItem();
		
		System.out.println("After Updation");
		testEditMenuItem();
		testGetMenuItemListAdmin();
		//M.getMenuItemListAdmin();
		
		
		
	}
	
	public static void testGetMenuItemListAdmin() {
		M = new MenuItemDaoSqlImpl();
		List<MenuItem> list =  M.getMenuItemListAdmin();
		
		for (MenuItem menuItem : list) {
			System.out.println(menuItem.toString());
		}
	}
	
	public static void testGetMenuItemListCustomer() {
		M = new MenuItemDaoSqlImpl();
		List<MenuItem> list =  M.getMenuItemListCustomer();
		
		for (MenuItem menuItem : list) {
			System.out.println(menuItem.toString());
		} 
	}
	
	public static void testGetMenuItem() {
		M = new MenuItemDaoSqlImpl();
		MenuItem menuItem = M.getMenuItem(001);
		System.out.println(menuItem.toString());
	}
	
	public static void testEditMenuItem() {
		M = new MenuItemDaoSqlImpl();
		String str = 2017 + "-" + 12 + "-" + "23";
		Date d = Date.valueOf(str);
		MenuItem menuItem = new MenuItem(002, "Burger", 79 , true ,DateUtil.convertToDate("25/12/2017"), "Starters", true);
		M.modifyMenuItem(menuItem);
	}

}
