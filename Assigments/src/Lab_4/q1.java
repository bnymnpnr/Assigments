package Lab_4;

public class q1 {

	public static void main(String[] args) {
		/*
		 * Question-1 Write a method that accepts an array and return true if 6 appears
		 * as either the first or last element in the array. The array will be length 1
		 * or more. int[] x = {1,2,6}; = > true int[] y = {6,1,2,3}; = > true int[] z =
		 * {13,6,1,2,3}; = > false
		 */

		

		int[] x = { 1, 2, 6 };

		System.out.println(array6(x));
	}

	private static boolean array6(int[] x) {

		boolean flag = false;

		if (x[0] == 6 || x[x.length - 1] == 6) {
			flag = true;
		}

		return flag;

	}

}
