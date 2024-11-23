package com.widenarrodemo;

public class WideNarroDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b = 10;
		short s = 127;
		int i = 23445653;
		long l = 10;
		float f = 100.7876f;
		double d = 10;
		char c = 10;
		boolean b1 = true;
		
//		Widening 
		
////		b = s; here it won't be possible because byte is smaller than short so byte cannot store short
//		s = b;
//		i = b;
//		l = b;
////		These 3 cases are possible because byte is smaller than short,integer,long so, byte can store in short, integer, long 
//		i = s;
//		l = s;
//		l = i;
////		There 3 cases are possible because short is smaller then integer & long , Interger is smaller than Long 
////		c = b; it won't be possible beacuse charecter we can only assign charecter or integer even the size of char is bigger than byte
////		b1 = b; this is also not possible
//		
//		f = s;
//		d = s;
//		f = i;
//		d = i;
//		f = b;
//		f = l;
//		d = l;
		
//		narrowing
//		b = (byte)s;
		b = (byte)i;
		i =(int)f;
		System.out.println(b);
		System.out.println(i);
	}

}
