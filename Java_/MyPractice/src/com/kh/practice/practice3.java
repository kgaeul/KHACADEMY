package com.kh.practice;

import java.util.Scanner;

public class practice3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		System.out.print("���ڸ� �Է����ּ��� : ");
		int num = sc.nextInt();
		if(num<1) {          
			System.out.println("1 �̻��� ���ڸ� �Է����ּ���. ");
			} else {
				for(int i=num; i>0; i--) {
				
				System.out.println(i);
			
			}
		/*
		 ����ڷκ��� �� ���� ���� �Է¹޾� 1���� �� ���ڱ����� ��� ���ڸ� �Ųٷ� �Է��ϼ���
		 �� �Է��� ���ڴ� 1���� ũ�ų� ���ƾ� �մϴ�.
		 */
		}

	}
}
