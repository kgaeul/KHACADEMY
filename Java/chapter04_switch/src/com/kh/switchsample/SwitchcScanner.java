package com.kh.switchsample;

import java.util.Scanner;

public class SwitchcScanner {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�ֹ��Ͻ� ��ȣ�� �������ּ���. ");
		
		System.out.println("1. �Ƹ޸�ī��");
		System.out.println("2. ī��� �����߶�");
		System.out.println("3. ī���");
		System.out.println("4. īǪġ��");
		
		boolean isChoice =false;
		
		int choice = sc.nextInt();
		while(isChoice) {
		
		switch (choice) {
		case 1:
			System.out.println("�Ƹ޸�ī�� �ֹ� �Ϸ�Ǿ����ϴ�.");
			break;
		case 2:
			System.out.println("ī��� �����߶� �ֹ� �Ϸ�Ǿ����ϴ�.");
			break;
		case 3:
			System.out.println("ī��� �ֹ� �Ϸ�Ǿ����ϴ�.");
			break;
		case 4:
			System.out.println("īǪġ�� �ֹ� �Ϸ�Ǿ����ϴ�.");
			break;
		default :
			System.out.println("�߸��� �����Դϴ�. �ٽ� �ѹ� �������ּ���. ");
			
			
		}	
			
		}
	}
}

