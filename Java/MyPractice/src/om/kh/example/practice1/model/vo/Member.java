package om.kh.example.practice1.model.vo;

public class Member {

	String memberId;
	String memberPwd;
	String memberName; 
	int age;
	char gender;
	String phone; 
	String email; 
	
	public Member(String memberId,String memberPwd,String memberName,int age,char gender,String phone,String email) { 

	this.memberId=memberId;
	this.memberPwd=memberPwd;
	this.memberName=memberName;
	this.age=age;
	this.gender=gender;
	this.phone=phone;
	this.email=email;
	
	}
	public void memberIdname() {
		System.out.println("���̵� : "+memberId);
	}
	public void memberPwdname() {
		System.out.println("��й�ȣ : "+memberPwd);
	}
	public void memberNamename() {
		System.out.println("�̸� : "+memberName);
	}
	public void agename() {
		System.out.println("���� : "+age);
	}
	public void gendername() {
		System.out.println("���� : "+gender);
	}public void phonename() {
		System.out.println("�ڵ��� ��ȣ : "+phone);
	}
	public void emailname() {
		System.out.println("�̸��� : "+email);
	}
	
		
		
	
}
