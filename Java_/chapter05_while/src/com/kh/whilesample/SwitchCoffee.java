package com.kh.whilesample;

import java.util.Scanner;

public class SwitchCoffee {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int choice;
		boolean ischoice = false;
		
		while(!ischoice) {
			System.out.println("Ŀ�� �ֹ����ּ��� 1. �Ƹ޸�ī�� 2. ī��� 3. ȫ��");
			
			choice = scanner.nextInt();
			
			switch (choice) {
			case 1:
				System.out.println("�Ƹ޸�ī�� �ֹ�");
				ischoice = true;
				break;
			case 2:
				System.out.println("ī��� �ֹ�");
				ischoice = true;
				break;
			case 3 :
				System.out.println("ȫ�� �ֹ�");
				ischoice = true;
				break;
			default:
				System.out.println("�ֹ��� �߸��Ǿ����ϴ�.");
			
			}
		}
		
	}

}
