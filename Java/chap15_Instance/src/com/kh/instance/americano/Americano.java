package com.kh.instance.americano;

public class Americano {
	private int size;//�Ƹ޸�ī�� ������
	private boolean hasSugar;//���� �ֳ� �ȳֳ�
	private String type;
	
	public Americano(String type,int size, boolean hasSugar) {
		this.type=type;
		this.size=size;
		this.hasSugar=hasSugar;
	}
	
	public void makeCoffee() {
		System.out.println("�Ƹ޸�ī�븦 ����ϴ�. ");
		System.out.println("ũ�� : "+size);
		
		//���࿡ ������ �ִ´ٸ�!
		if (hasSugar) {//true��� ���
		System.out.println("������ �߰��մϴ�. ");
	}
}
}