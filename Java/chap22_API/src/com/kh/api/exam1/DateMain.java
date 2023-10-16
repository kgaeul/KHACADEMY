package com.kh.api.exam1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateMain {
/* 
 
 Date :  ��¥�� �ð������� ��Ÿ���� �� ���
 �ڹ� 1 ���� ������� ����
 java.time ��Ű�� LocalDate LocalTime LocalDateTime
  */
	
	public static void main(String[] args) {
		LocalDate currentDate = LocalDate.now();
		System.out.println("���� ��¥ :"+currentDate);
		
		
		LocalDateTime currentDateTime = LocalDateTime.now();
		System.out.println("���� ��¥�� �ð� :"+currentDateTime);
		
		LocalTime currentTime = LocalTime.now();
		 
		System.out.println("���� �ð� :"+currentTime);
		
		
		
		for(int i=0;i<8;i++) {
			System.out.println(currentTime);
		}
		
		LocalDate today = LocalDate.now();
		LocalDate future1 = today.plusDays(5);
		LocalDate future2 = today.plusYears(1);
		LocalDate future3 = future2.plusDays(103);
		
		LocalDate past1 = today.minusYears(5);
		LocalDate past2 = today.minusDays(1);
		
		System.out.println("[5�� �� ��¥] :"+future1);
		System.out.println("[1�� �� ��¥] :"+future2);
		System.out.println("[1�� �� ũ��������] :"+future3);
		
		System.out.println("[5�� �� ��¥] :"+past1);
		System.out.println("[1�� �� ��¥] :"+past2);
		
		LocalDate date1 = LocalDate.of(2021,3,19);
		LocalDate date2 = LocalDate.of(2021,3,20);
	
		boolean isBefore =true;
		if(date1.isBefore(date2)) {
			System.out.println(date1+"��"+date2+"�� ���� ��¥�Դϴ�. ");
		}else if(date2.isAfter(date2)) {
			System.out.println(date1+"�� ���� ��¥�Դϴ�. ");
		}else {
			System.out.println(date1);
			
		}
		System.out.println(true);
	
	}

}
