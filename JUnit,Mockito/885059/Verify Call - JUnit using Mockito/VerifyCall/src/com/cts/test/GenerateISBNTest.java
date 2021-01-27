package com.cts.test;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Matchers.anyString;
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
		service.assignISBN("ISBN1234");
		verify(book).setIsbn("ISBN1234");
	}

	@Test(expected = RuntimeException.class)
	public void testFailed() {
		// fill code
		service.assignISBN("IS000");
		verify(book, never()).setIsbn("IS000");
	}

	@Test
	public void testException() {
		// fill code
		exceptionRule.expect(RuntimeException.class);
		exceptionRule.expectMessage("Invalid Code");
		service.assignISBN("ABCD");
	}
}
