package com.kh.practice;

import java.util.Scanner;

public class practice17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("���ڸ� �Է����ּ��� : ");	
		int num = sc.nextInt();		
		
		for(int i=1; i<= num; i++) {
			System.out.println(i);
		
		if(num%2==0&&num>0){
			System.out.print("�Ҽ��� �ƴմϴ�.");
				
		}else if(num%3==0&&num>3) {
				System.out.print("�Ҽ��� �ƴմϴ�.");
				
		}else if (num%5==0&&num>5) {                         
				System.out.print("�Ҽ��� �ƴմϴ�.");
				
		}else if (num<2){
				System.out.println("�߸��Է��ϼ̽��ϴ�. ");
				
			}else{
				System.out.print("�Ҽ��Դϴ�. ");
	}
		}
}
}
