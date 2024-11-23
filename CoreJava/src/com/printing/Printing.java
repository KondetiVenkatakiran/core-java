package com.printing;

public class Printing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		System.out.println();
//		int a = 10;
//		float b = 10.5f;
//		char ch = 'A';
//		String str = "Hello";
//		System.out.println(str);
//		int x = 10;
//		int y = 20;
//		System.out.println("sum of 10 and 20 is "+(x+y));
//		System.out.println("sum of " + 10 + " and " + 20 + " is "+ (x+y));
//		System.out.println();
//		System.out.print();
//		System.out.printf();
//		System.out.format();
		
		
//		System.out.printf();	
		
//		Format Specifier

// %[argument_index$][flags][width][.precision]conversion
//
// arguments index - 1$, 2$, 2$,.....
//
// flag '-', '+', '0', ' ', '('
//
// conversion 
//
// char c
//
// int d,o,x d-decimal, o-Octal, x-Hexadecimal
//
// float f,e,g  here f is for float and double
//
// String s (for string s is use )
//		int x = 10;
//		float y = 0.001256f;
//		char z = 'A';
//		String str = "Java Program ";

		//		 here we are using conversion 
		//
		// char c
		//
		// int d,o,x d-decimal, o-Octal, x-Hexadecimal
		//
		// float f,e,g  here f is for float and double		
//		System.out.printf("Hello %x %f %c World\n",x,y,z);
//		System.out.printf("Hello %f \n",y);
//		System.out.printf("Hello %e \n",y);
//		System.out.printf("Hello %g \n",y);
//		System.out.printf("Hello %s \n",str);

		//		here we are using  arguments index - 1$, 2$, 2$,.....
		
//		System.out.printf("%1$d %2$f %3$s",x,y,str);

		//		here we are using flag '-', '+', '0', ' ', '('
		
		int a =10;
		
		System.out.printf("%d \n" ,a);
		System.out.printf("%10d \n",a); 
		System.out.printf("%05d \n",a);
		System.out.printf("%(5d \n",a);

		int b = -10;
		System.out.printf("%5d \n",b);
		System.out.printf("%05d \n",b);
		System.out.printf("%(5d \n",b);
		System.out.printf("%+5d \n\n",b);
		
		float c = 3.45f;
		System.out.printf("%6.3f \n",c);
		
		String str = "Java";
		System.out.printf("%20s \n",str);
		System.out.printf("%-20s \n",str);
		
//		System.out.format(); printf and format are same we can use any thing here 
		System.out.format("%-20s \n",str);
		
	}

}
