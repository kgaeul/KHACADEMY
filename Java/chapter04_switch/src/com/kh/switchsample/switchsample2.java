package com.kh.switchsample;

import java.util.Scanner;

public class switchsample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �������ּ���.") ;
		System.out.println("��īĨ") ;
		System.out.println("ĭ��") ;
		System.out.println("�����۽�") ;
		System.out.println("��Ĩ") ;
		
		int snack = sc.nextInt();
		
		switch(snack) {
		case 1:
			System.out.println("��īĨ");
			break;
		case 2:
			System.out.println("ĭ��");
			break;
		case 3:
			System.out.println("�����۽�");
			break;
		case 4:
			System.out.println("��Ĩ");
			break;
		default :
			System.out.println("�߸��� �����Դϴ�. �ٽ� �ѹ� �������ּ���. ");
	}
	}

}
