package com.kh.If;

import java.util.Scanner;

public class practice4 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);

		
		System.out.print("���� �Է����ּ���. : ");
		
		int season = sc.nextInt();
		
		switch(season) {
		case 1 :
		System.out.println("1���� �ܿ��Դϴ�.");
		break;
		case 2 :
		System.out.println("2���� �ܿ��Դϴ�.");
		break;
		case 3 :
		System.out.println("3���� ���Դϴ�.");
		break;
		case 4 :
		System.out.println("4���� ���Դϴ�.");
		break;
		case 5 :
		System.out.println("5���� ���Դϴ�.");
		break;
		case 6:
		System.out.println("6���� �����Դϴ�.");
		break;
		case 7:
		System.out.println("7���� �����Դϴ�.");
		break;
		case 8:
		System.out.println("8���� �����Դϴ�.");
		break;
		case 9:
		System.out.println("9���� �����Դϴ�.");
		break;
		case 10:
		System.out.println("10���� �����Դϴ�.");
		break;
		case 11:
		System.out.println("11���� �ܿ��Դϴ�.");
		break;
		case 12:
		System.out.println("12���� �ܿ��Դϴ�.");
		break;
		default:
		System.out.println(season+"���� �߸��� �Է´��Դϴ�. ");
		
		}
	}

}
