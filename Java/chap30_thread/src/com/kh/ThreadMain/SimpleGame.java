package com.kh.ThreadMain;

public class SimpleGame {



	public static void main(String[] args) {
			// �ܺ� Ŭ������ �ν��Ͻ��� ����
			// ���� ���� ������ ����
		
			
		boolean isGameOver = true;
		
			SimpleGame s = new SimpleGame();
			Thread gameThread = new Thread(new GameLoop());
			gameThread.start();
			
			// ���� ���� ���� : �÷��̾ Enter Ű�� ������ ���� ����
			try {
				//����ڰ� Ű����� �Է��� ����Ʈ�� ����
				//����ڰ� EnterŰ�� ���� �� ���� ���α׷� �Ͻ� ����
				System.in.read( );
				isGameOver=false;
			} catch (Exception e) {
				e.printStackTrace();
		
		}
	}
}
