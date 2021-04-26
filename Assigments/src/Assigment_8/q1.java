package Assigment_8;

import java.util.Scanner;

public class q1 {

	public static void main(String[] args) {
		/*
		 * Question-1
		 * 
		 * Create a method called "plus", its return is void and it gets no arguments.
		 * 
		 * It asks the user to input two numbers, then it will add them and print the
		 * result. Create a scanner within the plus method.
		 * 
		 * Example:
		 * 
		 * enter first number: 1 enter second number: 2 result: 3
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number:");
		int first = scan.nextInt();
		System.out.println("Enter second number:");
		int second = scan.nextInt();
		int result;

		plus(first, second);
	}

	private static void plus(int a, int b) {
		int result = a + b;
		System.out.println("Result is: " + result);

	}

}
