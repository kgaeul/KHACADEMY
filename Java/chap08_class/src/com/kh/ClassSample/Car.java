package com.kh.ClassSample;

public class Car {

	//1.���� 2.�ʵ� 3.�������
	String brand;		//�귣��
	String model;		//��
	int speed;			//�ӵ�
	boolean engineOn;	//���� ����
	//������� �ؿ��� ��� �޼���� ����//
	//=============================================//
	
	//2.�����ڴ� �޼����� �Ѱ��� ����(�Է��� ���� �����ϼ���)
	public Car(int speed, String brand,String model) {
		this.brand = brand;
		this.model=model;
		this.speed=0;	
		this.engineOn=false;
		System.out.println("car ����");
		
	}
	//���� ���� �޼���
	public void startEngine() {
		//���࿡ ������ true�� ���� �õ��ϰ� 
		if(engineOn) {
			System.out.println("������ �õ��մϴ�.");//��� �޼ҵ� �ۼ�
		} else {//������ false�� �̹� ������ �����ִ�.
			System.out.println("�̹� ������ ���� �ֽ��ϴ�.");
			}
		
		
	}//���� �޼���
	public void acclerate(int amount) {
		if(engineOn) {
			//������ true�� ���� �ӵ��� �󸶴�.
			speed+=amount;
			System.out.println("�ӵ� ���Դϴ�.");
		}else {
			System.out.println("�ӵ��� �� �� ����.");
			//������ false�� ������ �����־� �ӵ��� �� �� ����.
		
	
		}	
	}	
}