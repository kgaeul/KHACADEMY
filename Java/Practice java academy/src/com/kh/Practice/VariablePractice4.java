package com.kh.Practice;

import java.util.Scanner;

public class VariablePractice4 {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System. in);
		
		System.out.println("���ڿ��� �Է����ּ��� : ");
		String abc =sc.next();
		char a = abc.charAt(0);
		System.out.println("index ù ��° �ڸ� : " + a);
		char b = abc.charAt(1);
		System.out.println("index �� ��° �ڸ� : " + b);
		String c = abc.substring(0,4); //substring�� ���۰� ���� ���ؾ� ��!! (a,b)
										//�ȱ׷��� ������ �� �����
		System.out.println("index �� ��° �ڸ� : " + c);
		char d = abc.charAt(3);
		System.out.println("index �� ��° �ڸ� : " + d);
		char e = abc.charAt(4);
		System.out.println("index �ټ��� ��° �ڸ� : " + e);
			
	
	}
}
