package com.kh.ThreadMain;

public class StudentThread extends Thread{

	private String StudentName;

	public StudentThread (String name) {
		this.StudentName=name;
	}
	
	@Override
	public void run() {
		
		System.out.println(StudentName +"�̰� ���� ���θ� �����մϴ�.");
		try {
			Thread.sleep(2000); //�����尡 2�ʵ��� ���ڱ� ���·� �ֵ��� �մϴ�.
		} catch (Exception e) {
			e.printStackTrace();
		}
		for(int i =0;i<=5;i++) {
			System.out.println("������ ���� �� : "+i);
		}
		System.out.println(StudentName+"�̰� ���θ� ��Ĩ�ϴ�.");
	}

}
