package com.kh.queueMain;

import java.util.LinkedList;
import java.util.Queue;
//ť�� ���� ������ ���� ���� ~~
public class QueueMain {
	
	public static void main(String[] args) {
	//ť ����
	Queue <String> queue = new LinkedList<>();
	
	/* front              real(tail)
	 *   |         |         |
	 *   V         V         V
	   +---+     +---+     +---+
	   | 1 | <-  | 2 |  <- | 3 |
	   +---+     +---+     +---+
	 
	 */
	//ť�� ��� �߰�
	queue.offer("���");
	queue.offer("�ٳ���");
	queue.offer("ü��");
	
	//ť���� ��� ���� �� ���(FIFO ������� ��µ�)
	String removeElement = queue.poll(); //queue���� apple �����ϰ� ��ȯ
	System.out.println(removeElement+" ����Կ�");
	
//	removeElement = queue.poll();
	
	//�������� �ʰ� Ȯ�θ�
	String fontElement = queue.peek();
	System.out.println(queue.peek());
	
	int size = queue.size();
	System.out.println("������� : "+size);
	System.out.println(queue);
	
//	while(!queue.isEmpty()) {
//		String element = queue.poll();
//		System.out.println(element);
//		}
	}
}
