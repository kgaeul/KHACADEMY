package com.kh.api.exam1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class practice4 {

	public static void main(String[] args) {

		practice4 p = new practice4();
		p.practice1();
		p.practice2();
		p.practice3();
		p.practice5();
		p.practice6();
		
		
		
		
	}
	
	public void practice1() {
		Date currentDate = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String forDate= sdf.format(currentDate);
		System.out.println("����� : "+forDate);
		
		
	}
	public void practice2() {
		Date currentDate = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("HH-mm-ss");
		String forDate= sdf.format(currentDate);
		System.out.println("�ú��� : "+forDate);
		}
	public void practice3() {
		Date currentDate = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd");
		String forDate= sdf.format(currentDate);
		System.out.println("���� : "+forDate);
	}
	public void practice5() {
		Date currentDate = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-HH");
		String forDate= sdf.format(currentDate);
		System.out.println("���� �ð� : "+forDate);
	}
	public void practice6() {
		Date currentDate = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-E");
		String forDate= sdf.format(currentDate);
		System.out.println(forDate);
	}

}
