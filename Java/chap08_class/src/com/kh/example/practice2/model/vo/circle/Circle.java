package com.kh.example.practice2.model.vo.circle;

public class Circle {

	double PI=3.14;
	int radius=1;
	
	public Circle() {
	
		}
		public  void incrementRadius() {
			System.out.println("���� : "+radius++);
		
		}
		public  void getAreaOfCircle() {
			System.out.println(PI);
			System.out.println(radius);
			System.out.println("���� : "+PI*radius*radius);
		double area = PI*radius*radius;
		}
		public  void getSizeOfCircle() {
			System.out.println("���� ������ : "+radius);
		
		}
}
