package com.kh.DequeueMain;

import java.util.Deque;
import java.util.LinkedList;

public class DequeueMain {

	/*
	  ` b  
	    |
	    V
	    [first] <-> [second] <-> [third]
	 */
	
	public static void main(String[] args) {

		Deque<String> deque = new LinkedList<>();
		
		deque.addFirst("��");
		deque.addFirst("��");
		deque.addFirst("��");
		
		deque.offerFirst("��");
		
		System.out.println(deque);
		
		
		
	}

}
