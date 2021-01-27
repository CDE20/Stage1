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
	    
	    //public MockitoRule mockitoRule = MockitoJUnit.rule();
	    
	    @Mock
        Book book;
        
	    @InjectMocks
        GenerateISBN service;
        
        @Rule
        public ExpectedException exceptionRule = ExpectedException.none();

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

    @Test
	public void testSuccess() {
	        
	        service.assignISBN("ISBN1234");
	    	verify(book).setIsbn("ISBN1234");
	}
	
	@Test
	public void testFailed() {
	        exceptionRule.expect(RuntimeException.class);
	    	service.assignISBN("ISBN00");
	    	verify(book,never()).setIsbn("ISBN00");

	}

    @Test
	public void testException() {
	    	
	    	exceptionRule.expect(Exception.class);
	    	exceptionRule.expectMessage("Invalid Code");
	    	
	    	service.assignISBN("ISBN00");
	    	


	}
}
