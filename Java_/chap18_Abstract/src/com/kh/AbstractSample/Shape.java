package com.kh.AbstractSample;
//�߻� Ŭ���� ���� 
abstract class Shape {//���������ڷ� public �Ⱦ�
//�Ϲ��ʵ�
	
	private String color;
	
	//�߻� �޼���(����Ŭ�������� �����ؾ���)

	abstract double calculateArea();
	
	abstract int RectangleArea();
	
	public  Shape (String c) {
		this.color = c;
	}
	
	public void setColor (String color) {
		this.color =color;
		
	}
	public String getColor () {
		return color;
		
	}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}

}
