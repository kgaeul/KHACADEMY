package com.kh.pattern.mvc.comtroller;
import com.kh.pattern.mvc.comtroller.userModel;
import com.kh.pattern.mvc.comtroller.userView;

public class userController {
		//�𵨰� �並 �����ϴ� ��
		//����� �Է��� ó���ϴ� ��
		private userModel usermodel;
		private userView userview;
		
		public userController (userModel usermodel,userView userview) {
			this.usermodel=usermodel;
			this.userview=userview;
		}
		
		public void setUsermodel(userModel usermodel) {
			this.usermodel = usermodel;
		}
		public void setUserview(userView userview) {
			this.userview = userview;
		}
		public userModel getUsermodel() {
			return usermodel;
		}
		public userView getUserview() {
			return userview;
		}

		public void setuserName(String name) {
			usermodel.setName(name);
		}
		
		public String getuserName(String name) {
			return usermodel.getName();
		}
		
		public void setuserAge(int age) {
			usermodel.setAge(age);
		}
		
		public int getuserAge(int age) {
			return usermodel.getAge();
		}
		public void updateview() {
			userview.displayinfo(usermodel.getName(),usermodel.getAge());
		}
		
}
