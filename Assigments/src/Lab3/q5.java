package Lab3;

public class q5 {

	public static void main(String[] args) {
		/*
		 * Question-5 Given a string of even length, return the first half. So the
		 * string "WooHoo" yields "Woo". firstHalf("WooHoo") - "Woo"
		 * firstHalf("HelloThere") - "Hello" firstHalf("abcdef") - "abc"
		 */

		firstHalf("WooHoo");
		firstHalf("HelloThere");
		firstHalf("abcdef");

	}

	private static void firstHalf(String str) {
		System.out.println(str.substring(0, (str.length() / 2)));

	}

}
