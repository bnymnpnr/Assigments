package Assignment_10;

public class q20 {

	public static void main(String[] args) {
		/*
		 * Question-20
		 * 
		 * In mathematics, the factorial of a positive integer n, denoted by n!, is the
		 * product of all positive integers less than or equal to n. Calculate factorial
		 * and output result to the console.
		 * 
		 * Sample Output:
		 * 
		 * input: 5 output: 120
		 */

		int number = 5;
		int sum = 1;

		if (number < 0) {
			System.out.println("Invalid number!");
			return;
		}

		for (int i = 1; i <= number; i++) {
			sum *= i;
		}

		System.out.println(sum);
	}

}
