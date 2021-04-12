package Lab2;

import java.util.Scanner;

public class q1 {

	public static void main(String[] args) {
		/*
		 * Question-1
		 * 
		 * Write a program with a loop that lets the user enter a series of integer
		 * numbers. After all the numbers have been entered, the program should display
		 * the largest and smallest numbers entered.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your first number:");
		int firstNum = scan.nextInt();

		System.out.print("Enter your next number:");
		int nextNumber = scan.nextInt();

		System.out.print("Do you want to enter another number: 0-No, 1-Yes");
		int answer = scan.nextInt();

		int smallest = firstNum;
		int largest = nextNumber;

		while (answer == 1) {
			System.out.print("Enter your next number:");
			nextNumber = scan.nextInt();

			if (nextNumber > largest) {
				largest = nextNumber;
			} else if (nextNumber < smallest) {
				smallest = nextNumber;
			}

			System.out.print("Do you want to enter another number: 0-No, 1-Yes");
			answer = scan.nextInt();
		}

		System.out.println("Smallest Number is:" + smallest);
		System.out.println("Largest Number is:" + largest);
	}

}
