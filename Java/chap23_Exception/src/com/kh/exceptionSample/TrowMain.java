package com.kh.exceptionSample;

import java.util.Scanner;

/*
		 * 
		 throw
		 ���ܸ� �߻���Ű�� Ű����
		 ���α׷� ���� �� ����ġ ���� ��Ȳ�� �߻����� �� ���
		 ���ܸ� �߻���Ű�� ����ó���� ���۵ǰ� 
		 ���α׷��� �ش翹�ܸ� ������ ó���ϰų� ����ȣ�� ���ÿ��ܸ� ����
		 
		 user ���ڸ� �Է��ؾ���
		 ����� �Է��ؾ��ϴµ� ������ �Է���
		 ������ ��� ���ܸ� �߻���Ű�� ������ ����
		 
		 
		 */
public class TrowMain {

	public static void main(String[] args) {
		
		
	
		try {
			int number = getNumber(); //���ڸ� ������ ��
			if(number < 0) {
				throw new NegativeNumberException ("������ ����� ���� �ʽ��ϴ�.");
			}
			System.out.println("�Է��� ���� : "+number);
		}catch(NegativeNumberException e ){
			System.out.println("���ܹ߻�!!!!"+e.getMessage());
		}
	}
		
	public static int getNumber() {
		Scanner sc= new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ��� : ");
		
		int number = sc.nextInt();
			return number;
	}
}
public class NegativeNumberException extends Exception {
	//����� ���� ���� Ŭ����
	public NegativeNumberException(String msg) {
		super(msg);
	}
}