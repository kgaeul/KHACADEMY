package com.kh.practice;

import java.util.Scanner;

public class practice8 {

	public static void main(String[] args) {

		Scanner sc =new Scanner (System.in);
		System.out.print("ù ��° ���ڸ� �Է��ϼ��� : ");
		int num1 =sc.nextInt();
		
		int result =0;
		for (int i=1 ; i<=9 ; i++) {
			result += num1;			
		
		System.out.println(num1+"x"+ i +"="+result);
	}
	}

}
