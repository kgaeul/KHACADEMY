package com.kh.practice;

import java.util.Scanner;

public class practice5_1 {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		
		System.out.print("���ڸ� �Է��ϼ��� : ");
		
		
		boolean checknum = true;
		
		
			int num = sc.nextInt();//���� num �Է�
			if(num<2) {//���� num�� 2���� ���� ���
				System.out.println("�߸� �Է��ϼ̽��ϴ�. 1 �̻��� ���ڸ� �Է����ּ���. ");
				
				
			}else {//num�� 2 ���� Ŭ ���
				int count=0; 
				for(int i=1;i<=num;i++) {//1���� num����
					if(num%i==0) {//1���� num���� ������ �� ����������� ���
						count++;
					}	
					
				}
					
					if(count>2) {//�������� 2���� Ŭ���
						System.out.println(num+"�� �Ҽ��� �ƴմϴ�.");
				
					}else {//�������� 2���� ���� ���
						System.out.println(num+"�� �Ҽ��Դϴ�.");
						
						
					
				}
		}
	}
}
