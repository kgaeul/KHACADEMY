package com.kh.Inheritance.animal;

public class Dog extends Animal {//�ڹٴ� ���� ���, �ٸ� ���� ���߻�� ����

	public Dog(String name,int age) {
		super(name, age);//���� Ŭ����(Animal)�� �������(�Ķ����)�� �����ϴ� �� ���
	
	}
	
	public void speak() {
		System.out.println(getName()+" : �۸�(������ ¢��;;)");
		
		
	}
	
	public void eat() {
		System.out.println("�츮 "+getName()+" ������ �Խ��ϴ�.");
		
		
	}
}
