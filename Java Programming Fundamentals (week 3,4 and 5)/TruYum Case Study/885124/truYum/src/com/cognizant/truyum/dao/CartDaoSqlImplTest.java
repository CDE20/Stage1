package com.cognizant.truyum.dao;

import java.util.List;

import com.cognizant.truyum.model.MenuItem;

public class CartDaoSqlImplTest {

	public static void main(String[] args) {
		CartDaoSqlImplTest C = new CartDaoSqlImplTest();
		System.out.println("Adding Items:");
		C.testAddCartItem();
		System.out.println("Items in Cart:");
		C.testGetAllCartItems();
		System.out.println("Remove Item:");
		C.testRemoveCartItem();
	}
	public void testAddCartItem() {
		
		CartDao cartDao = new CartDaoSqlImpl();
		cartDao.addCartItem(1, 1);
		cartDao.addCartItem(1, 4);
		List<MenuItem> lst;
		try {
			lst = cartDao.getAllCartItems(1);
			System.out.println("MenuItem List:"+ lst);
		} catch (CartEmptyException e) {
			// TODO Auto-generated catch block
			System.out.println("Cart is Empty!!");
		}
	}
	public void testGetAllCartItems() {
		
		CartDao cartDao = new CartDaoSqlImpl();
		List<MenuItem> lst;
		try {
			lst= cartDao.getAllCartItems(1);
			for(MenuItem m:lst) {
				System.out.println(m);
			}
		} catch (CartEmptyException e) {
			// TODO Auto-generated catch block
			System.out.println("Cart is Empty!!");
		}
	}
	public void testRemoveCartItem() {
		
		CartDao cartDao = new CartDaoSqlImpl();
		cartDao.removeCartItem(1, 4);
		List<MenuItem> newlst;
		try {
			newlst = cartDao.getAllCartItems(1);
			System.out.println(newlst);
		} catch (CartEmptyException e) {
			// TODO Auto-generated catch block
			System.out.println("Cart is Empty!!");
		}
	}
}
