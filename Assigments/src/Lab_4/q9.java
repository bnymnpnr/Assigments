package Lab_4;

import java.util.Arrays;

public class q9 {

	public static void main(String[] args) {
		/*
		 * Question-9 Write a method that accepts an array and prints a new array with
		 * double the length where its last element is the same as the original array,
		 * 
		 */
		int[] x = { 4, 5, 6 };

		System.out.println(Arrays.toString(doubleAndLast(x)));

	}

	private static int[] doubleAndLast(int[] x) {

		int[] y = new int[x.length * 2];
		y[y.length - 1] = x[x.length - 1];

		return y;
	}

}
