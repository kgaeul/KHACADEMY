package com.kh.fileIO;

import java.io.File;

public class MakeFoldersMain {

	public static void main(String[] args) {

		//mkdirs
		//����ȭ�鿡 kh������ ����� �̹��� ���� ����
		//�θ� ���丮�� �������� �ʴ� ��쿡 �߰� ��� ���丮 ����
	
		File dir = new File("C:\\Users\\user1\\Desktop\\��\\��\\��\\��");
		
		//mkdirs �޼��� ����Ͽ� ���丮 ���� �õ�
		boolean success = dir.mkdirs();
		
		if(success) {
			System.out.println("����������~~");
		}else {
			System.out.println("�������� �Ф�");
		}
		
		
	}

}
