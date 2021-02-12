package com.cts.test;

import static org.mockito.Mockito.never;
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
		// fill code
		// given

		String isbn = "ISBN1234";
		service.assignISBN(isbn);

		verify(book).setIsbn(isbn);
	}

	@Test
	public void testFailed() {
		// fill code
		String isbn = "ISBN123";
		try {
			service.assignISBN(isbn);
		} catch (Exception e) {
			e.printStackTrace();
		}

		verify(book, never()).setIsbn(isbn);
	}

	@Test
	public void testException() {
		// fill code
		exceptionRule.expect(RuntimeException.class);
		String isbn = "ISBN123";
		when(service.assignISBN(isbn)).thenThrow(RuntimeException.class);

	}
}
