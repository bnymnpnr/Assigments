package Lab_4;

import java.util.Arrays;

public class q8 {

	public static void main(String[] args) {
		/*
		 * Question-8 Write a method that accepts an array and prints true if it
		 * contains a 2 or a 3 int[] x = {2,5}; = > true int[] y = {4,3}; = > true int[]
		 * z = {4,5}; = > false
		 */

		int[] x = { 2, 5 };

		System.out.println((contains2or3(x)));

	}

	private static boolean contains2or3(int[] x) {
		boolean flag = false;
		for (int i : x) {
			if (i == 2 || i == 3) {
				flag = true;
			}
		}
		return flag;

	}
}
