package com.kh.Inheritance.animal;

public class Animalmain {

	public static void main(String[] args) {

		Dog mydog = new Dog("�����",5);
		mydog.information();
		mydog.age();
		mydog.eat();
		mydog.sleep();
		
		System.out.println("------------------------------");
		
		Dog mydog2 = new Dog("�ð��ں���",8);
		mydog2.information();
		mydog2.age();
		mydog2.eat();
		mydog2.sleep();
		mydog2.speak();
		
		System.out.println("------------------------------");
		
		Cat mycat = new Cat("����",7);
		mycat.information();
		mycat.age();
		mycat.eat();
		mycat.sleep();
		
		System.out.println("------------------------------");
		
		Rabbit rabbit =new Rabbit("�䲤��",3);
		rabbit.information();
		rabbit.age();
		rabbit.eat();
		rabbit.sleep();
		
		System.out.println("------------------------------");
		
		Lion lion = new Lion("����",7);
		lion.information();
		lion.age();
		lion.eat();
		lion.sleep();
		

		System.out.println("------------------------------");
		
		Monkey monkey = new Monkey("��߹�",7);
		monkey.information();
		monkey.age();
		monkey.eat();
		monkey.sleep();
		

	}

}
