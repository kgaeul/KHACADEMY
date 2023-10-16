package com.kh.ThreadMain;

public class ThreadMain extends Thread{
/*
 Thread 
	 ���μ��� ������ ����Ǵ� �������� ���� �帧
	 ��Ƽ�������� ���� �����۾��� ������ �� �ְ� ��
 */
	public void run() {
		for(int i =0;i<=5;i++) {
			System.out.println("������ ���� �� : "+i);
		}
		try {
			Thread.sleep(1000);//1�� ���� ������ �Ͻ�����
			System.out.println("������ �������ϱ�?");
			} catch (Exception e) {
				e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		ThreadMain thread1 = new ThreadMain();
		ThreadMain thread2 = new ThreadMain();

		//������ ����
		thread1.start();
		thread2.start();
		
		//���� �����忡�� �ٸ� �۾��� ������ �� ����
		
		try {
			thread1.join();
			thread2.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
	System.out.println("��� ������ ����");
	}

}
