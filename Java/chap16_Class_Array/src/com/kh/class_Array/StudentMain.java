package com.kh.class_Array;

public class StudentMain {

	public static void main(String[] args) {
		// Student�� ����� �迭 ����
		
		Student[] Student = new Student[3];
		
		//�迭�� Student��ü�� �߰�
		//[0] �ε��� 0 ��° �л����� �ε��� [2] �л����� �߰� �����ϱ�
		Student[0] = new Student("ȫ�浿",17);
		Student[1] = new Student("�谡��",24);
		Student[2] = new Student("����",18);
		
		//�ѱ��̴� length ���!!!!!
		
		//1�� ° �л��� �̸� student[0].name
		//student[0].age
		
		for(int i=0;i<Student.length;i++) {
			
			System.out.println((i+1)+"�� ° �л��� �̸��� "+Student[i].name+"�̰� �л��� ���̴� "+Student[i].age+ "�� �Դϴ�.");
			
			
		}
	
	}

}
