package com.kh.gettersetter.goodexam;

public class GoodPlayer {

	private String name;	//ĳ���� �̸�
	public void setName(String name) { //�̸��� ����Ǹ� ����� set
		this.name = name;
		
	}
	//�����ϴ� valid
	public void ValidName() { //ĳ���� �̸��� ���鿡 ���� �� ����
		if(this.name==" ") {
			this.name="No name";
		}
	}
	
	public String getName() { //ĳ���� �̸��� ��ȯ
		return name;
	}
	
	private int health;		//ü��
	public void setHealth(int health) {
		this.health = health;
	}
	public void ValidHealth() {
		//ü���� 0�̶�� 0���� ǥ��
		if(health<=0) { //ü���� 0������ ���
			this.health = 0;
			System.out.println(name+" ĳ���Ͱ� ����߽��ϴ�.");
		}
	}
	public int getHealth() {
		return health;
	}
	
	private int attackPower;//���� �Ŀ�
	public void setAttackPower(int attackPower) {
		this.attackPower = attackPower;
	}
	public void ValidattackPower() {//���Ἲ �ǰ� ����
		//���࿡ �Ŀ��� 0���� ���� ���
		if(attackPower<=0) {
			this.attackPower = 0;
		}
	}
		public int getAttackPower() {
			return attackPower;
	}
		
		public void display() {
			System.out.println("ĳ���� ���� : "+this.name);
			System.out.println("ü�� ���� : "+this.health);
			System.out.println("���ݷ� : "+this.attackPower);
		}
}
