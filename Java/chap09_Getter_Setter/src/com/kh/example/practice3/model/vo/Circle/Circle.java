package com.kh.example.practice3.model.vo.Circle;

public class Circle {

	private double PI =3.14;
	private int radius =1;
	
	public double getPI() {
		return PI;
	}
	public int getRadius() {
		return radius;
	}
	
	public void setPI(double pI) {
		this.PI = pI;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	
	public void increamentRadius() {
		radius++;
		System.out.println("���� ������ : "+radius);
	}
	public void getAreaofCircle() {
		double area = PI*radius*radius;
		System.out.println("���� ���� : "+area);
	}
	public void getsizeofCircle () {
		double size = PI*radius;
		System.out.println("���� �ѷ� : "+size);
	}
}
