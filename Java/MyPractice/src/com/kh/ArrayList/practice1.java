package com.kh.ArrayList;
import java.util.ArrayList;
public class practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated m
		
		

		ArrayList<String> colors = new ArrayList<>();
		
		
		colors.add("��");
		colors.add("��");
		colors.add("��");
		colors.add("��");
		colors.add("��");
		colors.add("��");
		colors.add("��");
		System.out.println(colors);
		
		colors.set(1,"��");
		colors.set(3,"����");
		colors.set(4,"�׸�");
		System.out.println(colors);
		
		
		colors.add(2,"���ο�");
		colors.add(5,"�����Ķ�");
		System.out.println(colors);
		
		System.out.println(colors.get(6));
		colors.remove(1);
		colors.remove(1);
		colors.remove(1);
		colors.remove(1);
		colors.remove(2);
		colors.remove(2);

		System.out.println(colors);
		
		for(String color:colors) {
			System.out.print(color);
			System.out.println(" ");
		}
		
		
	}

}
