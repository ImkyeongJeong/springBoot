package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.transaction.annotation.Transactional;

@DataJpaTest //jpa테스트
public class CustomerRepositoryTest {

	@Autowired CustomerRepository repo;
	
	@Test
	@Transactional
	@Commit
	public void insert() {
		Customer cust = Customer.builder()		//builder사용하면 초기화 편리
								.id(1L)
								.name("aaa")
								.phone("010")
								.build();
		//스프링에서 제공하는 JpaRepository에서 제공
		repo.save(cust);
	}
}
