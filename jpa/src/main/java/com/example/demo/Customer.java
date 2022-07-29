package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder			//객체 초기화할 때 편리
@NoArgsConstructor
@AllArgsConstructor	
@Entity	//Entity어노테이션을 통해 자동 테이블 생성
public class Customer {
	@Id	//기본키 설정
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(length = 20, nullable = false)
	private String	name;
	
	@Column(length = 20, nullable = false, unique = true)
	private String	phone;
	
	private String email;
}
