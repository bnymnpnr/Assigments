package Assignment_10;

public class q19 {

	public static void main(String[] args) {
		/*
		 * Question-19
		 * 
		 * Return the number of times that the string "java" appears anywhere in the
		 * given string word.
		 * 
		 * Sample Output:
		 * 
		 * input: javaxjava output: 2
		 * 
		 * input: javaxjavaapplepearjavaegg output: 3
		 */

		String word = "javaxjavaapplepearjavaeggjava";
		String specificWord = "java";
		int counter = 0;

		if (word.length() < specificWord.length()) {
			System.out.println("Word length must be greater than or equal Specific Word");
		}

		for (int i = 0; i < word.length() - 3; i++) {
			if (word.substring(i, i + 4).equals(specificWord)) {
				counter++;
			}
		}
		System.out.println(specificWord + " found " + counter + " times");
	}

}
