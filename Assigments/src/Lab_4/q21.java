package Lab_4;

public class q21 {
	/*
	 * Question-21 Write a method that accepts an array and prints true if the sum
	 * of all 2's in the array is exactly 8 int[] x = {2, 3, 2, 2, 4, 2} = > true
	 * int[] x = {2, 3, 2, 2, 4, 2, 2} = > false int[] x = {1, 2, 3, 4} = > false
	 */

	public static void main(String[] args) {
		int[] x = { 2, 3, 2, 2, 4, 2 };
		sumOf2equal8(x);
	}

	private static void sumOf2equal8(int[] x) {
		int sum = 0;
		for (int i : x) {
			if (i == 2) {
				sum += i;
			}
		}

		if (sum == 8)
			System.out.println(true);
		else
			System.out.println(false);
	}

}
