package Lab_4;

import java.util.Arrays;

public class q15 {

	public static void main(String[] args) {
		/*
		 * Question-15 Write a method that accepts an array and swap the first and last
		 * element in the array. Print the modified array int[] x = {1,2,3,4} = >
		 * [4,2,3,1] int[] y = {1,2,3} = > [3,2,1] int[] z = {8,6,7,9,5} = > [5,6,7,9,8]
		 */

		int[] x = { 9, 6, 7, 8, 5 };
		System.out.println(Arrays.toString(swapFirstAndLast(x)));

	}

	private static int[] swapFirstAndLast(int[] x) {
		int dummy = x[x.length - 1];

		x[x.length - 1] = x[0];
		x[0] = dummy;

		return x;
	}

}
