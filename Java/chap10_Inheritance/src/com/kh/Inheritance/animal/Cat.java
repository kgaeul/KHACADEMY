package com.kh.Inheritance.animal;

public class Cat extends Animal  {

	public Cat(String name,int age) {
		super(name,age);//���� Ŭ����(Animal)�� �������(�Ķ����)�� �����ϴ� �� ���
	
	}
	@Override
	public void eat() {//animal�� �����ִ� eat�� ����� �ȿ����� ������
		System.out.println("�츮 "+getName()+" ������ �Ծ�� ");
	}
	
}
