package com.kh.whilesample;

public class While04 {

	public static void main(String[] args) {

		int sum =0;
		int num =1;
		while(num<=5) {
			System.out.println("num�� : "+num);	
			sum+=num;
			num=num+1;
			//sum�� �հ踦 �ֱ������� ���� ������ while�� �ȿ� �ۼ��ϱ�	
		}
		System.out.println("num�� : "+sum);
		//while�� ����Ǿ��ٰ� �ؼ� Ŭ������ ����Ȱ��� �ƴ� while���� ����� �� �����ִ�
		//System.out.println(sum)�� ��µ�
	}

}
