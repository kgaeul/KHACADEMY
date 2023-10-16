package com.kh.fileIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyName {

	public static void main(String[] args) {

		String inputFile1="C:\\Users\\user1\\Pictures\\socute.png";
		String outputFile = "C:\\Users\\user1\\Desktop\\�ʹ��Ϳ���!!!!.png";
		
		String inputFile2="C:\\Users\\user1\\Pictures\\cute1.png";
		String outputFile2 = "C:\\Users\\user1\\Desktop\\�ʹ��Ϳ���!!!!!.png";
		
		String inputFile3="C:\\Users\\user1\\Pictures\\cute2.png";
		String outputFile3 = "C:\\Users\\user1\\Desktop\\�ʹ��Ϳ���!!!!!!.png";
		
		try (FileInputStream fis = new FileInputStream(inputFile1); 
				FileOutputStream fos = new FileOutputStream(outputFile)) {
			byte[]buffer = new byte[1024];
			int byteRead;
			
			//������ �а� �����ϴ� ���� ����
			//fis.read(buffer)���Ͽ��� �����͸� �о���̰�
			//fos.write(buffer,0,byteRead) �о���� �����͸� �����
			//������ ���� �����ϸ� -1 ��ȯ�ϸ鼭 while ����
			while((byteRead=fis.read(buffer)) !=-1) {
				fos.write(buffer,0,byteRead);
			}
				System.out.println("������ ����Ǿ����ϴ�.!");
				
		} catch (IOException e) {
			e.printStackTrace();
		}
			/////////////////////////////////////////////////
		try (FileInputStream fis = new FileInputStream(inputFile2); 
				FileOutputStream fos = new FileOutputStream(outputFile2)) {
			byte[]buffer = new byte[1024];
			int byteRead;
			while((byteRead=fis.read(buffer)) !=-1) {
				fos.write(buffer,0,byteRead);
			}
				System.out.println("������ ����Ǿ����ϴ�.!");
				
		} catch (IOException e) {
			e.printStackTrace();
		}
		////////////////////////////////////////////////////////
		try (FileInputStream fis = new FileInputStream(inputFile3); 
				FileOutputStream fos = new FileOutputStream(outputFile3)) {
			byte[]buffer = new byte[1024];
			int byteRead;
			while((byteRead=fis.read(buffer)) !=-1) {
				fos.write(buffer,0,byteRead);
			}
				System.out.println("������ ����Ǿ����ϴ�.!");
				
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
