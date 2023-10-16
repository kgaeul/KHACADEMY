package com.kh.serial;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationExam {

	public static void main(String[] args) {

		Person p = new Person("kh",30);
		
		try {
			FileOutputStream fileout = new FileOutputStream("person.txt");
			ObjectOutputStream out = new ObjectOutputStream(fileout);
//			Person deSerialPerson = (Person) out.readObject();
			out.writeObject(p);
			out.close();
			fileout.close();
			System.out.println("Perzon ��ü�� ����ȭ�Ǿ� person.txt ���Ͽ� �����");
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
		//���Ͽ� ��ü�� ������ȭ �Ͽ� �о��
		FileInputStream filein = new FileInputStream("person.txt");
		ObjectInputStream in = new ObjectInputStream(filein);
		Person deSerialPerson = (Person) in.readObject();
		System.out.println("person.txt ���Ͽ��� ������ȭ�Ͽ����ϴ�.");
		System.out.println("��ü���� : "+deSerialPerson);
		
		in.close();
		filein.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
