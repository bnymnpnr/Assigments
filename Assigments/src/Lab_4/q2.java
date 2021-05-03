package Lab_4;

public class q2 {

	public static void main(String[] args) {
		/*
		 * Question-2 Write a method that accepts an array and check the length of the
		 * array first. If the length is more than one, check if the first element and
		 * last element are equal. if it is print true, if not print false. If the
		 * length is not more than 1, print not valid an array int[] x = {1,2,3}; = >
		 * false int[] y = {1,2,3,1}; = > true int[] z = {1,2,1}; = > true int[] k =
		 * {1}; = > not a valid array
		 */

		int[] y = { 1, 2, 3, 1 };

		System.out.println(firstLastEqual(y));

	}

	private static String firstLastEqual(int[] y) {
		if (y.length <= 1) {
			return "not valid";
		}

		if (y[0] == y[y.length - 1]) {
			return "true";
		} else {
			return "false";
		}

	}

}
