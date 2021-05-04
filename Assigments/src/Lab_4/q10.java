package Lab_4;

import java.util.Arrays;

public class q10 {

	public static void main(String[] args) {
		/*
		 * Question-10 Write a method that accepts an array and prints true if the array
		 * contains 2 twice or 3 twice. int[] x = {2,2}; = > true int[] y = {3,3}; = >
		 * true int[] a = {2,3}; = > false int[] b = {12,20,42}; = > false int[] c =
		 * {2,2,2}; = > false
		 */

		int[] x = { 2, 2 };
		int[] y = { 3, 3 };
		int[] a = { 2, 3 };
		int[] b = { 12, 20, 42 };
		int[] c = { 2, 2, 2 };

		System.out.println(twice2or3(x));
		System.out.println(twice2or3(y));
		System.out.println(twice2or3(a));
		System.out.println(twice2or3(b));
		System.out.println(twice2or3(c));

	}

	private static boolean twice2or3(int[] x) {
		boolean flag = false;
		int counter2 = 0;
		int counter3 = 0;

		for (int i : x) {
			if (i == 2) {
				counter2++;
			}
			if (i == 3) {
				counter3++;
			}

		}

		if (counter2 == 2 || counter3 == 2) {
			flag = true;
		}
		return flag;

	}

}
