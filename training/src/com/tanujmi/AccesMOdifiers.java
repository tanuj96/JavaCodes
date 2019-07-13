package com.tanujmi;

import com.tanujmi.test.Student;

//Unlike C, C++ in java we dont have specifiers we only have Access Modifiers which are
/*
* -> abstract
* -> final
* -> public
* -> private
* -> protected
*/

//In class the modifiers we can use are only are final, abstract & public (but in inner class we can only use private)



public class AccesMOdifiers {

	public static void main(String[] args) {
		Student obj = new Student();
		obj.rollno = 9;
  // obj.marks = 98; this will show error because in diff package the marks is protected in student class
 //	obj.age = 25;  not accessible because it is package private
	}

}
