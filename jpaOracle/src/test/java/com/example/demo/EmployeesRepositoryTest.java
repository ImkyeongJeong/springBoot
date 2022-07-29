package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class EmployeesRepositoryTest {

	@Autowired EmployeesRepository repo;
	
	//@Test
	public void empList() {
		//System.out.println(repo.findByDepartmentId(10));
	}
	
	@Test
	public void selectId() {
		System.out.println(repo.findById(100));
	}
}
