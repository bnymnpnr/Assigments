package Lab_4;

public class q22 {
	/*
	 * Question-22 Write a method that accepts an array and prints true if the
	 * number 1's is greater than the number 4's int[] x = {1,4,1} = > true int[] x
	 * = {1,4,1,4} = > false int[] x = {1,1} = > true
	 */
	public static void main(String[] args) {
		int[] x = { 1, 1, 4 };
		number1greater4(x);

	}

	private static void number1greater4(int[] x) {
		int counter1 = 0;
		int counter4 = 0;
		for (int i : x) {
			if (i == 1) {
				counter1++;
			}
			if (i == 4) {
				counter4++;
			}
		}
		if (counter1 > counter4) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

	}

}
