package com.kh.ThreadMain;

import java.util.Random;


public class GameLoop implements Runnable {
	
	private boolean isGameOver = true;
	
	public void run() {
		while(isGameOver) {
			int randomValue = new Random().nextInt(10);
			System.out.println("������ ���� : " + randomValue);
			
			//���� ���� ���� �ð�
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			//�������� ����
			//Enter Ű�� ������ ������ ����
			System.out.println("������ �����Ϸ��� Enter Ű�� ��������. ");	
		}
	}
}
