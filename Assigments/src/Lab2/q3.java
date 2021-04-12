package Lab2;

import java.util.Scanner;

public class q3 {

	public static void main(String[] args) {
		/*
		 * Question-3
		 * 
		 * Write a program that asks the user for a positive nonzero integer value. The
		 * program should use a loop to get the sum of all the integers from 1 up to the
		 * number entered.
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Welcome to Calculator! Enter a positive number: ");
		int num = scan.nextInt();
		int sum = 0;

		while (num != -1) {
			if (num <= 0) {
				System.out.println("Invalid number. Try again: ");
				num = scan.nextInt();
				continue;
			}

			for (int i = 1; i <= num; i++) {
				sum += i;
			}
			System.out.println("Sum of 1 to " + num + " is: " + sum);

			System.out.println("Enter a new number. Enter -1 to Exit: ");
			num = scan.nextInt();
			sum = 0;

		}

		System.out.println("You exited succesfully! ");

	}

}
