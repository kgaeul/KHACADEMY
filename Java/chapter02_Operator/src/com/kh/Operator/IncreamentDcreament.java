package com.kh.Operator;

public class IncreamentDcreament {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//3.���� ������(increament,decreament)
		//���� �����ڴ� ������ ���� 1�� ������Ű�ų� ���ҽ�ų �� ���
		//���� ���� ������(++x,--x) ���� ���� ������(x++,x--)
		/* * 1-1)���� ���� ������
		 * ++���� ���� 1�� ���Ѵ�
		 * val = ++num;//num�� ���� 1�� ������ �� vam�� ������ ���� ����
		 * val = --num;//num�� ���� 1�� ������ �� vam�� ������ ���� ����
		 * */
		int val,val2;
		
		int num1 =10;
		
		val = ++num1; //num�� ���� 1�� ������ �� val�� ���� ���ԵǱ� ������ 11�� ����
		System.out.println(val);
		
		val2 = --num1; //num�� ���� 1�� ������ �� val�� ���� ����
		System.out.println(val2);
		
		//1-2 ���� ���� ������ : ++���� ���� 1�� ���Ѵ�.
		int val3, val4;
		int num2 =10;
		System.out.println("num2�� �� : " + num2);
		val3 =num2++; //val2 ������ ���� num3�� ���� ������ �Ŀ� num3 �� ����
		//1�� val3=num2 �� �߰�����
		//2�� num ++1 �߰�����
		System.out.println(val3);
		System.out.println(num2);
		
		val4 = num2--;
		System.out.println("val4 : "+val4);
		System.out.println("num2�� �� : "+num2);
		
		
		
		
		

	}

}
