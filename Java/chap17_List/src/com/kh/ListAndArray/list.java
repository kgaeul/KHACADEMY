package com.kh.ListAndArray;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class list {
	public static void main(String[] args) {
		ListArray1();
		list a = new list();
		a.ListArray2();
	}
		public static void ListArray1()	{
			
		Scanner sc =new Scanner(System.in);
		String[]StirngArray= new String[3];
			
			StirngArray[0]="(1) ������";
			StirngArray[1]="(2) �����";
			StirngArray[2]="(3) �䳢";
			 
			for(String s:StirngArray) {
			System.out.print(s+ " ");
			}
			
			System.out.println();
			System.out.print("��ȣ�� �Է����ּ��� : ");
			int num=sc.nextInt();
	
			System.out.print("������ ���� : ");
			System.out.println(StirngArray[num-1]);
	}
		
		public void ListArray2() {
		System.out.println();
		System.out.println("============�� �� ° ������=============");
		System.out.println();
		List<String> StringList = new ArrayList<>();
		
		StringList.add("��");
		StringList.add("������");
		StringList.add("�ڳ���");
		StringList.add("��");
		
		for(String s1:StringList) {
			System.out.print(s1+ " ");
		}
		
	}
}