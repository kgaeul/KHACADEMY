package com.kh.ArrayListSample;

import java.util.ArrayList;

public class todoSample {

	public static void main(String[] args) {

		ArrayList<String> todo = new ArrayList<>();
		todo.add("�����ϱ�");
		System.out.println(todo);
		todo.add("û���ϱ�");
		System.out.println(todo                                                                                                                                                                                                                                                                                                                                                                                                                                                                );
		todo.add("�����ϱ�");
		System.out.println(todo);
		
		String firsttodo=todo.get(0);
		System.out.println("ù ��° ���� : "+firsttodo);
		String secondtodo=todo.get(2);
		System.out.println("�� ��° ���� : "+secondtodo);
		
		todo.set(1, "��å�ϱ�");
		System.out.println("[û���ϱ�] => ["+todo.get(1)+"]�� �����ϱ�");
		todo.set(0, "��ϱ�");
		System.out.println("[�����ϱ�] => ["+todo.get(0)+"]�� �����ϱ�");
		
		todo.remove(2);
		System.out.println("[�����ϱ�] ���� start "+todo);
		
		System.out.println("=======��� ���� ���======");
		//�츮�� ���� ������// ����� ����ִ� ������
		for (String todos:todo) {
			System.out.println("["+todos+"]");
		}
		
		todo.clear();
		System.out.println(todo+" => ��� �����Ǿ����ϴ�.");
		
	}

}
