package com.kh.ListAndArray;

import java.util.ArrayList;
import java.util.List;

public class ListAndArray {

	public static void main(String[] args) {
		// array ����
		
//		int[] intArray = new int[2];
//		intArray[0]=1;
//		intArray[1]=2;
//		
//		
//		System.out.println("Array ��� : ");
//		
//		for(int i=0;i<intArray.length;i++) {
//			System.out.print(intArray[i]+" ");
//		}
//		
//		System.out.println();
//		
//		//list ����
//		
//		List<Integer> intList = new ArrayList<>(); //Integer��ü�� �����ϴ� ArrayList ����
//		
//		intList.add(1);
//		intList.add(2);
//		intList.add(3);
//		intList.add(4);
//		
//		System.out.println("List ��� "+intList);
//		
//		for( int num : intList){
//			System.out.print(num+" ");
//		}
		
		String[]StirngArray= new String[3];
		
		StirngArray[0]="������";
		StirngArray[1]="�����";
		StirngArray[2]="�䳢";
	
		
		for(String s:StirngArray) {
			System.out.print(s+ " ");
		}

		List<Integer> StringList = new ArrayList<>();
		
		StringList.add(1);
		StringList.add(2);
		StringList.add(3);
		StringList.add(4);
		
		for(Integer s1:StringList) {
			System.out.print(s1+ " ");
		}
	}

}
