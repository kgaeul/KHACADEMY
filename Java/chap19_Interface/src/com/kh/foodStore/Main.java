package com.kh.foodStore;

import com.kh.InterfaceSample.order2;

public class Main {

	public static void main(String[] args) {
		FoodStore order = new Order();
		
		order.addMenu("[«��] �ֹ�");
		order.addMenu("[¥���] �ֹ�");
		order.addMenu("[������] �ֹ�");
		order.addMenu("[������] �ֹ�");
		order.printMenu();
		
		
		
		System.out.println("===========�ѽ�=========");
		FoodStore order3 = new order2();
		
		
		order3.addMenu("[��ġ�] �ֹ�");
		order3.addMenu("[�����] �ֹ�");
		order3.addMenu("[�δ��] �ֹ�");
		order3.addMenu("[������] �ֹ�");
		order3.printMenu();

		
	}
}
