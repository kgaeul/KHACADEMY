package com.kh.thisSample;

class MyAnimal{
	String Rabbit;
	int age;
	String favorite;
	
	MyAnimal(){
		this("�Ϳ��� �䲤��", 5, "���");
	}
	MyAnimal(String pet,int age,String favorite){
		this.Rabbit=pet;
		this.age=age;
		this.favorite=Rabbit;
	}
	void Mypetname(){-
		System.out.println("������ �̸��� "+this.Rabbit+"�Դϴ�.");
		System.out.println(this.Rabbit+"�� ���̴� "+this.age+"�� �Դϴ�.");
		System.out.println(this.Rabbit+"�� �־� ���̴� "+this.favorite+"�Դϴ�.");
	}
}
public class Animal {

	public static void main(String[]args) {
		MyAnimal animal = new MyAnimal("���ѱ��� �䲤��",3,"����");
		MyAnimal animal2 = new MyAnimal();
		
		animal.Mypetname();
		animal2.Mypetname();
	}

		
	}
	

