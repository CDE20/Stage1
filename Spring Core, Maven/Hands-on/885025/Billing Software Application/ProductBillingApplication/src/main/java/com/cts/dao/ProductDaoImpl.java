package com.cts.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.cts.bean.Product;

@Repository
public class ProductDaoImpl implements ProductDao {

	//wire dependency
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate(){
	    return jdbcTemplate;
	}
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate){
	    this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public Product getProductDetails(int product_code) {
		//add your code here
		String sql ="select * from product where product_code = ?;";
	    Product product = jdbcTemplate.queryForObject(sql,BeanPropertyRowMapper.newInstance(Product.class),product_code);
	return product;
	}

}
