package com.kh.Operator;

public class Logical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//5. �������� (Logical)
		/*
		 �� �����ڴ� ������ ������ �ٷ� �� ����Ѵ�
		 &&(�� AND), ||(�� OR), !(�� NOT)
		 &&(����) �� ���� ��� ���� ��� ��, �ƴϸ� ����
		 ex) boolean val =5>2 && 5>3;
		 ||(����) �� �� �� �ϳ��� ���̸� ��!
		 boolean val = (5>2) || (5<3);
		 !(�� ����) ���� ��� �������� �ٲٰ�, ������ ���� ������ �ٲ�
		 ex) boolean val = !(5>2);
		 
		 */
		boolean isTrue =true;
		boolean isFalse= false;
		//1. &&(�� AND)
		boolean logicalAnd=isTrue && isFalse;
		System.out.println(logicalAnd);
		boolean val1 = 5>2 && 5>3;
		System.out.println(val1);
		
		int a=10;
		int b=5;
		int c=3;
		boolean val2= a<b && a>c;
		System.out.println(val2);
		boolean val3 = a>b && a<c;
		System.out.println(val3);
		
		//2.����(||) 
		boolean val4 = 5>2 || 5<3;
		System.out.println("|| : " +val4);
		
		int d= 20;
		int e= 10;
		int f= 5;
		boolean val5 = d>e || d<f;
		System.out.println(val5);
		
	boolean val6 = d>e || e>f;
	System.out.println(val6);
	//3.���� (!)
	boolean val7 =!(5>2);
	System.out.println(val7);
	
	int g =100;
	int h =200;
	int i =100;
	boolean dd = !(g>h);
	System.out.println(dd);
	boolean dd2 = !(g>i);
	System.out.println(dd2);

		
		
		
		
	}

}
