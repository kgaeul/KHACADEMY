package com.kh.ArrayListSample;

import java.util.ArrayList;

public class ArrayListSample {

	public static void main(String[] args) {
		//�� arraylist ����
		ArrayList<String> fruits = new ArrayList<>();
		System.out.println(fruits);
		
		fruits.add("���");
		System.out.println(fruits);
		fruits.add("����");
		System.out.println(fruits);
		fruits.add("�ٳ���");
		System.out.println(fruits);
		
		int size = fruits.size();
		System.out.println("������ ũ�� : "+size);
		
		String firstFruits=fruits.get(0);
		System.out.println("ù ��° ���� : "+firstFruits);
		String fourFruits=fruits.get(2);
		System.out.println("ù ��° ���� : "+fourFruits);
		//��� ������ �ž�
		fruits.set(2, "ü��");
		System.out.println("����"+fruits);
		
		//�������
		fruits.remove(1);
		System.out.println("�ٳ��� ���� start"+fruits);
		fruits.clear();
		System.out.println(fruits);
	}

}
