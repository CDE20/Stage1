package com.cognizant.truyum.dao;

import java.util.*;
import com.cognizant.truyum.model.MenuItem;
import com.cognizant.truyum.util.DateUtil;

public class MenuItemDaoCollectionImplTest {

	public static void main(String[] args) {
		MenuItemDaoCollectionImplTest M = new MenuItemDaoCollectionImplTest();
		System.out.println("For admin");
		M.testGetMenuItemListAdmin();
		System.out.println("For Customer");
		M.testGetMenuItemListCustomer();
		System.out.println("Modified");
		M.testModifyMenuItem();
		
	}
	public void testGetMenuItemListAdmin() {
		
		MenuItemDaoCollectionImpl menuItemDao = new MenuItemDaoCollectionImpl();
		List<MenuItem>  menuItemList= menuItemDao.getMenuItemListAdmin();
		for(MenuItem m:menuItemList) {
			System.out.println(m.toString());
		}
	}
	public void testGetMenuItemListCustomer() {
		
		MenuItemDaoCollectionImpl menuItemDao = new MenuItemDaoCollectionImpl();
		List<MenuItem>  menuItemList= menuItemDao.getMenuItemListCustomer();
		for(MenuItem m:menuItemList) {
			System.out.println(m.toString());
		}
	}
	public void testModifyMenuItem(){
		
		MenuItem menuItem = new MenuItem(1,"Sandwich",(float) 99.00,true,DateUtil.convertToDate("15/03/2017"),"Main Course",true);
		MenuItemDaoCollectionImpl menuItemDaoImpl = new MenuItemDaoCollectionImpl();
		MenuItemDao menuItemDao = menuItemDaoImpl;
		menuItemDao.modifyMenuItem(menuItem);
		System.out.println(menuItemDao.getMenuItem(1));
		
	}
	public void testGetMenuItem(){
		
	}
}
