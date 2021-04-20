package Lab3;

public class q9 {

	public static void main(String[] args) {
		/*
		 * Question-9 Given a string, return a "rotated right 2" version where the last
		 * 2 chars are moved to the start. The string length will be at least 2.
		 * right2("Hello") - "lo Hel" right2("java") - "va ja" right2("Hi") - "Hi"
		 */

		right2("Hello");
		right2("java");
		right2("Hi");

	}

	private static void right2(String str) {
		if (str.length() >= 2) {
			str = str.substring(2) + (str.substring(0, 2));
		}
		System.out.println(str);

	}

}
