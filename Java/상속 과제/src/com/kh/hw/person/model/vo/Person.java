package com.kh.hw.person.model.vo;

public class Person {
	String name;
	int age;
	double height;
	double weight;
	
	
	public void person (String name,int age,double height,double weight) {
		this.name=name;
		this.age=age;
		this.height=height;
		this.weight=weight;
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(height);
		System.out.println(weight);
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	
}
