package com.kh.api.exam1;

public class wrapperMain {
//wrapper �⺻ ������ ������ ��ü�� ����
//	��ü�� �۾��� �� ����
//	Ŭ�����δ� Integar , double , boolean ���� �ִ�
	public static void main(String[] args) {

		Integer num = 40;
		System.out.println(num);
		
		
		int intValue = num.intValue();
		System.out.println(intValue);
		
		double pi = 3.14159265369;
		double radius =5;
		double area = pi*Math.pow(radius, 2);
		System.out.println(area);
		
		//���ڿ��� �Ǽ��� ��ȯ
		String  numStr = "3.14";
		Double parsedDouble = Double.parseDouble(numStr);
		
		//���ڿ� �����͸� ����, �Ҽ��� ��ȯ�ϰڴ�.
		System.out.println(parsedDouble);
		
		
		//boolean Wrapper Ŭ���� �����
		Boolean isJavaFun = true;
		
		if(isJavaFun) {
			System.out.println("�ڹٴ� ��ս��ϴ�. ");
		}else {
			System.out.println("�ڹٴ� ��̾����ϴ�. ");
		}
		
		String boolStr = "true";
		
		Boolean parseBool = Boolean.parseBoolean(boolStr);
		System.out.println(parseBool);
		
	}
}
