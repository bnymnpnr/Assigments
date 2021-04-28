package Assignment_10;

public class q21 {

	public static void main(String[] args) {
		/*
		 * Question-21
		 * 
		 * Given a string, consider the prefix string made of the first n chars of the
		 * string. Does that prefix string appear somewhere else in the string? Assume
		 * that the string is not empty and that n is in the range from 1 till
		 * str.length().
		 * 
		 * Sample Output:
		 * 
		 * input: abXYabc input: 1 output: true a appears twice
		 * 
		 * input: abXYabc input: 2 output: true ab appears twice
		 * 
		 * input: abXYabc input: 3 output: false abX appears once only
		 */

		String word = "abXYabc";
		int range = 2;
		int counter = 0;
		boolean flag = false;

		String appearingWord = word.substring(0, range);

		for (int i = 0; i < word.length(); i++) {
			if (word.contains(appearingWord)) {
				flag = true;
				counter++;
				word = word.replaceFirst(appearingWord, "");
			}
		}
		System.out.println(flag + " " + appearingWord + " appears " + counter);

	}

}
