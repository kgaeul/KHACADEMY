package com.kh.fileIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MakeFolderMain {

	public static void main(String[] args) {
		MakeFolderMain MakeFolder = new MakeFolderMain();
		MakeFolder.practice1();
	}
		public void practice1() {
		
			File f = new File("C:\\Users\\user1\\Desktop\\����������\\���� ���� ������\\��¥ ��¥ ���� ������\\���������� ���ϴµ� ��¥ ���� ������");
			
			
			if(!f.exists()) {
				f.mkdir();
				System.out.println("������ ��������ϴ�.");
			}else {
				System.out.println("������ �̹� �ֽ��ϴ�.");
			}
			
			try {
				FileWriter fw = new FileWriter("C:\\Users\\user1\\Desktop\\����������\\���� ���� ������\\��¥ ��¥ ���� ������\\"
												+ "���������� ���ϴµ� ��¥ ���� ������\\��¥ ���ǰ���.txt");
				fw.write("�����������ݾƿ� \n");
				fw.write("-_-");
				fw.close();
		
				FileReader reader = new FileReader("C:\\Users\\user1\\Desktop\\����������\\���� ���� ������\\��¥ ��¥ ���� ������\\"
						+ "���������� ���ϴµ� ��¥ ���� ������\\��¥ ���ǰ���.txt");
				BufferedReader br = new BufferedReader(reader);
				String line;
				while((line=br.readLine()) !=null){
					System.out.println(line);
				}
				br.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			
	}

}
