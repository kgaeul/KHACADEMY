package com.kh.Operator;

public class Ternary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//6. ���� ������
		/*
		 ������ ���ϰ� �� ���� �� �� �ϳ��� ��ȯ�մϴ�.
		 ���� ����
		 ����  ? ��1 : ��2 ���·� ���
		 ����= ����? ����:����
		 
		 * */
		//EX) ���̰� 20 �̻��̸� �����ΰ� �̼������ΰ�
		/*�� 1�� ������ ���� �� ���
		�� 2�� ������ ������ �� ���
		*/
		int age = 20; //   ����? ��1(true):��2(false)
		String status = (age>=21)?"����" : "�̼�����";	 
		System.out.println(status);
		
		int score = 85;
		String result = (score>=60)?"�հ�":"���հ�";
		System.out.println(result);
		
		int number =-5;
		String sign = (-5>0) ? "true":"false";
		System.out.println(sign);
		
		int temperature =25;
		String weather = (temperature>25)? "������ ����":"���� ����";
	    System.out.println(weather);
	    
	    
	    //���� 7�� ���� ¦������ Ȧ������ ���
	    
	    int number1 =7;
	    String result1 = (0==(number1%2))?"¦��":"Ȧ��";
	    System.out.println(result1);

	    int number2 = 0;
	    String sign2 = (number2>0)?"���":(number<0)?"����":"0";
	    System.out.println(sign2);
		
				

	}

}
