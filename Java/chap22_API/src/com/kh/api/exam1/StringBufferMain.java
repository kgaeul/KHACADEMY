package com.kh.api.exam1;

//StringBuffer
//���ڿ��� ȿ�������� �ٷ�� ���� Ŭ���� �ٲ�ų� �ٲ� �� �ִ� ���ڿ��� ��Ÿ����
//���ڿ��� �����̳� ������ �ʿ��� ��� ���

public class StringBufferMain {

	public static void main(String[] args) {
		//�� StringBuffer ��ü ����
		StringBuffer sb = new StringBuffer();
		
		//���ڿ� �߰�
		sb.append("Hello");
		sb.append("Java");
		sb.append("StringBuffer");
		
		System.out.println(sb.toString());
		
		sb.insert(6, "Eclpse");
		System.out.println(sb.toString());
		
		sb.replace(13,17, "WoW");
		System.out.println(sb.toString());
		
		sb.delete(13,17);
		System.out.println(sb.toString());
	}

}
