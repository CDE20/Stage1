package com.cts.test;

import org.junit.*;
import org.junit.After;
import org.junit.Before;
import org.junit.rules.ExpectedException;
import org.junit.Rule;
import static org.mockito.Mockito.*;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

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
	    MockitoAnnotations.initMocks(this);
	}

	@After
	public void tearDown() throws Exception {
	}

    @Test
	public void testSuccess() {
	    	//fill code
	    service.assignISBN("ISBN1010");
        verify(book).setIsbn("ISBN1010");
	}
	
	@Test
	public void testFailed() {
	    	//fill code
	    exceptionRule.expect(Exception.class);
	    service.assignISBN("ISBN01");
        verify(book,never()).setIsbn("ISBN01");
	}
    
    @Test(expected = RuntimeException.class)
	public void testException() {
	    	//fill code
	    service.assignISBN("ISBN01");
	}
}
