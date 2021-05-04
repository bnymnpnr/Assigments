package Lab_4;

import java.util.Arrays;

public class q30 {
	/*
	 * Question-30 It is said that an element in array is alone if there are values
	 * before and after it, and those values are different from it. Write a method
	 * that accepts an array and a number and prints the given array where every
	 * instance of the given value which is alone is replaced by whichever value to
	 * its left or right is larger. int[] x = {1,2,3}; int n = 2;
	 * System.out.println(Arrays.toString(notAlone(x, n))); //int[] x = {1,2,3}; int n = 2; [1, 3, 3] int[] y =
	 * {1, 2, 3, 2, 5, 2}; int n1 = 2;
	 * System.out.println(Arrays.toString(notAlone(y, n1))); //[1, 3, 3, 5, 5, 2]
	 */
	public static void main(String[] args) {
		int[] y = { 1, 2, 3, 2, 5, 2 };
		int n = 2;
		notAlone(y, n);

	}

	private static void notAlone(int[] y, int n) {
		for (int i = 1; i < y.length - 1; i++) {
			if (y[i - 1] != y[i] && y[i] != y[i + 1]) {
				if (y[i - 1] > y[i + 1]) {
					y[i] = y[i - 1];
				} else {
					y[i] = y[i + 1];
				}
			}
		}
		System.out.println(Arrays.toString(y));
	}

}
