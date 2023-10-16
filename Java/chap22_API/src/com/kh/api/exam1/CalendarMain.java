package com.kh.api.exam1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarMain {

	public static void main(String[] args) {

		//Ŭ������ ����� ���� ��¥�� �ð� ��������
		
		Calendar calendar = Calendar.getInstance();
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH);
		int day = calendar.get(Calendar.DATE);
		int hour = calendar.get(Calendar.HOUR);
		int minute = calendar.get(Calendar.MINUTE);
		int second = calendar.get(Calendar.SECOND);
		
		System.out.print("Ķ������ �̿��� ���� ��¥�� �ð�");
		System.out.print(year+"�� ");
		System.out.print(month+"�� ");
		System.out.print(day+"�� ");
		System.out.print(hour+"�� ");
		System.out.print(minute+"�� ");
		System.out.print(second+"��");
		
		GregorianCalendar gCalendar = new GregorianCalendar();
		year = gCalendar.get(Calendar.YEAR);
		month = gCalendar.get(Calendar.MONTH);
		day = gCalendar.get(Calendar.DAY_OF_MONTH);
		System.out.println(year+month+day);
		
		
		
		
		
		
		
		
	}

}
