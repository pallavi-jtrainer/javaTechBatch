package com.sample.service;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.sample.dao.EmployeeDaoImpl;
import com.sample.entity.Employee;

@RunWith(MockitoJUnitRunner.class)
public class EmployeeServiceTest {
	//EmployeeDaoImpl ed = mock(EmployeeDaoImpl.class);
	
	@Mock
	EmployeeDaoImpl ed;
	
	@InjectMocks
	EmployeeServiceImpl es = new EmployeeServiceImpl(ed);
	
	@Test
	public void testRetrieveAllEmployees() {
		List<Employee> eList = new ArrayList<Employee>();
		eList.add(new Employee(1, "test1", 12));
		eList.add(new Employee(2, "test2", 23));
		eList.add(new Employee(3, "test3", 34));
		
		//expected
		when(ed.retrieveAllEmployees()).thenReturn(eList);
		
		//actual
		Employee[] list = es.retrieveAllEmployees();
		
		//convert eList to array
		Employee[] arr = eList.toArray(new Employee[eList.size()]);
		
		
		assertArrayEquals(arr, list);
	}
	
	@Test
	public void testCreateEmployee() {
		Employee e = new Employee(12, "test", 23);
		
		when(ed.createEmployee(e)).thenReturn(1);
		
		int act = es.createEmployee(e);
		
		assertEquals(1, act);
	}
}
