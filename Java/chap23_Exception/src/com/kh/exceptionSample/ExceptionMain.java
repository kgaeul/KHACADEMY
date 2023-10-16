package com.kh.exceptionSample;

public class ExceptionMain {

	public static void main(String[] args) {
		ExceptionMain Exception = new ExceptionMain();
		Exception.Exception1();
		Exception.Exception2();
		Exception.Exception3();
		Exception.Exception4();
		Exception.Exception5();
	}
	public void Exception1() {
		try {
		int result = 10/0;
		System.out.println("Result : " + result);
		}catch(ArithmeticException e){
			/*
			 ArithmeticException =>�������� ���������� �߻��ϴ� ����
			 ArithmeticException e => �츮�� ������ ������
			 e�� ������ ������ �޼����� getMessage()�� ���޹޴´�.
			 */
			System.out.println("����������� �߻��� ���� : " +e.getMessage());
		}
	}
	public void Exception2() {
		String text = "����";
		int length = text.length();
		System.out.println("���ڿ� ���� : " + length);
		
	}
	public void Exception3() {
		try {
			String text = null;
			int length = text.length();
		}catch(NullPointerException Null) {
			System.out.println("��ȭ��ȣ�� �Էµ��� �ʾҽ��ϴ�.��ȣ �� �Է��ϼ��� ");
		}
	}
	public void Exception4() {
		
		try {
			String jumin = "�ȿ�����904";
		int number = Integer.parseInt(jumin);
		System.out.println(number);//���ڰ� ����־� ������ ���� ����
		}catch(NumberFormatException Null) {
			System.out.println("���ϴ� ���̿��� �ٽ� �Է��ϼ���!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!"+Null.getMessage());
		}
	}
	public void Exception5() {
		try {
		int[]numbers = {1,2,3,4,5};
		int index = 7;
		int result = numbers[index];
		System.out.println(result);
		}catch(ArrayIndexOutOfBoundsException e) {
			//�迭�ε����� ������ ����� �� �߻��ϴ� ����ó��
			System.out.println("�迭�ε����� ������ ��� ���ܰ� �߻�");
		}catch(Exception e) {
			//�ٸ� ���ܸ� ó���� �� �ִ� ����ó��
			System.out.println("�Ϲ����� ����");
		}finally { //�׻� ����Ǵ� ���
			System.out.println(" ����!! ");
		}
		System.out.println("���α׷��� ����Ǿ����ϴ�. ");
	}
}
