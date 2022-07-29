package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

														//Entity클래스명, ID타입을 넣어준다.
public interface CustomerRepository extends JpaRepository<Customer, Long>{
	//JpaRepository가 상속해주는 CustomerRepository가 데이터를 이용할 수 있다.

}
