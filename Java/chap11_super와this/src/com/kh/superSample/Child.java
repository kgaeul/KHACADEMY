package com.kh.superSample;

public class Child extends Parent{
	//���������ڰ� defult�� ����� ���ֺ� public�̶� ������ �Ȱ���
	
	public Child(){
		super();//�θ� Ŭ������ �⺻ ������ ȣ��
		System.out.println("�ڽ� Ŭ������ �⺻ �������Դϴ�. ");
		
	}
	public Child(String name) {
		super(name); //�θ� Ŭ������ ���ڿ� �Ķ���� ȣǮ
		System.out.println("�θ��� �Ķ���� �����ڸ� �����Խ��ϴ�.");
	}
	public void display() {
		super.show();//��Ʈ(.)�� ���� �׸�
		System.out.println("�ڽ� Ŭ������ display �޼ҵ� �Դϴ�. ");
	}
	
	
}
