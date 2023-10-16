package com.kh.Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UserMain implements Comparator<String>{

	@Override
	public int compare(String num1, String num2) {
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

		
		List<String> Snack = new ArrayList<>();
		
		Snack.add("������");
		Snack.add("��īĨ");
		Snack.add("�����۽�");
		Snack.add("���ڼ���");
		Snack.add("����");
		
		Collections.sort(Snack,new UserMain());
		
		for(String snack: Snack) {
			System.out.println(snack);
		}
	}



}
