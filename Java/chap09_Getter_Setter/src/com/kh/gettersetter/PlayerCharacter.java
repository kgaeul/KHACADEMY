package com.kh.gettersetter;

public class PlayerCharacter {

	private String name;//ĳ���� �̸�
	private int health;//ü��
	private int attackPower;//���� �Ŀ�
	
	//�������� ���纻�� �����ֱ� ������ ���� ��ü�� �����ʹ� �ջ��Ű�� ����
	//���������ʹ� ������
	
	public String getName() {
		return name;
	}
	public int getHealth() {
		return health;
	}
	public int getAttackPower() {
		return attackPower;
	}
	
	
	//Setter
	//�ܺο��� �޼ҵ带 ���� �����Ϳ� ������ �ϰ� �ȴٸ� �޼ҵ�� �Ű����� ���� �����ؼ� ��ȿ�� ���� �����ͷ� ������ �� ����
	public void setName(String name) {
		this.name = name;
	}
	
	public void setHealth(int health) {
		this.health = health;
		if(health>0) {
			this.health=health;
		}else {
			System.out.println("ĳ���Ͱ� ����߽��ϴ�.");
		}
	}
	
	public void setAttackPower(int attackPower) {
		if(attackPower>1) {
		this.attackPower = attackPower;
		}else {
			this.attackPower = attackPower;
			System.out.println("�Ŀ��� �������մϴ�.");
		}
		
	
	}
	public void displayedInfo() {
		System.out.println("ĳ���͸� : "+name);
		System.out.println("ü�� : "+health);
		System.out.println("���ݷ� : "+attackPower);
	}
	//ĳ���� �����ϴ� ��� �޼���
	int damage=20;
	public void attack(PlayerCharacter target) {
			System.out.println(name+"��"+name+"�� �����߽��ϴ�. "+target.damage+"�������� ����ϴ�!");
		
	}
	public void takeDamage(int damage) {
		System.out.println("���ݹ޾ҽ��ϴ�. ");
		
		
		
}
}