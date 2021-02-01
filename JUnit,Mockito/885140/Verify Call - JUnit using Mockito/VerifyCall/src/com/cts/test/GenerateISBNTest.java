package com.cts.test;

import static org.junit.Assert.*;
import static org.mockito.BDDMockito.then;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.cts.utility.Book;
import com.cts.utility.GenerateISBN;

//Provide necessary Annotation to class, attributes and test methods

public class GenerateISBNTest {
	
		@Mock
        Book book;
	
        
     
        @Mock
        GenerateISBN service;
        
        public ExpectedException exceptionRule = ExpectedException.none();

	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}

	@After
	public void tearDown() throws Exception {
		
	}

	@Test
	public void testSuccess() {
	    	//fill code
		
		//verify(service,times(1)).assignISBN("ISBN1234");
		when(service.assignISBN(anyString())).thenReturn(book);
		assertEquals(book.getIsbn(),service.assignISBN("ISBN1234").getIsbn());
		verify(service,times(1)).assignISBN("ISBN1234");
		//asertservice.assignISBN("ISBN1234");
	}
	
	public void testFailed() {
	    	//fill code
		//assertEquals(book.getIsbn(),service.assignISBN(""))
	}

	public void testException() {
	    	//fill code

	}
}
