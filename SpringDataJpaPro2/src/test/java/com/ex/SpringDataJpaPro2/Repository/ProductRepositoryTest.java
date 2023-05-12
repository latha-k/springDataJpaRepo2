package com.ex.SpringDataJpaPro2.Repository;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ex.SpringDataJpaPro2.Entity.Product;
import com.ex.SpringDataJpaPro2.Repository.ProductRepository;
@SpringBootTest
class ProductRepositoryTest {
	@Autowired
	ProductRepository pr;
	@BeforeEach
	void setUp() throws Exception {
		System.out.println("befre test edit1");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("After test");
	}

	@Test
	void testSave() {
		fail("Not yet implemented");
	}
	@Test
	void saveMethod() {
		Product p = new Product("soap", new BigDecimal(10), false);
		Product savedproduct = pr.save(p);
		System.out.println(savedproduct.getId());
		System.out.println(savedproduct.toString());
	}

}
