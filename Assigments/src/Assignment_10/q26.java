package Assignment_10;

public class q26 {

	public static void main(String[] args) {
		/*
		 * Question-26
		 * 
		 * uniqueChars is a method that you will code now, should be able to accept any
		 * string in the word and return unique characters from the parameter.
		 * 
		 * Sample Output:
		 * 
		 * uniqueChars("java") ==> "jav"
		 * 
		 * uniqueChars("mama") ==> "ma"
		 * 
		 * uniqueChars("spoon") ==> "spon"
		 */

		String word = "mama";
		uniqueChars(word);

	}

	private static void uniqueChars(String word) {
		int counter = 0;
		String newWord = "";
		for (int i = 0; i < word.length(); i++) {
			for (int j = 0; j < word.length(); j++) {
				if (word.charAt(i) == word.charAt(j)) {
					if (newWord.contains(word.charAt(i) + "")) {
						continue;
					}

					newWord += word.charAt(i);
				}
			}
		}

		System.out.println(newWord);
	}
}
