package com.kh.practice6;

import java.util.Scanner;

public class Snackrun {

	public static void main(String[] args) {

		Snack snack = new Snack("��","����ũ","��纣��",1,15000);
		Scanner sc =new Scanner(System.in);
		System.out.print("�������� �Է����ּ��� : ");
		String bread=sc.next();
		System.out.print("���̸��� �Է����ּ��� : ");
		String name=sc.next();
		System.out.print("���� �Է����ּ��� : ");
		String flavor=sc.next();
		System.out.print("������ �Է����ּ��� : ");
		int numOf=sc.nextInt();
		System.out.print("������ �Է����ּ��� : ");
		int price=sc.nextInt();
		
		Snack snack2 = new Snack(bread,name,flavor,numOf,price);
		snack.information();
		snack2.information();
			}

}
