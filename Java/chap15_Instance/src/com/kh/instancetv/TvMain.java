package com.kh.instancetv;

public class TvMain {
	//���ø޸𸮿� �ö󰣴�// ���� �� �� ���� ����Ѵ�
	public static void main(String[] args) {
	Tv tv;//Tv  �ν��Ͻ��� �����ϱ� ���ؼ� ���� tv�� ����-���� �� ��
	tv = new Tv();// tv �ν��Ͻ� ���� - ���� �������!!!
	//��ü(Tv)�� �ּҸ� �ν��Ͻ�(tv) �ȿ��ٰ� ����
	
	
		tv.channel=7;  //�ν��Ͻ��� ������� ���� 7�� ����
		tv.power();
		tv.channelDown(); //�ν��Ͻ��� �޼��� channelDown ȣ��
		tv.channelUp(); //�ν��Ͻ��� �޼��� channelUp ȣ��
		System.out.println("channel : "+tv.channel);
	}

}
