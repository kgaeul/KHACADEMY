package com.kh.Practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class PracticeCopy {

	public static void main(String[] args) {

		String input = "C:\\Users\\user1\\Pictures\\abc.png";
		String output = "C:\\Users\\user1\\Desktop\\���� �����Ǵٴ�!!!!!!.png";
		
		try (FileInputStream fis = new FileInputStream(input);
				FileOutputStream fos = new FileOutputStream(output)){
			
			byte[]buffer = new byte[1024];
			int Readbyte;
			
			while((Readbyte=fis.read(buffer))!=-1) {
				fos.write(buffer,0,Readbyte);
			}
			System.out.println("���Ϻ���Ϸ�");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		File file = new File("C:\\Users\\user1\\Desktop\\������");
		
		boolean success = file.mkdirs();
		if(success) {
			file.mkdirs();
			System.out.println("���� ������~~");
		}else {
			System.out.println("���� ���������Ф�");
		}
		
		
		String input2 = "C:\\Users\\user1\\Desktop\\���� �����Ǵٴ�!!!!!!.png";
		String output2 = "C:\\Users\\user1\\Desktop\\������\\���� �����Ǵٴ�!!!!!!.png";
		
		try (FileInputStream fis = new FileInputStream(input2);
			FileOutputStream fos =new FileOutputStream(output2))	{
			
			byte[]buffer = new byte[1024];
			int Readbyte;
			while((Readbyte=fis.read(buffer))!=-1) {
				fos.write(buffer,0,Readbyte);
			}
			System.out.println("��������Ϸ�");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
