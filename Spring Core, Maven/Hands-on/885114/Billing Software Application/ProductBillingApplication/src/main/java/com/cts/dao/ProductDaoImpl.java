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
public class ProductDaoImpl implements ProductDao {

	// wire dependency
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public Product getProductDetails(int product_code) {
		// add your code here
		String sql = "select * from product where product_code = ?";

		RowMapper<Product> rowMapper = new RowMapper<Product>() {

			@Override
			public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
				Product product = new Product();
				product.setProduct_code(rs.getInt("product_code"));
				product.setProduct_name(rs.getString("product_name"));
				product.setProduct_category(rs.getString("product_desc"));
				product.setProduct_desc(rs.getString("product_category"));
				product.setProduct_price(rs.getDouble("product_price"));

				return product;
			}

		};
		Product product = jdbcTemplate.queryForObject(sql, rowMapper, product_code);
		return product;
	}

}
