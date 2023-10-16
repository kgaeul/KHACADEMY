package com.kh.Practice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PracticeMain {

	public static void main(String[] args) {

		PracticeMain pm = new PracticeMain();
		pm.PracticeQueue();
		pm.PracticeStack();
		
	}
	public void PracticeQueue() {
		Queue<String> snackqueue = new LinkedList<>();
		System.out.println("==================Queue=================");
		snackqueue.offer("������");
		snackqueue.offer("��īĨ");
		snackqueue.offer("�����۽�");
		snackqueue.offer("���ڼ���");
		snackqueue.offer("��Ϲ���Ĩ");
		snackqueue.offer("ĭ��");
		
		System.out.println(snackqueue);
		
		System.out.println(snackqueue.poll());
		
		System.out.println(snackqueue.peek());
		
		System.out.println(snackqueue.size());
	
		System.out.println(snackqueue.contains("���ڼ���"));
		
		while(!snackqueue.isEmpty()) {
			String element = snackqueue.poll();
			System.out.println(element);
		}
		System.out.println("==================Stack=================");
		
	}
	public void PracticeStack() {
		
		Stack<String> stack = new Stack<>();
		
		stack.push("����");
		stack.push("��Ȳ");
		stack.push("���");
		stack.push("�Ķ�");
		stack.push("����");
		stack.push("����");
	
		System.out.println(stack);
		
		System.out.println(stack.pop()+" �����Ұ�");
		
		System.out.println(stack.peek()+ " <- �갡 �������̶���.");
		
		System.out.println("ũ�Ⱑ "+stack.size()+"�Դϴ�.");

		System.out.println("Q) ���� �־�� ? ");
		if(stack.contains("����")==true) {
			System.out.println("A) ���� �ִµ��� ");
		}else if(stack.contains("����")==false) {
			System.out.println("A) �� ���� ���µ���?");
		}
		
		System.out.println("���� ���� �� :"+stack);
		
		if(stack.empty()==true) {
			System.out.println("�� �����Ǿ����ϴ�. ");
		}else if(stack.empty()==false) {
			System.out.println("�� ���� �ִµ���?");
		}
		
		stack.clear();
		
		if(stack.empty()==true) {
			System.out.println("�� �����Ǿ����ϴ�. ");
		}else if(stack.empty()==false) {
			System.out.println("�� ���� �ִµ���?");
		}
		
	}
}
