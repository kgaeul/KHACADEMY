package com.kh.todoList;

public class todoListModel {
	//���� ���
	//����� ������
	//������ ���ϰ� ����
	
	private String items;
	private String item;
	
	public todoListModel(String text) {
		this.item=text;
	}
	
	public String getItem() {
	
		return item;
	}
	public String getItems() {
		return items;
	}
	
	public void list() {
		System.out.println("������ ������ " +item+"�Դϴ�.");
	}
}
