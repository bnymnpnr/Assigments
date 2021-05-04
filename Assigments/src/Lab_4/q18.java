package Lab_4;

public class q18 {

	public static void main(String[] args) {
		/*
		 * Question-18 Write a function that accepts an array and prints the sum of the
		 * numbers in the array. Except the number 13 is very unlucky, so it does not
		 * count and numbers that come immediately after a 13 also do not count int[] x
		 * = {1,2,2,1} = > 6 int[] y = {1,1} = > 2 int[] a = {1,2,2,1,13} = > 6 int[] b
		 * = {1,2,2,1,13,3} = > 6
		 */
		int[] x = { 1, 2, 2, 1 };
		int[] y = { 1, 1 };
		int[] a = { 1, 2, 2, 1, 13 };
		int[] b = { 1, 2, 2, 1, 13, 3 };

		unlucky13(x);
		unlucky13(y);
		unlucky13(a);
		unlucky13(b);

	}

	private static void unlucky13(int[] x) {
		int sum = 0;
		for (int i = 0; i < x.length; i++) {
			if (i != x.length - 1 && x[i] == 13) {
				x[i] = 0;
				x[i + 1] = 0;
			}

			if (x[x.length - 1] == 13) {
				x[x.length - 1] = 0;
			}

			sum += x[i];

		}
		System.out.println(sum);

	}

}
