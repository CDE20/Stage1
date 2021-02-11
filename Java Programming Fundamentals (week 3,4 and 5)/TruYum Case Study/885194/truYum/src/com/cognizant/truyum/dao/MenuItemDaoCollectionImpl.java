package com.cognizant.truyum.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.cognizant.truyum.model.MenuItem;
import com.cognizant.truyum.util.DateUtil;

public class MenuItemDaoCollectionImpl implements MenuItemDao {

	 private static List<MenuItem> menuItemList;
	 
	public MenuItemDaoCollectionImpl() {
		super();
		if(menuItemList == null) {
			menuItemList = new ArrayList<MenuItem>();
			menuItemList.add(new MenuItem(1, "Sandwich", 99.0f, true, DateUtil.convertToDate("15/03/2017"), "Main Course", true));
			menuItemList.add(new MenuItem(2, "Burger", 129.0f, true, DateUtil.convertToDate("23/12/2017"), "Main Course", true));
			menuItemList.add(new MenuItem(3, "Pizaa", 149.0f, true, DateUtil.convertToDate("21/08/2017"), "Main Course", true));
			menuItemList.add(new MenuItem(4, "French Fries", 57.0f, true, DateUtil.convertToDate("02/07/2017"), "Starters", true));
			menuItemList.add(new MenuItem(5, "Chocolate Brownie", 32.0f, true, DateUtil.convertToDate("02/11/2022"), "Dessert", true));
	
		}
		
	}

	@Override
	public List<MenuItem> getMenuItemListAdmin() {
		return menuItemList;
	}

	public List<MenuItem> getMenuItemListCustomer(){
		ArrayList<MenuItem> arraylist = new ArrayList<>();
		Date currdate = new Date();
		for (MenuItem menuItem : menuItemList) {
			if (currdate.compareTo(menuItem.getDateOfLaunch()) <= 0 && menuItem.isActive()) {
				arraylist.add(menuItem);
			}
		}
		return arraylist;
		
	}
	
	public void modifyMenuItem(MenuItem menuItem) {
		for(MenuItem m : menuItemList ) {
			if(menuItem.getId() == m.getId()) {
				m.setName(menuItem.getName());
				m.setActive(menuItem.isActive());
				m.setCategory(menuItem.getCategory());
				m.setDateOfLaunch(menuItem.getDateOfLaunch());
				m.setFreeDelivery(menuItem.isFreeDelivery());
				m.setPrice(menuItem.getPrice());
				break;
				
			}
		}
	}
	
	 public MenuItem getMenuItem(long menuItemId) {
		 for(MenuItem m1 : menuItemList ) {
			 if(m1.getId() == menuItemId) {
				 return m1;
			 }
		 }
		 return null;
		 
	 }
	
	
}
