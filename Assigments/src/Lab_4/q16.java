package Lab_4;

public class q16 {

	public static void main(String[] args) {
		/*
		 * Question-16 Write a method that accepts an array and prints the number of
		 * even numbers in the array. int[] x = {2,1,2,3,4} = > 3 int[] y = {2,2,0} = >
		 * 3 int[] z = {1,3,5} = > 0
		 */

		int[] x = { 2, 1, 2, 3, 4 };
		printEvens(x);

	}

	private static void printEvens(int[] x) {
		int counter = 0;

		for (int i : x) {
			if (i % 2 == 0) {
				counter++;
			}
		}
		System.out.println(counter);
	}

}
