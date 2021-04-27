package Assigment_8;

import java.util.Scanner;

public class q7 {

	public static void main(String[] args) {
		/*
		 * Question-7
		 * 
		 * Complete a method isPalindrome() that will check if the number is a
		 * palindrome. Print your result as a boolean (true or false). Do not convert
		 * int into a string! Example: input: 1001 output: true
		 * 
		 * Example: input: 1234 output: false
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = scan.nextInt();
		
		System.out.println(isPalindrome(number));
		

	}

	private static boolean isPalindrome(int num) {
		boolean flag = false;

		int reverse = 0;
		int realNum = num;

		while (num > 0) {
			reverse = (reverse * 10) + num % 10;
			num /= 10;
	
		}

		if (reverse == realNum) {
			flag = true;
		}

		return flag;

	}

}
