package com.sample.entity;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class EmployeeTest {

	Employee e;
	
	@Before
	public void setUp() {
		System.out.println("In Setup - @Before");
		e = new Employee();
	}
	
	@After
	public void tearDown() {
		System.out.println("In teardown - @After");
		e = null;
	}
	/**
	 * test for default constructor
	 */
	@Test
	@Ignore
	public void testEmployee() {
//		Employee e = new Employee();
		assertNotNull(e);
	}
	
	@Test
	public void testEmployee1() {
		Employee e1 = new Employee(1, "test", 23.00);
		
		assertEquals(1, e1.getEmployeeId());
		assertEquals("test", e1.getEmployeeName());
		assertEquals(23.00, e1.getSalary(), 0);
	}
	
	@Test
	public void testGetEmployeeId() {
		Employee e1 = new Employee(1, "test", 23.00);
		assertEquals(1, e1.getEmployeeId());
	}
	
	@Test
	public void testSetEmployeeId() {
//		Employee e = new Employee();
		e.setEmployeeId(2);
		assertEquals(2, e.getEmployeeId());
		
	}
	
	
}
