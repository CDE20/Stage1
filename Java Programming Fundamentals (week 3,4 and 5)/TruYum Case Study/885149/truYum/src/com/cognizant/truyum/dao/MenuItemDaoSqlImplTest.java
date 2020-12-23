package com.cognizant.truyum.dao;

import java.sql.Date;
import java.util.List;

import com.cognizant.truyum.model.MenuItem;

public class MenuItemDaoSqlImplTest {
	public static void main(String[] args) {
		MenuItemDaoSqlImplTest m = new MenuItemDaoSqlImplTest();
		List<MenuItem> list1 = m.getMenuItemAdminTest();
		for(MenuItem m1: list1) {
			System.out.println(m1);
		}
		System.out.println("Customer ");
		List<MenuItem> custlist1 = m.getMenuItemListCustomer();
		for(MenuItem m1: custlist1) {
			System.out.println(m1);
		}
		
		System.out.println("Get Menu Item");
		MenuItem mi = m.getMenuItemTest(002L);
		System.out.println(mi);
		
		m.testUpdate();
	}
	
	public List<MenuItem> getMenuItemAdminTest(){
		MenuItemDao test1 = new MenuItemDaoSqlImpl();
		List<MenuItem> list= test1.getMenuItemAdmin();
		return list;
	}
	
	public List<MenuItem> getMenuItemListCustomer(){
		MenuItemDao test1 = new MenuItemDaoSqlImpl();
		List<MenuItem> list= test1.getMenuItemListCustomer();
		return list;
	}
	
	public MenuItem getMenuItemTest(long menuItemId) {
		MenuItemDao test1 = new MenuItemDaoSqlImpl();
		MenuItem i= test1.getMenuItem(menuItemId);
		return i;
	}
	
	public void testUpdate() {
		MenuItemDao test1 = new MenuItemDaoSqlImpl();
		MenuItem menuItem = new MenuItem(002L, "Burger", 129.0f, true, new Date(2017-12-23),"Main Course",false);
		test1.modifyMenuItem(menuItem);
	}

}
