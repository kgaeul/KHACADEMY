package com.kh.example.practice2.Product;

public class Product {

	 private String pName;
	 private int price;
	 private String brand;
	
	public Product (String pName,int price,String brand) {
		this.pName=pName;
		this.price=price;
		this.brand=brand;
	}
	
	 public void information() {
		System.out.println("��ǰ�� : "+pName);
		System.out.println("���� : "+price);
		System.out.println("�귣��� : "+brand);
	}
	
	
	
}
