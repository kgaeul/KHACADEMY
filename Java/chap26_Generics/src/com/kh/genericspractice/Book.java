package com.kh.genericspractice;
//���ʸ� Ŭ���� ����
public class Book <T> {
	T content;
	
	public void put(T item) {
		this.content=item;
	}
	public T get() {
		return content;
	}
	
	Book<Integer> intBook = new Book<>();
	intBook.put(42);
	intBook.put(722);
	int intValue = intBook.get();
	
	//����ȯ �ʿ����
	
	//���ڿ� �����͸� �����ϴ� Book �ν��Ͻ� ����
	Book<String> strBook = new Book<>();
	
	strBook.put("Hello");
	strBook.put("ggggg");
	strBook.put("java");
	strBook.put("C++");
	strBook.put("Python");
	String strValue = strBook.get();
	
}


