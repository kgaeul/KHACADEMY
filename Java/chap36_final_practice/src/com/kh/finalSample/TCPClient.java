package com.kh.finalSample;

import java.io.*;
import java.net.*;

public class TCPClient{

	public static void main(String[] args) throws Exception  {
		
		String serverIP = InetAddress.getLocalHost().getHostAddress();
		Socket socket = new Socket(serverIP,2222);
		
		
		//Ŭ���̾�Ʈ�� ����� ���� ����� ��Ʈ�� ����
		BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		OutputStream out = socket.getOutputStream();
		
		String msg = "�ȳ� ����";
		out.write(msg.getBytes());
		out.flush();
		
		socket.close();
	}
	
		
}
