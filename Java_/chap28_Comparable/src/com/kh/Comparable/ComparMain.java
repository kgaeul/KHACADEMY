package com.kh.Comparable;

import java.util.ArrayList;
import java.util.List;

public class ComparMain {

	public static void main(String[] args) {

		List<Person> people = new ArrayList<>();
		
		people.add(new Person("�谡��",78));
		people.add(new Person("��ٶ�",40));
		people.add(new Person("�踶��",28));
		people.add(new Person("����",71));
		
		//���̸� �������� ����
		
		//Collections.short(people);
		
		for(Person person : people) {
			System.out.println(person);
		}
		
	}

}
