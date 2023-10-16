package com.kh.SocketMain;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientMain {

	public static void main(String[] args) throws UnknownHostException, IOException {

		//������ �����ϱ� ���� ������  ����
		Socket socket = new Socket("localHost",5678);
		
		//������ �����͸� ������ ���� ��� ��Ʈ�� ����
		PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
		
		//������ ���� �����͸� �ޱ� ���� ��� ��Ʈ�� ����
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
		
		String userInputString;
		while((userInputString = userInput.readLine())!=null) {
			
			//����� �Է°��� ������ �����ϰڽ��ϴ�.
			out.println(userInputString);
			
			String serverResponse = in.readLine();
			System.out.println("���� ��� : "+serverResponse);
		}
		socket.close();
		userInput.close();
	}

}
