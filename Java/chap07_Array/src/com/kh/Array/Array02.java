package com.kh.Array;

public class Array02 {

	public static void main(String[] args) {

		
		int[]num = new int[10];
		
		for(int i=0;i<num.length;i++) {
			num[i] =i+1;
			System.out.println(num[i]);
		}
		//������� �迭 �ε����� �� ���� ���
		
		for(int i =1; i<num.length;i++) {
			System.out.println("num: "+num[i]);
		}
		
		//���̰� 10�� �迭 ����
		//�������� ���
		for(int i =0; i<num.length; i++) {
			num[i]=num.length-i;
			System.out.println("num["+i+"]="+num[i]);
			
	}
		//���̰� 5�� String �迭 �����ϰ� ��� �� ���� ������ ���ܷ� �ʱ�ȭ�� �� �迭 �ε����� �� ���
		String[]fruit = {"���","��","����","������","����"};
			System.out.println(fruit[1]);
		
	}
}
