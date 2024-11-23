package com.bitwisedemo;

public class Bitwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a = 10;
//		int b = 15;
//		
//		a = a^b;
//		b = a^b;
//		a = a^b;
//		System.out.println(a+" "+b);

		byte a = 9;
		byte b = 12;
		
		byte c;
		c = (byte)(a<<4);
		c = (byte)(c|b);
		System.out.println((c&0b11110000)>>4);
		System.out.println((c&0b00001111));
	}

}
