package com.cognizant.truyum.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.cognizant.truyum.model.Cart;
import com.cognizant.truyum.model.MenuItem;

public class CartDaoCollectionImpl implements CartDao {

	private HashMap<Long, Cart> userCarts;

	public CartDaoCollectionImpl() {
		// TODO Auto-generated constructor stub
		if (userCarts == null) {
			userCarts = new HashMap<>();
		}
	}

	@Override
	public void addCartItem(long userId, long menuItemId) {
		// TODO Auto-generated method stub
		MenuItemDao menuItemDao = new MenuItemDaoCollectionImpl();
		MenuItem menuItem = menuItemDao.getMenuItem(menuItemId);
		if (userCarts.containsKey(userId)) {
			userCarts.get(userId).getMenuItemList().add(menuItem);
		} else {
			ArrayList<MenuItem> itemList = new ArrayList<MenuItem>();
			itemList.add(menuItem);
			Cart cart = new Cart(itemList, menuItem.getPrice());
			userCarts.put(userId, cart);
		}
	}

	@Override
	public List<MenuItem> getAllCartItems(long userId) throws CartEmptyException {
		// TODO Auto-generated method stub
		List<MenuItem> menuItemList = userCarts.get(userId).getMenuItemList();
		if (menuItemList.isEmpty()) {
			throw new CartEmptyException("Cart Empty");
		} else {
			double total = 0;
			for (MenuItem item : menuItemList) {
				total += item.getPrice();
			}
			userCarts.get(userId).setTotal(total);
		}
		return menuItemList;
	}

	@Override
	public void removeCartItem(long userId, long menuItemId) {
		// TODO Auto-generated method stub
		List<MenuItem> menuItemList = userCarts.get(userId).getMenuItemList();
		for (MenuItem item : menuItemList) {
			if (menuItemId == item.getId()) {
				userCarts.get(userId).getMenuItemList().remove(item);
				break;
			}
		}

	}

}
