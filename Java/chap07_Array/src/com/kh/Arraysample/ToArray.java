package com.kh.Arraysample;

public class ToArray {

	public static void main(String[] args) {

		//���� ���ڿ� �迭 ����� �ʱ�ȭ
							//0		1		2
		String[][] fruits = 
							{{"���","�ٳ���","ü��"}, //0
						//{"����","������","����"}, //1
							{"����","����","����"} //2
		};
			for(int i=0; i<fruits.length;i++) {
				System.out.print(fruits.length);
				System.out.print(fruits[i].length);
				System.out.println();
				for(int a=0; a<fruits[i].length;a++) {
					System.out.print(a +":"+fruits.length);
					
					System.out.print(fruits[i][a]+" ");
			}
			System.out.println(); //���� ������ �̵��� �� �ְ� enter�� ��� �޼ҵ� �Է�
		}
	}
}
