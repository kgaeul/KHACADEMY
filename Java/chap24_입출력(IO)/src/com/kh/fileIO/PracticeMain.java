package com.kh.fileIO;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class PracticeMain {

	public static void main(String[] args) {
		PracticeMain pm = new PracticeMain();
		pm.practice1();
		
	}
	
	public void practice1() {
	
		try {
			FileWriter writer = new FileWriter("C:\\Users\\user1\\Documents\\�̰� ������ �ȵ˴ϴ�.txt");
			writer.write("[��] ��÷ [��] \n\n ~����� �ٺ��Դϴ�~ \n ����� �ٺ��Դϱ�? \n (1) YES \n (2) NO");
			writer.close();
	
			FileReader reader = new FileReader("C:\\Users\\user1\\Java_Workspace\\chap24_�����(IO)\\src\\com\\kh\\fileIO\\abc.txt");
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
	public void practice2() {
		
	}
}
