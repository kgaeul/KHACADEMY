package com.kh.RandomMain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
 Random ����(�������� ������� ��)�� �����ϱ� ���� ���Ǵ� Ŭ����
 */
public class RandomMain {

	public static void main(String[] args) {

		RandomMain randomMain = new RandomMain();
		
		randomMain.Lotto();
	//	randomMain.RandomExam();
		
	}
	public void Lotto() {
		Random rd = new Random();
		//ArrayList ����ؼ� ��ٱ��Ϸ� ���
		
		List<Integer> Lottonum= new ArrayList<>();
		//�ߺ��� ���ϱ� ���� set�� ���~~
		//6���ڸ� �� ��!!!!!
		
		int six = 6;
		while(Lottonum.size()<six) {
			//1~45���� ������ �����ؼ� ������ �����ؾ߰ڴ�.
			int ranNumber = rd.nextInt(45); //0~44�ڸ��� �������� ��ȣ
			
			//�����ϴ� �� ���� �ߺ�X
			if(!Lottonum.contains(ranNumber)) {
				//!�� ������� ���� ������ ���� list�� ����Ǵ� ���̱� ������ ���ѷ���
				Lottonum.add(ranNumber);
			}
			
		}
		System.out.println("�ζǹ�ȣ "+Lottonum+"");

		
	}
	public void RandomExam() {
		Random rd = new Random();
		
		int randint = rd.nextInt();
		System.out.println(randint);

		double rand = rd.nextDouble();
		System.out.println(rand);
		
		boolean randbool = rd.nextBoolean();
		System.out.println(randbool);
	}
	
}
