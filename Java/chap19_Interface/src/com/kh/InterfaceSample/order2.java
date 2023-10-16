package com.kh.InterfaceSample;

import java.util.List;

import com.kh.foodStore.FoodStore;
import com.kh.foodStore.Menu;

public class order2 implements FoodStore{

	private List<Menu> OrderMenus;
	
	@Override
	public void addMenu(String menu) {
		Menu menu2=new Menu(menu);//�Ķ���� ���� ������ ���� ��~~
		OrderMenus.add(menu2);
	}

	@Override
	public void removeMenu(String menu) {
		System.out.println(menu);
		
	}
	
	@Override
	public void printMenu( ) {
		System.out.println("<<�ֹ������� ������ �����ϴ�.>> ");
		for(Menu Menu2:OrderMenus)
			System.out.println(Menu2.getItem());
	}
	
	
}
