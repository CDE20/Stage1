package com.cognizant.truyum.dao;

import java.util.ArrayList;
import com.cognizant.truyum.model.MenuItem;
import com.cognizant.truyum.util.DateUtil;

public class MenuItemDaoCollectionImpl implements MenuItemDao{

	private static ArrayList<MenuItem> menuItemList;
	public MenuItemDaoCollectionImpl() {
		if(menuItemList==null) {
			ArrayList<MenuItem> lst = new ArrayList<>();
			MenuItem m1 = new MenuItem(1,"Sandwich",(float) 99.00,true,DateUtil.convertToDate("15/03/2017"),"Main Course",true);
			lst.add(m1);
			MenuItem m2 = new MenuItem(2,"Burger",(float) 129.00,true,DateUtil.convertToDate("23/12/2017"),"Main Course",false);
			lst.add(m2);
			MenuItem m3 = new MenuItem(3,"Pizza",(float) 149.00,true,DateUtil.convertToDate("21/08/2018"),"Main Course",false);
			lst.add(m3);
			MenuItem m4 = new MenuItem(4,"French Fries",(float) 57.00,false,DateUtil.convertToDate("02/07/2017"),"Starters",true);
			lst.add(m4);
			MenuItem m5 = new MenuItem(5,"Chocolate Brownie",(float) 32.00,true,DateUtil.convertToDate("02/11/2022"),"Desert",true);
			lst.add(m5);
			menuItemList=lst;
		}
	}
	public ArrayList<MenuItem> getMenuItemListAdmin(){
	
		return menuItemList;
	}
	
	public ArrayList<MenuItem> getMenuItemListCustomer() {
		ArrayList<MenuItem> menu = new ArrayList<MenuItem>();
		DateUtil d = new DateUtil();
		for(MenuItem m:menuItemList) {
			if(m.isActive()==true &&(m.getDateOfLaunch().before(d.convertToDate("19/08/2019")))) {
				menu.add(m);
			}
		}
		return menu;
	}
	@Override
	public void modifyMenuItem(MenuItem menuItem) {
		
		for(MenuItem m:menuItemList) {
			if(m.getId()==(menuItem.getId())) {
				m.setId(menuItem.getId());
				m.setName(menuItem.getName());
				m.setCategory(menuItem.getCategory());
				m.setPrice(menuItem.getPrice());
				m.setActive(menuItem.isActive());
				m.setDateOfLaunch(menuItem.getDateOfLaunch());
			}
		}
	}
	@Override
	public MenuItem getMenuItem(long menuItemId) {
		MenuItem menu=null;
		for(MenuItem m:menuItemList) {
			if(m.getId()==menuItemId) {
				menu=m;
				break;
			}
		}
		return menu;
	}
}