package Lab_4;

public class q26 {
	/*
	 * Question-26 Write a method that accepts an array and prints true if the array
	 * contains 3 even or 3 odd values all next to each other. int x[] = {2,1,3,5};
	 * //true int y[] = {2,1,2,5}; //false int z[] = {2,4,2,5}; //true
	 */

	public static void main(String[] args) {
		int x[] = { 2, 1, 3, 5 };
		int y[] = { 2, 1, 2, 5 };
		int z[] = { 2, 4, 2, 5 };

		even3od3(x);
		even3od3(y);
		even3od3(z);
	}

	private static void even3od3(int[] x) {
		int even = 0;
		int odd = 0;

		for (int i : x) {
			if (i % 2 == 0) {
				even++;
			} else {
				odd++;
			}
		}
		if (odd >= 3 || even >= 3) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}

}
