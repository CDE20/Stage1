package com.cognizant.truyum.dao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Period;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.cognizant.truyum.model.MenuItem;
import com.cognizant.truyum.util.DateUtil;

public class MenuItemDaoCollectionImpl implements MenuItemDao {
	
	private List<MenuItem> menuItemList ;
	
	@SuppressWarnings("deprecation")
	public MenuItemDaoCollectionImpl() {
		if(menuItemList == null) {
			menuItemList = new ArrayList<>();
			MenuItem m ;
			long id = 1;
			String name = "Sandwich",category="Main Course";
			float price = (float) 99.00;
			boolean active = true,free_delivery  =true;
			Date dateOfLaunch;
			dateOfLaunch = DateUtil.convertToDate("15/03/2017");
			m = new MenuItem(id, name, price, active, dateOfLaunch, category, free_delivery);
			menuItemList.add(m);
			id= 2;name = "Burger";price = (float) 129.00;active = true;dateOfLaunch = DateUtil.convertToDate("23/12/2017");category="Main Course";free_delivery=false;
			m = new MenuItem(id, name, price, active, dateOfLaunch, category, free_delivery);
			menuItemList.add(m);
			id= 3;name = "Pizza";price = (float) 149.00;active = true;dateOfLaunch = DateUtil.convertToDate("21/08/2017");category="Main Course";free_delivery=false;
			m = new MenuItem(id, name, price, active, dateOfLaunch, category, free_delivery);
			menuItemList.add(m);
			id= 4;name = "French Fries";price = (float) 57.00;active = false;dateOfLaunch = DateUtil.convertToDate("02/07/2017");category="Starters";free_delivery=true;
			m = new MenuItem(id, name, price, active, dateOfLaunch, category, free_delivery);
			menuItemList.add(m);
			id= 5;name = "Chocolate Brownie";price = (float) 32.00;active = true;dateOfLaunch = DateUtil.convertToDate("02/11/2017");category="Dessert";free_delivery=true;
			m = new MenuItem(id, name, price, active, dateOfLaunch, category, free_delivery);
			menuItemList.add(m);
		}
	}
	@Override
	public List<MenuItem> getMenuItemListAdmin() {
		return menuItemList;
	}

	@Override
	public List<MenuItem> getMenuItemListCustomer() {
		List<MenuItem> arr = new ArrayList<MenuItem>();
		try {
			Date current = new SimpleDateFormat("dd/MM/yyyy").parse("22/12/2020");
			Period p;
			for(MenuItem m : menuItemList) {
				p = Period.between(current.toInstant().atZone(ZoneId.systemDefault()).toLocalDate(), m.getDateOfLaunch().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
				if(p.getDays() <= 1) {
					if(m.isActive())
						arr.add(m);
				}
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return arr;
	}

	@Override
	public void modifyMenuItem(MenuItem menuItem) {
		// TODO Auto-generated method stub
		for(MenuItem m : menuItemList) {
			if(m.getId() == (menuItem).getId())
				m = menuItem;
		}
	}

	@Override
	public MenuItem getMenuItem(long menuItemId) {
		// TODO Auto-generated method stub
		MenuItem m1 = null;
		for(MenuItem m : menuItemList) {
			if(m.getId() == menuItemId)
				m1 = m;
		}
		return m1;
	}

}
