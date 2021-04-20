package Lab3;

public class q4 {

	public static void main(String[] args) {
		/*
		 * Question-4 Given a string, return the string made of its first two chars, so
		 * the String "Hello" yields "He". If the string is shorter than length 2,
		 * return whatever there is, so "X" yields "X", and the empty string "" yields
		 * the empty string "". firstTwo("Hello") - "He" firstTwo("abcdefg") - "ab"
		 * firstTwo("ab") -"ab"
		 */

		firstTwo("");

	}

	private static void firstTwo(String str) {
		if (str.length() >= 2) {
			System.out.println(str.substring(0, 2));
		} else if(str.isEmpty()) {
			System.out.println("Empty string!");
		}else {
			System.out.println(str);
		}

	}

}
