package com.kh.api.exam1;

public class PracticeMain2 {

	public static void main(String[] args) {
		PracticeMain2 p= new PracticeMain2();
		
		p.practice1();
		p.practice2();
		p.practice3();
		p.practice4();
		p.practice5();

	}
	public void practice1() {
		//���ڿ� �� ���̱� ��� append Ȱ�� 
		StringBuffer sb = new StringBuffer();
		sb.append("���� "); //���� ������ ������?
		sb.append("������ ");
		sb.append("��");
		sb.append("�Կ��? ");

		System.out.println(sb.toString());
		
	}
	public void practice2() {
		StringBuffer sb = new StringBuffer();
		sb.append("���� ������ ������?");
		System.out.println(sb.toString());
		
	}
	public void practice3() {
		String str = ("���� ������ ���� ������?");
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		System.out.println(sb.toString());
	}
	
	public void practice4() {
		//���ڿ� �� ���̱� ��� append Ȱ�� 
		StringBuffer sb = new StringBuffer();
		sb.append("���� ������ ���� ������?"); //���� ������ ������?
		sb.insert(14,"����");
		System.out.println(sb.toString());
		
	}
	public void practice5() {
		StringBuffer sb = new StringBuffer();
		sb.append("���� ������ ������?");
		sb.delete(9,10);
		//n���� m ���� �����ִ� ��
		sb.insert(9,"��");
		System.out.println(sb.toString());
		
	}

}
