package com.kh.practice;

import java.util.Scanner;

public class practice2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		boolean isTrue = true;
		
		while(isTrue) {
		System.out.print("���ڸ� �Է����ּ��� : ");
		int num = sc.nextInt();
			if(num<1) {
				System.out.println("1�̻��� ���ڸ� �Է����ּ���.");
			} else {
				for(int i=1; i<= num; i++) {
					isTrue = false;
					System.out.println(i);	
				}
			}
	
		}
	}
}
