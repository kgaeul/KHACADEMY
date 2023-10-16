package com.kh.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorMain implements Comparator<String>{

	@Override
	public int compare (String num1,String num2) {
		//���̰� ������ 0 ��ȯ
		
		if(num1.length()==num2.length()) {
			return 0;
		}
		//num1�� num2 ���� ��� ��� ��ȯ
		else if(num1.length()>num2.length()) {
			return 1;
		}
		else {
			return -1;
		}
	}
	
	public static void main(String[] args) {

		List<String> str = new ArrayList<>();
		str.add("apple");
		str.add("banana");
		str.add("cherry");
		str.add("add");
		str.add("abcdefg");
		str.add("bcdefg");
		str.add("b");
		str.add("d");
		str.add("D");
		str.add("��");
		//�ѱ� �ҹ��� �빮��
		
		//Comparator ����Ͽ� ���ڿ��� �����ϱ�
		Collections.sort(str,new ComparatorMain());
		
		for(String s:str) {
			System.out.println(s);
		}
	}

}
