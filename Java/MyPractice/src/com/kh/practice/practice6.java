package com.kh.practice;

import java.util.Scanner;

public class practice6 {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		System.out.print("ù ��° ���ڸ� �Է��ϼ��� : ");
		int num1 =sc.nextInt();
		System.out.print("�� ��° ���ڸ� �Է��ϼ��� : ");
		int num2 =sc.nextInt();

		for(int i = num1; i<=num2; i++) {
			System.out.print(i);
		}
	}

}
