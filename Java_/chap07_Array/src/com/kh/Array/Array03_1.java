package com.kh.Array;

import java.util.Scanner;

public class Array03_1 {

	public static void main(String[] args) {
		
		/*���ڿ��� �Է¹޾� ���� �ϳ��ϳ� �迭�� �ְ� �˻��� ���ڰ� ���ڿ��� 
		 � �� �ִ� �� ������ 
		 �� ��° �ε����� ��ġ�ϴ� �� ����ϱ�
		 */
		Scanner sc =new Scanner(System.in);
		
		System.out.print("���ڿ��� �Է��ϼ��� : ");//���ڿ��� �Է¹޾�
		String inputString = sc.next();
		
		System.out.print("�˻��� ���ڸ� �Է��ϼ��� : ");
		char searchChar = sc.next().charAt(0); //�˻��� ���� scanner
		char[]charString = inputString.toCharArray(); // ���� �ϳ��ϳ� �迭�� �ְ�
		
		int count =0; //0���� ����
		int charCount =charString.length; // ���ڿ� ���� Ȯ��
			System.out.println("<"+inputString+">���� "+searchChar+"�� ��ġ : ");
			
		for(int i=0; i<charCount; i++){ //0��° �ڸ����� �� ���ڸ������� 
			if(charString[i]==searchChar){ //���° �ε����� ��ġ�ϴ� �� �ε��� ����ϱ�
				count++;//����� ���� Ȯ���ϱ�
				System.out.println(i+"�� ° �ڸ�");
			}
			
		}
		System.out.println("���� �� '"+searchChar+ "'�� ������ �� "+count+"�� �Դϴ�. ");
		if(count>5) {
			System.out.println("���ڰ� ���� ��ġ�մϴ�.");
		}else {
			System.out.println("���ڰ� ��ġ���� �ʽ��ϴ�.");
		}
	}

}
