package com.kh.finalSample;

import java.io.*;
import java.net.*;



public class TCPServer {
	
	public static void main(String[] args) throws Exception {
		
	ServerSocket server = new ServerSocket(2222);
	System.out.println("[���� ���� ��� ��]");
	
	 while(true) {
		Socket client = server.accept();
		System.out.println("[���� ���� �Ϸ�]");
		InputStream inStream = client.getInputStream();
		OutputStream outStream = client.getOutputStream();
		PrintStream printstream = new PrintStream(outStream);
		
		printstream.flush();
		client.close();
	 	}
	

	}
}