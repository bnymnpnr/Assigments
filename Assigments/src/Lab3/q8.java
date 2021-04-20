package Lab3;

public class q8 {

	public static void main(String[] args) {
		/*
		 * Question-8 Given a string, return a "rotated left 2" version where the first
		 * 2 chars are moved to the end. The string length will be at least 2.
		 * left2("Hello") - "lloHe" left2("java") - "vaja" left2("Hi") - "Hi"
		 */

		left2("Hello");
		left2("java");
		left2("Hi");

	}

	private static void left2(String str) {
		if (str.length() >= 2) {
			str = str.substring(2).concat(str.substring(0, 2));
		}
		System.out.println(str);
	}

}
