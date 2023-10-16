package com.kh.exceptionPractice;

import java.util.Scanner;

public class PracticeMain {

	public static void main(String[] args) {
		PracticeMain pm = new PracticeMain();
		pm.ArithException();
		pm.NPEException();
		pm.NumFormatException();
		Scanner sc= new Scanner(System.in);
		
	}
	public void ArithException() {
		try {
		int dividend = 100;
		int divisior = 0;
		int num =(dividend/divisior);
		System.out.println(num);
		}catch(ArithmeticException e){
			System.out.println("�ٽ� �Է����ּ���. "+e.getMessage());
		}
	}
	public void NPEException() {
		try {
		String text ="Hello World";
		String subtext = null;
		int length = text.indexOf(subtext);
		//indexof =>subtext�� ����ִ� ù ��° ��ġ �˻�.....!
		//ã�� ���ڿ��� ������ -1�� ����
		System.out.println(length);
		}catch(NullPointerException nulltext){
			System.out.println("�ٽ��Է����ּ���. "+nulltext.getMessage());
		}
		
	}
	public void NumFormatException() {
		
		int num = sc. nextInt();
		
		try {
		String text ="123.45";
		int number = Integer.parseInt(text);
		//�������� ������ �������� ���ڸ� ������ ��ȯ�ϰڴ�. �ٸ� ��¥ ���ڰ� ���� ������
		System.out.println(number);
		}catch(NumberFormatException n){
			System.out.println("������ �Է����ּ���. "+n.getMessage());
		}
	}
}
