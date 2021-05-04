package Lab_4;

import java.util.Arrays;

public class q28 {
	/*
	 * Question-28 Write a method that accepts start and end numbers. Given start
	 * and end numbers, return a new array containing the sequence of integers from
	 * start up to but not including end, so start=5 and end=10 yields [5, 6, 7, 8,
	 * 9]. fizzArray3(5, 10) [5, 6, 7, 8, 9] fizzArray3(11, 18) [11, 12, 13, 14, 15,
	 * 16, 17] fizzArray3(1, 3) [1, 2]
	 */
	public static void main(String[] args) {
		fizzArray3(11, 18);

	}

	private static void fizzArray3(int a, int b) {
		int length = b - a;
		int[] arr = new int[b - a];
		for (int i = 0; i < length; i++) {
			arr[i] = a++;
		}
		System.out.println(Arrays.toString(arr));

	}

}
