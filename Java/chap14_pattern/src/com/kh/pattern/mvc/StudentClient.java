package com.kh.pattern.mvc;

import com.kh.pattern.mvc.Model.StudentModel;
import com.kh.pattern.mvc.controller.Studentcontroller;
import com.kh.pattern.mvc.view.Studentview;

public class StudentClient {

	
	public static void main(String[] args) {

		//�� ��ü ����
		StudentModel model = new StudentModel("�谡��",24);
		
		Studentview view = new Studentview();
		
		Studentcontroller controller = new Studentcontroller(model,view);
		//�� ��ü ����
		//��Ʈ�ѷ� ��ü ����(�𵨺� ����)
	
		controller.updateView();
		
		controller.setStudentName("�̾�����Ʈ");
		controller.updateView();
		//�л� ���� ������Ʈ�� ����!
		controller.setStudentName("�̾�����Ʈ");
		controller.setStudentAge(18);
		//������Ʈ �� �л� ������ ���
		controller.updateView();
	
	}

	
	
	
	
}
