package com.cognizant.truyum.dao;

@SuppressWarnings("serial")
public class CartEmptyException extends Exception{

	public CartEmptyException(String message) {
		super(message);
	}
}
