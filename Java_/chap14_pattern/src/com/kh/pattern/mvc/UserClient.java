package com.kh.pattern.mvc;

import com.kh.pattern.mvc.comtroller.userController;
import com.kh.pattern.mvc.comtroller.userModel;
import com.kh.pattern.mvc.comtroller.userView;

public class UserClient {

	public static void main(String[] args) {
		//MVC ������ ����ؼ� �л� ������ �ٷ�°�
		//�� ��ü ����
		userModel user  = new userModel ("�谡��",24);
		//�� ��ü ����
		//�л� ������ ������Ʈ�ؼ� ���
		//�л����� ������Ʈ�� ����
		//������Ʈ�� �л������� ���
		
		userView view = new userView();
		
		
		userController controller = new userController (user,view);
		
		controller.updateview();
		controller.updateview();
		controller.updateview();
		
		
		
	}

}
