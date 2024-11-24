package com.loops;
import java.util.*;
public class forLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		for(int i = 0;i<=10;i++) {
//			System.out.println(i);
//		}
//		for(int j=10;j>=-10;j--) {
//			System.out.println(j);
//		}
//		another way of representing for loop
//		int i=0;
//		for(System.out.println("Hi");i<=10;) {
//			System.out.println(i);
//			i++;
//		}
		
//		another way of representing for loop
//		for(int i=0,j=1;i<=10;i++,j=j*2) {
//			System.out.println(i+" "+j);
//			i++;
//		}
		
//		Display Multiplication Table
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = scanner.nextInt();
		int i = 1;
		for(;i<=10;) {
			System.out.println(n+" X "+i+" = "+n*i);
			i++;
		}
		
//		find the sum of n natural numbers
//		Scanner scanner = new Scanner(System.in);
//		int n = scanner.nextInt();
		int sum = 0;
		int j =0;
		for(;j<=n;) {
			sum += j;
			j++;
		}
		System.out.println("Sum of "+n+" number is "+sum);
		
//		Factorial of a number
		long fact= 1;
		int k=1;
		for(;k<n;) {
			fact+=k;
			k++;
		}
		System.out.println("Fatcorial of number: "+fact);
	}

}
 