package com.kh.goodExam.game;

public class GameView {
	
	private String start = "���� ���߱� ������ �����մϴ�. 1���� 100������ ���ڸ� �����ּ���!";
	private String guess = "������ ���ڸ� �Է��ϼ��� : ";
	private String correct = "���ڸ� ������ϴ�.";
	private String fail=  "���Ƚ��ϴ� �ٽ� �õ��ϼ��� ";
	private String over="���� ����";
	private int attempts;
	private String num = "�õ�Ƚ�� : "+attempts;

	
	public void displayMessage() {
		System.out.println(start);
		//���� �����ϴ� �� �Է��ϱ�
	}
	public void displayGuessPrompt() {
		System.out.println(guess);
	}
	
	public void displayCorrectGuess( ) {
		System.out.println(correct);
	} 
	
	public void displayinCorrectGuess() {
		System.out.println(fail);
	
}
	public void displayAttempts() {
		System.out.println(num);
	}
	public void displayGameover() {
		System.out.println(over);
	}
	
} 
