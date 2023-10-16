package com.kh.iAddress.practice;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Adresspractice {

	public static void main(String[] args) {

		try {
			InetAddress address = InetAddress.getByName("www.maplestory.com");
			
			byte[]ipaddress=address.getAddress();
			for(byte ip : ipaddress)
			System.out.println("ip�ּҸ� �迭�� ��� : "+ip);
			System.out.println("ȣ��Ʈ�� ������ �̸� : "+address.getCanonicalHostName());
			System.out.println(address.isMulticastAddress());
			System.out.println(address.getLoopbackAddress());
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
	}

}
