package com.kh.classCircle;

public class Circle {
	//�������
	private  final double PI = 3.14;
	int radius =1;
	
	
	//������
	public Circle() {
		//�⺻ ������
	}
	//�������� ���� ���
	public void in() {
		//������ ���� ������ų ���� ������ �� �ִ�.
		radius++;
		System.out.println(radius);
	}
	public void areacircle() {
		double area = PI*radius*radius;
		System.out.println("���� ���� : "+area);
	}
	//���� ���̸� ����ϰ� ����ϴ� �޼ҵ�
	
	public void Sizeofcircle() {
		double size = PI*radius;
		System.out.println("�ѷ� : "+size);
	}
	
}
