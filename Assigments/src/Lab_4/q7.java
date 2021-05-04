package Lab_4;

import java.util.Arrays;

public class q7 {

	public static void main(String[] args) {
		/*
		 * Question-7 Write a method that accepts 2 arrays and prints the second array
		 * containing the first and last elements from the first array. int[] x =
		 * {1,2,3}; int[] y = {}; = > [1,3] int[] a = {7,4,6,2}; int[] b = {}; = > [7,2]
		 */
		
		
		int[] x = { 1, 2, 3 };
		int[] y = new int[2];

		System.out.println(Arrays.toString(containsFirstLast(x, y)));

	}

	private static int[] containsFirstLast(int[] x, int[] y) {

		y[0] = x[0];
		y[1] = x[x.length - 1];

		return y;

	}
}
