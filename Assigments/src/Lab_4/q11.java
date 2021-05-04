package Lab_4;

import java.util.Arrays;

public class q11 {
	public static void main(String[] args) {
		/*
		 * Question-11 Write a method that accepts an array, and if there is a 2 in the
		 * array immediately followed by a 3, set the 3 element to 0. Print the changed
		 * Array int[] x = {1,2,3} = > [1,2,0] int[] x = {2,3,5} = > [2,0,5] int[] x =
		 * {1,2,1} = > [1,2,1] int[] x = {11,2,13,3,2} = > [11,2,13,3,2]
		 */

		int[] x = { 2,3,2,3,2,3,2,3,2 };

		System.out.println(Arrays.toString(follows3(x)));

	}

	private static int[] follows3(int[] x) {
		for (int i = 0; i < x.length; i++) {
			if (i != x.length - 1 && x[i] == 2 && x[i + 1] == 3) {
				x[i + 1] = 0;
			}
		}
	return x;
	}
}
