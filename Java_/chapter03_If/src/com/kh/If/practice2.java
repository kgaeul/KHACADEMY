package com.kh.If;

import java.util.Scanner;

public class practice2 {

	public static void main(String[] args) {
	
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է����ּ��� : ");
		int number = sc.nextInt();
		
		if((number>0)&&(number%2)==0) {
			System.out.println("¦����");
		}else if ((number>0)&&(number%2)==1) {
			System.out.println("Ȧ����");
		}else {
			System.out.println("����� �Է����ּ���");
		}
	}

}
