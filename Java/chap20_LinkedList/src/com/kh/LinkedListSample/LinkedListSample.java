package com.kh.LinkedListSample;

import java.util.LinkedList;
import java.util.List;

public class LinkedListSample {

	public static void main(String[]args){
		
		
		List<String> LinkedList = new LinkedList<>();
		List<String> LinkedList2 = new LinkedList<>();

		LinkedList<String> LinkedList3 = new LinkedList<>();
		
		
		LinkedList.add("ù ��°");
		LinkedList.add("�� ��°");
		LinkedList.add("�� ��°");
		System.out.println(LinkedList);
		
		LinkedList.remove(2);
		System.out.println("���� �� : "+LinkedList);
		
		boolean isTrue = LinkedList.contains("�� ��°");
		
		System.out.println(isTrue);
		
		int size = LinkedList.size();
		System.out.println("�迭�� ũ�� : "+size);
		
		LinkedList3.add("�䳢");
		LinkedList3.add("�ź���");
		LinkedList3.add("ȣ����");
		LinkedList3.add("����");
		
		System.out.println(LinkedList3);
		
		
		
	}
	
}
