package Assigment_8;

import java.util.Scanner;

public class q2 {

	public static void main(String[] args) {
		/*
		 * Question-2
		 * 
		 * Create a method called cube. Write all required code inside this method in
		 * order to ask the user for a number and then prints the cubed value of that
		 * number:
		 * 
		 * Example:
		 * 
		 * input: 5 output: 125
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to calculate cube:");
		int number = scan.nextInt();
		cube(number);

	}

	private static void cube(int number) {
		int result = 1;
		for (int i = 0; i < 3; i++) {
			result *= number;
		}
		System.out.println(result);
	}

}
