package com.kh.Inheritance.calculator;

import java.util.Scanner;

public class CalculatorRun extends Calculator{

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� 1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("���� 2 : ");
		int num2 = sc.nextInt();
		//���� �� �ڵ带 �������� ���ϴ°�!
		Calculator cal = new Calculator();	
		int results1 = cal.add();
		int results2 = cal.substruct();
		int results3 = cal.multifly();
		int results4 = cal.divide();
		int results5 = cal.mod(num1,num2);
		
		System.out.println("�� : "+results1);
		System.out.println("�� : "+results2);
		System.out.println("�� : "+results3);
		System.out.println("�� : "+results4);
		System.out.println("������ : "+results5);
	}

}
