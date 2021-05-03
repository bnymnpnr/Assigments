package Lab_4;

import java.util.Arrays;

public class q5 {

	public static void main(String[] args) {
		/*
		 * Question-5 Write a method that accepts an array and prints an array with the
		 * elements "rotated left” int[] x = {1,2,3}; = > [2,3,1] int[] y =
		 * {17,12,10,8}; = > [12,10,8,17] int[] a = {7,0,0}; = > [0,0,7]
		 */

		int[] x = { 0, 1, 2, 3, 4, 5, 6 };
		rotatedLeft(x);
		System.out.println(Arrays.toString(rotatedLeft(x)));

	}

	private static int[] rotatedLeft(int[] x) {
		int[] arr = new int[x.length];
		int lenght = x.length;
		for (int i : x) {
			arr[lenght - 1] = i;
			lenght--;
		}
		return arr;

	}

}
