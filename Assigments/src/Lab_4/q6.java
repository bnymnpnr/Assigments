package Lab_4;

import java.util.Arrays;

public class q6 {

	public static void main(String[] args) {
		/*
		 * Question-6 Write a method that accepts an array and figure out which is
		 * greatest element in the array, a and set all the other elements to be that
		 * value. Print the changed array. int[] x = {1,2,3}; = > [3,3,3] int[] y =
		 * {11,5,9}; = > [11,11,11] int[] a = {110,5,98,0,1200,11,-4}; = >
		 * [1200,1200,1200,1200,1200,1200,1200]
		 */

		int[] x = { 1, 2, 9, 3, 4 };
		changeByGreatest(x);
		System.out.println(Arrays.toString(changeByGreatest(x)));

	}

	private static int[] changeByGreatest(int[] x) {
		int[] arr = new int[x.length];
		int max = x[0];

		for (int i : x) {
			if (i > max) {
				max = i;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			arr[i] = max;
		}
		return arr;

	}

}
