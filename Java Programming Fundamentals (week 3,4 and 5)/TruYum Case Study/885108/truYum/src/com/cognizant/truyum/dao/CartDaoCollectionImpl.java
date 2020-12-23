package com.cognizant.truyum.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.cognizant.truyum.model.Cart;
import com.cognizant.truyum.model.MenuItem;

public class CartDaoCollectionImpl implements CartDao {
	private HashMap<Long, Cart> userCarts = null;
	
	public CartDaoCollectionImpl() {
		if(userCarts == null) {
			userCarts = new HashMap<>();
		}
	}

	@Override
	public void addCartItem(long userId, long menuItemId) {
		// TODO Auto-generated method stub
		MenuItemDao menuItemDao = new MenuItemDaoCollectionImpl();
		MenuItem m = menuItemDao.getMenuItem(menuItemId);
		boolean found = false;
		for(Map.Entry<Long , Cart> obj : userCarts.entrySet()) {
			if(obj.getKey() == userId) {
				obj.getValue().getMenuItemList().add(m);
				found  = true;
				break;
			}
		}
		if(found == false) {
			Cart c = new Cart();
			c.getMenuItemList().add(m);
			userCarts.put(userId, c);
		}
	}

	@Override
	public List<MenuItem> getAllCartItems(long userId) throws CartEmptyException {
		// TODO Auto-generated method stub
		Cart c = userCarts.get(userId);
		if(c.getMenuItemList().size() == 0)
			throw new CartEmptyException();
		else {
			double sum = 0;
			for(MenuItem m : c.getMenuItemList()) 
				sum += m.getPrice();
			c.setTotal(sum);
		}
		return c.getMenuItemList();
	}

	@Override
	public void removeCartItem(long userId, long menuItemId) {
		// TODO Auto-generated method stub
		Cart c = userCarts.get(userId);
		int count =0;
		for(MenuItem m : c.getMenuItemList()) {
			if(m.getId() == menuItemId) {
				count++;break;
			}
				
		}
		c.getMenuItemList().remove(count);
	}

}
