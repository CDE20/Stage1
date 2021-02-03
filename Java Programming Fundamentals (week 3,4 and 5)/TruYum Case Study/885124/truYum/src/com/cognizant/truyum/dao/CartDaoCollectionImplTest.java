package com.cognizant.truyum.dao;

import java.util.*;
import com.cognizant.truyum.model.MenuItem;

public class CartDaoCollectionImplTest {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
		CartDaoCollectionImplTest C= new CartDaoCollectionImplTest();
		System.out.println("Add Item:");
		C.testAddCartItem();
		System.out.println("Items in Cart:");
		C.testGetItemAllCartItems();
		System.out.println("Remove a Cart item:");
		C.testRemoveCartItem();
	}
	
	public static void testAddCartItem() {
		
		CartDaoCollectionImpl cartDaoImpl = new CartDaoCollectionImpl();
		CartDao cartDao = cartDaoImpl;
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
	
	public static void testGetItemAllCartItems(){
		
		CartDaoCollectionImpl cartDaoImpl = new CartDaoCollectionImpl();
		CartDao cartDao = cartDaoImpl;
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
	public static void testRemoveCartItem() {
		
		CartDaoCollectionImpl cartDaoImpl = new CartDaoCollectionImpl();
		CartDao cartDao = cartDaoImpl;
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
