package com.cts.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.cts.bean.Product;

@Repository
public class ProductDaoImpl implements ProductDao {

	// wire dependency
	@Autowired
	JdbcTemplate template;

	@Override
	public Product getProductDetails(int product_code) {
		// add your code here
		String sql = "select * from product where product_code=?";
		Product product = template.queryForObject(sql, new Object[] { product_code }, BeanPropertyRowMapper.newInstance(Product.class));
		return product;
	}

}
