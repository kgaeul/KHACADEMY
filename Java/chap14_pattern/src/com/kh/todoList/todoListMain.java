package com.kh.todoList;

public class todoListMain {

	public static void main(String[] args) {

		todoListModel tdm = new  todoListModel("��ħ�Ա�");
		todoListView tdv = new todoListView();
		todoListController tdc = new todoListController();
		
		
		tdv.displayTodoList();
		tdm.list();
		tdm.getItem();
		
		
		String item = tdm.getItem();
//		System.out.println(item);
	}

}
