package Assignment_10;

public class q30 {

	public static void main(String[] args) {
		/*
		 * Question-30
		 * 
		 * at3 method gets two strings and returns a string. The first string is the one
		 * that will be manipulated. At the 3rd char position of the target you will
		 * insert the word argument.
		 * 
		 * Sample output:
		 * 
		 * at3("longword","foo") return: "lonfoogword"
		 * 
		 * at3("blabla","a") return: "blaabla"
		 */

		at3("longword", "foo");

	}

	private static void at3(String word1, String word2) {
		String newWord = word1.substring(0, word1.length() / 2) + word2 + word1.substring(word1.length() / 2);
		System.out.println(newWord);
	}

}
