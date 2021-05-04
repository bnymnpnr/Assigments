package Lab_4;

public class q27 {
	/*
	 * Question-27 Write a method that accepts an array and prints true if the array
	 * contains, somewhere, three increasing adjacent numbers like 4,5,6,... or
	 * 23,24,25. int[] x = {1,4,5,6,2}; //true int[] y = {1,2,3}; //true int[] z =
	 * {1,2,4,5,8,9}; //false
	 */

	public static void main(String[] args) {
		int[] x = { 1, 4, 5, 6, 2 }; // true
		int[] y = { 1, 2, 3 }; // true
		int[] z = { 1, 2, 4, 5, 8, 9 }; // false

		adjacentNumbersLike456(x);
		adjacentNumbersLike456(y);
		adjacentNumbersLike456(z);

	}

	private static void adjacentNumbersLike456(int[] x) {

		for (int i = 0; i < x.length - 2; i++) {
			if (x[i] + 1 == x[i + 1] && x[i + 1] + 1 == x[i + 2]) {
				System.out.println(true);
				return;
			}
		}
		System.out.println(false);

	}

}
