package com.kh.If;

public class IfElseIfSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//if else if else
		
		/*���� ���� ������ ���������� ��
		�� �� ù ��° ���� ���ǿ� �ش��ϴ� �ڵ� ����� �����ϴ� ����
		���� if�� else�� ���ǵ� ���� �ƴ϶�� ������ else ��� ����
		
		if (����1) {
		//���� 1�� ���� �� �����ڵ�
		 } else if (����2) {
		 ���� 2�� ���� �� �����ڵ�
		 } else {
		 ���� ��� ������ ������ �� ����Ǵ� �ڵ� 
		 }
		
		*/
		
		int age =20;
		if(age==20){
		 System.out.println("�ؿܿ����� ���ž�");
		}else if(age>=20) {
		System.out.println("���迩���� ���ž�");
		}else{
		System.out.println("���� �����ž�");
		}

		int score =85;
		if(score==90){
		 System.out.println("B+");
		}else if(score>90) {
		System.out.println("A");
		}else{
		System.out.println("B");
		}

		int Age =15;
		if(Age>19) {
		System.out.println("û�ҳ�");
		}else if(Age==15) {	
		System.out.println("û�ҳ�"); 
		}else {
		System.out.println("����Դϴ�.")	;
		}
		
		int month =8;
		if (month ==1||month==2||month==12) {
			System.out.println("�ܿ�");
		}else if(month >=3 && month <=5) {
			System.out.println("��");
		}else if(month>=6&&month<=8) {
			System.out.println("����");
		}else {
			System.out.println("����");	
		}
		
	}
	
}


		
			
		
	


