package com.kh.iAddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressMain {

	public void InetExam() { 
		try {
			//ȣ��Ʈ �̸� �̿��ؼ� ��ü ����
			InetAddress address = InetAddress.getByName("www.naver.com");
			
			//������ �ּ� ���
			System.out.println("Host Name : "+ address.getHostName());
			System.out.println("IP Address : "+ address.getHostAddress());
			
			//�� ��ǻ��!!!!!!!! InetAddress ��ü ��� => �������� �ּ�!
			InetAddress localHost = InetAddress.getLocalHost();
			System.out.println("�� ��ǻŸ �̸� : "+localHost);
			System.out.println("�� ��ǻ�� �ּ� : "+ localHost.getHostAddress());
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
		try {
			InetAddress address2 = InetAddress.getByName("www.google.com");
			System.out.println("Host Name : "+ address2.getHostName());
			System.out.println("IP Address : "+ address2.getHostAddress());
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
		try {
			InetAddress address3 = InetAddress.getByName("www.maplestory.com");
			System.out.println("Host Name : "+ address3.getHostName());
			System.out.println("IP Address : "+ address3.getHostAddress());
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
	
	public void InetSample() { 
		try {
			InetAddress address = InetAddress.getByName("www.Daum.com");
			
			//ip�ּҸ� ����Ʈ �迭�� ���
			//ip �Ꙡ�� ����Ʈ �迭�� ������ �� ����Ʈ�� ���� IP �ּҸ� �ٷ� �� ����
			
			byte[]ipAddress = address.getAddress();
			System.out.println("����Ʈ�� ����");
			
		for(byte ip : ipAddress) {
			System.out.print(ip+".");
		}
			
		InetAddress[] alladdress =InetAddress.getAllByName("www.Daum.com");
		System.out.println("���ۿ� ������ ��� ȣ��Ʈ�� ������ �ּҸ� �迭�� ����");
		for(InetAddress addr : alladdress) {
			System.out.println(addr.getHostAddress());
		}
		
		
		//ȣ��Ʈ �̸� ���
		String HostName= address.getHostName();
		System.out.println("HostName : "+HostName);
		
		//���� ȣ��Ʈ�� ip �ּ� ���
		InetAddress localHost =InetAddress.getLocalHost();
		System.out.println("����ǻ�� �ּ� : "+localHost.getHostAddress());
		
		//��Ƽ ĳ��Ʈ �ּ� ���� Ȯ��
		boolean inMultiCast = address.isMulticastAddress();
		System.out.println(inMultiCast);
		
		//ȣ��Ʈ �̸��� �̿��ؼ� InetAddress ��ü ����
		InetAddress name = InetAddress.getByName("www.maplestory.com");
		System.out.println(name.getHostAddress());
		
		//ȣ��Ʈ�� ������ �̸� ��������(��ü ������ �̸�)
		//ȣ��Ʈ�� ����ȭ�� FQDN �������� �̸� ����
		//FQDN = Full Qaulified Domain Name
		String hostfullName = name.getCanonicalHostName();
		System.out.println("Ǯ����:"+hostfullName);
		System.out.println(name.getHostName());
		
		//LookPask �ּ� ���� Ȯ��
		//false�� true�� ���
		boolean isLookPack = address.isLoopbackAddress();
		System.out.println(isLookPack);
		
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		InetAddressMain IAM = new InetAddressMain();
		IAM.InetSample();

	}

}
