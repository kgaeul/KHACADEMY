package com.kh.finalSample;

import java.util.ArrayList;

public class MyMusic {
	public static void main(String[] args) {
			MyMusic mm = new MyMusic();
			mm.runMusic();
		}
	

	public void runMusic() {
		ArrayList<Music>List = new ArrayList<Music>();
		List.add(new Music("�߶��","����"));
		List.add(new Music("�߶��","�ų�"));
		List.add(new Music("����","��ſ�"));
		
		for(int i=0;i<=List.size();i++) {
			Music m = List.get(i);
			System.out.println(List.get(i));
			System.out.println(m.getG()+m.getMoode());
		}
	}

	
	
}
