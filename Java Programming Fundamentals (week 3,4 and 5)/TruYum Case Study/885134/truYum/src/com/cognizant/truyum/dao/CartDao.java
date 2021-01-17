package com.cognizant.truyum.dao;

import java.util.List;

import com.cognizant.truyum.model.MenuItem;


public interface CartDao {
	void addCartItem(long userId, long menuItemId);

	public List<MenuItem> getAllCartItems(long userId) throws CartEmptyException;

	void removeCartItem(long userId,long menuItemId);
}
