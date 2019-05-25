package myproject;

import java.util.Scanner;

public class joycee {
	
	public static void printSum(int num1, int num2) {
		int sum = num1 + num2;
		
		System.out.println("Sum: " + sum);
	}
	
	public static void printDifference(int num1, int num2) {
		int difference = num1 - num2;
		
		 System.out.println("Difference: "+ difference);
	}
	
	public static void printProduct(int num1, int num2) {
		int product = num1 * num2;
		
		System.out.println("Product: " + product);
	}
	
	public static void printQuotient(int num1, int num2) {
		int quotient = num1 / num2;
		
		System.out.println("Quotient: "+ quotient);
	}
	
	public static void printRemainder(int num1, int num2) {
		int remainder = num1%num2;
		
		System.out.println("Remainder: "+ remainder );
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 23;
		int b = 12;
		
		printSum(a, b);
		printDifference(a, b);
		printProduct(a, b);
		printQuotient(a, b);
		printRemainder(a, b);
		
		System.out.println("");
		a = 20;
		b = 10;
		
		printSum(20.20, "Hello");
		printDifference(a, b);
		printProduct(a, b);
		printQuotient(a, b);
		printRemainder(a, b);

	}
	
}
