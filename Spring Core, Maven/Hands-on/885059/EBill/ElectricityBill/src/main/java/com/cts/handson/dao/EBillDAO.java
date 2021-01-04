package com.cts.handson.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import com.cts.handson.model.EBill;

@Service
@ComponentScan("com.cts.handson")
public class EBillDAO {
	@Autowired
	JdbcTemplate jdbcTemplate;
	@Autowired
	PlatformTransactionManager txManager;

	public void deleteBill(long... billNumbers) throws Exception {
		DefaultTransactionDefinition def = new DefaultTransactionDefinition();
		TransactionStatus status = txManager.getTransaction(def);
		try {
			// delete business logic here
			for (long n : billNumbers) {
				if (n >= 100) {
					String sql = "delete from ebill where bill_number=?";
					int result = jdbcTemplate.update(sql, n);
				} else {
					throw new Exception();
				}
			}
			txManager.commit(status);
		} catch (Exception ex) {
			// roll back logic here
			txManager.rollback(status);
			throw ex;
		}
	}

	public List<EBill> getAllBill() {
		// retrieve business logic here
		String sql = "select * from ebill";
		List<EBill> bills = jdbcTemplate.query(sql, new BeanPropertyRowMapper<EBill>(EBill.class));
		return bills;
	}
}
