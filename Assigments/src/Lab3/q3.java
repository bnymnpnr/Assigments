package Lab3;

public class q3 {

	public static void main(String[] args) {
		/*
		 * Question-3 Create a method return a new string made of 3 copies of the last 2
		 * chars of the original string. The string length will be at least 2.
		 * extraEnd("Hello") - "lololo" extraEnd("ab") -"ababab" extraEnd("Hi") -
		 * "HiHiHi"
		 */

		extraEnd("Hello");

	}

	public static void extraEnd(String str) {
		if (str.length() >= 2) {
			for (int i = 0; i < 3; i++) {
				System.out.print(str.substring(str.length() - 2));
			}
		} else {
			System.out.println("invalid string");
		}

	}

}
