package com.kh.Operator;

public class OperatorExam {

	public static void main(String[] args) {

		//1. ���� ���� ������
		/*
		 �������� �����ڴ� ���� 1�� ������Ų �� ���� �ٽ� ������ �Ҵ�
		 i�� ���� 1 ������Ű�� �� ���� �ٽ� i�� �Ҵ� 
		 */
		
		int i = 5;
		i = ++i;
		System.out.println("i = ++i"+i);
		
		//�������� �����ڴ� ������ ���� ���� ����� �� ���� 1�� ����
		//i�� ���� ���� i�� �Ҵ��ϰ�, �� �Ŀ� i�� ���� 1������Ų��.
		//������ �Ҵ��� ���簪�̹Ƿ� i�� ������� �ʴ´�.
		
		int i1 =5;
		i1 =i1++;
		
		int val;
		int val2;
		
		int num1 =10;
		val=num1++;
		System.out.println(val);
		val2=--num1;
		
		int a =5;
		++a;
		System.out.println(a);
		int b =5;
		b=b++;
		System.out.println(b);
		
		
		
		
		
	}

}
