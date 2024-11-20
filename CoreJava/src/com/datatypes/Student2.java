package com.datatypes;

public class Student2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Local variables 
//		it can create within method and can be accessed within that particular method and cannot accessed outside the method 
//		no need to create object
//		int height = 70;
//		Student2 student = new Student2();
//		System.out.println(height);
		test1(70);
		test1(40);
	}
	public static void test1(int height ) {
		int weight = 50;
		System.out.println(weight);
		System.out.println(height);
	}

}
