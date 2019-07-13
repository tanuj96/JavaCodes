package com.tanujmi.test;

public class DemoMain {

	public static void main(String[] args) {
		
		Student obj = new Student();
		obj.rollno = 9;
//		obj.name = "Mittal";   this will show error because string name is private in Student class
		obj.marks = 99;
		obj.age = 24;
	}

}
