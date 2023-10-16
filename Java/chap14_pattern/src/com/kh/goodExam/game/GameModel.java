package com.kh.goodExam.game;

public class GameModel {

	private int secretNumber;//������ ��ȣ
	private int attempts;//��� �õ��ߴ°�//�ν��Ͻ�����                                     
	
	
	public GameModel() {
		secretNumber=(int)(Math.random()*100)+1;
		attempts=0; 
	}
	
	public int getSecretNumber() {
		return secretNumber;
	}
	public int getAttempts() {
		return attempts;
	}
	public void increamentAttempts() {
		attempts++;
	}
	
	public boolean inCorrectGuess (int guess) {
		increamentAttempts();
		
		//�߰��ϴ� ���� �߰�
	return guess==secretNumber;
	}
}
