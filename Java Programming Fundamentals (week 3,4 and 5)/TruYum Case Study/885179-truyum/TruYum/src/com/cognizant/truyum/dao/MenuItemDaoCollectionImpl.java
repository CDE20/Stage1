package com.cognizant.truyum.dao;

import java.util.Date;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import com.cognizant.truyum.model.MenuItem;
import com.cognizant.truyum.util.DateUtil;

/**
 * 
 * @author 
 *
 */
public class MenuItemDaoCollectionImpl implements MenuItemDao {
	static List<MenuItem> menuItemList;

	/**
	 * Constructor
	 */
	public MenuItemDaoCollectionImpl() {
		if (menuItemList == null) {
			try {
				menuItemList = new ArrayList<MenuItem>();
				menuItemList.add(new MenuItem(000001, "Sandwich", 99.00f, true, DateUtil.convertToDate("15/03/2017"),
						"Main Course", true));
				menuItemList.add(new MenuItem(000002, "Burger", 129.00f, true, DateUtil.convertToDate("23/12/2017"),
						"Main Course", false));
				menuItemList.add(new MenuItem(000003, "Pizza", 149.00f, true, DateUtil.convertToDate("21/08/2018"),
						"Main Course", false));
				menuItemList.add(new MenuItem(000004, "French Fries", 200.00f, false,
						DateUtil.convertToDate("02/07/2017"), "Main Course", false));
				menuItemList.add(new MenuItem(000005, "Choclate Brownie", 32.00f, true,
						DateUtil.convertToDate("02/11/2022"), "Dessert", true));
			} catch (ParseException e) {
				e.printStackTrace();
			}

		}
	}

	/**
	 * @return List of menu items for admin
	 */
	@Override
	public List<MenuItem> getMenuItemListAdmin() {
		return menuItemList;
	}

	/**
	 * @return List of menu items for customer
	 */
	@Override
	public List<MenuItem> getMenuItemListCustomer() {
		List<MenuItem> menuItemListCust = new ArrayList<MenuItem>();

		Date today = new Date();
		for (MenuItem menuItem : menuItemList) {
			if (menuItem.getDateOfLaunch().getTime() <= today.getTime() && menuItem.isActive()) {
				menuItemListCust.add(menuItem);
			}
		}
		return menuItemListCust;
	}

	/**
	 * Modifies the details of menu item in MenuItem
	 * 
	 * @param Object of MenuItem
	 */
	@Override
	public void modifyMenuItem(MenuItem menuItem) {
		for (MenuItem menuItemForModification : menuItemList) {
			if (menuItem.getId() == menuItemForModification.getId()) {

				menuItemForModification.setName(menuItem.getName());
				menuItemForModification.setCategory(menuItem.getCategory());
				menuItemForModification.setDateOfLaunch(menuItem.getDateOfLaunch());
				menuItemForModification.setFreeDelivery(menuItem.isFreeDelivery());
				menuItemForModification.setPrice(menuItem.getPrice());
				menuItemForModification.setActive(menuItem.isActive());

			}
		}
	}

	/**
	 * Fetches menu items based on menuItemId
	 * 
	 * @param Id of the menuItem
	 */
	@Override
	public MenuItem getMenuItem(long menuItemId) {
		for (MenuItem menuItem : menuItemList) {
			if (menuItemId == menuItem.getId()) {
				return menuItem;
			}
		}
		return null;
	}

}
