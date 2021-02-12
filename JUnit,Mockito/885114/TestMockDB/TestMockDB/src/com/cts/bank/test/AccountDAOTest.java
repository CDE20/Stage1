package com.cts.bank.test;

import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.anyBoolean;
import static org.mockito.Matchers.anyDouble;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
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
		// fill code
//		con = mock(Connection.class);
//		ps = mock(PreparedStatement.class);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testInvalidAccount() throws AccountTransactionException {
		// fill code
		exceptionRule.expect(AccountTransactionException.class);
		exceptionRule.expectMessage("Invalid account number");
		
		dao.deposit("", 500);
	}

	@Test
	public void testNullAccount() throws AccountTransactionException {
		// fill code
		exceptionRule.expect(AccountTransactionException.class);
		exceptionRule.expectMessage("Invalid account number");
		
		dao.deposit(null, 500);
	}

	@Test
	public void testInvalidAmount() throws AccountTransactionException {
		// fill code
		exceptionRule.expect(AccountTransactionException.class);
		exceptionRule.expectMessage("Invalid amount");
		
		dao.deposit("123", -1);
	}

	@Test
	public void testMethodCall() throws SQLException, AccountTransactionException {
		// fill code
		when(ds.getConnection()).thenReturn(con);
		when(con.prepareStatement(anyString())).thenReturn(ps);
		
		
//		when(ps.executeUpdate()).thenReturn(5);
		
//		doReturn(5).when(ps).executeUpdate();
		
//		when(dao.deposit("123", 500.0)).thenReturn(true);
//		dao.deposit("123", 500.0);
		
		boolean deposit = dao.deposit("123", 500);
		
		verify(ds).getConnection();
		verify(con).prepareStatement(anyString());
		verify(ps).executeUpdate();
		
//		assertTrue(deposit);
	}
}
