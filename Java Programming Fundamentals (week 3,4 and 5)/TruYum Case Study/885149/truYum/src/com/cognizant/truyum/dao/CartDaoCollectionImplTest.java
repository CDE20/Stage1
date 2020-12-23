package com.cognizant.truyum.dao;

import java.util.List;

import com.cognizant.truyum.model.MenuItem;

public class CartDaoCollectionImplTest {
	public static void main(String[] args) throws CartEmptyException {
		CartDaoCollectionImplTest c = new CartDaoCollectionImplTest();
		c.testAddCartItem();
		c.testRemoveCartItem();
	}

	public void testAddCartItem() throws CartEmptyException {
		CartDao cartDao = new CartDaoCollectionImpl();
		cartDao.addCartItem(1, 002L);
		List<MenuItem> cart = cartDao.getAllCartItem(1);
		for (MenuItem m : cart) {
			System.out.println(m);
		}
	}

	public void testGetAllCartItem() throws CartEmptyException {
		CartDao cartDao = new CartDaoCollectionImpl();
		List<MenuItem> cart = cartDao.getAllCartItem(1);
		for (MenuItem m : cart) {
			System.out.println(m);
		}
	}

	public void testRemoveCartItem() {
		CartDao cartDao = new CartDaoCollectionImpl();
		cartDao.removeCartItem(1, 002L);
		try {
			cartDao.getAllCartItem(1);
		} catch (CartEmptyException e) {
			System.out.println("Cart is Empty");
		}
	}

}
