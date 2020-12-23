package com.cognizant.truyum.dao;

import com.cognizant.truyum.model.Cart;
import com.cognizant.truyum.model.MenuItem;

public class CartDaoCollectionImplTest {
	public static void main(String[] args) {
		testAddCartItem();
		testRemoveCartItem();
	}

	private static void testRemoveCartItem() {
		// TODO Auto-generated method stub
		CartDao cartDao = new CartDaoCollectionImpl();
		cartDao.addCartItem(1, 2);
		cartDao.removeCartItem(1, 1);
		try {
			Cart c = new Cart();
			c.setMenuItemList(cartDao.getAllCartItems(1));
			for(MenuItem m: c.getMenuItemList()) {
				System.out.println(m.toString());
			}
			System.out.println("Total Price  "+c.getTotal());
		} catch (CartEmptyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void testAddCartItem() {
		// TODO Auto-generated method stub
		CartDao cartDao = new CartDaoCollectionImpl();
		cartDao.addCartItem(1, 1);
		try {
			Cart c = new Cart();
			c.setMenuItemList(cartDao.getAllCartItems(1));
			for(MenuItem m: c.getMenuItemList()) {
				System.out.println(m.toString());
			}
			System.out.println("Total Price  "+c.getTotal());
		} catch (CartEmptyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
