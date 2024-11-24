package com.scswitch1;
import java.util.*;
public class SCSwitch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Menu");
		System.out.println("========================");
		System.out.println("ADD");
		System.out.println("SUB");
		System.out.println("MUL");
		System.out.println("DIV");
		System.out.println("=========================");
		
		System.out.print("Enter the number1:");
		double n1 = scanner.nextDouble();
		System.out.print("Enter the number2: ");
		double n2 = scanner.nextDouble();
		scanner.nextLine();
		System.out.println("Select the option: ");
		
		String option = scanner.nextLine();
		option = option.toUpperCase();
		switch(option) {
		case("ADD"):System.out.println("sum is "+(n1+n2));
		break;
		case("SUB"):System.out.println("Substration is "+(n1-n2));
		break;
		case("MUL"):System.out.println("Multiplication is "+(n1*n2));
		break;
		case("DIV"):System.out.println("Division is "+(n1/n2));
		break;
		default:System.out.println("Invalid Operation! ");
		}
	}

}
