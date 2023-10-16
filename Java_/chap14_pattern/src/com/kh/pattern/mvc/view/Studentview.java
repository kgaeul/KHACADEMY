package com.kh.pattern.mvc.view;
import com.kh.pattern.mvc.controller.Studentcontroller;
import com.kh.pattern.mvc.Model.StudentModel;

public class Studentview {

	public static void main(String[] args) {
		// �� ��ü ���� Model
		StudentModel model = new StudentModel("���л�",17);
		//  �� ��ü ���� View
		Studentview view = new Studentview();
		// ��Ʈ�ѷ� ��ü ���� Controller(�� �� ����)
		Studentcontroller controller = new Studentcontroller(model, view);
		//�л� ������ ������Ʈ�ؼ� ���
		controller.updateView();
		//�л� ���� ������Ʈ�� ����!
		controller.setStudentName("�̾�����Ʈ");
		controller.setStudentAge(18);
		//������Ʈ �� �л� ������ ���
		controller.updateView();
	}

	public void displayInfor(String name, int age) {
		// TODO Auto-generated method stub
		
	}

	}


