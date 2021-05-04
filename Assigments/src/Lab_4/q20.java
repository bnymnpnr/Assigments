package Lab_4;

public class q20 {

	public static void main(String[] args) {
		/*
		 * Question-20 Write a method that accepts an array and prints true if the array
		 * contains a 2 next to a 2 somewhere. int[] x = {1,2,2} = > true int[] y = {1,
		 * 2, 1,2} = > false int[] a = {2,1,2} = > false int[] b = {2,2,1,2} = > true
		 */

		int[] x = { 2, 2, 1, 2 };
		nex2to2(x);

	}

	private static void nex2to2(int[] x) {

		for (int i = 0; i < x.length - 1; i++) {
			if (x[i] == 2 && x[i + 1] == 2) {
				System.out.println(true);
			}
		}

	}

}
