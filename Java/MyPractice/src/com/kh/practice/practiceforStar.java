package com.kh.practice;

import java.util.Scanner;

public class practiceforStar {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		System.out.print("���ڸ� �Է����ּ��� : ");
		int num = sc.nextInt();
		
		//�簢�� ���// ���� �࿡�� ����ϴ� ���� ù��° ���� ���(j=1)
		for(int i = 1; i<=5; i++) {
			for(int j = 1; j<=1; j++) {
				if(i==1||i==num||j==num||j==1) {
					System.out.print("*");
					System.out.print(" ");
			}else {
				
					
			}
		}
			
	}

}
}