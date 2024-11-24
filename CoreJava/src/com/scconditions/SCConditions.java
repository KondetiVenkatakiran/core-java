package com.scconditions;
import java.util.Scanner;
public class SCConditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		To find the number is even or odd
		int n;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number: ");
		n = scanner.nextInt();
		
		if(n%2==0) {
			System.out.println("Even number");
		}else {
			System.out.println("Odd number");
		}
//		Find person is young or not young
		int age;
		System.out.println("Enter the your age: ");
		age = scanner.nextInt();
		
//		if(age>=14 && age<=55) {
//			System.out.println("younger");
//		}else if(age<14) {
//			System.out.println("Kid");
//		}else {
//			System.out.println("Old");
//		}
		if(age<=12) {
			System.out.println("Adult");
		}else if(age >12 && age <= 21){
			System.out.println("minor");
		}else if(age > 21 && age <= 30) {
			System.out.println("major");
		}else if(age > 30 && age <= 45) {
			System.out.println("uncle");
			
		}else {
			System.out.println("old");
			
		}
//	Find grades for given marks
//		int m1;
//		int m2;
//		int m3;
		System.out.println("Enter the marks m1: \n"+"Enter the the marks m2: \n"+"Enter the marks m3: \n");
		int m1 = scanner.nextInt();
		int m2 = scanner.nextInt();
		int m3 = scanner.nextInt();
		
		float total = m1+m2+m3;
		float avg = (total)/3;
		System.out.println("your total score: "+total);
		System.out.println("your avarage: "+avg);
		if(avg>=90) {
			System.out.println("Grade-A");
		}else if(avg>=80&&avg<90){
			System.out.println("Grade-B");
		}else if(avg>=70&&avg<60) {
			System.out.println("Grade-C");
		}else if(avg>=60&&avg<70) {
			System.out.println("Grade-D");
		}else{
			System.out.println("Fail");
		}

		
	}

}
