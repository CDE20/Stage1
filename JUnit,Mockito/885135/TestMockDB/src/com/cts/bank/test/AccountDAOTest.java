package com.cts.bank.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

import javax.sql.DataSource;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.when;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.ExpectedException;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;

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
		when(con.prepareStatement(anyString())).thenReturn(ps);
		when(ds.getConnection()).thenReturn(con);

	}

	@After
	public void tearDown() throws Exception {
	}

    @Test
	public void testInvalidAccount() throws AccountTransactionException {
        exceptionRule.expect(AccountTransactionException.class);
        exceptionRule.expectMessage("Invalid account number");
        
        dao.deposit("", 5078.8);
	}
    
    @Test
	public void testNullAccount() throws AccountTransactionException {
        exceptionRule.expect(AccountTransactionException.class);
        exceptionRule.expectMessage("Invalid account number");
        
        dao.deposit(null, 5078.8);	   	 

	}
	
	@Test
	public void testInvalidAmount() throws AccountTransactionException {
	   	exceptionRule.expect(AccountTransactionException.class);
        exceptionRule.expectMessage("Invalid amount");
        
        dao.deposit("9876", -19);

	}
	
	@Test
	public void testMethodCall() throws SQLException,AccountTransactionException {
	   	 dao.deposit("1223",500.0);
	   	 
	   	 verify(ds).getConnection();
	   	 verify(con).prepareStatement(anyString());
	   	 verify(ps).executeUpdate();
	}
}
