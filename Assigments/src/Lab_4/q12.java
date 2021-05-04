package Lab_4;

public class q12 {

	public static void main(String[] args) {
		/*
		 * Question-12 Write a method that accepts two arrays and prints how many of the
		 * arrays have 1 as their first element int[] x = {1,2,3} Int[] y = {1,3} Output
		 * = 2 int[] x = {7,2,3} Int[] y = {1} Output = 1 int[] x = {3,2,4} Int[] y =
		 * {4,3,4} Output = 0
		 */

		int[] x = { 1, 2, 3 };
		int[] y = { 1, 3 };

		firstElement1(x, y);

	}

	private static void firstElement1(int[] x, int[] y) {
		int counter = 0;

		if (x[0] == 1) {
			counter++;
		}
		if (y[0] == 1) {
			counter++;
		}
		System.out.println(counter);

	}

}
