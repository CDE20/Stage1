package com.cognizant.truyum.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.cognizant.truyum.model.MenuItem;
import com.cognizant.truyum.util.DateUtil;

public class MenuItemDaoCollectionImpl implements MenuItemDao {

	private static List<MenuItem> menuItemList = null;
	DateUtil du = new DateUtil();

	@Override
	public List<MenuItem> getMenuItemAdmin() {
		return menuItemList;
	}

	@Override
	public List<MenuItem> getMenuItemListCustomer() {
		ArrayList<MenuItem> customerList = new ArrayList<>();
		for (MenuItem m : menuItemList) {
			if (m.getDateOfLaunch().before(new Date())) {
				if (m.isActive()) {
					customerList.add(m);
				}
			}
		}
		return customerList;
	}

	@Override
	public void modifyMenuItem(MenuItem menuItem) {
		for (MenuItem m : menuItemList) {
			if (m.equals(menuItem)) {
				m.setName(menuItem.getName());
				m.setPrice(menuItem.getPrice());
				m.setActive(menuItem.isActive());
				m.setCategory(menuItem.getCategory());
				m.setDateOfLaunch(menuItem.getDateOfLaunch());
				m.setFreeDilvery(menuItem.isFreeDilvery());
			}
		}

	}

	@Override
	public MenuItem getMenuItem(long menuItemId) {
		// MenuItem m = new MenuItem();
		for (MenuItem m : menuItemList) {
			if (m.getId() == menuItemId) {
				return m;
			}
		}
		return null;
	}

	public MenuItemDaoCollectionImpl() {
		if (menuItemList == null) {
			menuItemList = new ArrayList<MenuItem>();
			MenuItem item1 = new MenuItem(001L, "Sandwich", 99.00f, true, du.convertToDate("15/03/2017"), "Main Course",
					true);
			menuItemList.add(item1);
			MenuItem item2 = new MenuItem(002L, "Burger", 129.00f, true, du.convertToDate("23/12/2017"), "Main Course",
					false);
			menuItemList.add(item2);
			MenuItem item3 = new MenuItem(003L, "Pizza", 129.00f, true, du.convertToDate("21/8/2017"), "Main Course",
					false);
			menuItemList.add(item3);
			MenuItem item4 = new MenuItem(004L, "French Fries", 57.00f, false, du.convertToDate("02/07/2017"),
					"Starters", true);
			menuItemList.add(item4);
			MenuItem item5 = new MenuItem(005L, "Chocolate Brownie", 32.00f, true, du.convertToDate("02/11/2022"),
					"Desert", true);
			menuItemList.add(item5);
		}
	}

}
