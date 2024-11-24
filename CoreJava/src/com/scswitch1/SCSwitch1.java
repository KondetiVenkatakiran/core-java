package com.scswitch1;
import java.util.*;
public class SCSwitch1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
////		Display the day based on number
//		System.out.print("Enter the day no: ");
//		int day = scanner.nextInt();
//		switch(day) {
//		case 1:System.out.println("Monday! ");
//		break;
//		case 2:System.out.println("Tuesday! ");
//		break;
//		case 3:System.out.println("Wednessday! ");
//		break;
//		case 4:System.out.println("Thrusday! ");
//		break;
//		case 5:System.out.println("Friday! ");
//		break;
//		case 6:System.out.println("Saturday! ");
//		break;
//		case 7:System.out.println("Sunday! ");
//		break;
//		default:System.out.println("Invalid day!");
//		}
////		Display name of a moth based on number
//		System.out.println("Enter the month no: ");
//		int month = scanner.nextInt();
//		switch(month) {
//		case 1:System.out.println("January! ");
//		break;
//		case 2:System.out.println("February! ");
//		break;
//		case 3:System.out.println("March! ");
//		break;
//		case 4:System.out.println("April! ");
//		break;
//		case 5:System.out.println("May! ");
//		break;
//		case 6:System.out.println("June! ");
//		break;
//		case 7:System.out.println("July! ");
//		break;
//		case 8:System.out.println("August! ");
//		break;
//		case 9:System.out.println("September! ");
//		break;
//		case 10:System.out.println("October! ");
//		break;
//		case 11:System.out.println("November! ");
//		break;
//		case 12:System.out.println("December! ");
//		break;
//		default:System.out.println("Inavlid Number!");
//		}
		
		
//		Display a type of website
		System.out.print("Enter the url: ");
		String url = scanner.nextLine();
		String protocol = url.substring(0, url.indexOf(":"));
		System.out.println(protocol);
		switch(protocol) {
		case("http"):System.out.println("Hypertext Transfer Protocol! ");
		break;
		case("ftp"):System.out.println("File Transfer Protocol! ");
		break;
		case("https"):System.out.println("Hypertext Transfer Protocol Secure! ");
		break;
		default:System.out.println("Invalid Text!");
		}
		String exe = url.substring(url.lastIndexOf(".")+1);
		System.out.println(exe);
		switch(exe) {
		case("com"):System.out.println("Commercial Web-Site! ");
		break;
		case("org"):System.out.println("Organizational web-site! ");
		break;
		case("gov"):System.out.println("Government web-site! ");
		break;
		default:System.out.println("Invalid Text! ");
		}
		
	}
}
 