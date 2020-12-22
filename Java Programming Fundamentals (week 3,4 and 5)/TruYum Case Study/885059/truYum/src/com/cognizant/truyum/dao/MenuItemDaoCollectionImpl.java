package com.cognizant.truyum.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.cognizant.truyum.model.MenuItem;
import com.cognizant.truyum.util.DateUtil;

public class MenuItemDaoCollectionImpl implements MenuItemDao {

	private static List<MenuItem> menuItemList;

	public MenuItemDaoCollectionImpl() {
		// TODO Auto-generated constructor stub
		if (menuItemList == null)
		{
			menuItemList = new ArrayList<>();
			menuItemList.add(new MenuItem((long)1, "Sandwich", (float)99, true, DateUtil.convertToDate("15/03/2017"), "Main Course", true));
			menuItemList.add(new MenuItem((long)2, "Burger", (float)129, true, DateUtil.convertToDate("23/12/2017"), "Main Course", false));
			menuItemList.add(new MenuItem((long)3, "Pizza", (float)149, true, DateUtil.convertToDate("21/08/2018"), "Main Course", false));
			menuItemList.add(new MenuItem((long)4, "French Fries", (float)57, false, DateUtil.convertToDate("02/07/2017"), "Starters", true));
			menuItemList.add(new MenuItem((long)5, "Chocolate Brownie", (float)32, true, DateUtil.convertToDate("02/11/2022"), "Dessert", true));
		}
	}

	@Override
	public List<MenuItem> getMenuItemListAdmin() {
		// TODO Auto-generated method stub
		return menuItemList;
	}

	@Override
	public List<MenuItem> getMenuItemListCustomer() {
		// TODO Auto-generated method stub
		ArrayList<MenuItem> items = new ArrayList<>();
		for(MenuItem item: menuItemList)
		{
			if(item.getDateOfLaunch().before(new Date()) && item.isActive())
				items.add(item);
		}
		return items;
	}

	@Override
	public void modifyMenuItem(MenuItem menuItem) {
		// TODO Auto-generated method stub
		for(int i=0; i<menuItemList.size(); i++)
		{
			if(menuItem.equals(menuItemList.get(i)))
			{
				menuItemList.remove(i);
				menuItemList.add(i, menuItem);
				break;
			}
		}
	}

	@Override
	public MenuItem getMenuItem(long menuItemId) {
		// TODO Auto-generated method stub
		for(MenuItem item: menuItemList)
		{
			if(item.equals(menuItemId))
			{
				return item;
			}
		}
		return null;
	}

}
