package com.cognizant.truyum.dao;

public class CartEmptyException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * CartEmpty Exception
	 * 
	 * @param message
	 */
	public CartEmptyException(String message) {
		super(message);
	}
}
