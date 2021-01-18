package com.cognizant.truyum.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.cognizant.truyum.model.Cart;
import com.cognizant.truyum.model.MenuItem;

public class CartDaoCollectionImpl implements CartDao {

	private static HashMap<Long, Cart> userCarts;

	public CartDaoCollectionImpl() {
		if (userCarts == null) {
			userCarts = new HashMap<>();
		}
	}

	@Override
	public void addCartItem(long userId, long menuItemId) {
		MenuItemDaoCollectionImpl menuItemDao = new MenuItemDaoCollectionImpl();
		MenuItem menuItem = menuItemDao.getMenuItem(menuItemId);

		if (userCarts.containsKey(userId)) {
			List<MenuItem> menuItemList = userCarts.get(userId).getMenuItemList();
			menuItemList.add(menuItem);
		} else {
			List<MenuItem> menuItemList = new ArrayList<>();
			Cart cart = new Cart(menuItemList, 0);
			menuItemList.add(menuItem);
			userCarts.put(userId, cart);
		}
	}

	@Override
	public List<MenuItem> getAllCartItems(long userId) throws CartEmptyException {
		Cart cart = userCarts.getOrDefault(userId, new Cart(new ArrayList<>(), 0));

		List<MenuItem> menuItemList = cart.getMenuItemList();

		if (menuItemList.isEmpty()) {
			throw new CartEmptyException("Cart is Empty");
		} else {
			double total = 0;
			for (MenuItem m : menuItemList) {
				total += m.getPrice();
			}
			cart.setTotal(total);
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