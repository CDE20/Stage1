package com.cts.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.Rule;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;

import com.cts.utility.Book;
import com.cts.utility.GenerateISBN;

//Provide necessary Annotation to class, attributes and test methods
@RunWith(MockitoJUnitRunner.class)
public class GenerateISBNTest {
	    
	    @Mock
	    Book book;
        
	    @InjectMocks
        GenerateISBN service;
        
        @Rule
        public ExpectedException exceptionRule = ExpectedException.none();

	@Before
	public void setUp() throws Exception {
	    	//MockitoAnnotations.initMocks(this);
	}

	@After
	public void tearDown() throws Exception {
	}
    
    @Test
	public void testSuccess() {
	    	//fill code
	    	
	    	service.assignISBN("ISBN0000");
	    	//verify(book, times(1)).setIsbn("ISBN0000");
	    	verify(book).setIsbn("ISBN0000");
	    	

	}
	
	@Test
	public void testFailed() {
	    	//fill code
	    	exceptionRule.expect(Exception.class);
	    	
	    	service.assignISBN("ISBN00");
	    	verify(book,never()).setIsbn("ISBN00");

	}
     
     @Test
	public void testException() {
	    	//fill code
	    	
	    	exceptionRule.expect(RuntimeException.class);
	    	exceptionRule.expectMessage("Invalid Code");
	         service.assignISBN("ISBN00");
	    
	    	}
}
