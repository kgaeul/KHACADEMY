package com.kh.example.practice2.run;

import com.kh.example.practice2.model.vo.Product.Product;
//import = ���� 1ȸ�� ������
public class Productrun {

	public static void main(String[] args) {

		
		Product product1=new Product("����",3000,"������");
		Product product2=new Product("�����",2000,"������");
		Product product3=new Product("����",3500,"�ٷ���");

		product1.information();
		product2.information();
		product3.information();
		
		/*
		 com.kh.example.practice3.model.vo. 
		 Ŭ���� : circle
		 
		 �ʵ� (�������)
		pi double=3.14
		radius :int=1
		
		������
		+Circle()
		
		�޼ҵ�
		+incrementRadius():void
		+getAreaOfCircle():void
		+getSizeOfCircle():void
		
		
		
*/
	}

}
