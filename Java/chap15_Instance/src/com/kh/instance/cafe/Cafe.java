package com.kh.instance.cafe;

public class Cafe {
	private int size;//�Ƹ޸�ī�� ������
	private boolean hasSugar;//���� �ֳ� �ȳֳ�
	private String type;
	
	public Cafe (String type,int size, boolean hasSugar) {
		this.type=type;
		this.size=size;
		this.hasSugar=hasSugar;
	}
	
	public void makeCoffee() {
		System.out.println("������ ���� : "+type);
		System.out.println(type+" ������ �����մϴ�. ");
		System.out.println("ũ�� : "+size);
		
		//���࿡ ������ �ִ´ٸ�!
		if (hasSugar) {//true��� ���
		System.out.println("������ �߰��մϴ�. ");
	}
}
}
