package com.cts.academy.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.runners.MockitoJUnitRunner;
import org.mockito.stubbing.Answer;

import com.cts.academy.dao.TrainerCohortMapDAO;
import com.cts.academy.model.Cohort;

@RunWith(MockitoJUnitRunner.class)
public class TrainerCohortMapDAOTest {

	// Mock and rule

	@Mock
	TrainerCohortMapDAO dao;

	@InjectMocks
	Cohort cohort;

	@Rule
	public ExpectedException exceptionRule = ExpectedException.none();

	@Before
	public void setUp() throws Exception {

		Mockito.doAnswer(new Answer<Void>() {
			public Void answer(InvocationOnMock invocation) throws Throwable {
				Object[] ids = invocation.getArguments();
				String trainerId = (String) ids[0];
				String cohortCode = (String) ids[1];
				if (trainerId.matches("^[t-]{2}[a-zA-Z-9]{1,}$")) {
					if (cohortCode.matches("^[A-Z]{3}[0-9]{2}[A-Z]{2}[0-9]{3}$")) {
						cohort.setTrainerId(trainerId);
					} else {
						throw new RuntimeException("Invalid Cohort Code");
					}
				} else {
					throw new RuntimeException("Invalid Trainer ID");
				}
				return null;
			}
		}).when(dao).mapTrainerCohort(any(String.class), any(String.class));

	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSuccess() {
		try {
			//verify(cohort, times(1)).setTrainerId("t-Jerry");
			dao.mapTrainerCohort("t-Jerry", "CHN00AJ000");
		} catch (Exception ex) {

		}
		// code here
		assertEquals("t-Jerry", cohort.getTrainerId());
	}

	@Test
	public void testTrainerId() {
		// code here
		exceptionRule.expect(RuntimeException.class);
		exceptionRule.expectMessage("Invalid Trainer ID");
		dao.mapTrainerCohort("Jerry", "CHN19AJ021");
	}

	@Test
	public void testCohortCode() {
		// code here
		exceptionRule.expect(RuntimeException.class);
		exceptionRule.expectMessage("Invalid Cohort Code");
		dao.mapTrainerCohort("t-Jerry", "AJ021");
	}
}