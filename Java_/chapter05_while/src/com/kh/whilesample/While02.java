package com.kh.whilesample;

import java.util.Scanner;

public class While02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		 boolean isChoice = false;
		 while(!isChoice) {
			 System.out.print("������ �������ּ��� : ");
			 
			 int month = sc.nextInt();
			 switch(month) {
			
			 case 3: case 4: case 5:
				 System.out.println(" �� ");
				 isChoice=true;
				 break;			//break�� case������ �����ϰ��� �ϴ� �� ����� �� �� ���� ����Ѵ�.
			 case 6: case 7: case 8:
				 System.out.println(" ���� ");
				 isChoice=true;  //�� !����ǥ�� ���� ��� ���� �������� ����ǰ� , 
				 //������ ������ ����Ǳ� ������ true�� �ۼ����־� !�� ���� false�� ������ while���� �������ش�.
				 break;
			 case 9: case 10: case 11:
				 System.out.println(" ���� ");
				 isChoice=true;
				 break;
			 case 1: case 2: case 12:
				 System.out.println(" �ܿ� ");	
				 isChoice=true;
				 break;
			default :
				System.out.println("�߸��� �����Դϴ�.");
				
				/*
				���̸� �Է¹޾� ���� û�ҳ� ��̷� �з��ϰ� ����ϱ�
				while switch case �̿��ؼ� ����ϱ�
				case ���� 
				
				 * */
		 
			 }
		 }
		 
		 boolean choice = true;		 	
		 while(choice) {
			 System.out.print("���̸� �Է����ּ��� :  ");
			 int age=sc.nextInt();	
			 switch(age) {
			 
			 case 19: case 20:
				 System.out.println("�����Դϴ�.");
				 choice = false;
				 break; //switch case ����
			 case 14: case 15: case 16: case 17: case 18:
				 System.out.println("�����Դϴ�.");
				 choice = false;
				 break;
			 case 10: case 11: case 12: case 13:
				 System.out.println("�����Դϴ�.");
				 choice = false;
				 break;
			 default:
				 System.out.println("�ٽ� �Է��ϼ���. ");
				 
			 }
		 }
	}

}