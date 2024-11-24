package com.scconditions2;
import java.util.*;
public class SCConditons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Find radix of a number given in a string
		
		String number;
		Scanner scanner = new Scanner(System.in);
		System.out.print("enter the number: ");
		
		number = scanner.nextLine();
		if(number.matches("[01]+")) {
			System.out.println("Binary number and radix is 2! ");
		}else if(number.matches("[0-7]+")) {
			System.out.println("Octal Radix is 8! ");
		}else if(number.matches("[0-9A-F]+")) {
			System.out.println("HexaDecimal radix is 16!");
		}else {
			System.out.println("Invalid number! ");
		}
//		scanner.close();
	//   Find a given year is a leap year
		System.out.print("Enter the year: ");
		int year = scanner.nextInt();
		
		if(year%4==0) {
			if(year%100==0) {
				if(year%400==0) {
					System.out.println("Leap-Year!");
				}else {
					System.out.println("Not Leap-Year!");
				}
			}else {
				System.out.println("Leap-Year");
			}
			
		}else {
			System.out.println("Not Leap-Year!");
		}
//		Display name of a day based on number
		System.out.print("Enter the day: ");
		int day = scanner.nextInt();
		
		if(day == 1) {
			System.out.println("Monday! ");
		}else if(day == 2) {
			System.out.println("Tuesday! ");
		}else if(day == 3) {
			System.out.println("Wednessday! ");	
		}else if(day == 4) {
			System.out.println("Thursday! ");
		}else if(day == 5) {
			System.out.println("Friday! ");
		}else if(day == 6) {
			System.out.println("Saturday! ");
		}else if(day == 7) {
			System.out.println("Sunday! ");
		}else {
			System.out.println("Invalid day");
		}
		

		
	}

	
}
