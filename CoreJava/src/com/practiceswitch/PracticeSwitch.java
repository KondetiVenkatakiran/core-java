
package com.practiceswitch;
import java.util.*;
public class PracticeSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// if-else else-if conditions
//		int n = 3;
//		if(n==0) {
//			System.out.println("Zero");
//		}else if(n==1) {
//			System.out.println("One");
//		}else if(n==2) {
//			System.out.println("Two");
//		}else if(n==3) {
//			System.out.println("Three");
//		}else {
//			System.out.println("Invalid");
//		}
//		switch case:
//		int n = 0;
//		switch(n) {
//		case 0: System.out.println("Zero! ");
//		break;
//		case 1: System.out.println("One! ");
//		break;
//		case 2: System.out.println("Three! ");
//		break;
//		case 3: System.out.println("Four! ");
//		break;
//		case 5: System.out.println("Invalid!");
//		}
//		example of switch case
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the info: ");
		String str = scanner.nextLine();
		switch(str) {
		case "Create": System.out.println("Create");
		break;
		case "Read":System.out.println("read");
		break;
		case "Update":System.out.println("Update");
		break; 
		case "Delete":System.out.println("Delete");
		break;
		default:System.out.println("Invalid");
		}
	}

}
