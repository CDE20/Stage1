package com.cognizant.truyum.dao;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.cognizant.truyum.model.MenuItem;
import com.cognizant.truyum.util.DateUtil;

public class MenuItemDaoCollectionImpl implements MenuItemDao {

	private static List<MenuItem> menuItemList;;
	MenuItem M;

	public MenuItemDaoCollectionImpl() {
		super();
		if (menuItemList == null) {
			menuItemList = new ArrayList<>();
			M = new MenuItem(101, "Sandwich", 99, true, DateUtil.convertToDate("15/03/2017"), "Main Course", true);
			menuItemList.add(M);
			menuItemList.add(
					new MenuItem(102, "Burger", 129, true, DateUtil.convertToDate("23/12/2017"), "Main Course", false));
			menuItemList.add(
					new MenuItem(103, "Pizza", 149, true, DateUtil.convertToDate("21/08/2018"), "Main Course", false));
			menuItemList.add(new MenuItem(104, "French Fries", 57, false, DateUtil.convertToDate("02/07/2017"),
					"Starters", true));
			menuItemList.add(new MenuItem(105, "Chocolate Brownie", 32, true, DateUtil.convertToDate("02/11/2022"),
					"Dessert", true));
		}
	}

	// This Method returns the Menu List for Admin
	@Override
	public List<MenuItem> getMenuItemListAdmin() {
		return menuItemList;
	}

	// This Method returns the Menu List for Customer
	@Override
	public List<MenuItem> getMenuItemListCustomer() {
		List<MenuItem> list = new ArrayList<MenuItem>();
		for (MenuItem menuItem : menuItemList) {
			// SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
			Date date = new Date();
			if (menuItem.getDateOfLaunch().before(date) || menuItem.getDateOfLaunch().equals(date))
				if (menuItem.isActive())
					list.add(menuItem);
		}
		return list;
	}

	// modify MenuItem
	@Override
	public void modifyMenuItem(MenuItem menuItem) {

		for (int i = 0; i < menuItemList.size(); i++) {
			if (menuItemList.get(i).equals(menuItem)) {
				menuItemList.remove(i);
				menuItemList.add(i, menuItem);
			}

		}

	}

	@Override
	public MenuItem getMenuItem(long menuItemId) {

		for (MenuItem menuItem : menuItemList) {
			if (menuItem.getId() == menuItemId)
				return menuItem;
		}
		return null;
	}

}
