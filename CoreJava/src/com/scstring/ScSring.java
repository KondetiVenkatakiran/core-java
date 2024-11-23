package com.scstring;

public class ScSring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = new String("programmer@gmail.com");
		
		String username = str.substring(0,10);
		System.out.println("sub string (or) UserName: "+username);
		System.out.println("StartsWith: "+username.startsWith("programmer"));
		
		int i = str.indexOf("@");
		System.out.println(i);
		
		String domain = str.substring(11,20);
		System.out.println("Sub String (or) Domain: "+domain);	
		System.out.println("StartsWith: "+domain.startsWith("gmail"));
		
		System.out.println("Equal: "+str.equals("google"));
//		this is for length of the string
		System.out.println("Length of the string: "+str.length());
//		this is for uppercase and lowercase
		String str1 = str.toLowerCase();
		String str2 = str.toUpperCase();
		System.out.println("Lower Case: "+ str1);
		System.out.println("Upper Case: "+ str2);
//		this is for trimming the string
		String str3 = new String("       programmer@gmail.com      ");
		System.out.println("Trim: "+str3.trim());
//		this is for replacing the string
		String str4 = str.replace("gmail.com", "google.com");
		System.out.println("Replace: "+str4);
//		this string starts with and ends with
		String str5 = new String("www.kiran.com");
		System.out.println("StartsWith: "+str5.startsWith("www"));
		System.out.println("EndsWith: "+str5.endsWith("com"));
//		This is for char
		String str6 = new String("dfghhxdttutyfyc");
		System.out.println("Charecter index at 10: "+str6.charAt(10));
//		this is for finding the index no of char in string 
		String str7 = new String("ertyuytdfg");
		System.out.println("Index no char in string: "+str7.indexOf("u"));
//		this is for finding the LastIndex no of char in string
		System.out.println("Last Index no char in string: "+str.lastIndexOf("a"));
//		this is for to equal and equal ingnore case
		String str8 = "programmer@gmail.com";
		
		String str9 = "programmer@gmail.com";
		System.out.println("for Equal Case: "+str.equals(str8));
		System.out.println("for Equal Case: "+str8.equals(str9));
//  here the object is same in str8 & str9 and it stores at only one place in pool 
		System.out.println("Equal case: "+str==str8);
// because in str the object is created in heap and in str8 the object is created in pool even the object is same 
		String str10 = "Programmer@gmail.com ";
		System.out.println("for EqualIgnoreCase: "+str9.equalsIgnoreCase(str10));
		
//		this is for compare to strings case CompareTo
		String str11 = "Java";
		String str12 = "java";
		String str13 = "python";
		System.out.println("CompareTo: "+str11.compareTo(str12));
		System.out.println("CompareTo: "+str12.compareTo(str11));
		System.out.println("CompareTo: "+str12.compareTo(str13));
		System.out.println("CompareTo: "+str9.compareTo(str8));
		System.out.println("CompareTo: "+str11.compareToIgnoreCase(str11));
		System.out.println("CompareTo: "+str.compareToIgnoreCase(str10));

//		this is for concat the 2 strings
		String str14 = str10.concat(str13);
		System.out.println("Concatination od 2 strings: "+str14);
		
//		this is for to convert any type of value into string valueOf()
		byte b = 10;
		short s = 10;
		int a = 10;
		long l = 10;
		float f = 10.09f;
		double d = 57.87d;
		char ch = 'A';
		boolean o = false;
		String str15 = String.valueOf(a);
		String str16 = String.valueOf(s);
		String str17 = String.valueOf(b);
		String str18 = String.valueOf(l);
		String str19 = String.valueOf(f);
		String str20 = String.valueOf(d);
		String str21 = String.valueOf(ch);
		String str22 = String.valueOf(o);
		System.out.println(str15);
		System.out.println(str16);
		System.out.println(str17);
		System.out.println(str18);
		System.out.println(str19);
		System.out.println(str20);
		System.out.println(str21);
		System.out.println(str22);
		
		
		
//		System.out.println(str.substring(0, 10));
//		System.out.println(str.charAt(10));
//		System.out.println(str.substring(11,16));
//		System.out.println(str.charAt(16));
//		System.out.println(str.substring(17,20));
		
// Find if a number is Binary or not
		int A = 10101010;
//		String str23 = b + "";
		String str23 = String.valueOf(A);
		
		System.out.println(str23.matches("[01]+"));
		
//		Find is a number is Hexa-Decimal or not
		
		
		String B = "766767ACEFD";
		System.out.println(B.matches("[1-9A-F]+"));
		
//		Find is the data in a date format (DD/MM/YYYY)
		String D = "13/12/2000";
		System.out.println(D.matches("[0-3][0-9]/[01][0-9]/[0-9]{4}"));
		
//		Remove Special characters from a string
		String str24 = "a!b@c#1#2%3";
		System.out.println(str24.replaceAll("[^a-zA-Z0-9]", ""));
		
//		Remove extra spaces from string
		String str25 = "   abc       de         fgh        ijk";
		System.out.println(str25.replaceAll("\\s+", " ").trim());
		
//		Find number of words in a String
		String str26 = str25.replaceAll("\\s+", " ").trim();
//		by using the split method i'm splitting the word based on spaces
		String words[] = str26.split("\\s");
		System.out.println(words.length);
	}

}
