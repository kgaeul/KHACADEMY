package com.kh.ArrayExam;

public class Exam {

	public static void main(String[] args) {
		int count =0;
		String []Students = {"���ǰ�","������","�����","�����","���̹�",
				"�ں���", "�ۼ���", "������","������","��õ��","��ǳǥ","������"};
		
		String [][] seat1 = new String[3][2];
		String [][] seat2 = new String[3][2];
		
		for(int i=0;i<seat1.length;i++) {
			for(int j=0;j<seat1[i].length;j++) {
			seat1[i][j]=Students[count++];
			}
		}
		for(int i=0;i<seat2.length;i++) {
			for(int j=0;j<seat2[i].length;j++) {
			seat2[i][j]=Students[count++];
			}
			System.out.println();
		}
		System.out.println("==1�д�==");
		for(int i=0;i<seat1.length;i++) {
			for(int j=0;j<seat1[i].length;j++) {
				System.out.print(seat1[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("==2�д�==");
		for(int i=0;i<seat2.length;i++) {
			for(int j=0;j<seat2[i].length;j++) {
				System.out.print(seat2[i][j]+" ");
			}
			System.out.println();
		}
	}
}

