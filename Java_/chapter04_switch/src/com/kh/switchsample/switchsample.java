package com.kh.switchsample;

public class switchsample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//switch��
		/*
		 Ư�������� ǥ������ ���� ���� �پ��� ��츦 ó���ϴ� ���� ����
		 switch�� �Ϸ��� case���� �ش簪�� ���Ͽ� ��ġ�ϴ� ��� �ش��ϴ� �ڵ����� ����
		 �� case�� �ڿ��� ��ġ�ϴ� ���̳� ǥ������ ����
		  
		  switch ��1 (���� �Ǵ� ǥ����){
		  case ��1:
		  //��1�� �ش��ϴ� �ڵ�
		   * break; //�ش� ����� ������ �ߴ��ϴ� ����
		  case ��2:
		  //��2�� �ش��ϴ� �ڵ�
		   * break;
		  default : 
		  
		 
		 */
		
		int day = 30;
		switch (day) { //day ==30
			case 1: //case�� 30�̸� ������ ���
				System.out.println("������");//��µ��� ����
				break; 
			case 2:
				System.out.println("ȭ����");//��µ��� ����
				break; 
			case 30:
				System.out.println("������");
				break; 
			default :
				System.out.println("�ָ�");
		}
		//
		
		
		int coffee = 5;
		
		switch (coffee) {
		case 1: 
			System.out.println("�Ƹ޸�ī�� �ֹ��Ϸ� �Ǿ����ϴ�. ");
			break ;
		case 2:
			System.out.println("�ڸ���Ϻ�Ƽ �ֹ��Ϸ� �Ǿ����ϴ�. ");
			break ;
		case 3:
			System.out.println("ī����� �ֹ��Ϸ� �Ǿ����ϴ�. ");
			break ;
		case 4:
			System.out.println("īǪġ�� �ֹ��Ϸ� �Ǿ����ϴ�. ");
			break ;
		default :
			System.out.println("�߸� �����̽��ϴ�. ó������ �ٽ� �ֹ����ּ���. ");
		}
		
		
		
	}

}
