package com.kh.Inheritance.animal;

public class Monkey extends Animal {

	public Monkey(String name,int age) {
		super(name, age);
		
	}
	@Override
	public void eat() {//animal�� �����ִ� eat�� ����� �ȿ����� ������
		System.out.println("�츮 "+getName()+" �ٳ����� �Ծ�� ~");
	}
	
}
