package com.kh.ComparablePractice;

import java.util.ArrayList;
import java.util.List;

public class ComparableMain {

	public static void main(String[] args) {

		List<CompareExam> Cellebrity = new ArrayList<>();
		
		Cellebrity.add(new CompareExam("�� ��","���",30,"��"));
		Cellebrity.add(new CompareExam("������","����",27,"��"));
		Cellebrity.add(new CompareExam("�� ��","����",28,"��"));
		Cellebrity.add(new CompareExam("�����","���",26,"��"));
		
		//���̸� �������� ����
		
		//Collections.short(people);
		
		for(CompareExam CompareExam : Cellebrity) {
			System.out.println(CompareExam);
		}
		
	}

}
