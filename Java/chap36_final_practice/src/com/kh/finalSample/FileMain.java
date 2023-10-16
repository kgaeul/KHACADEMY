package com.kh.finalSample;

import java.io.*;

public class FileMain {

	public void fileSave(String filename,Food food) throws Exception {
		//���޹��� fileName���� ���� ��ü ����
		FileOutputStream FOStream = new FileOutputStream(filename);
		
		//���� ��ü�� �����ϴ� ���� ��� ��Ʈ��
		ObjectOutputStream objStream = new ObjectOutputStream(FOStream);
		
		
		//���Ͽ� FOOD ��ü�� ���
		objStream.writeObject(food);
		
		//��Ʈ���� ����
		objStream.close();
		
		FOStream.close();
		
		System.out.println("food ��ü�� ���Ͽ� �����߽��ϴ�.");
	}
	
	public static void main(String[]args) throws Exception {
		FileMain fm = new FileMain();
		Food foodSample = new Food("���",20);
		fm.fileSave("food.txt", foodSample);
	}
}
