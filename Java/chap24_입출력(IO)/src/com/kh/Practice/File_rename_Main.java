package com.kh.Practice;

import java.io.File;

public class File_rename_Main {

	public static void main(String[] args) {

		String mainPath = "C:\\Users\\user1\\Pictures\\";
		String originFile = mainPath+"cute1.png";
		
		//���� ��ü ����
		File fileToDelete = new File(originFile);
		
		//���� ����
		boolean deleted = fileToDelete.delete();
		
		if(deleted) {
			System.out.println("������ ���������� �����߾�");
		}else {
			System.out.println("���ϻ��� ���߾� ����");
		}
		
	}

}
