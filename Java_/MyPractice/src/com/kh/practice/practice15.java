package com.kh.practice;

import java.util.Scanner;

public class practice15 {

	public static void main(String[] args) {

	Scanner sc = new Scanner (System.in);
	
	System.out.print("���ڸ� �Է����ּ��� : ");	
	int num = sc.nextInt();		
	
	int count=0;
	for(int i=1; i<=num ; i++) {
		if(num%i==0) {
			count++;
			System.out.println("��� : "+i);
		}else if(num<2){
			System.out.println("�ٽ� �Է����ּ���");
			
		}
	}
		if(count>2) {
			System.out.println(num+"�� �Ҽ��� �ƴմϴ�.");
			System.out.println(num+"�� ����� ������ "+count+"�� �Դϴ�.");
			}else if(count<3){
				System.out.println("�Ҽ��Դϴ�.");
				}else{
		}
	}    
}

