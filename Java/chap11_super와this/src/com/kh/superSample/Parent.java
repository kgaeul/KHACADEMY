package com.kh.superSample;
		//��� �޾Ƽ� super() super. ������ Ȯ��
		//super = �θ�Ŭ������ ������ �޼ҵ忡 �����ϱ� ���� ���
//		super()=�θ� Ŭ������ �����ڸ� ȣ���ϱ� ���� ���
//				����Ŭ������ �����ڿ��� ù ��° �ٿ� ȣ��Ǿ�� ��

public class Parent {
	String name;
		
	Parent(){
		System.out.println("�θ�Ŭ������ �⺻ ������ �Դϴ�.");
	}
		Parent(String name){
			this.name=name;
			System.out.print("�� ������ �̸� : ");
			System.out.println(name);
		}
		public void show() {
			System.out.println("�� ������ �����ϴ� ��");
	}

}
