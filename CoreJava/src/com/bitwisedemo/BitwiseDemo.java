package com.bitwisedemo;

public class BitwiseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int x = 10, y = 6, z;
//		z = x&y;
		
//		int x = 0b1010;
//		int y = 0b0110;
//		int z;
////		z = x&y;
////		z = x|y;
//		z = x^y;
//		System.out.println(z);
		int x = 10;
		int y;
		y=x>>2;

//		int x = 0b1010;
//		int y;
//		y = ~x;
		System.out.println(String.format("%s",Integer.toBinaryString(x)));
		System.out.println(String.format("%s",Integer.toBinaryString(y) ));
//		System.out.println(y);
	}

}
