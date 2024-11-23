package com.stringpractice;

public class SringPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Strings
//
//		String is a built-in class provided in Java, but it is almost used like a datatype.
//
//		String is a collection of characters.
//
//		String str1 = "Java Program";
//
//		Here, string is a class name, str1 is a reference, and "Java Program" is a string object and also a literal.
//
//
//
//		char c[] = {'A','B','C','D'};
//
//		String str1 = new String(c);
//
//		byte b[] = {'A','B','C','D'};
//
//		String str2 = new String(b);
//
//
//
//		String str1 = new String("Java");
//
//		Here, "Java" is a literal; it will be stored in head and pool.
//
//		String str2 = "Java Program";
//
//		Here "Java Program" is a literal, and it will be stored in pool.
//		Method - one - Here the literal "Java Project" is created in pool memory which is called as string pool
//		String str1 = "Java Project ";
////		Method - Two - Here the literal "Java" is created in Heap memory and pool 
//		String str2 = new String("Java");
////		Method - Three - Here the object is charecter array it is stored in Heap memory and pool
//		char c[] = {'H','E','L','L','O'};
//		String str3 = new String(c,1,2);
////		Method - four - Here the object is byte array it is stored in heap memory and pool 
//		byte b[] = {65,66,67,68};
//		String str4 = new String(b,2,2);
//		
//		System.out.println(str1);
//		System.out.println(str2);
//		System.out.println(str3);
//		System.out.println(str4);
//		

//		String str1 = "Java";
////		String str2 = "Java";
//		String str2 = new String("Java");
//		System.out.println(str1==str2);
		
////		String methods 
//		String str = new String("Netbeans");
//		int len = str.length();
//		System.out.println(len);
//		System.out.println(str);
//		str = str.toUpperCase();
//		str = str.trim();
		
////		String str2=str.substring(3,5);
//		String str2 = str.replace('e', 'M');
////		System.out.println(str);
//		System.out.println(str2+" "+str);
		
//		String str1 = "Mr. Sharukh Khan";
//		for(int i=0;i<str1.length();i++) {
//			System.out.print(str1.charAt(i));
//		}
//		System.out.println(str1.startsWith("Mr."));
//		System.out.println(str1.endsWith("Khan"));
//		System.out.println(str1.charAt(4));
//		
//		String str1 = "www.udemy.co.in";
//		System.out.println(str1.indexOf('.'));
//		System.out.println(str1.indexOf("udemy"));
//		System.out.println(str1.indexOf(".",4));
//		System.out.println(str1.lastIndexOf("."));
//		
//		Regular Expressions
//		String str1 = "a";
//		System.out.println(str1.matches("."));
//		String str1 = "b9";
//		System.out.println(str1.matches("."));
//		System.out.println(str1.matches("[abc]"));
//		System.out.println(str1.matches("[^abc]"));
//		System.out.println(str1.matches("[a-z][0-9]"));
//		System.out.println(str1.matches("a|b"));
		
//		Meta Characters
//		String str1 = "0";
//		String str1 = "@";
//		System.out.println(str1.matches("\\d"));
//		System.out.println(str1.matches("\\D"));
//	
//		String str1 = " ";
//	
//		System.out.println(str1.matches("\\s"));
//		System.out.println(str1.matches("\\S"));
		
//		String str1 = "A";
//		String str1 = "10";
//		System.out.println(str1.matches("\\w"));
//		System.out.println(str1.matches("\\W"));
//		String str1 = "aabb8987";
//		System.out.println(str1.matches(".*"));
//		System.out.println(str1.matches(".+"));
//		String str1 = "8";
//		System.out.println(str1.matches(".?"));
//		String str1 = "Java";
//		System.out.println(str1.matches(".{4}"));
//		System.out.println(str1.matches("[a-zA-Z]{0,4}"));
		String str1 = "vkondeti@gmail.com";
		System.out.println(str1.matches(".*gmail.*"));
		
		
//		
	}
	

}
