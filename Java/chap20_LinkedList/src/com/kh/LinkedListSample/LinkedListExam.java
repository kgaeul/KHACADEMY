package com.kh.LinkedListSample;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExam {

	public static void main(String[] args) {

		List<String> LinkedList = new LinkedList<>();
		
		LinkedList.add("������");
		LinkedList.add("��Ȳ��");
		LinkedList.add("�����");
		LinkedList.add("�ʷϻ�");
		
		System.out.println(LinkedList);
		
		LinkedList.remove(2);
		
		System.out.println("���� �� : "+LinkedList);
		
		LinkedList<Integer> LinkedList2 = new LinkedList<>();
		
		LinkedList2.add(1);
		LinkedList2.add(2);
		LinkedList2.add(3);
		LinkedList2.add(4);
		LinkedList2.add(5);
		
		System.out.println(LinkedList);
		
		LinkedList2.remove(2);
		
		System.out.println("���� �� : "+LinkedList2);
		
		
	}

}
