package com.junitexamples.junit05;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AppTest {
	@BeforeEach
	void beforeEach() {
		System.out.println("Before each called!");
	}
	@BeforeAll
	static void beforeAll() {
		System.out.println("Before All called!");
	}
	@AfterAll
	static void afterAll() {
		System.out.println("after all called!");
	}
	@AfterEach
	void afterEach() {
		System.out.println("After each called!");
	}
	@Test
	
	void testOne() {
		 System.out.println("======TEST ONE EXECUTED=======");
		 Assertions.assertEquals( 4 , Calculator.add(2, 2));
	}

@Test
	
	void testTwo() {
		 System.out.println("======TEST TWO EXECUTED=======");
		 Assertions.assertEquals( 3 , Calculator.add(2, 2));
	}

}
