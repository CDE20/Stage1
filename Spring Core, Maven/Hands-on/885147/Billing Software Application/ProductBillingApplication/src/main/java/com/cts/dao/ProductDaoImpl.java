package com.cts.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.cts.bean.Product;

@Repository
public class ProductDaoImpl implements ProductDao,RowMapper<Product> {

	//wire dependency
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public Product getProductDetails(int product_code) {
		//add your code here
		String sql = "select * from product where product_code = ?";
		RowMapper<Product> rowMapper = new ProductDaoImpl();
		Product product = jdbcTemplate.queryForObject(sql,rowMapper,product_code);
	return product;
	}

	@Override
	public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
		Product product = new Product(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getDouble(5));
		return product;
	}

}
