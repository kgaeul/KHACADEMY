package com.kh.If;

import java.util.Scanner;

public class practice1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("�޴���ȣ�� �Է��ϼ��� : ");
		System.out.println("1. �Է�");
		System.out.println("2. ����");
		System.out.println("3. ��ȸ");
		System.out.println("4. ����");
		System.out.println("7. ����");
		
		
		int choice = sc.nextInt();
		switch(choice) {
		case 1 :
		System.out.println("�Է�");
		break;
		case 2 :
		System.out.println("����");
		break;
		case 3 :
		System.out.println("��ȸ");
		break;
		case 4 :
		System.out.println("����");
		break;
		default:
		System.out.println("���α׷��� ����˴ϴ�. ");
		
		}
		
	}

}
