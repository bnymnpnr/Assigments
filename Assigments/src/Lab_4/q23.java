package Lab_4;

import java.util.Arrays;

public class q23 {
	/*
	 * Question-23 Write a method that accepts a number and create and prints a new
	 * array of length number, containing the numbers 0,1,2,...number-1.
	 * fizzArray(4) [0, 1, 2, 3] fizzArray(1) [0] fizzArray(10) [0, 1, 2, 3, 4, 5,
	 * 6, 7, 8, 9]
	 */

	public static void main(String[] args) {
		fizzArray(10);

	}

	private static void fizzArray(int num) {
		int[] arr = new int[num];
		for (int i = 0; i < num; i++) {
			arr[i] = i;
		}
		System.out.println(Arrays.toString(arr));
	}

}
