package com.kh.practice;

import java.util.Scanner;


//todosample
//���� ����� �����ϰ� ����� ���� ����

public class practice16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		boolean isTrue = true;
		
		while(isTrue) {
		System.out.print("���ڸ� �Է����ּ��� : ");	
		int num = sc.nextInt();		
		if(num%2==0&&num>2){
			System.out.print("�Ҽ��� �ƴմϴ�.");
				isTrue = false;
		}else if(num%3==0&&num>3) {
				System.out.print("�Ҽ��� �ƴմϴ�.");
				isTrue = false;
		}else if (num%5==0&&num>5) {                         
				System.out.print("�Ҽ��� �ƴմϴ�.");
				isTrue = false;
		}else if (num<2){
				System.out.println("�߸��Է��ϼ̽��ϴ�. ");
				
			}else{
				System.out.print("�Ҽ��Դϴ�. ");
				isTrue = false;
				}
			}    
	}

}
