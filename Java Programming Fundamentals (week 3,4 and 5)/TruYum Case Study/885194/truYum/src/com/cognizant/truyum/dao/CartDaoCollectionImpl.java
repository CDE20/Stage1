package com.cognizant.truyum.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.cognizant.truyum.model.Cart;
import com.cognizant.truyum.model.MenuItem;

public class CartDaoCollectionImpl implements CartDao {

	private static HashMap<Long, Cart> userCarts;

	public CartDaoCollectionImpl() {
		super();
		if (userCarts == null) {
			userCarts = new HashMap<Long, Cart>();
		}
	}

	public void addCartItem(long userId, long menuItemId) {
		MenuItemDaoCollectionImpl menuItemDao = new MenuItemDaoCollectionImpl();
		MenuItem mi = menuItemDao.getMenuItem(menuItemId);
		if (!userCarts.containsKey(userId)) {
			userCarts.put(userId, new Cart(new ArrayList<MenuItem>(), 0));
		}
		List<MenuItem> menuItemList = userCarts.get(userId).getMenuItemList();
		menuItemList.add(mi);

	}

	@Override 
	public List<MenuItem> getAllCartItems(long userId) throws CartEmptyException {
		Cart cart = userCarts.getOrDefault(userId, new Cart(new ArrayList<>(), 0));

		List<MenuItem> menuItemList = cart.getMenuItemList();

		if (menuItemList.isEmpty()) {
			throw new CartEmptyException();
		} else {
			double total = 0;
			for (MenuItem m : menuItemList) {
				total += m.getPrice();
			}
			cart.setTotal(total);
			System.out.println("total " + total);
			userCarts.put(userId, cart);
		}
		return menuItemList;
	}

	@Override

	public void removeCartItem(long userId, long menuItemId) {
		Cart cart = userCarts.get(userId);
		if (cart != null) {
			List<MenuItem> menuItemList = cart.getMenuItemList();
			for (int i = 0; i < menuItemList.size(); i++) {
				if (menuItemList.get(i).getId() == menuItemId) {
					menuItemList.remove(i);
				}
			}
		}
	}

}
