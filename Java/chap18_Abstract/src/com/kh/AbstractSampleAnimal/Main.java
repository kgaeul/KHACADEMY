package com.kh.AbstractSampleAnimal;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Animal rabbit= new Animal("[�䳢]","���ѱ���","���",5);
		Animal monkey= new Animal("[������]","�쳢��","�ٳ���",7);
		Animal lion= new Animal("[����]","������","���",9);
		
		Dog d = new Dog("[������]","�۸�","���ٱ�",3);

		System.out.println(rabbit.infor());
		System.out.println(d.infor());
		System.out.println(monkey.infor());
		System.out.println(lion.infor());
		
		System.out.println("================================");	

		List<String>Animal= new ArrayList<>();
		
		Animal.add("[�䳢]");
		Animal.add("[������]");
		Animal.add("[����]");

								
		for(String Animals : Animal) {
			System.out.print(Animals+" ");
		}
	}

	
}


