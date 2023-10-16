package com.kh.testSample.BF;

import static org.junit.Assert.*;

import org.junit.*;

public class CalculatorTest {
	private Calculator cal;
	
	@Before
	public void setUp() {
		cal = new Calculator();
		System.out.println("�׽�Ʈ ����!!!");
	}
	@After
	public void tearDown() {
		System.out.println();
		System.out.println("�׽�Ʈ ����");
	}
	@Test
	public void testAddition() { 
		int result = cal.add(3, 4);
		assertEquals(7,result);
	}
	@Test
	public void testSub() {
		int result = cal.subtract(3, 4);
		assertEquals(-1,result);
	}
}
