package com.kh.fileIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileWriter;

public class InPutStreamMain {

	
		/*
		 FileInputStream 
		 	������ ���� �� ���Ǵ� Ŭ����
		 	���Ϸκ��� �����͸� ����Ʈ ��Ʈ������ �о���� �� �����ϰ� ���
		 	int read() : ���Ͽ��� ����  �����͸� �а� ��ȯ
		 				�� �̻� ���� �����Ͱ� ������ -1�� ��ȯ
		 	int read(byte[] b): ���Ͽ��� ����Ʈ �迭 'b'�� �����͸� �а� 
		 						������ ���� ����Ʈ ���� ��ȯ
		 	int read(byte[] b, int off, int len):���Ͽ��� ����Ʈ �迭 'b'�� 
		 						�������� ��ġ���� �ִ� len ����Ʈ ��ŭ �о
		 						������ ���� ����Ʈ ���� ��ȯ
		 		void close() ���� �ݱ�
		 	
		 * */
		public static void main(String[] args) {
	
			
			
			try {
			String fileName = "exam.txt";
			FileWriter w = new FileWriter("C:\\Users\\user1\\Desktop\\fileName.txt");
			w.write("���ƾ�");
			w.close();
				FileInputStream fis = new FileInputStream(fileName);
				
				int data;
				System.out.println("���ϸ���� ��ü���� ����");
				try {
					data = fis.read();
					System.out.println("���� �б� ����!");
				} catch (IOException e) {
					System.out.println("���� �б� ����");
					e.printStackTrace();
				}
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}

}
