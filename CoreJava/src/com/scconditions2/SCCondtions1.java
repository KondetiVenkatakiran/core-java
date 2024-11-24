package com.scconditions2;
import java.util.*;
public class SCCondtions1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Find type of web-site and Protocol used
//		https://www.google.com
		Scanner scanner = new Scanner(System.in);
//		System.out.print("Enter the url: ");
//		String url = scanner.nextLine();
//		String protocol = url.substring(0, url.indexOf(":"));
//		System.out.println(protocol);
//		
//		if(protocol.equals("http")) {
//			System.out.println("Hypertext Tranfer Protocol! ");
//		}else if(protocol.equals("ftp")) {
//			System.out.println("File Transfer Protocol! ");
//		}else if(protocol.equals("https")) {
//			System.out.println("Hypertext Transfer Protocol Secure");
//		}
//		
//		String exe = url.substring(url.lastIndexOf(".")+1);
//		System.out.println(exe);
//		if(exe.equals("com")) {
//			System.out.println("Commercial Web-Site");
//		}else if(exe.equals("org")) {
//			System.out.println("Qrganization Web-Site");	
//		}else if(exe.equals("gov")) {
//			System.out.println("Government Web-Site");
//		}
		
//		this is based on switch case
		
//		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the url: ");
		String url = scanner.nextLine();
		String protocol = url.substring(0, url.indexOf(":"));
		System.out.println(protocol);
		
//		if(protocol.equals("http")) {
//			System.out.println("Hypertext Transfer Protocol ");
//		}else if (protocol.equals("ftp")) {
//			System.out.println("File Transfer Protocol ");
//		}else if(protocol.equals("https")) {
//			System.out.println("Hypertext Transfer Protocol Secure ");
//		} 
		switch(protocol) {
		case("http"):System.out.println("Hypertext Transfer Protocol! ");
		break;
		case("ftp"):System.out.println("File Transfer Protocol! ");
		break;
		case("https"):System.out.println("Hypertext Transfer Protocol Secure! ");
		break;
		default:System.out.println("Invalid Text! ");
		}
		
		String exe = url.substring(url.lastIndexOf(".")+1);
		System.out.println(exe);
		
//		if(exe.equals("com")) {
//			System.out.println("Commercial Web-Site");
//		}else if  (exe.equals("org")) {
//			System.out.println("Organisation Web-Site");
//		}else if(exe.equals("gov")) {
//			System.out.println("Government Wbe-Site");
//		}
		switch(exe) {
		case("com/"):System.out.println("Commercial Web-Site! ");
		break;
		case("org/"):System.out.println("Organisation Web-Site! ");
		break;
		case("gov/"):System.out.println("Government web-Site!");
		break;
		default:System.out.println("Invalid Text! ");
		}
	}

}
