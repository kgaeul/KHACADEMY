package com.kh.Operator;

public class comparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//4. �񱳿����� : ���� ���� �� ���
		/*
		 ũ�� ��, ��ȣ �� ���� ���డ��
		 �� ���� �� �� ��� ���� �� ū�� , �� ���� ��, ���� ��, �ٸ� ���� ���θ� �Ǵ���
		 �� �������� ��� ���� ��(true) �Ǵ� ���� (false)���� ��
		 > ���� ���� ũ�� ��, �ƴϸ� ������ ��ȯ �̸� �ʰ�
		 < ���� �� ���� ũ�� �� ,�ƴϸ� ������ ��ȯ �̸� �ʰ�
		 >= ���� ���� ������ �׺��� ũ�ų� ������ ��, �ƴϸ� ������ ��ȯ
		 <= ���� ���� ������ �׺��� �۰ų� ������ ��, �ƴϸ� ������ ��ȯ
		 == �� ���� ���� ������ ��, �ƴϸ� ������ ��ȯ ex)num ==5
		 != �� ���� ���� �ٸ��� ��, �ƴϸ� ������ ��ȯ num!=5

		 */
		int p =5;
		int q =10;
		
		System.out.println("boolean�� ���� ���� : "+ (p==q));//false�� true�� ����
		boolean isEqual =p ==q;
		System.out.println(isEqual);
		int r =5;
		System.out.println(p==r); //���� 5�� �����ϱ� ������ true�� ��ȯ
		
		boolean isEqual1=p!=q;
		System.out.println(isEqual1);
		System.out.println(p<=q);
		System.out.println(p>=r);
		
		boolean isEqual2 =p!=r;
		System.out.println(isEqual2);
		
		
		
		

	}

}
