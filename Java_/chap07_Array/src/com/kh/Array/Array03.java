package com.kh.Array;

import java.util.Scanner;

public class Array03 {

	public static void main(String[] args) {
		
		/*
		 ���ڿ��� �Է¹޾� ���� �ϳ��ϳ� �迭�� �ְ� �˻��� ���ڰ� ���ڿ��� 
		 � �� �ִ� �� ������ 
		 �� ��° �ε����� ��ġ�ϴ� �� ����ϱ�
		 
		 
		 1.	 ���ڿ��� �Է¹޾�
			 ���� �ϳ��ϳ� �迩�� �ְ�
		     �˻��� ���� scanner
			 ���ڿ��� � �� �ִ��� ������
			 ���° �ε����� ��ġ�ϴ� �� �ε��� ����ϱ�
		 
		 
		 
		 2.  ���� �ϳ��ϳ� �迭�� �ִ´�.
			 string �ȿ� �ִ� ���ڵ��� �迭�� ��´�.
			 char�� ���ڸ� ���� ���� ���ڵ��� �迭�� �ִ´�.
			 string �ȿ� char�迭�� ������ִ� �༮ => tochararray
			 
		 */
		
		Scanner sc =new Scanner(System.in);
		System.out.print("���ڿ��� �Է��ϼ��� : ");
		
		String inputString = sc.next();
		System.out.print("�˻��� ���ڸ� �Է��ϼ��� : ");
		
		char searchChar = sc.next().charAt(0);
		//���ڿ��� ���ڷ� ��ȯ
		//�ȳ��ϼ��� -> �� �� �� �� ��
		
		//toCharArray -> ���ڿ��� ���ڹ迭�� ��ȯ�ϴ� ����
		char[]charString = inputString.toCharArray();
		
		int count =0;
		int charCount =charString.length;
			System.out.print(inputString+"��"+searchChar+"�� �����ϴ� ��ġ");
		//���࿡ ���� �� ���ڸ� �˻����� �� �� ���ڴ� ��� ° �ε����� ��ġ�ϴ� �� �ε��� ����ϱ�
		for(int i=0; i<charCount; i++){
			//�ݺ��� ����ؼ� ��ġã��
			if(charString[i]==searchChar){
				System.out.print(i);
				/*�������� �ƴ϶� i���� �Ǿ� �ϴ�����*/
				
			}
			count++;
		}
				
	}

}
