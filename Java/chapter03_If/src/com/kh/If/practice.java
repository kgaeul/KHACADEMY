package com.kh.If;

import java.util.Scanner;

public class practice {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("���������� �Է����ּ��� :  ");
		int score1 = sc.nextInt();
		System.out.print("���������� �Է����ּ��� :  ");
		int score2 = sc.nextInt();
		System.out.print("���������� �Է����ּ��� :  ");
		int score3 = sc.nextInt();
		
		
		if((score1+score2+score3)/3<=60) {
			System.out.println("���հ��Դϴ�. ");
		} else {
			System.out.println("��� : "+(score1+score2+score3)/3 +"���Դϴ�. �����մϴ�.�հ��Դϴ�. ");
		}
		
		
	}


}
