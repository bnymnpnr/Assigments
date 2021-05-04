package Lab_4;

import java.util.Arrays;

public class q29 {
	/*
	 * Question-29 Write a function that accepts and array. For each multiple of 10
	 * in the given array, change all the values following it to be that multiple of
	 * 10, until encountering another multiple of 10. int[] x = {2,10,3,4,20,5};
	 * System.out.println(Arrays.toString(tenRun(x))); // x = {2,10,3,4,20,5}; [2, 10, 10, 10, 20, 20]
	 * int[] y = {10,1,20,2}; System.out.println(Arrays.toString(tenRun(y))); //
	 * [10, 10, 20, 20]
	 */

	public static void main(String[] args) {
		int[] x = { 2, 10, 3, 4, 20, 5 };
		tenRun(x);

	}

	private static void tenRun(int[] x) {
		int dummy = 10;
		for (int i = 0; i < x.length; i++) {
			if (x[i] % 10 == 0) {
				for (int j = i + 1; j < x.length; j++) {

					if (x[j] % 10 == 0) {
						dummy = x[j];
					}
					x[j] = dummy;
				}
			}
		}
		System.out.println(Arrays.toString(x));
	}

}
