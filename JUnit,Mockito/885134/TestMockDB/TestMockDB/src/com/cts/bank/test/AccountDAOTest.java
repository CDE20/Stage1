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
		//fill code
		
		when(con.prepareStatement(anyString())).thenReturn(ps);
		when(ds.getConnection()).thenReturn(con);
		
		//MockitoAnnotations.initMocks(this);

	}

	@After
	public void tearDown() throws Exception {
	}

   @Test
	public void testInvalidAccount() throws AccountTransactionException {
	    	//fill code
	    	exceptionRule.expect(AccountTransactionException.class);
	    	exceptionRule.expectMessage("Invalid account number");
	    	dao.deposit("",500);
	    	

	}
    
    @Test
	public void testNullAccount() throws AccountTransactionException {
	   	 //fill code
	   	 exceptionRule.expect(AccountTransactionException.class);
	    	exceptionRule.expectMessage("Invalid account");
	    	dao.deposit(null,500);
	    	

	}
	
	@Test
	public void testInvalidAmount() throws AccountTransactionException {
	   	 //fill code
	   	 exceptionRule.expect(AccountTransactionException.class);
	    	exceptionRule.expectMessage("Invalid amount");
	    	dao.deposit("1234",0);

	}
	
	@Test
	public void testMethodCall() throws SQLException,AccountTransactionException {
	   	 //fill code
	   	 
	   	  boolean result=dao.deposit("1234",500);
	   	  assertFalse(result);
	   	 
	   	 verify(ds,times(1)).getConnection();
	   	 verify(con,times(1)).prepareStatement("UPDATE ACCOUNT SET balance = balance + ? WHERE accNo = ?");
	   	 verify(ps,times(1)).executeUpdate();
	   	 

	}
}
