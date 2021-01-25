package com.cts.bank.test;

import static org.junit.Assert.*;
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
import org.mockito.runners.MockitoJUnitRunner;

import com.cts.bank.dao.AccountDAO;
import com.cts.bank.exception.AccountTransactionException;


//Provide necessary Annotation to class, attributes and test methods
@RunWith(MockitoJUnitRunner.class)	
public class AccountDAOTest {

	//Provide necessary Annotation
	@Mock
	private DataSource ds;
	@InjectMocks
	private AccountDAO dao;
	@Mock
	private Connection con;
	@Mock
	private PreparedStatement ps;
	@Rule
	public ExpectedException exceptionRule = ExpectedException.none();
	
	@Before
	public void setUp() throws Exception {
		when(con.prepareStatement(anyString())).thenReturn(ps);
		when(ds.getConnection()).thenReturn(con);
		

	}

	@After
	public void tearDown() throws Exception {
	}

	@Test(expected=AccountTransactionException.class)
	public void testInvalidAccount() throws AccountTransactionException {
		boolean flag = dao.deposit("", 500.0);

	}

	@Test(expected=AccountTransactionException.class)
	public void testNullAccount() throws AccountTransactionException {
		boolean flag = dao.deposit(null, 500.0);

	}
	
	@Test(expected=AccountTransactionException.class)
	public void testInvalidAmount() throws AccountTransactionException {
		boolean flag = dao.deposit("Account1234",-23);

	}
	
	
	@Test
	public void testMethodCall() throws SQLException, AccountTransactionException {
		boolean flag = dao.deposit("1234",500);
		assertFalse(flag);
		verify(ds,times(1)).getConnection();
		verify(con,times(1)).prepareStatement("UPDATE ACCOUNT SET balance = balance + ? WHERE accNo = ?");
		verify(ps,times(1)).executeUpdate();
	}
}
