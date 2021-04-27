package Assigment_8;

public class q14 {

	public static void main(String[] args) {
		/*
		 * Question-14
		 * 
		 * This one is about truth table logic, threeLocks gets 3 booleans and returns a
		 * boolean.
		 * 
		 * It returns true only if both a and b are true or c is true.
		 * 
		 * https://en.wikipedia.org/wiki/Truth_table
		 */
		boolean b1 = true;
		boolean b2 = false;
		boolean b3 = true;

		System.out.println(threeLocks(b1, b2, b3));

	}

	private static boolean threeLocks(boolean b1, boolean b2, boolean b3) {
		boolean flag = false;
		if ((b1 && b2) || b3  ) {
			flag = true;
		}
		return flag;

	}

}
