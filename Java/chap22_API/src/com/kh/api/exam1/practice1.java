package com.kh.api.exam1;

import java.util.Scanner;

public class practice1 {
	Object obj = new Object();
	public static void main(String[] args) {
		
	
		Scanner sc = new Scanner(System.in);
		System.out.print("ù ��° ���ڸ� �Է����ּ��� : ");
		String a = sc.next();
		System.out.print("�� ��° ���ڸ� �Է����ּ��� : ");
		String b = sc.next();
	
		
		sc.close();
		
		if(a.equals(b)) {
			System.out.print("�� ���ڴ� �����ϴ�.");
		}else {
			System.out.println("�� ���ڴ� �ٸ��ϴ�.");
		
	}
		
		int hashCode1= a.hashCode();
		int hashcode2= b.hashCode();
		
		System.out.println(hashCode1);
		System.out.println(hashcode2);
		
		String aString = a.toString();
		String bString = b.toString();
		
		System.out.println(aString);
		System.out.println(bString);
		
		
		}
}
