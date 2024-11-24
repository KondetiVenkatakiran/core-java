package com.relational;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		IF - Statement
		int x = 5;
		if(x>=0) {
			System.out.println("Positive");
		}else {
			System.out.println("Negative");
		}
		
//		Nested IF-Statement
		int a = 5;
		int b = 6;
		int c = 10;
		if(a>b&&a>c) {
			System.out.println(a);
		}else { 
			if(b>c) { 
				System.out.println(b);
			}else {
				System.out.println(c);
			}
		}
//		elif-ladder
		int A = 5;
		int B = 6;
		int C = 10;
		if(a>b&&a>c) {
			System.out.println(a);
		}else if(b>c) {
				System.out.println(b);	
		}else {
			System.out.println(c);
		}
			
	}
}

