package com.example.demo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Employees {
	@Id
	Integer employee_id;
	
	@Column(name="first_name") //DB에서 사용할 명 지정
	String firstName;
	
	@Column(length = 25, nullable = false)
	String last_name;
	
	@Column(length = 25, nullable = false)
	String email;
	
	String phone_number;
	
	@Column(nullable = false)
	@Temporal(TemporalType.DATE) //util.Date import했을 때 사용
	Date hire_date;
	
	@Column(length = 10, nullable = false)
	String job_id;
	
	Double salary;
	Double commission_pct;
	Integer manager_id;
	
	//@Column(name="department_id")
	//Integer departmentId;
	
	@ManyToOne
	@JoinColumn(name="department_id")
	Departments departments;
}
