package com.kh.forexample;

import java.util.Scanner;

public class for02 {

	public static void main(String[] args) {

		Scanner sc =new Scanner (System.in);
		/*System.out.print("ù ��° ���ڸ� �Է��ϼ��� : ");
		int num1 =sc.nextInt();
		
		System.out.print("�� ��° ���ڸ� �Է��ϼ��� : ");
		int num2 =sc.nextInt();
		int result =0;
		for (int i=1 ; i<=num2 ; i++) {//for ������ ����ؼ� i������ 0���� num2�̸����� �ݺ�
			result += num1;			//�� ������ �ι�° ������ num2��ŭ �ݺ�
			//result ������ num1���� ����
			//num2��ŭ num1�� ���ϴ� ȿ���� ��
		
		System.out.println(num1+"x"+ i +"="+result);
		//���� ����� ��� �Է¹��� �� ���ڿ� ��� ���� ���ڿ��� ���� ���
		
		System.out.print("ù ��° ���ڸ� �Է��ϼ��� : ");
		*/
		int num1; //=sc.nextInt();
		
		//System.out.print("�� ��° ���ڸ� �Է��ϼ��� : ");
		int num2; //=sc.nextInt();
		
		
		
		for (int i2=1 ; i2<10 ; i2++) { //i2�� ����
			for (int i=1 ; i<=9 ; i++) { //i�� ����
				int result =i*i2;			//	i*i2
				System.out.println(i2+"x"+ i +"="+result); //i*i2�� ���
				
				
				
				
			}
		}
		
		
		
	}	
		
}
