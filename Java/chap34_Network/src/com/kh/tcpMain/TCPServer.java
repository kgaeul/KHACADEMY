package com.kh.tcpMain;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

	public static void main(String[] args) {
		try {
			ServerSocket serversocket = new ServerSocket(6789);
			System.out.println("!���� �����!");
			
			//���࿡ Ŭ���̾�Ʈ�� �����ϰ� �ʹٸ� Ŭ���̾�Ʈ�� �����ϴ� �ڵ��ۼ�
		while(true){
			//Ŭ���̾�Ʈ�� �������ϴ� �ڵ�
			Socket client = serversocket.accept();
			System.out.println("Ŭ���̾�Ʈ�� ����Ǿ����ϴ�.");
			client.close();
		}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
