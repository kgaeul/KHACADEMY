package com.kh.whilesample;

import java.util.Scanner;

class While01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		boolean isTrue = true;
		
		
		while(isTrue) {
			System.out.println("Ŀ�Ǹ� �ֹ����ּ���."+ "1. �Ƹ޸�ī��"+ "2. īǪġ��"+ "3. ������ũƼ");
		int choice = sc.nextInt();	
		switch (choice) {
		case 1:
			System.out.println("�Ƹ޸�ī�� �ֹ�");
			isTrue = false; //�Ƹ޸�ī�� �ֹ��� �޾����� switch�� while���� �����ϱ� ���� false ����!
			break;
		case 2:
			System.out.println("īǪġ�� �ֹ�");
			isTrue = false;
			break;
		case 3:
			System.out.println("������ũƼ �ֹ�");
			isTrue = false;
			break;
		default:
			System.out.println("�ֹ����� ���ֹ� ���ּ���. ");
			
		
		}
		}
		
	}

}