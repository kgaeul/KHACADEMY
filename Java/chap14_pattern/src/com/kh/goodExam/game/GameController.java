package com.kh.goodExam.game;

import java.util.Scanner;

public class GameController {
	//		String
	private GameModel model;
	
	private GameView view;
	
	public GameController(GameModel model,GameView view) {
		this.model=model;
		this.view=view; 
	}
	
	public void runGame() {
		//���ʸ޼��� �����ִ� �� ����ϰ�
		
		//��ĳ�� �̿��ؼ� �Է°� ȣ��
	
	while(true) {
	view.displayMessage();
	view.displayGuessPrompt();
	Scanner sc = new Scanner(System.in);
	int guess=sc.nextInt();	
	//���ڸ� ������ �� �ҷ��� view
		if(model.inCorrectGuess(guess)) {
		view.displayCorrectGuess();
		view.displayAttempts(); 
		break;
		}else{
		//��ǻ�Ͱ� ������ ���ڿ� �����Է��� ���ڰ� Ʋ���� �� view
		view.displayinCorrectGuess();
		view.displayAttempts();
		}
	}
		view.displayGameover();
		
		
}
	
	public  static void main(String[]args) {
		                                                                                                                                         
	}
	
}
