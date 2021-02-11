package com.cognizant.truyum.dao;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;

import com.cognizant.truyum.model.MenuItem;
import com.cognizant.truyum.util.DateUtil;
public class MenuItemDaoSqlImplTest{
	public static void testGetMenuItemListAdmin() throws ClassNotFoundException, SQLException {
		List<MenuItem> menuList = new MenuItemDaoSqlImpl().getMenuItemListAdmin();
		for (MenuItem menuItem : menuList) {
			System.out.println(menuItem.toString());
		}
		
	}
	public static void testGetMenuItemListCustomer() throws ClassNotFoundException, SQLException {
		List<MenuItem> menuList = new MenuItemDaoSqlImpl().getMenuItemListCustomer();
		for (MenuItem menuItem : menuList) {
			System.out.println(menuItem.toString());
		}		
	}
	public static void testModifyMenuItem() throws ClassNotFoundException, SQLException, ParseException {
		MenuItem menuItem = new MenuItem(1, "Sandwich", 99.00f, true, DateUtil.convertToDate("15/03/2017"),
				"Main Course", true);
		new MenuItemDaoSqlImpl().editMenuItem(menuItem);			
	}
	public static void testGetMenuItem() throws ClassNotFoundException, SQLException {
		MenuItem item = new MenuItemDaoSqlImpl().getMenuItem(1);
		System.out.println(item.toString());		
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException, ParseException {
		testGetMenuItemListAdmin();
		testGetMenuItemListCustomer();
		testModifyMenuItem();
		testGetMenuItem();
	}
}