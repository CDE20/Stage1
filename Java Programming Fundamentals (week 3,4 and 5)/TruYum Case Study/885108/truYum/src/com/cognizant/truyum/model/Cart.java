package com.cognizant.truyum.model;

import java.util.ArrayList;
import java.util.List;

public class Cart {
	private List<MenuItem> menuItemList = new ArrayList<>();
	private double total;
	public List<MenuItem> getMenuItemList() {
		return menuItemList;
	}
	public void setMenuItemList(List<MenuItem> menuItemList) {
		this.menuItemList = menuItemList;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public Cart(List<MenuItem> menuItemList, double total) {
		super();
		this.menuItemList = menuItemList;
		this.total = total;
	}
	public Cart() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Cart [menuItemList=" + menuItemList + ", total=" + total + "]";
	}
	
}
