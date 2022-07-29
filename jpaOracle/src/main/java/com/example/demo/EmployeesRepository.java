package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EmployeesRepository extends JpaRepository<Employees, Integer>{
	
	public List<Employees> findByEmail(String email);
	//public List<Employees> findByDepartmentIdOrderByFirstNameAsc(Integer departmentId);
	
	//부서별로 검색 first_name정렬 (JPA쿼리 작성 가능 from에 클래스이름을 넣어줘야 함!)
	//@Query("select e from Employees e where department_id =?1 order by e.firstName")
	//public List<Employees> findByDepartmentId(Integer departmentId);
}
