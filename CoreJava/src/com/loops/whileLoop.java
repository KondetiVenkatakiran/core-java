package com.loops;
import java.util.*;
public class whileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the n: ");
		int n = scanner.nextInt();
		int i=1;
		
		while(i<n) {
			System.out.println(i);
			i=i*2;
		}
//		while(true) {
//			System.out.println(i);
//			i++;
//		}
//		do {
//			System.out.println(i);
//			i=i*2;
//		}while(i<n);

	}
	

}
  