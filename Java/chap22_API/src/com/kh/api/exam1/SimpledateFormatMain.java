package com.kh.api.exam1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpledateFormatMain {
/*
 SimpleDateFormat
 ��¥�� �ð��� ���ϴ� �������� �������ϰų� ���ڿ��κ��� ��¥�� �ð��� �Ľ��ϴµ� ���Ǵ� Ŭ����
 
 y=����
 M=��
 d=��
 H=�ð�
 m=��
 s=��
 */
	public static void main(String[] args) {
		Date currentDate = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-hh-mm-ss");
		
		String forDate = sdf.format(currentDate);
		
		System.out.println(forDate);
		
	}

}
