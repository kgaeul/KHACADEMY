package com.kh.example.practice2.model.vo.Product;

public class Product {

/*	1.��� ���� �����
 	pname : String
	brand :String
	price : int*/
	String pname;
	int price;
	String brand;
	
	//2.������ this�� ����ؼ� ��������
	//+Product()
	
	public Product(String pname,int price,String brand) {
		this.pname=pname;
		this.price=price;
		this.brand=brand;
		
	}
	 
	//3.������� �޼ҵ� �����
	//+information():void */
	public void information() {
		System.out.println("��ǰ�� : "+pname);
		System.out.println("���� : "+price+"��");
		System.out.println("�귣��� : "+brand);
	}
	
	
	
}
