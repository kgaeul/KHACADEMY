package com.kh.testPractice;

import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.Scanner;
import org.junit.*;

public class practice {

	private Practice1 p;

	
	public void practice3() {
		int[] arr = {1,2,3,4,5,6};
		int[] result = p.getArray(6);
		assertEquals(arr,result); 
		}
		
	@Test
	public void practice4() {
		String[] result= p.getString("����","���","�ٳ���");
		String[] answer1 = {"����","���","�ٳ���"};
		assertEquals(answer1,result);
	}
		
}
