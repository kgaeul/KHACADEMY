package com.kh.fileIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Practice_mkdirs {

	public static void main(String[] args) {

		Practice_mkdirs pm = new Practice_mkdirs();
		pm.practice();
		pm.practice2();
		pm.practice3();
		
	}
		public void practice(){
	
			File file = new File("C:\\Users\\user1\\Desktop\\�ٺ�\\�Դϴ�");
			
			boolean success = file.mkdirs();
			
			FileWriter fw;
			try {
				fw = new FileWriter("C:\\Users\\user1\\Desktop\\�ٺ�\\�Դϴ�\\����ΰ���.txt");
				fw.write("�� ������̰Ե� ����Դϴ�. ");
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			FileReader fr;
			try {
				fr = new FileReader("C:\\Users\\user1\\Desktop\\�ٺ�\\�Դϴ�\\����ΰ���.txt");
				String line;
				BufferedReader br = new BufferedReader(fr);
				while((line=br.readLine()) !=null){
					System.out.println(line);
				}
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
			
			
			if(success) {
				System.out.println("���� ������!!!!!!");
			}else{
				System.out.println("���� �������� �Ф�");
			}
			
					
			
		}
		public void practice2() {
			File file2 = new File("C:\\Users\\user1\\Java_Workspace\\chap25");
			
			boolean success = file2.mkdirs();
			
			FileWriter fw;
			try {
				fw = new FileWriter("C:\\Users\\user1\\Java_Workspace\\chap25\\�ٺ��Դϴ�.txt");
				fw.write("�� ������̰Ե� �½��ϴ�. ");
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			FileReader fr;
			try {
				fr = new FileReader("C:\\Users\\user1\\Java_Workspace\\chap25\\�ٺ��Դϴ�.txt");
				String line;
				BufferedReader br = new BufferedReader(fr);
				while((line=br.readLine()) !=null){
					System.out.println(line);
				}
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if(success) {
				System.out.println("���� ������!!!!!!");
			}else{
				System.out.println("���� �������� �Ф�");
			}
		}
		
		public void practice3() {
			File file3 = new File("C:\\Users\\user1\\Documents\\myPlace\\Music\\Korean\\kpop\\group");
		
			boolean success = file3.mkdirs();
			FileWriter fw;
			try {
				fw = new FileWriter("C:\\Users\\user1\\Documents\\myPlace\\Music\\Korean\\kpop\\group\\��������� ����.txt");
				fw.write("����ؿ��~");
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			FileReader fr;
			try {
				fr = new FileReader("C:\\Users\\user1\\Documents\\myPlace\\Music\\Korean\\kpop\\group\\��������� ����.txt");
				String line;
				BufferedReader br = new BufferedReader(fr);
				while((line=br.readLine()) !=null){
					System.out.println(line);
				}
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(success) {
				System.out.println("���� ������!!!!!!");
			}else {
				System.out.println("���� �������� �̤�");
			}
			
			
		}
}
