package Lab_4;

import java.util.Arrays;

public class q14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] x = { 1, 2 };
		int[] y = { 3, 4 };
		System.out.println(Arrays.toString(mergeArray(x, y)));

	}

	public static int[] mergeArray(int[] x, int[] y) {
		int[] arr3 = new int[x.length + y.length];

		for (int i = 0; i < x.length; i++) {
			arr3[i] = x[i];
		}

		for (int i = 0; i < y.length; i++) {
			arr3[i + x.length] = y[i];
		}

		return arr3;
	}

}
