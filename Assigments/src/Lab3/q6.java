package Lab3;

public class q6 {

	public static void main(String[] args) {
		/*
		 * Question-6 Given a string, return a version without the first and last char,
		 * so "Hello" yields "ell". The string length will be at least 2.
		 * withoutEnd("Hello") - "ell" withoutEnd("java") - "av" withoutEnd("coding") -
		 * "odin"
		 */

		withoutEnd("Hello");
		withoutEnd("java");
		withoutEnd("coding");

	}

	private static void withoutEnd(String str) {
		if (str.length() >= 2) {
			System.out.println(str.substring(1, str.length() - 1));
		}

	}

}
