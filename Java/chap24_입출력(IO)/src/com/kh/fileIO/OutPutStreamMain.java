package com.kh.fileIO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class OutPutStreamMain {

	public static void main(String[] args) {
		String filePath = "ex.txt";
		try {
			FileOutputStream fos = new FileOutputStream(filePath);
			
			String data= "�ȳ��ϼ���!!!";
			
			byte[] bArray=data.getBytes(); //����Ʈ�� ��ȯ
			try {
				fos.write(bArray);
			}catch(){
				System.out.println();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
