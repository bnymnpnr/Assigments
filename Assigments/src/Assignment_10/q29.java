package Assignment_10;

public class q29 {

	public static void main(String[] args) {
		/*
		 * Question-29
		 * 
		 * This method gets a string and an int, it returns a string. What it does is to
		 * limit the inputted string to a creating number of characters.
		 * 
		 * Sample Output:
		 * 
		 * limit("abcd",2) returns "ab"
		 * 
		 * limit("bla bla",3) returns "bla"
		 */

		limit("abcd", 2);

	}

	private static void limit(String word, int limit) {

		word = word.substring(0, limit);
		System.out.println(word);
	}

}
