package com.cognizant.truyum.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

import com.cognizant.truyum.model.Cart;
import com.cognizant.truyum.model.MenuItem;

public class CartDaoCollectionImpl implements CartDao {

	private static HashMap<Long, Cart> userCarts;

	@Override
	public void addCartItem(long userId, long menuItemId) {
		MenuItemDao menuItemDao = new MenuItemDaoCollectionImpl();
		MenuItem menu = menuItemDao.getMenuItem(menuItemId);
		// System.out.println(menu);
		// Set<Long> keys = userCarts.keySet();
		if (userCarts.keySet().contains(userId)) {
			List<MenuItem> orderlist = userCarts.get(userId).getMenuItemList();
			orderlist.add(menu);
			userCarts.get(userId).setMenuItemList(orderlist);
		} else {
			Cart newCart = new Cart(new ArrayList<>(), 0);
			List<MenuItem> newlist = newCart.getMenuItemList();
			newlist.add(menu);
			newCart.setMenuItemList(newlist);
			userCarts.put(userId, newCart);
		}

	}

	@Override
	public void removeCartItem(long userId, long menuItemId) {
		Cart cartItem = userCarts.get(userId);
		List<MenuItem> cartlist = cartItem.getMenuItemList();
		boolean flag = false;
		// Iterator<MenuItem> itr = new cartlist.iterator();
		MenuItem m1 = new MenuItem(0L, "", 0f, false, new Date(), "", false);
		for (MenuItem m : cartlist) {
			if (m.getId() == menuItemId) {
				flag = true;
				m1 = m;
				break;
			}
		}
		if (flag) {
			cartlist.remove(m1);
		}
	}

	@Override
	public List<MenuItem> getAllCartItem(long userId) throws CartEmptyException {
		Cart cartItem = userCarts.get(userId);
		List<MenuItem> cartlist = cartItem.getMenuItemList();
		if (cartlist.isEmpty()) {
			throw new CartEmptyException();
		} else {
			double total = 0;
			for (MenuItem m : cartlist) {
				total = total + m.getPrice();
			}
			cartItem.setTotal(total);
			return cartlist;
		}
	}

	public CartDaoCollectionImpl() {
		if (userCarts == null) {
			userCarts = new HashMap<Long, Cart>();

		}

	}

}
