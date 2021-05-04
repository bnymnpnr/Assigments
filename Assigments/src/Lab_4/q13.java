package Lab_4;

import java.util.Arrays;

public class q13 {

	public static void main(String[] args) {
		/*
		 * Question-13 Write a method that accepts 2 arrays and consider the sum of the
		 * values in each array. Print the array which has the largest sum. In event of
		 * a tie, print "equal" int[] x = {1,2} int[] y = {3,4} = > [3,4] int[] x =
		 * {5,6} int[] y = {3,8} = > equal int[] x = {1,1} int[] y = {1,0} = > [1,1]
		 */

		int[] x = { 1, 2 };
		int[] y = { 3, 4 };

		largestSum(x, y);
	}

	private static void largestSum(int[] x, int[] y) {
		int sumX = 0;
		int sumY = 0;

		for (int i : x) {
			sumX += i;
		}

		for (int i : y) {
			sumY += i;
		}

		if (sumX > sumY) {
			System.out.println(Arrays.toString(x));
		} else if (sumY > sumX) {
			System.out.println(Arrays.toString(y));
		} else {
			System.out.println("equal!");
		}

	}

}
