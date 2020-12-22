package com.cognizant.truyum.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.cognizant.truyum.model.Cart;
import com.cognizant.truyum.model.MenuItem;

public class CartDaoCollectionImpl implements CartDao {

	private static HashMap<Long, Cart> userCarts;

	public CartDaoCollectionImpl() {
		super();
		if (userCarts == null) {
			userCarts = new HashMap<>();
		}
	}

	@Override
	public void addCartItem(long userId, long menuItemId) {

		int flag = 0;
		// Set<Long> keySet = userCarts.keySet();
		MenuItem M = new MenuItemDaoCollectionImpl().getMenuItem(menuItemId);
		for (Map.Entry<Long, Cart> E : userCarts.entrySet()) {

			if (E.getKey() == userId) {
				Cart C = E.getValue();
				C.getMenuItemList().add(M);
				flag = 1;
				// System.out.println("Menu Added Successfully");
			}
		}
		if (flag == 0) {
			List<MenuItem> list = new ArrayList<>();
			list.add(M);
			Cart C = new Cart(list, M.getPrice());
			userCarts.put(userId, C);
			// System.out.println("Menu Added Successfully");
		}
	}

	@Override
	public List<MenuItem> getAllCartItems(long userId) throws CartEmptyException {

		// List<MenuItem> M = new ArrayList<>();

		Cart cart = userCarts.get(userId);
		List<MenuItem> M = cart.getMenuItemList();
		if (M.isEmpty())
			throw new CartEmptyException("Cart of the user is empty");
		return M;
	}

	@Override
	public void removeCartItem(long userId, long menuItemId) {

		Cart cart = userCarts.get(userId);
		List<MenuItem> list = cart.getMenuItemList();
		int count = 0;
		for (MenuItem menuItem : list) {
			if (menuItem.getId() == menuItemId) {
				list.remove(count);
				count++;
			}

		}

	}

}
