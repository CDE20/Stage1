package com.cts.test;

import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
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
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testSuccess() {
		//book=service.assignISBN("ISBN1234");
		//when(service.assignISBN("ISBN1234")).thenReturn(book);
		book=service.assignISBN("ISBN1234");
		verify(book,times(1)).setIsbn("ISBN1234");
		
	}
	@Test
	public void testFailed() {
		try{
		book=service.assignISBN("ISBn12324");
		}catch(RuntimeException e){
		verify(book,never()).setIsbn("ISBn12324");
		}
	}
	@Test(expected=RuntimeException.class)
	public void testException() {
		book=service.assignISBN("ISBn12324");

	}
}
