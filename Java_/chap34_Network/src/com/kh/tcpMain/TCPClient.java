package com.kh.tcpMain;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClient {

	public static void main(String[] args) {
		try {
			
			//�����ּҿ� ��Ʈ��ȣ�� ���� ����
			//�����ּҿ� ��Ʈ��ȣ�� ���� �����ϰ��� �ϴ� ��Ʈ�� �����ؾ���
			
			Socket socket= new Socket("loclahost",6789);
			
			PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			//���� �Ǵ��� �׽�Ʈ�޽���
			out.println("�ȳ� ����?");
			
			//�����κ��� �޼��� ���޵Ǵ��� Ȯ�� �׽�Ʈ
			String reponse = in.readLine();
			System.out.println("���� ����"+reponse);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
