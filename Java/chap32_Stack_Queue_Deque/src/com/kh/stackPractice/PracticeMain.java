package com.kh.stackPractice;

import java.util.Stack;

public class PracticeMain {

	public static void main(String[] args) {
		//���ÿ� ���� �����ϰ� �����ϰ� �ʱ�ȭ�� �޼��� ����غ���
		
		Stack<String> stack = new Stack<>();
		
		stack.push("��");
		stack.push("����");
		stack.push("����");
		stack.push("�ܿ�");
		
		stack.peek();
		
		System.out.println(stack.peek());
		
		stack.pop();
		System.out.println(stack.pop());
		

		System.out.println("���� �ִ°�? : "+stack.contains("��"));
		System.out.println("������ �ִ°�? : "+stack.contains("����"));
		System.out.println("������ �ִ°�? : "+stack.contains("����"));
		System.out.println("�ܿ��� �ִ°�? : "+stack.contains("�ܿ�"));
		
		System.out.println("ũ�Ⱑ ���̾�? \nũ��� "+stack.size()+" ��!!!");
		
		stack.clear();
		System.out.println(stack);
		
		System.out.println("����ֽ��ϱ�? : "+stack.empty());
		
		
		
		
				
				
	}

}
