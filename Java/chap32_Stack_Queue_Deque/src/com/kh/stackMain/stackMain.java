package com.kh.stackMain;

import java.util.Stack;

public class stackMain {

	public static void main(String[] args) {

		Stack<Integer> stack = new Stack<>();
		//stack�� �� �߰� push();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		//stack �� ���� pop();
		stack.pop();
	
		//���� ������ �� ���
		stack.peek();
		
		//��ü ����
		stack.clear();
		
		//ũ�� ���!!!
		stack.size();
		
//		stack empty : ������ ����ִ� �� üũ
//		����ִٸ� true �ϳ��� ����ִٸ� false
		stack.empty();
		
		//���� 1�� �ִ� �� üũ 1�� �����Ѵٸ� true
		stack.contains(1);
		System.out.println(stack.contains(1));
		/*
		 |			 |
		 |			 |
		 |			 |
		 |	   3	 |
		 |	   2	 |   
		 |_____1_____|
		 */
		

		
	}

}
