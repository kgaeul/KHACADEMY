package com.kh.api.exam1;

public class StringBuilderMain {
/*
 StringBuilder
 ���ڿ��� ȿ�������� ������ �� �ְ� ���ִ� Ŭ����
 ���ڿ��� ������ ������ ���ο� ���ڿ� ��ü�� �����ϴ� ���� �ƴ϶�
 ���� ���ڿ��� �����ϴ� ������� ����
 �޸� ����� ȿ�����̰� ��
 
 */
	
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Hello, ");
		sb.append("World");
		
		String result = sb.toString();
		
		System.out.println(result);
		
		//���ڿ� ����
		sb.insert(7,"java");//7��° ��ġ�� �ڹ� �����Ѵٴ� ��
		System.out.println(sb);
		
		sb.delete(1,7);
		System.out.println(sb);
		
		//���ڿ� ��ü
		sb.replace(1,7,"�ڹ��ְ��");
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
	}

}
