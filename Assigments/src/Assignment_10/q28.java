package Assignment_10;

public class q28 {

	public static void main(String[] args) {
		/*
		 * Question-28
		 * 
		 * This method gets two strings (text and badWord) and returns a string. Basicly
		 * what it does is take out all the occurrences of badWord in text.
		 * 
		 * Sample Output:
		 * 
		 * clean ("one two three","two") returns "one three"
		 * 
		 * clean ("foo bar","foo") returns "bar"
		 * 
		 * clean ("he said bla bla bla","bla") returns "he said "
		 */

		String text = "he said bla bla bla";
		String badWord = "bla";
		clean(text, badWord);

	}

	private static void clean(String text, String badWord) {

		for (int i = 0; i <= text.length() - badWord.length(); i++) {
			if (text.substring(i, i + badWord.length()).equals(badWord)) {
				text = text.replace(text.substring(i, i + badWord.length()), "");
			}
		}
		System.out.println(text);
	}

}
