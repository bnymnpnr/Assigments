package Assigment_8;

import java.util.Scanner;

public class q8 {

	public static void main(String[] args) {
		/*
		 * Question-8
		 * 
		 * Complete a method fib() that will compute Fibonacci numbers In fibonacci
		 * series, next number is the sum of previous two numbers for example 0, 1, 1,
		 * 2, 3, 5, 8, 13, 21, 34, 55, 89, 144,……... The first two numbers of fibonacci
		 * series are 0 and 1. Given a number num, print n-th Fibonacci Number.
		 * 
		 * Input : 2 Output : 1
		 * 
		 * Input : 9 Output : 21
		 */
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int count = scan.nextInt();
		fib(count);
	}

	private static void fib(int count) {
		int a = 0;
		int b = 1;
		System.out.println("fibonacci series of " + count);

		for (int i = 0; i < count; i++) {
			int sum = a + b;
			System.out.print(a + " ");

			a = b;
			b = sum;
		}

	}

}
