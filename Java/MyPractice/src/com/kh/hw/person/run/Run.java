package com.kh.hw.person.run;

import com.kh.hw.person.controller.PersonController;
import com.kh.hw.person.view.PersonMenu;

public class Run {

	public static void main(String[] args) {

		PersonMenu pm = new PersonMenu();
		PersonController pc =new PersonController();
		
		pm.mainMenu();
		pm.printStudent();
		
	}

}
