package com.cts.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.regex.*;

import com.cts.bean.Product;
import com.cts.dao.ProductDao;

@Service
public class ProductService {
	
	//wire dependency
	@Autowired
	private ProductDao dao;
	
	public ProductDao getDao(){
	    return dao;
	}
	
	public void setDao(ProductDao dao){
	    this.dao = dao;
	}

	public Product getProductDetails(int product_code) {
		//add your code here
		Product pro = dao.getProductDetails(product_code);
		return pro;
	}
	
	public double calculatePrice(int quantity,double product_price) {
		//add your code here
		double price = quantity * product_price;
		return price;
	}
	
	public boolean validateProductCode(int product_code){
		//add your code here
		String s =String.valueOf(product_code);
		if(Pattern.matches("[0-9]{4}",s) && product_code >0  )
		    return true;
		 else
		    return false;
	}
	
	public boolean validateQuantity(int quantity){
		//add your code here
		if(quantity > 0){
		    return true;
		}
		else{
		    return false;
		}
	}
}
