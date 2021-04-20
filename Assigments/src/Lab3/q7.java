package Lab3;

public class q7 {

	public static void main(String[] args) {
		/*
		 * Question-7 Given 2 strings, a and b, return a string of the form
		 * short+long+short, with the shorter string on the outside and the longer
		 * string on the inside. comboString("Hello", "hi") -"hiHellohi"
		 * comboString("hi", "Hello") - "hiHellohi" comboString("aaa", "b") - "baaab"
		 */

		comboString("Hello", "hi");
		comboString("hi", "Hello");
		comboString("aaa", "b");

	}

	private static void comboString(String a, String b) {
		if (a.length() > b.length()) {
			System.out.println(b + a + b);
		} else {
			System.out.println(a + b + a);
		}

	}

}
