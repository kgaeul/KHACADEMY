package com.kh.Inheritance.animal;

public class Lion extends Animal {

	public Lion(String name,int age) {
		super(name, age);
		
	}
	@Override
	public void eat() {//animal�� �����ִ� eat�� ����� �ȿ����� ������
		System.out.println("�츮 "+getName()+" ��⸸ �Ծ��.... ");
	}
}
