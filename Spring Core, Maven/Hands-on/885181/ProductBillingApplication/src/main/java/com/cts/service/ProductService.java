package com.cts.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.bean.Product;
import com.cts.dao.ProductDao;

@Service
public class ProductService {
	
	//wire dependency
	@Autowired
	ProductDao dao;

	public Product getProductDetails(int product_code) {
		//add your code here
		return dao.getProductDetails(product_code);
		
	}
	
	public double calculatePrice(int quantity,double product_price) {
		//add your code here
		return quantity*product_price;
	}
	
	public boolean validateProductCode(int product_code){
		//add your code here
		if(product_code>0 && String.valueOf(product_code).length() == 4)
			return true;
		return false;
	}
	
	public boolean validateQuantity(int quantity){
		//add your code here
		if(quantity>0)
			return true;
		return false;
	}
}
