package com.cts.bank.test;




import static org.junit.Assert.*;
import static org.mockito.Matchers.anyDouble;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import com.cts.bank.dao.AccountDAO;
import com.cts.bank.exception.AccountTransactionException;


//Provide necessary Annotation to class, attributes and test methods

@RunWith(MockitoJUnitRunner.class)
public class AccountDAOTest {

	@Mock
	private DataSource ds;

	@Mock
	private AccountDAO dao;
	
	@Mock
	private Connection con;
	
	@Mock
	private PreparedStatement ps;
	

	public ExpectedException exceptionRule = ExpectedException.none();
	

	
	@Before
	public void setUp() throws Exception {
		//fill code
		MockitoAnnotations.initMocks(this);
	}

	@After
	public void tearDown() throws Exception {
	
		
	}

	@Test(expected = AccountTransactionException.class)
	public void testInvalidAccount() throws AccountTransactionException {
	    	//fill code

			when(dao.deposit(anyString(), anyDouble())).thenThrow(new AccountTransactionException("Invalid account number"));
			dao.deposit("", 1000.0);
	}
	@Test
	public void testNullAccount() throws AccountTransactionException {
	   	 //fill code
		//when(dao.deposit(anyString(), anyDouble())).thenThrow(new AccountTransactionException("Invalid account number"));
		dao.deposit(null, 1000.0);
	}
	
	@Test
	public void testInvalidAmount() throws AccountTransactionException {
	   	 //fill code
		//when(dao.deposit(anyString(), anyDouble())).thenThrow(new AccountTransactionException("Invalid account number"));
		dao.deposit("12345", 0.0);
	}
	
	@Test
	public void testMethodCall() throws SQLException, AccountTransactionException {
	   	 //fill code
		when(dao.deposit(anyString(), anyDouble())).thenReturn(true);
		assertTrue(dao.deposit("12345", 100000));
		when(ds.getConnection()).thenReturn(con);
		assertEquals(con,ds.getConnection());
		verify(ds,times(1)).getConnection();
		
		when(con.prepareStatement(anyString())).thenReturn(ps);
		assertEquals(ps,con.prepareStatement(""));
		verify(con,times(1)).prepareStatement("");
		
		when(ps.executeUpdate()).thenReturn(1);
		assertEquals(1,ps.executeUpdate());
		verify(ps,times(1)).executeUpdate();
		
		
	}
}
