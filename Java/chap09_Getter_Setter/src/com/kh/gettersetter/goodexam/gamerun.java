package com.kh.gettersetter.goodexam;


public class gamerun {

	public static void main(String[] args) {

		GoodPlayer Player = new GoodPlayer();
		
		Player.setName("[�ٺ�]") ;
		
		Player.setHealth(100);//100ü���� �������ְ�
		Player.ValidHealth();//-10�� ���Ἲ(���� ���� �ڵ尡 ������ ���� ��)���� �����Ѵ�.
		
		Player.setAttackPower(0) ;
		Player.ValidattackPower() ;
		Player.ValidName();
		Player.display();
		
		
		System.out.println("---------------------");
		
		
		GoodPlayer Player2 =new GoodPlayer();
		Player2.setName("[��û��]") ;
		Player2.setHealth(0);
		Player2.setAttackPower(10) ;
		Player2.ValidHealth();
		Player2.ValidattackPower() ;
		Player2.ValidName();
		Player2.display();
	}

}
