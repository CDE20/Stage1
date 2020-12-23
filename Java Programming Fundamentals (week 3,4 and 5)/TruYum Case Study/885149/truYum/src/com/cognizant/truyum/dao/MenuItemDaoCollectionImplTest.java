package com.cognizant.truyum.dao;

import java.util.ArrayList;
import java.util.List;
import com.cognizant.truyum.model.MenuItem;
import com.cognizant.truyum.util.DateUtil;

public class MenuItemDaoCollectionImplTest {
	public static void main(String[] args) {
		System.out.println("Admin List");
		MenuItemDaoCollectionImplTest mic = new MenuItemDaoCollectionImplTest();
		mic.testGetMenuItemListAdmin();
		System.out.println();
		System.out.println("Customer List");
		mic.testGetMenuItemListCustomer();
		System.out.println();
		System.out.println("Modified Details");
		mic.testModifyMenuItem();
		
	}
	public void testGetMenuItemListAdmin(){
		MenuItemDao menuItemDao = new MenuItemDaoCollectionImpl();
		List<MenuItem> menuItem=menuItemDao.getMenuItemAdmin();
		for(MenuItem m:menuItem){
			System.out.println(m);
		}
	}
	
	public void testGetMenuItemListCustomer(){
		MenuItemDao menuItemDao1 = new MenuItemDaoCollectionImpl();
		List<MenuItem> custList= menuItemDao1.getMenuItemListCustomer();
		for(MenuItem m1:custList){
			System.out.println(m1);
		}
		
	}
	public void testModifyMenuItem(){
		DateUtil du = new DateUtil();
		MenuItem mtest= new MenuItem(003L,"Thal",129.00f,true,du.convertToDate("21/8/2017"),"Main Course",false);
		MenuItemDao menuItemDao2 = new MenuItemDaoCollectionImpl();
		menuItemDao2.modifyMenuItem(mtest);
		System.out.println(menuItemDao2.getMenuItem(003L));
	}

}
